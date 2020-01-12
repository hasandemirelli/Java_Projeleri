
import java.util.Scanner;
    // İki Kenarı Girilen Üçgenin Hipotenüs Bulma.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        double h;
        System.out.println("Birinci Kenarı Giriniz: ");
        a= scanner.nextInt();
        System.out.println("İkinci kenarı Giriniz: ");
        b= scanner.nextInt();
        
        h= Math.sqrt(a*a+b*b);
        System.out.println("Hipotenüs: "+h);
        
        
        
    }
}
