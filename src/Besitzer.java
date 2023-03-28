import java.util.ArrayList;
public class Besitzer {
    // Anfang Attribute
    private String name;
    private String ip;
    private ArrayList<String> geraet;
    // Ende Attribute
    public Besitzer(String ip, String name) {
        this.name = name;
        this.ip = ip;
        this.geraet = new ArrayList<String>();
    }

    // Anfang Methoden
    public void addGeraet (String name) {
        this.geraet.add(name);
    }

    public void removeGeraet (String name) {
        this.geraet.remove(name);
    }


    public String getName() {
        return name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ipNeu) {
        ip = ipNeu;
    }

    public void setName(String nameNeu) {
        name = nameNeu;
    }

    public String toString(){
        return "Besitzer = " + name + "\nIP-Adresse = " + ip + "\n Geräte = " + geraet.toString();
    }

    // Ende Methoden
}