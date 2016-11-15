package de.gliderpilot.spock

import spock.lang.Specification
import spock.lang.Subject

class SpockSpecification extends Specification {

    @Subject
    private List<String> list = new ArrayList<>();

    def "is empty after creation"() {
        expect:
        list.isEmpty()
    }

    def "size is one after adding one element"() {
        when: "I add an element" // <1>
        list.add("Paul")

        then:
        list.size() == 1
    }

    def "may contain duplicates"() {
        when:
        list.add("Paul");
        list.add("Paul");

        then:
        list.size() == 2
    }

}
