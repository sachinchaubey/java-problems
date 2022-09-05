// Write a java program to input 20 integers in array a[] by user and place all even integers in even and 
// odd integrs in odd array.

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_pro{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a[] = new int[20];

        ArrayList<Integer> even = new ArrayList<>();
        
        ArrayList<Integer> odd = new ArrayList<>();

        //  taking input from user

        System.out.print("Enter the 20 numbers :");

        for(int i = 0; i<a.length ; i++){
            a[i] = in.nextInt(); 
        }
        in.close();

        for(int i = 0; i<a.length ; i++){
            if(a[i] % 2 == 0){  
                even.add(a[i]);  
            }
            else{
                odd.add(a[i]);
            }
        }

        System.out.println("Even numbers : " + even);

        System.out.println("Odd numbers : " + odd);
    }
}