import java.util.Scanner;


public class Main {
        // nexInt'ten sonra nezLine Alındığında \'ı ir Line olarak kabul eder ve hata verir oyüzden Line İnt'ten önce alınır.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lütfen Bir İsim Giriniz :");
        String yazı = scanner.nextLine();
       
        System.out.println("Lütfen Yaşınızı Giriniz :");
        int yas = scanner.nextInt();
        
        System.out.println("İsim: "+yazı);
        System.out.println("Yaşınız: "+yas);
        
//----------------------------------------------------------------------
    int yaş1 = scanner.nextInt();
    int yaş2 = scanner.nextInt();
    int yaş3 = scanner.nextInt();
    
        System.out.println("Yaş1: " + yaş1 +  " Yaş2: " + yaş2 + " Yaş3: " + yaş3 );
    }
}
    
