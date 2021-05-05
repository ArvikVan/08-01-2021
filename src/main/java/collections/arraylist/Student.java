package collections.arraylist;

public class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student { "
                + "name = '" + name + '\''
                + ", sex = " + sex
                + ", age = " + age
                + ", course = " + course
                + ", avgGrade = " + avgGrade
                + '}';
    }
}
