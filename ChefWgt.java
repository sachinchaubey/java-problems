import java.util.Scanner;


class ChefWgt{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int W = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if(W == X || W == Y || W == Z){
                System.out.println("YES");
            }
            else if( W == X + Y || W == X + Z || W == Y + Z ){
                System.out.println("YES");
            }
            else if( W == X + Y + Z){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            n--;
        } 
        sc.close();
    }
}