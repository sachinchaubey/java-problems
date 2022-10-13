import java.util.Scanner;

//codechef contest

class papaerCutting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println((n/k) * (n/k));
        } 
        sc.close();
    }
}