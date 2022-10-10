import java.util.Scanner;

//codechef contest

class singleOp_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            String s = sc.next();
            int count = 1; 
            for(int i = 1; i<n; i++){
                if(s.charAt(i) == '1'){
                    count++;
                }
                else{
                    break;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}