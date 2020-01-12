
public class Main {

    public static void arrayMystery(int[] a) {
        for (int i = 1; i <a.length-1; i++) {
           a[i] = a[i+1] + a[i-1];
        }
    }
    public static void main(String[] args) {
        int[] a1 ={3,7};
        arrayMystery(a1);
        int[] a2 = {4,7,4,2,10,9};
        arrayMystery(a2);
             
    }
    
    
}
