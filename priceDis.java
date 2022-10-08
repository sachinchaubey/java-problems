import java.util.Scanner;

//codechef contest

class priceDis{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            // int x = sc.nextInt();
            float x = sc.nextInt();
            float y = sc.nextInt();
            float n = sc.nextInt();
            float m = sc.nextInt();
            float x1 = x/n;
            float y1 = y/m;
            // y = y/m;
            if(x1 == y1){
                System.out.println("Both");
            }
            else if(x1 < y1){
                System.out.println("chef");
            }
            else if(x1 > y1){
                System.out.println("chefina");
            }
        }
        sc.close();
    }
}