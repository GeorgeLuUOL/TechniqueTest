import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortTest {

    public static void main(String[] args) {

        List<Obj> objList = new ArrayList();

        for (int i=0;i<10;i++){
            objList.add(new Obj(i,"对象"+i+"type1",1));
        }
        for (int i=0;i<20;i++){
            objList.add(new Obj(i,"对象"+i+"type2",2));
        }

        objList.sort(new Comparator<Obj>() {
            @Override
            public int compare(Obj o1, Obj o2) {
                return 0;
            }
        });

        objList.forEach(item -> System.out.println(item.toString()));
    }

}
