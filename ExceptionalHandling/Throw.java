package ExceptionalHandling;

public class Throw {
    static void check(int age){
        if(age<18){
            throw new ArithmeticException("Age Invalid"); //it manually throw the exception - user build expection
        }
    }
    public static void main(String[] args) {
        try{
            check(17);
        }
        catch(ArithmeticException E){
            System.out.println(E.getMessage());
        }
        System.out.println("Hello");
    }
    
}
