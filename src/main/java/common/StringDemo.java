package common;

/**
 * @author Bright
 */
public class StringDemo {

    public static void main(String[] args) {
        String s = "0";
        String[] arr = { "1", "2" };

        for (String str : arr) {
            s = str;
        }
        System.out.println(s);
    }

}
