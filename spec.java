import java.util.Scanner;

//codechef contest

class spec{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x > y && x > z){
                System.out.println("setter");
            }
            else if( y > x && y > z){
                System.out.println("tester");
            }
            else if(z > x && z > y){
                System.out.println("editorialist");
            }
        }
        sc.close();
    }
}