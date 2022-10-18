import java.util.Scanner;

//codechef contest

class riche{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            y = y - x;
            System.out.println(y/z);
        }
        sc.close();
    }
}