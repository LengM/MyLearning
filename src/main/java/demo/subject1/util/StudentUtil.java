package demo.subject1.util;

import demo.subject1.bean.Student;
import demo.subject1.constant.StudentConstant;

import java.util.Random;

/**
 * 工具类
 */
public class StudentUtil {

    public static Student newStudent() {
        Student student = new Student();
        student.setClassNo(String.valueOf(newRandom(1, 5)));
        student.setUsername(randomString(StudentConstant.letters, 0, 24, 5, 15));
        student.setAge(newRandom(1, 100));
        student.setSex(randomString(StudentConstant.sex, 0, 1));
        return student;
    }

    public static Student newStudent(String username) {
        Student student = new Student();
        student.setClassNo(String.valueOf(newRandom(1, 5)));
        student.setUsername(username);
        student.setAge(newRandom(1, 100));
        student.setSex(randomString(StudentConstant.sex, 0, 1));
        return student;
    }

    public static boolean isStartWithAtoG(String str) {
        char[] letters = StudentConstant.letters;
        boolean result = false;
        for (int i = 0; i < 5; i++) {
            if (str.toLowerCase().startsWith(String.valueOf(letters[i]))) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * 将第一个，第五个，第十个位置的字母变为大写
     */
    public static String someIndexToUpperCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || i == 4 || i == 9) {
                chars[i] = String.valueOf(chars[i]).toUpperCase().toCharArray()[0];
            }
        }
        return String.valueOf(chars);
    }

    /**
     * 随机获取一个字符串
     *
     * @param chars 字符数组
     * @param min   下标随机数的最小值
     * @param max   下标随机数的最大值
     * @return strings数组中下标在min~max范围内的随机字符串
     */
    public static String randomString(char[] chars, int min, int max) {
        return String.valueOf(chars[newRandom(min, max)]);
    }

    /**
     * 随机获取一个随机长度的字符串
     *
     * @param chars  字符数组
     * @param min    下标随机数的最小值
     * @param max    下标随机数的最大值
     * @param minNum 返回值长度的最小值
     * @param maxNum 返回值长度的最大值
     * @return strings数组中下标在min~max范围内的，长度在minNum~maxNum范围内随机字符串
     */
    public static String randomString(char[] chars, int min, int max, int minNum, int maxNum) {
        int length = newRandom(minNum, maxNum);
        char[] returnChars = new char[length];
        for (int i = 0; i < length; i++) {
            returnChars[i] = chars[newRandom(min, max)];
        }
        return String.valueOf(returnChars);
    }

    /**
     * 赋值为一个 MIN 和 MAX 范围内的随机数
     * int randNumber = rand.nextInt(MAX - MIN + 1) + MIN;
     */
    public static int newRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static boolean isEmpty(String str) {
        return null == str || "".equals(str);
    }

}
