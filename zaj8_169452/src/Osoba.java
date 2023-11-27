public record Osoba(String name, int age) {

    public Osoba {
        if(age < 0) {
            age = 0;
        }
    }
    public Osoba(String name) {
        this(name, 15);
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
    public static void greet() {
        System.out.println("siema");
    }
}
