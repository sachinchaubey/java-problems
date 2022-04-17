// import java.util.*;
import java.util.ArrayList;

public class two_d_arraylist{
    public static void main(String[] args){

        ArrayList<ArrayList<String>> Grosary = new ArrayList<>();

        ArrayList<String> cockList = new ArrayList<>();

        cockList.add("Cokacola");
        cockList.add("pepsi");
        cockList.add("Coffes");

        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Mangos");
        fruitList.add("banana");
        fruitList.add("orange");

        Grosary.add(cockList);
        Grosary.add(fruitList);

        System.out.println(Grosary);

    }
}