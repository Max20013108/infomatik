public class fibonacci{

    public static int fibonacci(int n){
        int x = 0;
        if(n>1){
            x = fibonacci(n-1)+fibonacci(n-2);
        }
        if(n<=1){
            x = n;
        }

        return x;

    }

public static void main(String[] args){

    System.out.println(fibonacci(7));
}


}