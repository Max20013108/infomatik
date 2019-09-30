public class Lotto2
{
    public static void main(String[] args){
        int[] tipp = {1, 12, 21, 31, 37, 46};
        int[] ziehung = {1, 21, 25, 40, 44, 45};

        for(int s: tipp){
            System.out.println(s);
        }
        for(int s: ziehung){
            System.out.println(s);
        }

        int richtige = 0;
        for (int t : tipp) {
            for (int z : ziehung) {
                if (t == z) richtige = richtige + 1;
            }
        }
        System.out.println(richtige);        
    }
}