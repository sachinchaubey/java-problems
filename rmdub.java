import java.util.Arrays;
import java.util.HashSet;

// import javax.sound.midi.Soundbank;

class rmdub{
    public static void main(String[] args){
        int a[] = {-3,-1,0,0,0,3,3};
        HashSet<Integer> set = new HashSet<Integer>();
        for(int arr:a){
            set.add(arr);
        }
        // System.out.println(set.size());
        // System.out.println(set);
        int n = set.size();
        int j = 0;
        for(int arr:set){
            a[j++] = arr;
        }
        // int[] new = new int[n];
        int[] arrr = new int[n];
        for(int i = 0;i<n;i++){
            arrr[i] = a[i];
        }
        System.out.println(Arrays.toString(arrr));
    }
}