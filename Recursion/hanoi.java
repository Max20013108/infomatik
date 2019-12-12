public class hanoi{


public static int number(int n){
int x = 0;
for(int i=1;i<=n;i++){
    x=2*x+1;
}
return x;
}

// public static int number2(int n){

// if(){


// }
public static void move(char f, char t){
    System.out.println("Bewege scheibe von "+f+" zu "+t);
}

public static void hanoitower(int n,char f,char h,char t){
    if(n > 0){
        hanoitower(n-1,f,t,h);
        move(f,t);
        hanoitower(n-1,h,f,t);
    }
}



public static void main(String[] args){

    hanoitower(10, 'A', 'B', 'C');
    System.out.println(number(10));
}



}