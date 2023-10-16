import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Float> listaliczb = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            listaliczb.add(random.nextFloat(10));
        }

        ArrayList<Float> listaliczb2 = new ArrayList<>();

        System.out.println(listaliczb);

        float srednia = average(listaliczb);
        System.out.println("srednia = " + srednia);

        srednia = average(listaliczb2);
        System.out.println("srednia = " + srednia);
        //--------------------------------------------------------
        ArrayList<Integer> listaZZerami = new ArrayList<>();
        for(int i = 0; i < 7; i++)
        {
            listaZZerami.add(random.nextInt(5));
        }

        System.out.println(listaZZerami);
        System.out.println("ile zer: " + countZeros(listaZZerami));
        //--------------------------------------------------------

    }
    public static float average(ArrayList<Float> lista)
    {
        if(lista.size() == 0)
        {
            return 0;
        }
        float suma = 0;
        for(int i = 0; i < lista.size(); i++)
        {
            suma += lista.get(i);
        }
        float srednia = suma / lista.size();
        return srednia;
    }

    public static int countZeros(ArrayList<Integer> lista)
    {
        int licznik = 0;
        for(int i = 0; i < lista.size(); i++)
        {
            if(lista.get(i) == 0)
            {
                licznik++;
            }
        }
        return licznik;
    }
    String napis = "Ala ma kota";


    /*
    public static StringBuilder removeRepetitions(String string)
    {
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> usedLetters = new ArrayList<Character>();
        for(int i = 0; i < string.length(); i++)
        {
            char currentLetter = string.charAt(i);
            if(!usedLetters.contains(currentLetter))
            {
                sb.append(currentLetter);
                usedLetters.add(currentLetter);
            }
        }
        System.out.println(sb.toString());
    }
    */

    public static StringBuilder reverseString(StringBuilder sb2)
    {
        StringBuilder revSb2 = new StringBuilder(sb2.reverse());
        return revSb2;
    }

}