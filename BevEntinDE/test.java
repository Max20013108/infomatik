public class test{
public static void main(String[] args){

    float Interval = 0.1;
    float Summe = 0;
    while(Interval<=3){
        Summe= Summe+(50/9*Interval²);
        Interval = Interval+0.1

    }
    System.out.println(Summe);
}
}