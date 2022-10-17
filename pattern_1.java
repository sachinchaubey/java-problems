import java.util.Scanner;

class pattern_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        builder.append(sc.nextLine());
        String s = builder.toString();
        // String s = sc.next();
        int n = s.length();
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '('){
                count = count + 1;
            }
            else if(s.charAt(i) == ')'){
                count = count - 1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}