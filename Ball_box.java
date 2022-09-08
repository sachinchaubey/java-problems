import java.util.Scanner;

class Ball_box{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int k = Y*(Y+1)/2;
            if(X >= k){
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