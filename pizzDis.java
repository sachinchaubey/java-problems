import java.util.Scanner;

//codechef contest

class pizzDis{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int temp = n * x;
            if(temp  % 4 ==0){
                System.out.println(temp/4);
            }
            else{
                System.out.println(temp/4 + 1);
            }
        }
        sc.close();
    }
}