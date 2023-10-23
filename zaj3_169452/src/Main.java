import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*Ksiazka k1 = new Ksiazka();
        k1.rokWydania = 2000;
        k1.tytul = "Harry Potter 2";
        k1.autor = "JKR";

        Ksiazka k2 = new Ksiazka("Pani Jeziora",
                "Andrzej Sapkowski",
                1999);

        System.out.println(k2.autor);

        Ksiazka k3 = new Ksiazka();
        System.out.println(k3.tytul);
        //==================================== */
        Samochod s1 = new Samochod();
        System.out.println(s1.model);
        Samochod s2 = new Samochod("Fiat","126p");
        System.out.println(s2.marka);
        System.out.println(s2.rokProdukcji);
        System.out.println("//====================================");
        //====================================
        Osoba os1 = new Osoba("Jakub","Kozicki");
        System.out.println(os1.wiek);
        System.out.println(os1.imie);
        System.out.println("//====================================");
        //====================================
        Kwadrat k1 = new Kwadrat();
        System.out.println(k1.bok);
        Kwadrat k2 = new Kwadrat(15);
        System.out.println(k2.bok);
        System.out.println("//====================================");
        //====================================
        Student st1 = new Student("Jan","Kowalski");
        System.out.println(st1.nazwisko);
        System.out.println(st1.kierunekStudiow);
        System.out.println("//====================================");
        //====================================
        System.out.println(Osoba2.zwrocLicznik());
        Osoba2 o1 = new Osoba2();
        System.out.println(Osoba2.zwrocLicznik());
        Osoba2 o2 = new Osoba2();
        Osoba2 o3 = new Osoba2();
        System.out.println(Osoba2.zwrocLicznik());
        System.out.println(Osoba2.zwrocLicznik());
        System.out.println("//====================================");
        //====================================
        double a = Matematyka.PI * 10;
        System.out.println(a);
        System.out.println("//====================================");
        //====================================
        double liczba1 = 8;
        double liczba2 = 0;
        System.out.println(Kalkulator.dodaj(liczba1,liczba2));
        System.out.println(Kalkulator.odejmij(liczba1,liczba2));
        System.out.println(Kalkulator.pomnoz(liczba1,liczba2));
        System.out.println(Kalkulator.podziel(liczba1,liczba2));

        Calc pierwsze = new Calc();
        System.out.println();
        System.out.println("//====================================");
        //====================================
        Produkt p1 = new Produkt();
        Produkt p2 = new Produkt();
        Produkt p3 = new Produkt();
        System.out.println(Produkt.zwrocLicznik());
        Produkt p4 = new Produkt();
        System.out.println(Produkt.zwrocLicznik());
    }
}