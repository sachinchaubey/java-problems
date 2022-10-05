import java.util.Scanner;

//codechef contest

class susString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            String t = "";

            int i = 0 ;
            int j = n-1;
            while(i<=j){
                if(s.charAt(i) == '0'){
                    t = s.charAt(i) + t;
                }
                else{
                    t = t + s.charAt(i);
                }
                if(i<j){
                    if(s.charAt(j) == '0'){
                        t = t+s.charAt(i);
                    }
                    else{
                        t = s.charAt(i) + t;
                    }
                    j--;
                }
                i--;
            }
            System.out.println(t);
            sc.close();
        }
    }
}