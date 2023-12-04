/*
import java.time.LocalDate;
import java.util.Comparator;

public class Pracownik implements Comparable<Pracownik> {
    public String imie;
    public double pensja;
    public LocalDate dataZatrudnienia;

    public Pracownik(String imie, double pensja, LocalDate dataZatrudnienia) {
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return "" + pensja;
    }

    @Override
    public int compareTo(Pracownik o) {
        return (int)Math.signum(o.pensja - this.pensja);
    }

}
class PensjaComparator implements Comparator<Pracownik> {

    @Override
    public int compare(Pracownik o1, Pracownik o2) {
        return (int)Math.signum(o1.pensja - o2.pensja);
    }
}

*/