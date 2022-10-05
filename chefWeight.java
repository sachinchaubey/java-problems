import java.util.Scanner;

//codechef pro

class chefWeight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int w1= sc.nextInt();
            int w2 = sc.nextInt();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int M = sc.nextInt();
            int diff = w2 - w1;
            if(diff >= (x1 * M) && diff <= (x2 * M)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        sc.close();
    }
}