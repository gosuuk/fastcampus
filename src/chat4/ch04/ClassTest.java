package src.chat4.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException, SecurityException, NoSuchMethodException, InvocationTargetException {

        Class c1 = Class.forName("src.chat4.ch04.Person");
        Person person = (Person)c1.newInstance();

        person.setName("Park");
        System.out.println(person);
        Class c2 = person.getClass();
        Person p = (Person) c2.newInstance();
        System.out.println(p);

        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] init = {"Park"};
        Person ParkPerson = (Person) cons.newInstance(init);
        System.out.println(ParkPerson);

        Person Park2 = new Person("Park");
    }
}
