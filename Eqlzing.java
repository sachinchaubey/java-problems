import java.util.Scanner;
import java.lang.Math;

// codechef Equaling No probelm

class Eqlzing{
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N >= 1 && N <= 100){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int diff = Math.abs(A - B);
            if(A >= 1 && A <= 100 && B >= 1 && B <= 100){
                if(A == B){
                    System.out.println("Yes");
                }
                else if(diff % 2 == 0){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("NO");
                }
            }
            N--;
        }
        sc.close();
    }
}