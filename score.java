import java.util.Scanner;

// codechef problem

class score{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println((A/10)*B);
            n--;
        }
        sc.close(); 
    }
}