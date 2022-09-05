import java.util.Scanner;

// HACKER RANK : LEFT JUSTIFY PROBLEM:

public class left_justify{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("=======================");
            for(int i= 0;i<=3;i++){
                String a = input.next();
                int b = input.nextInt();
                System.out.printf("%-14s %03d\n",a,b);
            }
        }
        System.out.println("=======================");
        
    }
}