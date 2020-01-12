
import java.util.Scanner;


public class Main {
    // Beden Kitle İndeksi : Kilo /  Boy(m)*Boy(m) 
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Kilonuzu Giriniz: ");
        int kilo = scanner.nextInt();
        System.out.print("Boyunuzu Giriniz (örnek:1,70): ");
        float boy = scanner.nextFloat();
        System.out.println("Beden Kitle İndeksiniz: "+ kilo/(boy*boy));
    }
    
}
