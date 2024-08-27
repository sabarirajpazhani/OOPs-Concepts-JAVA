package OOPsPillers.Polymorphism;

/**
 * MethodOverRidding
 */
class Animal {
    int legs=4;
    
    public void eat(){
        System.out.println("I am Eating");
    }

    public void walk(){
        System.out.println("I am walking");
    }
}

class Cat extends Animal{
    int legs=6;

    public void eat(){
        System.out.println("Cat is Eating");
    }
}
public class MethodOverRidding {
    public static void main(String[] args) {
        Cat obj = new Cat();
        System.out.println(obj.legs);
        obj.eat();
        obj.walk();
    }
}