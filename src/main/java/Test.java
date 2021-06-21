import java.util.ArrayList;
import java.util.List;

public class Test {
    LabelList list = new LabelList();
//    Container container  = new Container(list);
}

class LabelList {
    private List<String> labels = new ArrayList<>();

    public LabelList() {
        labels.add("Plastics");
        labels.add("CardBoards");
    }
}

class Container {
    private List<String> labels = new ArrayList<>();

    public Container() {
        labels.add("Plastics");
        labels.add("CardBoards");
    }
}
class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
