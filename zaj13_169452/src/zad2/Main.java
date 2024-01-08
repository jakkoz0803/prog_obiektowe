package zad2;
public class Main {
    public static void main(String[] args) {
        BenzynowySilnik s1 = new BenzynowySilnik();
        Samochod sam1 = new Samochod(s1);
        sam1.start();
        sam1.stop();
    }
}