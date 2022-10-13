//codechef contest
import java.util.Scanner;
class tex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            if(n > 100){
                System.out.println(n-10);
            }
            else{
                System.out.println(n);
            }
        }
        sc.close();
    }
}