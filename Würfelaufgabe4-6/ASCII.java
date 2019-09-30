public class ASCII
{
    public static void main(String[] args){
        char zeichen;
        for (int i  = 0 ; i<256; i=i+1){
            zeichen = (char) i;
            System.out.println(i+" : "+zeichen);
        }
    }
}
