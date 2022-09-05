import java.util.Scanner;

public class intro{
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("What is your name : ");
            String name = scanner.nextLine();
            
            System.out.println("your age : ");
            int age = scanner.nextInt();

            scanner.nextLine();

            System.out.println("What is your fav game :");
            String game = scanner.nextLine();

            System.out.println("hello " + name);
            System.out.println("you are " + age +" year old.");
            System.out.println("you like playing " + game);
        }
    }
}