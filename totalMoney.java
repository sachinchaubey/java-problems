import java.util.Scanner;

// code chef practice

class totalMoney{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n --> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((10*a)+(90*b));
        }
        sc.close();
    }
}