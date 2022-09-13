import java.util.Scanner;

public class burgers {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A == B){
                System.out.println(A);
            }
            else if(A >= B){
                System.out.println(B);
            }
            else if(B >= A){
                System.out.println(A);
            }
            n--;
        }
        sc.close(); 
    }
}
