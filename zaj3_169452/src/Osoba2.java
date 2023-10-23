public class Osoba2 {
    public String imie;
    public static int licznik;

    public Osoba2()
    {
        this("Default");
    }

    public Osoba2(String imie)
    {
        this.imie = imie;
        licznik++;
    }

    public static int zwrocLicznik()
    {
        return licznik;
    }
}
