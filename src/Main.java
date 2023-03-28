import java.util.ArrayList;

public class Main {

    public static boolean containsZeitüberschreitung(String input) {
        String keyword = "Zeitüberschreitung";
        return input.contains(keyword);
    }

    //Aufgabe 3
    public static boolean containsAntwort( String adresse ) {
        String s = Net.ping(adresse);
        String subString = "Antwort";
        return s.indexOf( subString ) > -1 ? true : false;
    }

    public static boolean containsAntwort2(String adresse) {
        String s = Net.ping(adresse);
        String subString = "Antwort";
        if (s.indexOf(subString) > -1) {
            return true;
        } else {
            return false;
        }
    }


    //Aufgabe 4
    public static int verfugbareNetze(){
        String ip = "194.94.2.";
        int anzahl = 0;

        ArrayList<String> antwortendeIP = new ArrayList<String>();

        for (int i = 1; i <= 128; i++) {
            String ende = String.valueOf(i);
            String kompletteIP = ip + ende;
            if (!containsAntwort(kompletteIP)) {
                anzahl++;
            } else {
                antwortendeIP.add(kompletteIP);
            }
        }

        //Ausgabe antwortenden Adressen (Aufgabe 5)
        System.out.println(antwortendeIP.toString());

        return anzahl;
    }


}