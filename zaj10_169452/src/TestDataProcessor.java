public class TestDataProcessor {
    public static void main(String[] args) {
        DataProcessor test1 = new TextProcessor();
        String odwrocone = test1.processData("test 123 czesc");
        System.out.println("odwrocone: " + odwrocone);
        boolean czyValid = test1.isValid("test 456 dzien dobry");
        System.out.println(czyValid);

        DataProcessor test2 = new NumberProcessor();
        String liczba = test2.processData("19.99");
        System.out.println(liczba);
        boolean czyLiczbaValid = test2.isValid("19.99");
        System.out.println(czyLiczbaValid);
    }
}
