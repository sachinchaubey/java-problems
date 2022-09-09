import java.util.Scanner;

// sep long chlng 2022 codechef

class Bob_bank{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int W = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            Z = W+((X-Y)*Z);
            System.out.println(Z);
            n--;
        }
        sc.close();
    }
}