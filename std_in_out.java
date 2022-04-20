// HACKER RANK PROBLEM: stdin and stdout II (easy problem)

// print given int ,double, string in form of string ,double,int in new line

import java.util.Scanner;

public class std_in_out{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the int no: ");
            int a = input.nextInt();

            System.out.println("Enter the Double no: ");
            double b = input.nextDouble();

            input.nextLine();


            System.out.println("Enter the String no: ");
            String c = input.nextLine();

            // print all outputs
            System.out.println("String: " + c);
            System.out.println("Double: " + b);
            System.out.println("Int: " + a);
        }

        
    }
}