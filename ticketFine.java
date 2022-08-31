import java.util.Scanner;

class ticketFine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int wot = (Y - Z);
            int fine = wot * X;
            System.out.println(fine);
            n--;
        }
        sc.close();
    }
}