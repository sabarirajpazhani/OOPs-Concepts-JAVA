package OOPsPillers.Inheritance;   

class GrandFather {
    String gender="Male";
    void print(){
        System.out.println("Parent Class");
    }
}

class Mother extends GrandFather{
    String gender="Female";
}

class Daughter extends Mother{

}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Daughter obj = new Daughter();
        System.out.println(obj.gender);
        obj.print();
    }
}
