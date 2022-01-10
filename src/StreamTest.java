import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Stu> stus= new ArrayList<>();
        stus.add(new Stu(1,"ASD"));
        stus.add(new Stu(2,"asda"));
        stus.add(new Stu(3,"AqweSD"));
        stus.add(new Stu(4,"asqweqweda"));

        List<String> idList = stus.stream().map(Stu::getName).collect(Collectors.toList());
        idList.forEach(item-> System.out.println(item));
    }
}

class Stu{
    private int id;
    private String name;

    public Stu(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}