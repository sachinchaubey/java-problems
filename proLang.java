import java.util.Scanner;

// codechef problem solutions

class proLang{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int a[] = new int[6];
            for(int i = 0 ; i< a.length; i++){
                a[i] = sc.nextInt();
            }
            for(int j = 2; j < a.length; j++){
                if(a[0] == a[j] && a[1] == a[j+1] || a[1] == a[j] && a[0] == a[j+1]){
                    System.out.println(1);
                    break;
                }
                else if(a[0] == a[j+2] && a[1] == a[j+3] || a[1] == a[j+2] && a[0] == a[j+3]){
                    System.out.println(2);
                    break;
                }
                else{
                    System.out.println(0);
                    break;
                }
            }
        }
        sc.close(); 
    }
}