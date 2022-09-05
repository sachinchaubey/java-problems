
// HACKER RANK: IntToString problem solving;

import java.util.Scanner;

public class IntToString{
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int i = in.nextInt();

            String s = Integer.toString(i);

            if( i == Integer.parseInt(s)){
                System.out.println("Good job");
            }
            else{
                System.out.println("Wrong answer"); 
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 

    }
}