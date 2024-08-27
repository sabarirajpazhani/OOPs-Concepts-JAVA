class Demo{
    public static int factorial(int nn){
        int fact=1;
        for(int i=1;i<=nn;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n=145;
        int t=n;
        int c=0;
        while(n!=0){
            int x=n%10;
            int n1=factorial(x);
            c+=n1;
            n/=10;
        }
        if(c==t){
            System.out.println("YEs");
        }
        else{
            System.out.println("No");
        }
    }
}