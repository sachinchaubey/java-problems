// import java.util.*;
import java.util.HashMap;

class RomToInt{
    public static void main(String[] args){
        String s = "VIII";
        
        HashMap <Character , Integer> map = new HashMap<Character,Integer>();
        map.put('I' , 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = map.get(s.charAt(s.length()-1)); 
        // System.out.println(ans);
        for(int n = s.length()-2; n >= 0 ; n--){
            if(map.get(s.charAt(n)) >= map.get(s.charAt(n+1))){
                ans += map.get(s.charAt(n));
            }
            else{
                ans -= map.get(s.charAt(n));
            }
        }
        System.out.println(ans);
        
    }
}