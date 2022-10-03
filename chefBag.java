import java.util.Scanner;

//codechef pro

class chefBag{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            if((a+b) <= d && c <= e || (a+c) <= d && b <= e || (b+c) <= d && a <= e){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            } 
        }
        sc.close();
    }
}