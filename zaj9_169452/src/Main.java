import java.sql.Array;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<Pracownik> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(new Pracownik("Arek",4800, LocalDate.of(2020, 1, 8)));
        listaPracownikow.add(new Pracownik("Czarek",5300,LocalDate.of(2019, 4, 16)));
        listaPracownikow.add(new Pracownik("Darek",6500,LocalDate.of(2017, 5, 30)));
        listaPracownikow.add(new Pracownik("Jarek",4000,LocalDate.of(2021, 12, 26)));
        listaPracownikow.add(new Pracownik("Marek",4300,LocalDate.of(2020, 3, 1)));
        System.out.println(listaPracownikow);
        Collections.sort(listaPracownikow,new PensjaComparator());
        System.out.println(listaPracownikow);*/

        /*ArrayList<Klient> listaKlientow = new ArrayList<>();
        listaKlientow.add(new Klient("John",1,new Date(2023, Calendar.JANUARY,5)));
        listaKlientow.add(new Klient("John",1,new Date(2023, Calendar.DECEMBER,3)));
        listaKlientow.add(new Klient("John",1,new Date(2023, Calendar.DECEMBER,2)));
        listaKlientow.add(new Klient("John",1,new Date(2023, Calendar.NOVEMBER,15)));
        listaKlientow.add(new Klient("John",1,new Date(2023, Calendar.DECEMBER,1)));*/

        /*ArrayList<Osoba> listaOsob = new ArrayList<>();
        listaOsob.add(new Osoba("Joe",180,LocalDate.of(2003,8,23)));
        listaOsob.add(new Osoba("Joe",185,LocalDate.of(2003,7,31)));
        listaOsob.add(new Osoba("Joe",170,LocalDate.of(2003,8,15)));
        listaOsob.add(new Osoba("Joe",176,LocalDate.of(2003,4,4)));
        listaOsob.add(new Osoba("Joe",188,LocalDate.of(2003,2,13)));
        System.out.println(listaOsob);
        Collections.sort(listaOsob, new WzrostComparator());
        System.out.println(listaOsob);*/

        ArrayList<Produkt> listaProduktow = new ArrayList<>();
        listaProduktow.add(new Produkt(LocalDate.of(2023,12,14)));
        listaProduktow.add(new Produkt(LocalDate.of(2024,2,7)));
        listaProduktow.add(new Produkt(LocalDate.of(2023,12,25)));
        listaProduktow.add(new Produkt(LocalDate.of(2025,5,20)));
        listaProduktow.add(new Produkt(LocalDate.of(2024,1,8)));
        System.out.println(listaProduktow);
        Collections.sort(listaProduktow,new DataComparator());
        System.out.println(listaProduktow);
    }
}