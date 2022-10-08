import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//array to hashset

class hashpra{
    public static void main(String[] args){
        // int a[] = {1,3,3,4,3,6};
        // int n = a.length;
        String[] s = {"a","b","c","b" };
        Set<String> set = new HashSet<>(Arrays.asList(s));
        System.out.println(set);
    }
}