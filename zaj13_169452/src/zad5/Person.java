package zad5;

public class Person {
    private final int age;
    public Person(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}

/*
Stwórz klasę generyczną DoubleElement<T>, która przechowuje
dwa obiekty tego samego typu. Utwórz dwie klasy: Person i Student,
gdzie Student dziedziczy po Person.
Następnie napisz statyczną metodę generyczną findYoungest,
która przyjmuje DoubleElement<? extends Person>.
Metoda powinna zwracać element mniejszy według
własnego kryterium porównania, na przykład wieku.
 */