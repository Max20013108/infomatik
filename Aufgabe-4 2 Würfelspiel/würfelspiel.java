public class würfelspiel{
    public static void Main(String[] args){
         int würfel1 = (int)(6*Math.random()+1);
         int würfel2 = (int)(6*Math.random()+1);
         
         int würfelgesamt = würfel1+würfel2;

         if(würfelgesamt == 7||würfelgesamt == 11){
             System.out.println("Deine Augensumme war " +würfelgesamt + "und damit hast du gewonnen");

            }
         else{
             if(würfelgesamt==2 ||würfelgesamt==3 ||würfelgesamt==12){
                 System.out.println("Deine Augensumme war " +würfelgesamt + " und damit hast du verloren");

                }
             else{
                 int würfelgesamtvorher = würfelgesamt;
                 würfel1 = (int)(6*Math.random()+1);
                 würfel2 = (int)(6*Math.random()+1);
                 würfelgesamt = würfel1+würfel2;
                 if(würfelgesamt == würfelgesamtvorher){
                     System.out.println("Du hast gewonnen deine Augesumme war "+würfelgesamt +" und damit gleich deiner vorherigen Augesumme "+ würfelgesamtvorher );
                    }
                    else{
                        System.out.println("Du hast verloren deine Augesumme war "+würfelgesamt +" und damit nicht gleich deiner vorherigen Augesumme "+ würfelgesamtvorher);
                    }
                }
            }
        }
}