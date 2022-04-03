import java.util.Random;
// import java.lang.Math;

/**
 * random
 */
public class random {

    public static void main(String[] args){

        // int x;
        double y;

        Random random = new Random();


        // x = random.nextInt(6) + 1; //random no generat under 6 but not 6. for 6 we add +1 here(ex: 1,2,3,4,5,6);
        
        // y = random.nextDouble(6);
        y = Math.floor(random.nextDouble(6) + 1); //random generat b/w 1 to 6;
        System.out.println(y);



    }
}