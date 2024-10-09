package SpecialKeyWords;


class Father{
    char gender='M';
    void print(){
        System.out.println("Parent Class");
    }
}

class Daughter extends Father{
    char gender='F';
    void print(){
        System.out.println(super.gender);  //it return the father gender - super key   //used to refer the immediate parent class
        super.print();   //it print the Father's print method
    }
    
}

public class SuperKey {
    public static void main(String[] args) {
        Father obj1=new Father();
        System.out.println(obj1.gender);

        Daughter obj2=new Daughter();
        obj2.print();

    }
    
}
