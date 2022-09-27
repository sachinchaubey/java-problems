// codechef problem 
import java.util.Scanner;
class easePro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            for(int i = 0 ; i < n ; i++){
                char c = s.charAt(i);
                if(c != 'a' && c != 'i' && c != 'o' && c != 'e' && c != 'u'){
                    count++;
                }
                else{
                    if(count >= 4){
                        break;
                    }
                    else{
                        count = 0;
                    }
                }
            } 
            // System.out.println(count);
            if(count < 4){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        sc.close();
        // System.out.println(s);
    }
}