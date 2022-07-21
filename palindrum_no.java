import java.util.Scanner;

class palndrum_no{

    public static Boolean isPalindrum(int num){
        if(num < 0){
            return false;
        }

        int x = num;
        int rev = 0;
        int rem;
        while(x != 0){
            rem = x % 10 ;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        if(rev == num){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPalindrum(num));
        sc.close();
    }
}