import java.util.Scanner;
// import java.util.concurrent.CountDownLatch;

//codechef contest

class happyString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = s.length();
            int count = 1;
            for(int i = 0; i<n-1 ; i++){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                    if(s.charAt(i+1) == 'a' || s.charAt(i+1) == 'e' || s.charAt(i+1) == 'i' || s.charAt(i+1) ==  'o' || s.charAt(i+1) == 'u'){
                        count++;
                    }
                } 
            }
            if(count > 2){
                // System.out.println(count);
                System.out.println("Happy");
            }
            else{
                // System.out.println(count);
                System.out.println("Sad");
            }
        }
        sc.close();
    }
}