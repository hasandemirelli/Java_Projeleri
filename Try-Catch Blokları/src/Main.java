
public class Main {
    
    public static void main(String[] args) {
       
        try {
            int a= 30/0;                            //Exception Oluştura bilecek Kodlar.
            int[] b={1,2,3,4,5};
            
            System.out.println(b[6]);
            
        } 
        catch(ArithmethichException e){
            System.out.println(e);
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Burası Çalışıyor");
    }
    
}
