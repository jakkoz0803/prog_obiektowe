/*import java.util.Comparator;

import java.util.Date;

public class Klient implements Comparable<Klient> {
    public String imie;
    public int nrKlienta;
    public Date ostatnieLogowanie;
    public Klient(String imie, int nrKlienta, Date ostatnieLogowanie) {
        this.imie = imie;
        this.nrKlienta = nrKlienta;
        this.ostatnieLogowanie = ostatnieLogowanie;
    }

    @Override
    public String toString() {
        return "" + this.ostatnieLogowanie.getYear() + " " this.ostatnieLogowanie.getMonth() + " " + this.ostatnieLogowanie.getDay();
    }

    @Override
    public int compareTo(Klient o) {
        if(o.ostatnieLogowanie.after(this.ostatnieLogowanie)) {
            return 1;
        } else if(o.ostatnieLogowanie.before(this.ostatnieLogowanie)) {
            return -1;
        } else {
            return 0;
        }
    }
}
*/