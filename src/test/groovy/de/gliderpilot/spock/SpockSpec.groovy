package de.gliderpilot.spock

import spock.lang.Specification
import spock.lang.*

@Title("Lists")
@Narrative("As a User I want to use a List")
class SpockSpecification extends Specification {

    @Subject
    private List<String> list = new ArrayList<>();

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

    def "may contain duplicates"() {
        when: "I add an element twice"
        list.add("Paul");
        list.add("Paul");

        then: "the list contains two elemens"
        list.size() == 2
    }

}
