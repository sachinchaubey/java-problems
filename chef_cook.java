import java.util.Scanner;
class chef_cook{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int count = 0;
            // int n = sc.nextInt();
            int a[] = new int[5];
            for(int i = 0; i < 5; i++){
                a[i] = sc.nextInt();
                if(a[i] == 1){
                    count++;
                }
            }
            if(count == 0){
                System.out.println("Beginner");
            }
            else if(count == 1){
                System.out.println("Junior Developer");
            }
            else if(count == 2){
                System.out.println("Middle Developer");
            }
            else if(count == 5){
                System.out.println("Jeff Dean");
            }
            else if(count == 3){
                System.out.println("Senior Developer");
            }
            else if(count == 4){
                System.out.println("Hacker");
            }
        }
        sc.close();
    }
}