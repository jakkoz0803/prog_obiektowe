import java.time.LocalDate;
import java.util.Comparator;

public class Osoba implements Comparable<Osoba> {
    public String imie;
    public int wzrost;
    public LocalDate dataUrodzenia;

    public Osoba(String imie, int wzrost, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.wzrost = wzrost;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return "" + wzrost;
    }

    @Override
    public int compareTo(Osoba o) {
        return (int)Math.signum(o.wzrost - this.wzrost);
    }

}
class WzrostComparator implements Comparator<Osoba> {

    @Override
    public int compare(Osoba o1, Osoba o2) {
        return (int)Math.signum(o2.wzrost - o1.wzrost);
    }
}