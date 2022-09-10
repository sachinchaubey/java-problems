import java.util.Scanner;

// codechef practice

class ageLimit{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int A = sc.nextInt();
            if(A >= X && A < Y){
                System.out.println("Yes");
            }
            else{
                System.out.println("NO");
            }
            n--;
        }
        sc.close(); 
        
    }
}