public class power{
    public static void main(String[] args ){
        int p = 1;
        for(int i=0 ; i<5 ; i++){
            if(i == 0){
                p = 1;
            }
            else{
                p = (p * 2); 
            }
            System.out.println(p);
        }
    }
}