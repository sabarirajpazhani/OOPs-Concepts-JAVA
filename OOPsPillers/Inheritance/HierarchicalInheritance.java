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

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Daughter obj1 = new Daughter();
        System.out.println(obj1.gender);
        obj1.print();

        Son obj2=new Son();
        System.err.println(obj2.gender);
        obj2.print();

    }
    
}
