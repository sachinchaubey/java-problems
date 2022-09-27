import java.util.Scanner;
class lunchtTime_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int d= b-a;
            x = x*2;
            if(d % x == 0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        sc.close();
    }
}
