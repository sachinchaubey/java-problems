import java.util.Scanner;

// codechef 

class subscri{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int A = sc.nextInt();
            if(A > 30){
                System.out.println("yes");
            }
            else if(A <= 30){
                System.out.println("no");
            } 
            n--;
        }
        sc.close();  
    }
}