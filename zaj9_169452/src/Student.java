/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student>, Cloneable{
    String name;
    double averageGrade;
    int yearOfBirth;

    public Student(String name, double averageGrade, int yearOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }

    public Student(double averageGrade) {
        name = "default";
        yearOfBirth = 2000;
        this.averageGrade = averageGrade;
    }

    public Student(int yearOfBirth) {
        name = "default";
        this.yearOfBirth = yearOfBirth;
        averageGrade = 4.0;
    }

    @Override
    public String toString() {
        return "" + yearOfBirth;

    }

    @Override
    public int compareTo(Student o) {
        return (int)Math.signum(o.averageGrade - this.averageGrade);
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        /*ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1999));
        studentList.add(new Student(1998));
        studentList.add(new Student(1990));
        studentList.add(new Student(2004));
        System.out.println(studentList);
        Collections.sort(studentList,new YearStudentComparator());
        System.out.println(studentList);
        Student s1 = new Student("Stefan",3.5,1998);
        Student s2 = (Student)s1.clone();
        s1.yearOfBirth = 2005;
        System.out.println(s1 + " " + s2);
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            // TODO: copy mutable state here, so the clone cos tam
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class YearStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int)Math.signum(o2.yearOfBirth - o1.yearOfBirth);
    }
}

class AverageGradeStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int)Math.signum(o2.averageGrade - o1.averageGrade);
    }
}
*/