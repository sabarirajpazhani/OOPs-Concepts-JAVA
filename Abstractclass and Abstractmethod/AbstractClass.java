package AbstractclassAndAbstractmethod;

abstract class Computer{
    void turnOn(){
        System.out.println("Turning-On");
    }
}

class HP extends Computer{
    void turnOn(){
        System.out.println("Turning-On-1");
    }
}

class DELL extends Computer{

}

public class AbstractClass {
    public static void main(String[] args) {
        HP obj = new HP();
        obj.turnOn();
    }
}
