import java.net.SocketTimeoutException;
import java.util.Scanner;

public class fizz_buzz{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0; i<=n ; i++){
            if(i == 0){
                System.out.println(i);
            }
            else if( i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizzbuzz");
            }
            else if ( i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            } 
        } 
    }
}