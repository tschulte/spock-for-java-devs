package de.gliderpilot.spock.groovy.primer

class Groovy { // <1>
    List<String> list = ["a", "b", "c"] // <2><3><4>

    Map<String, String> map = [a: "first", b: "second", c: "third"] // <5>

    static void main(args) {
        Groovy groovy = new Groovy()
        groovy.map.d = "fourth"
    }
}
