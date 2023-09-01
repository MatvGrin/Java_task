package obj;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person(1, "Vova", 44);
        Person person2 = new Person(2, "Anna", 44);

        boolean res = person1.equals(person2);
        System.out.println(res);

        int hc1 = person1.hashCode();
        System.out.println(hc1);
        int hc2 = person2.hashCode();
        System.out.println(hc2);

        String str = person1.toString();
        System.out.println(str);

        System.out.println("------------------");
        Person person3 = person1.clone();
        System.out.println(person3.equals(person1));
        System.out.println(person3.hashCode());
        System.out.println(person3);

        Class<? extends Person> aClass = person1.getClass();
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getReturnType() + " " + method.getName());
        }

    }
}
