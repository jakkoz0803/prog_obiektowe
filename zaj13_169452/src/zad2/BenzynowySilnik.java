package zad2;

public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("wrr");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("pyr pyr");
    }
}
