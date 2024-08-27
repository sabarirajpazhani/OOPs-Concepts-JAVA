

class Object{
    String name;
    int n;

    public void setObject(String str, int n1){
        name=str;
        n=n1;
    }

    public void display(){
        System.out.println(name);
        System.out.println(n);
    }

}
public class ClassAndObject{
    public static void main(String args[]){
        String str1="Coder";
        int n1=100;
        Object obj = new Object();
        obj.setObject(str1,n1);
        obj.display();
    }
}


