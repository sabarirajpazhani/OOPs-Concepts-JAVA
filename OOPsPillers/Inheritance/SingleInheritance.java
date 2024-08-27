package OOPsPillers.Inheritance;
class Father{
    String gender="Male";
    void print(){
        System.out.println("Fater Class");
    }
}

class Son extends Father{
    
}

public class SingleInheritance {
    public static void main(String[] args) {
        Son obj = new Son();
        System.out.println(obj.gender);
        obj.print();
    }
}
