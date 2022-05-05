import java.util.Scanner;

public class hacker_1{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = 0;
            while(sc.hasNext()){
                n++;
                System.out.println(n +" "+ sc.nextLine());
            }
        }
    }
}