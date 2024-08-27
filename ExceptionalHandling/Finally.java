package ExceptionalHandling;

public class Finally {
    public static void main(String[] args) {
        int a=8;
        int b=2;
    
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException E){
            System.out.println("b is Zero");
        }
        finally{
            System.out.println("Final Block");
        }

        System.out.println("Hello");
    }
}
