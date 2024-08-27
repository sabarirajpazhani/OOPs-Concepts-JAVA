package OOPsPillers.Polymorphism;
class Sample{
    private String name;
    private int num;

    public void setName(String name1){
        name=name1;
    }
    public void setNum(int num1){
        num=num1;
    }
    public void display(){
        System.out.println(name);
        System.out.println(num);
    }
}
public class Encapsulation{
    public static void main(String args[]){
        String name1="Coding";
        int num1=1200;
        Sample obj=new Sample();
        obj.setName(name1);
        obj.setNum(num1);
        obj.display();
    }
}