import java.util.Scanner;

//codechef problems

class happyString_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = s.length();
            int count = 0;
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                    count++;
                    if(count > 2){
                        // System.out.println("Happy");
                        break;
                    }
                    // else{
                    //     System.out.println("Sad");
                    //     break;
                    // }
                }
                else{
                    count = 0;
                }
            }
            if(count > 2){
                System.out.println("happy");
            }
            else{
                System.out.println("sad");
            }
        }
        sc.close();
    }
}