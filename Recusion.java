
public class Recusion {
    public static void PrintNumber(int x){
        if(x==1){
            System.out.println(x);
        }
        else{
            System.out.println(x);
            PrintNumber(x-1);
        }
    }
    public static void main(String args[]){
        int n=10;
        PrintNumber(n);
    }
}
