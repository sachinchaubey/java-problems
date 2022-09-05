import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// using of bufferReader to best efficiency

class sum{
    public static void main(String args[]) throws NumberFormatException, IOException{
        int a,b,sum;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your first no: ");
        a = Integer.parseInt(buffer.readLine());
        System.out.print("Enter your secone no: ");
        b = Integer.parseInt(buffer.readLine());
        sum = a + b;
        System.out.println("Total is: "+ sum);

    }
}