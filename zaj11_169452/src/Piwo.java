public class Piwo {

    public void checkAge(int age) {
        if(age < 18) {
            throw new IllegalArgumentException("Klient jest niepelnoletni");
        } else {
            System.out.println("Piwo piwo dobre piwo");
        }
    }
}
