import java.util.Scanner;

public class two_sum{
    public static void main(String args[]){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the length of array: ");
            int n = scanner.nextInt();
            int[] array = new int[n];
            for(int i = 0 ; i < n ; i++){
                array[i] = scanner.nextInt();
            }
            System.out.println("enter the target value:");
            int target = scanner.nextInt();
            for (int i = 0 ; i < n ; i++){
                for(int j = i + 1 ; j < n ; j++){
                    if(array[i] + array[j] == target){
                        System.out.println("the sum of the target value is: " + i + " "+  j);
                            break; 
                    }
                }
            }
        }
    } 

}