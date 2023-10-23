public class Produkt {
    public static int liczbaProduktow;
    public static final int MAX_PRODUKTOW = 3;
    public Produkt()
    {
        if(liczbaProduktow < MAX_PRODUKTOW)
        {
            liczbaProduktow++;
        }
        else
        {
            System.out.println("osiagnieto limit");
        }
    }
    public static int zwrocLicznik()
    {
        return liczbaProduktow;
    }

}
