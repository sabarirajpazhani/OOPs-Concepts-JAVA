package OOPsPillers.Inheritance;

class Father {
    String gender="Male";
    void print(){
        System.out.println("Parent class");
    } 
}

class Daughter extends Father {
    String gender="Female";
}

class Son extends Father{

}

class GrandDaughter extends Daughter{
    void print(){
        System.out.println("GrandDaughter");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Daughter obj1 = new Daughter();
        System.out.println(obj1.gender);
        obj1.print();

        GrandDaughter obj2=new GrandDaughter();
        System.err.println(obj2.gender);
        obj2.print();

    }
    
}
