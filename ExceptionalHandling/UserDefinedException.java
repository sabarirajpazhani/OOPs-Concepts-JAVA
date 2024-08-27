package ExceptionalHandling;
class UserDefined extends Exception{
    UserDefined(String str){
        super(str);
    }
}

public class UserDefinedException {
    static void check(int age) throws UserDefined{
        if(age<1){
            throw new UserDefined("Age is Invalide");
        }
    }
    public static void main(String[] args) {
        try{
            check(19);
        }
        catch(UserDefined E){
            System.out.println(E.getMessage());
        }
        System.out.println("Hello");
    }
    
}
