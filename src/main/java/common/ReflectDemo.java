package common;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Bright
 */
public class ReflectDemo {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Person person = new Person();
        person.setId("1");
        person.setName("张三");
        person.setAge("18");
        test(person);
    }

    private static void test(Object o) throws InvocationTargetException, IllegalAccessException {
        Class c = o.getClass();
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            Object value = method.invoke(o, null);
            System.out.println(value);
        }
        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println(c.getName());
    }

    public static class Person {
        private String id;
        private String name;
        private String age;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }

}
