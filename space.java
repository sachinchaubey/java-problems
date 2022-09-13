import java.util.Scanner;

//codechef practice

class space{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int s = B + (C*2);
            if(s <= A){
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