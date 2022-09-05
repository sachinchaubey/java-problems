// Parallelogram formula : A = base * height
import java.util.Scanner;

public class hacker_rank{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Base is : ");
        int B = sc.nextInt();
        System.out.print("Height is : ");
        int H = sc.nextInt();
        sc.close();
        if(B > 0 && H > 0 ){
            int Area = B*H;
            System.out.println("Area of Parallelogram is : "+Area);
        }
        else if(B <= 0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}