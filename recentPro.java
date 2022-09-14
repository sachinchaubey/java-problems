import java.util.Scanner;

// codechef practice

class recentPro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int t = sc.nextInt();
            int count = 0;
            int count1 = 0;
            // String p1 = "START38";
            // String p2 = "LTIME108";
            while(t != 0){
                String A = sc.next();
                if(A.equals("START38")){
                    count++;
                } 
                else{
                    count1++;
                }
                t--;
            }
            n--;
            System.out.println(count +" "+ count1);
        }
        sc.close();
    }
}