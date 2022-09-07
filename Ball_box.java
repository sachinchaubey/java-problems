import java.util.Scanner;

class Ball_box{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X < Y){
                System.out.println("no");
            }
            else if((X / Y) == 10){
                System.out.println("yes");
            }
            else if(X == 1 && Y == 1){
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