import java.util.Scanner;

class creditCource{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum;
        while(n != 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            sum = (X*4)+(Y*2)+(Z*0);
            System.out.println(sum);
            n--;
        }
        sc.close();
    }
}