import java.time.LocalDate;
import java.util.Comparator;

public class Samochod implements Comparable<Samochod> {
    public String marka;
    public int rokProdukcji;
    public double cena;
    public Samochod(String marka, int rokProdukcji, double cena) {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
    }
    public Produkt(int rokProdukcji) {
        this.marka = "default";
        this.rokProdukcji = rokProdukcji;
        this.cena = 0;
    }

    @Override
    public String toString() {
        return "" + this.rokProdukcji;
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
