//codechef contest 
//starter 57D
import java.util.Scanner;
class str57{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a >= 2*b){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        sc.close();
    }

}