import java.util.ArrayList;

public class besic_array{
    public static void main(String[] args){

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("dog");
        animals.add("cat");
        animals.add("birds");

        // for add new element with specific place use set method
        animals.set(1,"elephent");

        // for remove elemetn use remove method
        animals.remove(1) ;
        
        // for clear use clear method
        // animals.clear();


            System.out.println(animals);
    }
}