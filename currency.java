import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
class currency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the money: ");
        Double m = sc.nextDouble();
        sc.close();
        
        // for US
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: "+us.format(m));

        // for INDIA
        NumberFormat ind = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        System.out.println("India: "+ind.format(m));

        //for CHINA
        NumberFormat chi = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: "+chi.format(m));

        //for FRANCE
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: "+france.format(m));

    }
}