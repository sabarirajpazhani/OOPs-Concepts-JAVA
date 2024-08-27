package OOPsPillers.Inheritance;
class Animal{
    int legs=4;

    public static void eat(){
        System.out.println("I am Eating");
    }

    public static void walk(){
        System.out.println("I am Walking");
    }
}

class Cat extends Animal{
    boolean canBark=true;
}

public class Inheritance {
    public static void main(String[] args) {
        Cat obj = new Cat();
        System.out.println(obj.canBark);
        obj.eat();
        obj.walk();

    }
    
}
