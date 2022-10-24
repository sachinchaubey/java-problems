//codechef contest

import java.util.Scanner;

class spell{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b= sc.nextInt();
            int c = sc.nextInt();
            int max  = 0 ; 
            if(a + b > max){
                max = a+b;
            }
            if(b + c > max){
                max = b + c;
            }
            if(a + c > max){
                max = a + c;
            }
            System.out.println(max);
        }
        sc.close();
    }
}