import java.util.Scanner;

// codechef practice

class volume{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n --> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a = a - b;
            System.out.println(Math.abs(a));
        }
        sc.close();
    }
}