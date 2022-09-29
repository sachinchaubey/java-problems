import java.util.Scanner;

//codechef contest

class rankList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int a = sc.nextInt();
            a = (int) Math.ceil((double)a/25);
            System.out.println(a);
        }

        sc.close();
    }
}