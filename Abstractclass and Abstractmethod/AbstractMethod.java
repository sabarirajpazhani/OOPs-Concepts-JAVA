package AbstractclassAndAbstractmethod;

abstract class Computer{
    abstract void turnOff();

    abstract void turnOn();
}

class HP extends Computer{
    void turnOn(){
        System.out.println("Turning-On-1");
    }

    void turnOff(){
        System.out.println("Turning off-HP");
    }
}

class DELL extends Computer{
    void turnOn(){
        System.out.println("Hello");
    }
    void turnOff(){
        System.out.println("Turning off-DELL");
    }

}

public class AbstractMethod {
    public static void main(String[] args) {
        HP obj = new HP();
        obj.turnOn();
        obj.turnOff();

        DELL obj1=new DELL();
        obj1.turnOn();
        obj1.turnOff();
    }
}
