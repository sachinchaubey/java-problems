import java.util.Scanner;

class primeNo{
    static int flag = 0;

    static void checkPrime(int n){
        for (int i = 2; i<n; i++){
            // if(n == 0 || n == 1){
            //     flag = 1;
            //     break;
            // }
            if(n % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println(n + " is not prime no.");
        }
        else{
            System.out.println(n + " is prime no.");
        }
    } 

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. that you want to check prime or not: ");
        int num = sc.nextInt();
        sc.close();
        if(num == 0 || num == 1 || num == 2){
            System.out.println(num + " is not prime no.");
        }
        else{
            checkPrime(num);
        } 
    }
}