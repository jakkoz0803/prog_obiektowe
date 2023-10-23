public class Kalkulator {
    public static double dodaj(double a, double b)
    {
        return a+b;
    }
    public static double odejmij(double a, double b)
    {
        return a-b;
    }
    public static double pomnoz(double a, double b)
    {
        return a*b;
    }
    public static double podziel(double a, double b)
    {
        if(b == 0)
        {
            System.out.println("Nie mozna dzielic przez 0");
            return -1;
        }
        else return a/b;
    }
}
