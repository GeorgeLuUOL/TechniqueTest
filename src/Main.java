import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main  {
    public static void main(String[] args) {
        System.out.println("hello world");
        //匿名内部类
        System.out.println(new MathProcess() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }


        }.add(1, 2));
        //lemada
        MathProcess mathProcess = (a,b) -> a+b;
        System.out.println(mathProcess.add(1, 2));
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6);
        int count = 0;
        arr.forEach(integer -> System.out.println(integer));

    }
}
interface MathProcess{
    int add(int a, int b);
}
interface WordProcess{
    void print(Object o);
}