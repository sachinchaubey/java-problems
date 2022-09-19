import java.util.Scanner;
class minus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        int  b = sc.nextInt();
        a = Math.abs(a - b);
        System.out.println(a);
        sc.close();
    }
}