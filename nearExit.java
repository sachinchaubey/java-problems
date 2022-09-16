// codeChef contest #START56D
import java.util.Scanner;
class nearExit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n --> 0){
            int a = sc.nextInt();
            if(a <= 50){
                System.out.println("left");
            }
            else if (a > 50 && a <= 100){
                System.out.println("Right");
            }
        }
        sc.close();
    }
}