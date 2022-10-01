import java.util.Scanner;

class eatcandi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int a = sc.nextInt();
            int b = sc.nextInt(); 
            for(int i = 1,j = 2; ; i=i+2,j=j+2){
                a = a - i;
                b = b - j;
            
                if(a < 0){
                    System.out.println("Bob");
                    break;
                }
                else if(b < 0){
                    System.out.println("Limak");
                    break;
                }
            }
        }
    }    
}
