package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate函数式接口Demo
 * 断言型
 * 返回值为boolean，用做判断
 * 
 * @author Bright
 */
public class PredicateDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("输出所有：");
        eval(list, integer -> true);
        System.out.println("输出大于3：");
        eval(list, integer -> integer > 3);
        System.out.println("输出偶数：");
        eval(list, integer -> integer % 2 == 0);

        // 非封装形式
        Predicate<Integer> predicate = integer -> integer % 2 == 0;
        for (Integer i : list) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }

    }

    private static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer i : list) {
            if (predicate.test(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
