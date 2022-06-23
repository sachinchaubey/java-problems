import java.util.Scanner;

//add two no without using operator'+'

class add{
    static int addNo(int a,int b){
        for(int i = 1 ; i <= b ; i++){
            a++;
        }
        return a;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no.: ");
        int x = sc.nextInt();
        System.out.print("Enter the second no.: ");
        int y = sc.nextInt();
        sc.close();
        int a = addNo(x,y);
        System.out.println("The addition of "+ x + " and "+ y +" is: "+ a);
    }
}