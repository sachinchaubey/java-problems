import java.util.Scanner;

//codechef practic

class scholar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        if(r <= 50){
            System.out.println(100);
        }
        else if(r > 50 && r <= 100){
            System.out.println(50);
        }
        else{
            System.out.println(0);
        }
        sc.close();
    }
}