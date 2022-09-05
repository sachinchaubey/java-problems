import java.util.Scanner;

//fibonacci without recursion.

class fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = 0,n2 = 1,n3=0;
        int count = sc.nextInt();
        sc.close();
        System.out.print(n1 +" "+n2);
        for(int i = 2; i < count; i++){
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3; 
        }
    }
}