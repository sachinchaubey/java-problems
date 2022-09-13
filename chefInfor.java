
import java.util.Scanner;

// codechef practice

class chefInfor{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println((X*7) - Y);
            n--;
        }
        sc.close(); 
        
    }
} 