import java.util.*;

class rantedCar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n != 0){
            int km = sc.nextInt();
            if(km >= 1 && km <= 300){
                System.out.println(300 * 10);
            }
            else if(km > 300 && km <= 1000){
                System.out.println(km * 10);
            }
            else{
                System.out.println("invalid");
            }
            n++;
        }
        sc.close();
    }
}
