import java.util.ArrayList;
// import java.util.Arrays;

class add2{
    public static void main(String[] args){
        // int a1 = 3;
        // int a2 = 4;
        // int a3 = a1 + a2;
        // System.out.println(a3);
        int a[] = {2,4};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ;i < a.length; i++){
            list.add(a[i]);
        }
        System.out.println(list);

        // int c = 0;
        // for(int b : a){
        //     c = c + b;
        // }
        // System.out.println(c);
    }
}