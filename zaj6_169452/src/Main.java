import java.util.ArrayList;
public class Main {
    public static ArrayList<Integer>mergeArrays(int[] tab1, int[] tab2)
    {
        ArrayList<Integer>result = new ArrayList<Integer>();
        for(int i : tab1) result.add(i);
        for(int i : tab2) result.add(i);
        return result;
    }
    public static void main(String[] args) {

        /*var buf = new StringBuffer("teest");
        Util util = null;
        util.capitalizeEverySecond(buf);
        System.out.println(buf.toString());*/

        /*Car auto = new Car("marka","model",4);
        System.out.println(auto.brand);
        System.out.println(auto.model);
        System.out.println(auto.numberOfDoors);*/

        /*Vehicle toyota = new Vehicle();
        toyota.drive();
        Car tesla = new Car();
        tesla.drive();*/

        int[]tab1 = {1,2,3};
        int[]tab2 = {4,5,6};
        ArrayList<Integer> nList = mergeArrays(tab1,tab2);
        for(int i : nList) System.out.print(i);
    }
}