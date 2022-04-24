public class power{
    public static void main(String[] args ){
        int p;
        for(int i=0 ; i<5 ; i++){
            // if(i == 0){
            //     p = 1;
            // }
            // else{
            //     p = (p * 2); 
            // }
            p = (int) Math.pow(2,i);
            System.out.println(p);
        }
    }
}