import java.util.Scanner;

class fev_4 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int M = sc.nextInt();
            int rev;
            for(int i=0; i<M ;i++){
                int N = sc.nextInt();
                int flag = 0;
                while(N != 0){
                    rev = N % 10;
                    if(rev == 4){
                        flag++;
                    }
                    N = N / 10;
                }
                System.out.println(flag);
            }
        }
        catch (Exception e) {
            //TODO: handle exception
        }
    }

}

