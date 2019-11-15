public class Verarbeitung
{
    public static String verschluessele(String klartext) {
        String geheimtext = "";
        int n = klartext.length();
        for (int i=0;i<n;i=i+2) {
            geheimtext = geheimtext+klartext.charAt(i);
        }
        for (int i=1;i<n;i=i+2) {
            geheimtext = geheimtext+klartext.charAt(i);
        }
        return geheimtext;
    }
}