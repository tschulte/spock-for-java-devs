package de.gliderpilot.spock

import spock.lang.*

@Title("Lists")
@Narrative("As a User I want to use a List")
class SpockSpec extends Specification {

    @Subject
    private list = []

    @Issue("1234")
    def "is empty after creation"() {
        expect:
        list.isEmpty()
    }

    @Issue("http://github.com/tschulte/spock-for-java-devs/issues/123")
    def "size is one after adding one element"() {
        when: "I add an element" // <1>
        list.add("Paul")

        then: "the list contains one element"
        list.size() == 1

        and: "the element is the added one"
        list.first() == "Paul"
    }

    def "contains the element after insertion"() {
        when:
        list.add("Paul")

        then:
        list.stream().filter { it == "Paul" }.findFirst().get()
    }


    def "may contain duplicates"() {
        when: "I add an element twice"
        list.add("Paul")
        list.add("Paul")

        then: "the list contains two elemens"
        list.size() == 2
    }

}
