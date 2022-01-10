package designPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer();
        String s = "abc";
        Class c1 = Class.forName("designPattern.Customer");
        Constructor[] constructors;
        constructors = c1.getDeclaredConstructors();
        Class[] p = {int.class,String.class};
        //获取了声明的构造器
        Constructor constructor = c1.getDeclaredConstructor(p);
        System.out.println(constructor);
        //通过构造器获取对象
        System.out.println(constructor.newInstance(1, "Lu").getClass());
        Customer customerFromReflect = (Customer)constructor.newInstance(1, "Lu");
        customerFromReflect.spawn();
        //获取字段
        Field field = c1.getDeclaredField("name");
        field.setAccessible(true);
        field.set(customerFromReflect,"新名字");
        System.out.println(field.get(customerFromReflect));

        Object o = c1.newInstance();
        Method m = c1.getDeclaredMethod("spawn",null);
        m.invoke(o);
    }
}
