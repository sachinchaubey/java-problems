import java.util.Scanner;

//fibonacci using recursion

class fibo_recu{
    static int n1=0,n2=1,n3=0; 
    static void printFeb(int count){
        if(count > 0){
        n3 = n1 + n2;
        System.out.print(" "+n3);
        n1 = n2;
        n2 = n3;
        printFeb(count - 1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no you want to print: ");
        int count = sc.nextInt();
        sc.close();
        System.out.print("The Fibonacci is: "+n1 +" "+n2);
        printFeb(count - 2);
    }
}