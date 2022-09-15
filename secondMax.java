import java.util.Arrays;
import java.util.Scanner;

// codeChef practice

class secondMax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            // int n = sc.nextInt();
            int a[] = new int[3];
            for(int i = 0; i < 3; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[1]);
        }
        sc.close();
    }
}