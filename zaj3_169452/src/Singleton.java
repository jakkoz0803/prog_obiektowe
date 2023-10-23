public final class Singleton {
    private Singleton() {}
    static final Singleton instance = new Singleton();

    public static Singleton getInstance()
    {
        return instance;
    }
}
