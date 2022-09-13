import java.util.Scanner;

// codeChef problems

class toDolist{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int t = sc.nextInt();
            int count = 0;
            while(t != 0){
                int A = sc.nextInt();
                if(A >= 1000){
                    count++;
                }
                t--;
            }
            System.out.println(count);
            n--;
        }
        sc.close();
    }
}