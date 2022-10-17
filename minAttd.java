import java.util.Scanner;

//codechef problem

class minAttd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            // String s = sc.next();
            int n = sc.nextInt(); 
            String s = sc.next();
            int count= 0;
            for(int i = 0 ; i < n ; i++){
                if(s.charAt(i) == '1'){
                    count = count + 1;
                    // System.out.println(count);
                }
            }
            float b = (120-n)+count;
            b = (b*100)/120;
            if(b >= 75){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
        
    }
}