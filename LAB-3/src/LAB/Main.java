package LAB ;

public class Main {

    public static void main(String[] args) {
        Cass[] elements = {new Cass(),new Denny(),new John(),new Michelle()};
        for(int i=0; i< elements.length; i++){
            elements[i].method1();
            System.out.println();
            elements[i].method2();
            System.out.println();
            System.out.println(elements[i]);
            System.out.println();
        }
    }
    
}
