import java.util.Scanner;


public class age_checker {

    public static void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)){
        System.out.println("enter your age");
        int age = scanner.nextInt();
    


        if (age >= 75){
            System.out.println("Ok Boomer");
        }

        else if ( age >= 16 ){
            System.out.println("you are adult");
        }

        else{
            System.out.println("you are not adult:" );
        }
        }
    }
    
}