import java.util.Scanner;


class pairShoes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n --> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a <= b){
                System.out.println(a);
            }
            else if(a > b){
                int c = a -b;
                c = c + a;
                System.out.println(c);
            }
        }
        sc.close();
        
    }
}