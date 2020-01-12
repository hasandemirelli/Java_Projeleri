
public class Account {
    
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo ;
    
    public void parayatir (double miktar){
        bakiye = bakiye+miktar;
        System.out.println("Yeni Bakiye = "+bakiye);
    }
    public String hetHesapNo(){
        return hesapNo;
    }
    public void setHesapNo(String hesapNo){
        this.hesapNo=hesapNo;
    }
    public void paraCekme(double miktar){
        if(miktar >1500){
            System.out.println("Birgünde 1500 TL den fazla para Çekemezsiniz...");
        }
        if()
    }
}
