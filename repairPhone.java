import java.util.Scanner;

class repairPhone{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X < Y){
                System.out.println("Repair");
            }
            else if(X > Y){
                System.out.println("new phone");
            }
            else if(X == Y){
                System.out.println("Any");
            }
            n--;
        } 
        sc.close();
    }
}