import java.util.Scanner;

//codechef problem

class buynew{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int b = sc.nextInt();
            int ar = 0;
            int r = 0;
            while(n --> 0){
                int w = sc.nextInt();
                int h = sc.nextInt();
                int p = sc.nextInt();
                if(p <= b){
                    r = w * h;
                }
                ar = Math.max(ar, r);
            }
            if(ar > 0){
                System.out.println(ar);
            }
            else{
                System.out.println("no tablet");
            }
        }
    }
}