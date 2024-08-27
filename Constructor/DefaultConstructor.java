package Constructor;

class Sample{
    String name;
    int n;
    Sample(){
        name="Coder";
        n=100;
    }
}

public class DefaultConstructor {
    public static void main(String args[]){
        Sample obj = new Sample();
        System.out.println(obj.name);
        System.out.println(obj.n);
    }
}