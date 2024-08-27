package OOPsPillers.Polymorphism;

class Method{
    void max(int a, int b){
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }

    void max(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a);
        }
        else if (b>a && b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}

public class MethodOverLoading {
   public static void main(String[] args) {
    Method obj = new Method();
    obj.max(2,5);
    obj.max(2,3,6);
   }
}
