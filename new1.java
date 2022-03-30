import java.util.Scanner;
// import java.util.Formatter;

/**
 * new1
 */
public class new1 {

    public static void main(String[] args) {
        // System.out.println("hello");

        double x ;
        double y ;
        double z ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the value of x: ");
        x = scanner.nextDouble();

        System.out.println("enter the value of y: ");
        y = scanner.nextDouble();

        
        z = Math.sqrt((x*x) + (y*y));
        System.out.println("The hypotenuse value of trangle is : " + String.format("%.2f", z));

        scanner.close();

    }

}