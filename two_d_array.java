public class two_d_array{
    public static void main(String[] args){
        String[][] cars = {
                            {"A","B","C"},
                            {"D","E","F"},
                            {"G","H","I"}  
                            };
        for(int i=0; i<cars.length ; i++){
            System.out.println(" ");
            for(int j=0 ; j<cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }
                            
       }
    }