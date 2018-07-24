package demo.subject1.bean;

/**
 * 学生
 */
public class Student {
    /**
     * 班级号
     */
    private String classNo;
    /**
     * 姓名
     */
    private String username;
    /**
     * 年龄
     */
    private int age;
    /**
     * 性别
     */
    private String sex;

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classNo='" + classNo + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
