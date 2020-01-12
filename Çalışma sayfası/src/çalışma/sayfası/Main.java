
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        String ad = "Hasan";
        String soyad = "Demirelli";
        boolean baş= ad.startsWith("H");
        boolean son= ad.endsWith("i");
        boolean varmı= ad.contains("i");
        
        System.out.println(ad.charAt(0));
        System.out.println(ad.substring(0,3));
        System.out.println(ad.toLowerCase());
        System.out.println(soyad.toUpperCase());
        System.out.println(baş);
        System.out.println(son);
        System.out.println(varmı);
        
        String ozel = "Hasan";
        String biz = "Basan";

        if(ozel == "Hasan"){
            System.out.println(ozel + "a "+ biz);
        }
        Scanner input = new Scanner(System.in);

        String kelime1 = input.next();
        String kelime2 = input.next();

        System.out.println("Kelime1: " + kelime1 + "\nKelime2: " + kelime2);

    }

}