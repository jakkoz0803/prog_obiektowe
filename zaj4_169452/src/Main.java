public class Main {
    public static void main(String[] args) {
        Person osoba = new Person("","Kowalski",-35);
        System.out.println(osoba.firstName);
        System.out.println(osoba.lastName);
        System.out.println(osoba.age);
        System.out.println(osoba.toString());

        Vehicle pojazd = new Vehicle("fiat","",2050);
        System.out.println(pojazd.toString());

        Book ksiazka = new Book("Ksiazka kucharska","Gordon Ramsay",200);
        System.out.println(ksiazka.toString());

        Rectangle prostokat = new Rectangle(4,8);
        System.out.println(prostokat.area(prostokat.getWidth(), prostokat.getHeight()));
        System.out.println(prostokat.perimeter(prostokat.getWidth(), prostokat.getHeight()));
    }
}