import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        Cat kot = new Cat();
        Dog piez = new Dog();
        kot.makeNoise();
        piez.makeNoise();
        System.out.println("-------------------------------------");
        TestMyComparator porownaj = new TestMyComparator();
        int zad2 = porownaj.compare(6,5);
        System.out.println(zad2);
        System.out.println("-------------------------------------");
        /*CurrencyConverter dolar = new CurrencyConverter();
        double zad3 = Math.round(dolar.convertToUSD(100.0*161.35))/100.0;
        System.out.println(zad3);*/
        System.out.println("-------------------------------------");

    }
}