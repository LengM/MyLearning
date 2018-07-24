package demo.subject1.test;

import demo.subject1.bean.Student;
import demo.subject1.util.StudentUtil;

import java.util.*;
import java.util.stream.Collectors;

public class StudentTest {

    private static List<Student> studentList;

    private static Map<String, List<Student>> studentsMap;

    public static void main(String[] args) {

        getStudentList();
        studentsMap = studentList.stream().collect(Collectors.groupingBy(Student::getClassNo));
        sortAndOutput();

        upperCaseAndOutput();

        String stringNames = getStudentNames();
        splitNamesAndOutput(stringNames);

    }

    private static void getStudentList() {
        studentList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            studentList.add(StudentUtil.newStudent());
        }
        studentList.add(StudentUtil.newStudent("James"));
        studentList.add(StudentUtil.newStudent("Johon"));
        studentList.add(StudentUtil.newStudent("Lily"));
        studentList.add(StudentUtil.newStudent("Sophia"));
        studentList.add(StudentUtil.newStudent("Smith"));
    }

    private static void sortAndOutput() {
        System.out.println("\n将mapList每个value中的list按照年龄进行排序，得到排序后的mapList，将排序后的map中的内容打印到控制台，每个班级一行，格式是 班级号：姓名1（年龄），姓名2（年龄），姓名3（年龄）……：");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        studentsMap.forEach((classNo, students) -> {
            // students.sort((o1, o2) -> o1.getAge() > o2.getAge() ? 1 : (o1.getAge() == o2.getAge() ? 0 : -1));
            students.sort(Comparator.comparingInt(Student::getAge));
            StringBuilder print = new StringBuilder(classNo + "：");
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                print.append(student.getUsername()).append("(").append(student.getAge()).append(")");
                if (students.size() > i + 1) {
                    print.append("，");
                }
            }
            System.out.println(print.toString());
        });
    }

    private static void upperCaseAndOutput() {
        System.out.println("\n将studentList中所有人的名字进行处理，首字母大写，第5个字母大写，第10个字母大写。输出所有姓名以a-g开头或者姓名包含am的姓名：");
        System.out.println("------------------------------------------------------------------------------------------------------");
        studentList.forEach(student -> {
            student.setUsername(StudentUtil.someIndexToUpperCase(student.getUsername()));
            if (StudentUtil.isStartWithAtoG(student.getUsername()) || student.getUsername().toLowerCase().contains("am")) {
                System.out.println(student.getUsername());
            }
        });
    }

    private static String getStudentNames() {
        StringBuilder nameString = new StringBuilder();
        studentList.forEach(student -> nameString.append(student.getUsername()).append(","));
        return nameString.toString().substring(0, nameString.length() - 1);
    }

    private static void splitNamesAndOutput(String studentNames) {
        System.out.println("\n将studentNames以逗号为分隔符拆分成数组，获得所有人的名字的数组，输出到控制台：");
        System.out.println("-----------------------------------------------------------------");
        String[] nameArray = studentNames.split(",");
        for (String name : nameArray) {
            System.out.println(name);
        }
    }

}
