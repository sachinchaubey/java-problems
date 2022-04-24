import java.util.Scanner;

// Hacker rank problem : loop II problem

public class loop_II{
    public static void main(String[] args){
        Scanner q_int = new Scanner(System.in);
        int q = q_int.nextInt();
        System.out.println("enter the no");
        Scanner a_int = new Scanner(System.in);
        int a = a_int.nextInt();
        int b = a_int.nextInt();
        int n = a_int.nextInt();
        int c = 1;
        int k = 0;

        for(int i = 0; i<n ; i++){
            if( i == 0){
                c =  1;
                k = c * b;
            }
            else{
                c = (c * 2);
                k = c * b;
            }

            a = a + k;

            System.out.print( a + " ");
        }
    }
}