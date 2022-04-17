import java.util.Scanner;

public class nested_loop_besic{
    public static void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int raw;
            int colom;
            String symbol = "";

            System.out.println("enter the no of row :");
            raw = scanner.nextInt();

            System.out.println("enter the no of coloum :");
            colom = scanner.nextInt();

            System.out.println("enter the symbol in your choice : ");
            symbol = scanner.next();

            for(int i = 1 ; i <= raw ; i++){
                System.out.println();
                for(int j = 1 ; j <= colom; j++){
                    System.out.print(symbol + " ");
                }
            }
        }


    }
}