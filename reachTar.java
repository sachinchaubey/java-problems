import java.util.Scanner;

//codechef contest 

class reachTar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a-b);
        }
        sc.close();
    }
}