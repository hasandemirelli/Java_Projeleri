
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int sayı1, sayı2,temp;
        
        System.out.print("Birinci Sayıyı Giriniz:");
        sayı1=scanner.nextInt();
        System.out.print("İkici Sayıyı Giriniz");
        sayı2 = scanner.nextInt();
        
        temp=sayı1;
        sayı1=sayı2;
        sayı2=temp;
        
        System.out.println("Birinci Sayı: "+sayı1);
        System.out.println("İkinci Sayı : "+sayı2);
        
        
    }
}
