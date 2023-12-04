import java.time.LocalDate;
import java.util.Comparator;

public class Produkt implements Comparator<Produkt> {
    public String nazwa;
    public double cena;
    public LocalDate dataWaznosci;
    public Produkt(String nazwa, double cena, LocalDate dataWaznosci) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataWaznosci = dataWaznosci;
    }
    public Produkt(LocalDate dataWaznosci) {
        this.nazwa = "default";
        this.cena = 1;
        this.dataWaznosci = dataWaznosci;
    }

    @Override
    public String toString() {
        return "" + this.dataWaznosci.getYear() + "/" + this.dataWaznosci.getMonth() + "/" + this.dataWaznosci.getDayOfMonth();
    }

    @Override
    public int compareTo(Produkt o) {
        if(o.dataWaznosci.isAfter(this.dataWaznosci)) {
            return 1;
        } else if(o.dataWaznosci.isBefore(this.dataWaznosci)) {
            return -1;
        } else {
            return 0;
        }
    }
}
class DataComparator implements Comparator<Produkt> {

    @Override
    public int compare(Produkt o1, Produkt o2) {
        if(o1.dataWaznosci.isAfter(o2.dataWaznosci)) {
            return 1;
        } else if(o1.dataWaznosci.isBefore(o2.dataWaznosci)) {
            return -1;
        } else {
            return 0;
        }
    }
}
