//codechef problem
import java.util.Scanner;
class fitTri{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int b = sc.nextInt();
            int count = 0;
            for(int i = 0; i<b/2 ;i++){
                count += i;
            }
            System.out.println(count);
        }
        sc.close();
    }
}