//leetcode problem

class largestOdd{
    public static void main(String[] args){
        String s = "05";
        int max = 0;
        for(char c : s.toCharArray()){
            int i = Character.getNumericValue(c);
            if( i % 2 == 1){
                // System.out.println(i);
                if(i > max){
                    // System.out.println(":" + i);
                    // System.out.println("1 : " + max);
                    max = i;
                    // System.out.println("2 :" + max);
                }
            }
        }
        System.out.println(Integer.toString(max));
        // System.out.println("max :" + max);
    }
}