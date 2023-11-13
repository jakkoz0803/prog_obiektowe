public class Settings {
    public String wersja;
    public String jezyk;
    public Settings() {};
    public Settings(String wersja, String jezyk) {
        this.wersja = wersja;
        this.jezyk = jezyk;
    }

    public static defaultSettings(String wersja, String jezyk) {
        this.wersja = "1.8.9";
        this.jezyk = "English";
    }
}
