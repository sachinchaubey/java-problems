// import java.text.NumberFormat.Style;
import java.util.Scanner;

// import javax.lang.model.util.ElementScanner14;

// codechef seplong2022 chlg

class dis_time{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            Float d1 = (float) sc.nextInt();
            Float h1 = (float) sc.nextInt();
            Float s1 = (float) (d1/h1);
            System.out.println(s1);
            Float d2 = (float) sc.nextInt();
            Float h2 = (float) sc.nextInt();
            Float s2 = (float) (d2/h2);
            System.out.println(s2);
            if(s1 > s2){
                System.out.println("alice");
            }
            else  if(s1 < s2){
                System.out.println("bob");
            }
            else{
                System.out.println("equal");
            }
            n--;
        }
        sc.close();
    }
}