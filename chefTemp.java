import java.util.Scanner;

class chefTemp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int temp = sc.nextInt();
            if(temp > 98 && temp <= 103){
                System.out.println("YES");
            }
            else if(temp >= 94 && temp <= 98){
                System.out.println("NO");
            }
            n--;
        }
        sc.close();
    }
}