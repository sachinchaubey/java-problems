import java.util.Scanner;

// hacker rank data type problem

public class data_type{
    public static void main(String args[]){
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            while(n --> 0){
                try {
                    Long value = scanner.nextLong();
                    System.out.println(value + " can be fitted in: ");
                    if(value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE){
                        System.out.println("* byte");
                    }
                    if(value >= Short.MIN_VALUE && value <= Short.MAX_VALUE){
                        System.out.println("* short");
                    }
                    if( value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE){
                        System.out.println("* int");
                    }
                    if( value >= Long.MIN_VALUE && value <= Long.MAX_VALUE){
                        System.out.println("* long");
                    }
                    
                }
                catch (Exception e) {
                    System.out.println(scanner.next() + " can't be fitted anywhere.");
                    //TODO: handle exception
                }
            }
        }
        }
            
}

        

    // public static void check(Long value){
    //     System.out.println(value + " can be fitted in: ");
    //     if(value >= Short.MIN_VALUE && value <= Short.MAX_VALUE){
    //         System.out.println(" * short "  );
    //     }
    //     if( value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE){
    //         System.out.println(" * int " );
    //     }
    //     if( value >= Long.MIN_VALUE && value <= Long.MAX_VALUE){
    //         System.out.println(" * long " );
    //     }
    //     else if( value > Long.MAX_VALUE){
    //         System.out.println(value + " can't be fitted anywhere ");
    //     }
    // }
