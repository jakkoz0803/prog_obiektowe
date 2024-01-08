package zad5;

public final class Main {
    private Main() {}
    static Person findYoungest(DoubleElement<? extends Person> pair) {
        return pair.left().getAge() < pair.right().getAge() ? pair.left() : pair.right();
    }
    public static void main(String[] args) {
        System.out.println(findYoungest(new DoubleElement<Student>(new Student(5),new Student(25))).getAge());
    }
}
