import java.util.HashSet;


class removeDuplicate{

    
    public static void main(String[] args){
        int arr[] = {1,1,2,2,3,5,5};
        int k = removeDuplicates(arr);
        int count=0;
        for(int i = 0 ; i < k ; i++){
            count++;
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
        System.out.println("total distinc element is " + count);
    }
    static int removeDuplicates(int[] arr){
        HashSet <Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length; i++){
            set.add(arr[i]); 
        }
        int k = set.size();
        int j = 0;
        for(int x : set){
            arr[j++] = x;
        }
        return k;
    }
}

