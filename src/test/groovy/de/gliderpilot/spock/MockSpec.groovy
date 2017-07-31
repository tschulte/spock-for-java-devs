package de.gliderpilot.spock

import spock.lang.Specification

class MockSpec extends Specification {

    Observer observer = Mock()

    Observable observable = new Observable()

    def setup() {
        observable.addObserver(observer)
    }

    def "observer is not notified when unchanged"() {
        when:
        observable.notifyObservers()

        then:
        0 * observer.update
    }

    def "observer is notified on change"() {
        when:
        observable.setChanged()
        observable.notifyObservers()

        then:
        1 * observer.update(observable, null)
    }

    def "observer is notified with argument"() {
        when:
        observable.setChanged()
        observable.notifyObservers("Hallo")

        then:
        1 * observer.update(observable, "Hallo")
    }
}
