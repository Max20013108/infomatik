public class fak{


    public static int fak(int n){
        if(n>=1){
            return fak(n-1)*n;
        }
        else{
            return 1;
        }
}


public static void main(String[] args){

    System.out.println(fak(10));
} 

}