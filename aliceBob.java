import java.util.Scanner;

// codechef problem 

class aliceBob{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if(A+B == C){
                System.out.println("yes");
            }
            else if(A+C == B){
                System.out.println("yes");
            }
            else if(B+C == A){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            n--;
        }
        sc.close();
    }

}