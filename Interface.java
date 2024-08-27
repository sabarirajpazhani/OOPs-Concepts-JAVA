

interface Father {
    abstract void call();
    abstract void talk();
    
}

public class Interface implements Father {
    public void call(){
        System.out.println("Calling");
    }

    public void talk(){
        System.out.println("Talking");
    }

    public static void main(String[] args) {
        Interface obj=new Interface();

        obj.call();
        obj.talk();
    }
}
