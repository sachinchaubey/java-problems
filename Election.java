import java.util.Scanner;

//codechef contest

class Election{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x + y + z == 101){
                if(x > 50){
                    System.out.println("A");
                }
                else if(y > 50){
                    System.out.println("B");
                }
                else if(z > 50){
                    System.out.println("C");
                }
                else{
                    System.out.println("NOTA");
                }
            }
        }
        sc.close();
    }
}