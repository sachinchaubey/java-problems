import java.util.Scanner;

// sep2022 long clng codechef

class chef_wire{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int X = sc.nextInt();
            X = (2*N + 2*M)*X;
            System.out.println(X);
            n--;
        }
        sc.close();

    }
}