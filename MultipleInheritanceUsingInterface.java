interface Father{
    abstract void call();
    abstract void talk();
    abstract void walk();
}

interface Mother{
    abstract void call();
    abstract void talk();
}


public class MultipleInheritanceUsingInterface implements Father, Mother {
    public void call(){
        System.out.println("Calling");
    }
    
    public void talk(){
        System.out.println("Talking");
    }
    public void walk(){
        System.out.println("walking");
    }

    public static void main(String[] args) {              // MultipleInheritanceUsingInterface is "Son"
        MultipleInheritanceUsingInterface obj = new MultipleInheritanceUsingInterface();
        obj.call();
        obj.talk();
        obj.walk();
    }
}
