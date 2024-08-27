package SpecialKeyWords;

class Father{
    final int age=54;
    final void print(){
        System.out.println("Parent Class");
    }
}

class Son extends Father{
    int age=21;
    void print(){
        System.out.println("Child Class");    //it gives the error because the print is the method created in the Father class and declared as final
    }
}
public class FinalKey {
    public static void main(String[] args) {
        Son obj=new Son();
        System.out.println(obj.age);
        obj.print();

    }
    
}
