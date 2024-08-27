package ExceptionalHandling;
public class ArithmaticException {
    public static void main(String[] args) {
        int a=5;
        int b=0;
    
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException E){
            System.out.println("b is Zero");
        }

        System.out.println("Hello");
    }
}
