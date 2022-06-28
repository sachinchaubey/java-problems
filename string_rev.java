import java.util.Scanner;

class string_rev{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        // System.out.println(str);
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        if(str.equals(st.toString())){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        // System.out.println(st.toString()); 
        // char ch[] = str.toCharArray();
        // System.out.println(ch);
        // String rev = "";
        // sc.close();
        // System.out.println(ch.length);

        // for(int i = ch.length ; i > 0 ; i--){

        //     // System.out.println(i)
        //     System.out.println(ch[i]);
        //     rev = rev + ch[i];
        //     // rev += ch[i];
        //     System.out.println(rev);
        // }
        // System.out.println(rev);
        // if(str == rev){
        //     System.out.println("yes");
        // }
        // else{
        //     System.out.println("no");
        // }
        
        // System.out.println(str.length());
    }
}