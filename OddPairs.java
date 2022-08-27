// Codechef oddPairs solution :

import java.util.Scanner;


class OddParis{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n >= 1 && n <= 100){
            // int flag = 0;
            long N = sc.nextInt();
            if(N >= 1 && N <= Math.pow(10, 9)){
                if(N == 1){
                    System.out.println(0);
                }
                else if(N % 2 == 1){
                    System.out.println(((N/2)+1)*((N/2)*2));
                }
                else{
                    System.out.println((N/2)*(N/2)*2);
                }
            }
            n--;  
        }
        sc.close();
    }
}