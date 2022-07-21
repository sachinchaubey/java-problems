// P1: CodeChef Fit problem

import java.util.Scanner;

class CodeChef_Fit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // sc.close();
        // int M = sc.nextInt();
        while(N != 0){
            int M = sc.nextInt();
            System.out.println((M*2)*5);
            N--;
        }
        sc.close();
    }
}