
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Aracın Kilometrede Kaç Kuruş Yaktığını Giriniz (Örnek: 0,30): ");
         float kr = scanner.nextFloat();
         System.out.print("Aracın Kaç Kilometre Yol Aldığını Giriniz: ");
         int km = scanner.nextInt();
         
         System.out.println("TOPLAM TUTAR: "+ km*kr + " TL.");
    }
    
}
