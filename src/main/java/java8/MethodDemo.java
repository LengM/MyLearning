package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * 方法引用
 * :: - 两个冒号
 * 1.类::new -- 该类必须是静态
 * 
 * 2.对象::普通有参方法 -- 该方法只有一个参数，且该方法的参数类型与对象的类型必须一致
 * 3.类::静态方法 -- 该方法必须带有，且只有一个与类相符合的参数
 * 4.类::普通无参方法 -- 该方法无参数
 * 
 * @author Bright
 */
public class MethodDemo {

    public static void main(String[] args) {

        Car car = Car.create(Car::new);
        List<Car> carList = Arrays.asList(car);
        // 类名直接调用静态方法
        carList.forEach(Car::collide);
        // 对象调用普通带参方法
        carList.forEach(car::follow);
        // 类名调用普通无参方法
        carList.forEach(Car::repair);

        // 使用简化的输出语句
        List<String> names = new ArrayList<>();
        names.add("Google");
        names.add("Java");
        names.add("8");
        names.forEach(System.out::println);

    }

    /**
     * 类加static是因为：
     * 想要使用Java8新的方法引用创建对象，该对象必须是static
     */
    static class Car {

        /** 方法加static是为了可以直接类名点 */
        static Car create(Supplier<Car> supplier) {
            return supplier.get();
        }

        static void collide(Car car) {
            System.out.println("Collide " + car.toString());
        }

        void follow(Car car) {
            System.out.println("follow the " + car.toString());
        }

        String repair() {
            System.out.println("repair " + this.toString());
            return "2";
        }

    }

}
