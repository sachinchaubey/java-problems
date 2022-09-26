// import javax.swing.text.html.HTMLDocument.RunElement;

class Boolbinarys {
    public static boolean bool(int a[] , int key){
        for(int i= 0 ; i<a.length ; i++){
            if(a[i] == key){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args){
        int a[] = {1,0,1,1,1};
        int key = 0;
        System.out.println(bool(a,key));

    }    
}
