import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {
        if(dane.length() <= 5) {
            throw new NiepoprawnyFormatDanychException("dlugosc danych jest za krotka");
        } else {
            System.out.println(dane);
        }
    }

    public static void main(String[] args) throws NiepoprawnyFormatDanychException{

        /*PlanPodrozy plan = new PlanPodrozy(new LotMiedzynarodowy());
        plan.wystawBilet();
        plan = new PlanPodrozy(new Koncert());
        plan.wystawBilet();
        plan = new PlanPodrozy(new BramkaNaAutostradzie());
        plan.wystawBilet();*/

        /*Biuro drukarka = new Biuro(new StandardowyPrinter());
        String tekst1 = "Dzień dobry";
        drukarka.drukujDokument(tekst1);*/

        /*Samochod engine = new Samochod(new BenzynowySilnik());
        engine.start();
        engine.stop();*/

        /*Uzytkownik notify = new Uzytkownik(new Email());
        String tekst2 = "modernizacja";
        notify.powiadomOModernizacji(tekst2);*/

        /*Piwo piwo = new Piwo();
        try {
            piwo.checkAge(16);
        } catch(IllegalArgumentException e) {
            System.out.println("Klient jest niepelnoletni");
        }

        try {
            piwo.checkAge(20);
        } catch(IllegalArgumentException e) {
            System.out.println("Klient jest niepelnoletni");
        }*/

        /*Scanner scanner = new Scanner(System.in);
        boolean bool = true;
        while(bool) {
            try {
                System.out.println("podaj a: ");
                int a = scanner.nextInt();
                System.out.println("podaj b: ");
                int b = scanner.nextInt();
                int c = a/b;
                System.out.println(c);
                bool = false;
            }
            catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Wprowadz dane poprawnie");
                scanner.next();
            }
        }*/

        String tekst1 = "1234567";
        String tekst2 = "123";

        sprawdzFormatDanych(tekst1);
        sprawdzFormatDanych(tekst2);

    }
}