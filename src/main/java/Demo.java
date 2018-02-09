/**
 * @author Bright
 */
public class Demo {

    private static final String regEx = "^(?![A-Z]+$)(?![a-z]+$)(?!\\d+$)(?![\\W_]+$)\\S{6,16}$";

    public static void main(String[] args) {
        System.out.println("111qqq".matches(regEx));
    }

}
