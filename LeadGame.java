import java.util.Scanner;

// codechef practice

class LeadGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1=0;
        int sum2 = 0;
        int max1 = 0;
        int max2 = 0;
        while(n != 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            sum1 = sum1 + A;
            sum2 = sum2 + B;
            if(sum1 > sum2){
                int lead1 = sum1 - sum2;
                max1 = Math.max(max1 , lead1);
            }
            else if(sum2 > sum1){
                int lead2 = sum2 - sum1;
                max2 = Math.max(lead2, max2);
            }
            n--;
        }
        if(max1 > max2){
            System.out.println("1 " + max1);
        }
        else if(max2 > max1){
            System.out.println("2 " + max2);
        }
        sc.close();
    }
}