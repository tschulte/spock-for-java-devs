package de.gliderpilot.spock.groovy.primer

public class Java {

    private List<String> list = new ArrayList<>();

    private Map<String, String> map = new HashMap<>();

    public Java() {
        list.add("a");
        list.add("b");
        list.add("c");

        map.put("a", "first");
        map.put("b", "second");
        map.put("c", "third");
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public static void main(String[] args) {
        Java java = new Java();
        java.getMap().put()
    }


}
