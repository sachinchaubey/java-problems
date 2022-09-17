import java.util.Scanner;

// codechef problems

class wordle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n --> 0){
            String a = sc.next();
            String b = sc.next();
            String c = "";
            for(int i = 0; i < b.length() ; i++){
                if(a.charAt(i) == b.charAt(i)){
                    c = c + "G";
                }
                else{
                    c = c + "B";
                }
            }
            System.out.println(c);
        }
        sc.close();
    }
}