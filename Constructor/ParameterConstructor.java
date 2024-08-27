package Constructor;

class Sample {
    String name;
    int n;

    Sample(String name1, int n1) {
        name = name1;
        n = n1;
    }

    public void display() {
        System.out.println(name);
        System.out.println(n);
    }
}

public class ParameterConstructor {
    public static void main(String args[]) {
        String name2 = "Coder";
        int n2 = 120;
        Sample obj = new Sample(name2, n2);
        obj.display();
    }
}
