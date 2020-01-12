package LAB;


public class John extends Cass{
    @Override
    public void method2(){
        method1();
        System.out.print("john 2");
        
    }
    @Override
    public String toString(){
        return "john " ;
    }
}
