// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Hammer mlotek = new Hammer("mlot");
        System.out.println(mlotek.toolName);
        //--------
        Pojazd toyota = new Pojazd();
        toyota.jedz();
        //---------
        Kalkulator pierwsze = new Kalkulator();
        KalkulatorRozszerzony drugie = new KalkulatorRozszerzony();
        System.out.println(pierwsze.dodaj(3,5));
        System.out.println(drugie.dodaj(3,5,4));
        System.out.println(drugie.dodaj(3,5));
        //---------
        Komputer wlacz = new Komputer();
        wlacz.uruchom();
        //---------
        Programista darek = new Programista();
    }
}