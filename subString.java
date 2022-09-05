import java.util.Scanner;

class subString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // sc.close();
        String name = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        System.out.println(name.substring(start,end));
        }
        // System.out.println(a);
    }