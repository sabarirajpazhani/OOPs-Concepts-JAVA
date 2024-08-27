package SpecialKeyWords;
class Object{
    String name;
    int age;

    void setValue(String name, int age){
        this.name=name;
        this.age=age;   
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class thisKey {
    public static void main(String[] args) {
        Object obj = new Object();
        obj.setValue("Coder", 21);
        obj.display();
    }
    
}
