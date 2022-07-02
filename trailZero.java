import java.util.Scanner;

class trailZero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // int num = sc.nextInt();
        int rev = 0;
        for(int i = 5; i<=n ; i = i*5){
            rev = rev + n/i;
        }
        System.out.println("No of trailing zeros of factorial  "+n+" is "+rev);
    }
}