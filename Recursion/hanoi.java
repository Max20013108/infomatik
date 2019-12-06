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

public static void hanoitower(int i,char f,char h,char t){
    if(i == 0){
    }
else{
    hanoitower(i-1,f,t,h);
    move(f,t);
    hanoitower(i-1,h,f,t);

}

}

public static void main(String[] args){

    hanoitower(5, 'A', 'B', 'C');
}



}