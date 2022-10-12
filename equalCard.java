import java.util.Scanner;

//codechef solution

class equalCard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int k = 52/n;
            k = 52-(k*n);
            System.out.println(k);
        }
        sc.close();
    }
}