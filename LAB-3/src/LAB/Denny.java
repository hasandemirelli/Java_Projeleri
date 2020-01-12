package LAB;


public class Denny extends John{
    
    public void method1 (){
        System.out.print("denny 1");
    }
    
    public String toString(){
        return "denny " + super.toString();
    }
}
