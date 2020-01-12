
public class Boy extends Human{
    @Override
    public void eat(){
        System.out.println("Boy");
    }
    public static void main(String[] args) {
        Human obj= new Human();
        obj.eat();
    }
    
}
