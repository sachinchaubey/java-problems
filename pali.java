import java.util.Scanner;

class pali{
    static void isPalindrum(int x){
        int num = x;
        int rev = 0;
        int rem;
        while(num != 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        // System.out.println(rev);
        if(rev == x){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }


    public static void main(String[] args){
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        sc.close();
        isPalindrum(y);
    }
}