import java.util.HashMap;
// import java.util.Map;
import java.util.Scanner;

//codechef contest

class changeIt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i = 0; i<n ;i++){
                int key = sc.nextInt();
                if(map.containsKey(key)){
                    map.put(key,map.get(key)+1);
                }
                else{
                    map.put(key,1);
                }
            }
            int max = 0;
            for(Integer k: map.keySet()){
                if(map.get(k) > max){
                    max = map.get(k);
                }
            }
            System.out.println(n - max);
        }
        sc.close();
    }
}