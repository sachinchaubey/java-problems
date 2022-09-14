import java.util.Scanner;

// codeChef practice

class playWithMatches{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n --> 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int count = 0;
            int temp = A+B;
            while(temp != 0){
                int b = temp;
                int C = b%10;
                if(C == 0 || C == 6 || C == 9){
                    count += 6;
                }
                else if(C == 1){
                    count += 2;
                }
                else if(C == 2 || C == 3 || C == 5){
                    count += 5;
                }
                else if(C == 4){
                    count += 4;
                }
                else if(C == 7){
                    count += 3;
                }
                else if(C == 8){
                    count += 7;
                }
                temp = temp / 10;
            }
            System.out.println(count);
        }
        sc.close();
    }
}