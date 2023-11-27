public class Main {
    public static void main(String[] args) {

        /*Person osoba1 = new Person("Stefan",24);
        System.out.println(osoba1.age() + " " + osoba1.name());
        Person osoba2 = new Person("Stefan",24);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(osoba1.equals(osoba2));
        System.out.println(osoba1);
        Person.greet();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Person osoba3 = new Person("Maciek");
        System.out.println(osoba3);
        Person osoba4 = new Person("Maciek",-13);
        System.out.println(osoba4);*/

        BookDT0 ksiazka1 = new BookDT0("1984", "Orwell", 39.99, 1949);
        BookDT0 ksiazka2 = new BookDT0("tytul", "autor", 49, 2014);
        System.out.println(ksiazka1);
        System.out.println(ksiazka2);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        Address adres1 = new Address("Polna", 4, "81-104", "Gdynia");
        System.out.println(adres1);
        Person person1 = new Person("Jan", "Nowak", adres1);
        System.out.println(person1);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        Point2D punkt1 = new Point2D(3.5,2);
        Point2D punkt2 = new Point2D(6.5,-2); // oczekiwany dystans: 5
        System.out.println(punkt1);
        System.out.println(punkt2);
        System.out.println("odleglosc: " + punkt1.distanceTo(punkt2));
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    }
}
