public class Calc {
    public static void main(String[] args) {
        double wynikDodawania = Kalkulator.dodaj(5,3);
        System.out.println("Dodawanie: " + wynikDodawania);
        double wynikOdejmowania = Kalkulator.odejmij(5,3);
        System.out.println("Odejmowanie: " + wynikOdejmowania);
        double wynikMnozenia = Kalkulator.pomnoz(5,3);
        System.out.println("Mnozenie: " + wynikMnozenia);
        double wynikDzielenia = Kalkulator.podziel(5,3);
        System.out.println("Dzielenie: " + wynikDzielenia);
    }
}
