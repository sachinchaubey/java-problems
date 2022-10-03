import java.util.Scanner;

//codechef problems

class multiChoice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            String s = sc.next();
            String a = sc.next();
            // for(int i = 0 ; i < n ; i++){
            //     s = s + sc.next();
            //     a = a + sc.next(); 
            // }
            // System.out.println(s);
            // System.out.println(s.indexOf(1) );
            int count = 0 ; 
            for(int i = 0 ; i < n ; i++){
                if(a.charAt(i) != 'N'){
                    if(s.charAt(i) == a.charAt(i)){
                        count++;
                    }
                    else if(s.charAt(i) != a.charAt(i)){
                        i = i + 1;
                    }
                } 
                // if(s.indexOf(i) == a.indexOf(i)){
                //     count++;
            
            }
            System.out.println(count);

        }
    }
}