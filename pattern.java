import java.util.Scanner;
class pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = (t+4)/2;          // *? this n is define for spacing;
        int s = t - ((t/2) + 1);      // *! this s is define for where pyramid is decrease;

        // *TODO: this program are made in 4 parts : 
        // this for loop is first part: the open box part;
        for(int i = 1; i <= t-1; i++){
            System.out.print("*");
            for(int j = 1; j <= (t+4)-2 ; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        // base of the box part;
        for(int i = 1; i <= t+4; i++ ){
            System.out.print("*");
        }
        System.out.println();

        // *? this part is the 3rd part of the program : 
        // in this loop we made pyramid in incr order:
        for(int i = 1; i <= t/2 + 1; i++){
            for(int j = 1; j<= n; j++){
                System.out.print(" ");     // *! this is space that we need in the programm
            }
            // System.out.println("*");
            for(int k = i; k <= i; k++){
                for(int j = 1; j<=k ; j++ ){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        // *! this part is the last part of out program:
        // in this loop we made pyramid in decr order:
        for(int i = 1; i <= s ; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(" ");
            }
            for(int k = i ; k <= i ; k++){
                for(int j = s - i ; j >= 0; j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
        
    }
    
}
