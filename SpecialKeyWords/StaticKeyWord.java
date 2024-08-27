package SpecialKeyWords;
class Father{
    static char gender='M';
    static void  print(){
        System.out.println("Parent Class");
    }
}
class Daughter extends Father{
    char gender= 'F';
}

public class StaticKeyWord {
    public static void main(String[] args) {
        System.out.println(Father.gender);   //without object creation
        Father.print();


        Daughter obj=new Daughter(); //with p=obejct creation
        System.out.println(obj.gender);
        obj.print();
    }
}
