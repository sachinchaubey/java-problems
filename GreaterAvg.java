import java.util.Scanner;

class GreaterAvg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            float avg = (float)(A + B)/ 2;
            System.out.println(avg);
            if(avg > C){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            n--;
        }
        sc.close();
    }
}