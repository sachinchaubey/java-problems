import java.util.Scanner;
class bin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int dec = Integer.parseInt(s,2);
        int r = dec;
        int count = 0;
        while(r --> 0){
            if(dec == 0){
                break;
            }
            if(dec % 2 == 0){
                dec /= 2;
                count = count + 1;
            }
            else if(dec % 2 != 0){
                dec -= 1;
                count = count + 1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}