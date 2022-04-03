    
class Tester{
    public void  findSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum inside method:" + sum);
    }
}    


public class findSum{
    public static void main(String[] args){
        Tester test = new Tester ();
        int var1 = 12;
        int var2 = 20;
        test.findSum(var1,var2);
    }
}