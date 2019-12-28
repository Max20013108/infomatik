public class fibonacci{

    public static int fibonacci(int n){
        if(n>1){
            return fibonacci(n-1)+fibonacci(n-2);
        }
        else{
            return  n;
        }
    }

public static void main(String[] args){

    System.out.println(fibonacci(7));
}


}