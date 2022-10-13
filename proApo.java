import java.util.Scanner;

//codechef contest

class proApo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int ans = (y*100)/x;
            // System.out.println(ans);
            if(ans >= 50){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}