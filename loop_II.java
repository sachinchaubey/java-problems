import java.util.Scanner;

// Hacker rank problem : loop II problem

public class loop_II{
    
        public static void  series(int a , int b, int n) {
            int s = a;
            for(int i = 0; i<n ; i++){
                s = s + ((int)Math.pow(2,i)) * b;
                System.out.print(s + " ");
            }
            System.out.println("");
        }
public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            int q = sc.nextInt();
            nextLine();
            int a,b,n;

            while( q --> 0){
                a = sc.nextInt();
                b = sc.nextInt();
                n = sc.nextInt();
                nextLine();

                series(a,b,n);

            }
            // series(a, b, n);
        }

    }
private static void nextLine() {
}
}