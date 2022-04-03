import java.util.Scanner;

public class age_checker {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextInt();
        


        if (age >= 75){
            System.out.println("Ok Boomer");
        }

        else if ( age >= 18 ){
            System.out.println("you are adult");
        }

        else{
            System.out.println("you are not adult:" );
        }
    }
}