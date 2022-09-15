import java.util.Scanner;

// codeChef problems

class chairsReq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n --> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == b || a < b){
                System.out.println(0);
            }
            else if (a > b){
                a = a - b;
                System.out.println(a);
            }
        }
        sc.close();
    }
}