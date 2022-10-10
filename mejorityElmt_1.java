import java.util.HashMap;
// import java.util.Scanner;

//leetcode problem

//using hashmap

class mejorityElmt_1{
    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = {2,2,1,1,1,2,2};
        // int arr[] = {1};
        int elmt = 0;
        if(arr.length == 1){
            elmt = arr[0];
            
        }
        else{
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                int count = map.get(arr[i])+1;
                if(count > arr.length/2){
                    elmt = arr[i];
                }
                else{
                    map.put(arr[i],count);
                }
            }
            else{
                map.put(arr[i],1);
            }

        }
        }
        System.out.println(elmt);
    }
}