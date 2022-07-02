import java.util.Scanner;

class fecto{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no.: ");
        int n = sc.nextInt();
        sc.close();
        int fec = 1;
        for(int i=1; i<=n; i++){
            fec = fec*i;
        }
        System.out.println("Factorial is: "+fec);

    }  
}