//codechef pro
import java.util.HashMap;
import java.util.Scanner;
class myScore{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int k = sc.nextInt();
            HashMap <Integer,Integer> m = new HashMap<>();
            int score = 0;
            for(int i = 0 ; i< k; i++){
                int ques = sc.nextInt();
                int num = sc.nextInt();
                if(ques <= 8){
                    if(m.containsKey(ques)){
                        m.put(ques,Math.max(num,m.get(ques))); 
                    }
                    else{
                        m.put(ques,num);
                    }
                }
            }
            for(int a : m.values()){
                score += a;
            }
            System.out.println(score);
        }
        sc.close();
    }
}