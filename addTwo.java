import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;

class addTwo{
    public static int sum(int num1,int num2){
        int add = num1 + num2;
        return add;
    }
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine()); 
        int num2 = Integer.parseInt(br.readLine());
        int ans = sum(num1,num2);
        System.out.println(ans);
    }
}