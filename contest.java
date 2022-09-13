import java.util.Scanner;

// codechef problem

class contest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            System.out.println(A-B);
            System.out.println((A-B)-C);
            n--;
        }
        sc.close();
    }
}