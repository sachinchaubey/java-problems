class add2{
    public static void main(String[] args){
        // int a1 = 3;
        // int a2 = 4;
        // int a3 = a1 + a2;
        // System.out.println(a3);
        int a[] = {2,4,5,2,3};
        int c = 0;
        for(int b : a){
            c = c + b;
        }
        System.out.println(c);
    }
}