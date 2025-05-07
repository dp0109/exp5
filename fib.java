
public class fib {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        System.out.println("fibonacci series upto"+n+"terms:");
        for(int i=1;i<n;++i){
            System.out.println(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
