import java.util.Scanner;

// codeChef practice

class prettyNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n --> 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int count = 0;
            for(int i = A ; i<=B ; i++){
                int c = i%10;
                if(c == 2 || c == 3 || c == 9){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}