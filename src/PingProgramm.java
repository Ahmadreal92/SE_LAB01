import java.util.ArrayList;
import java.util.List;

public class PingProgramm {
    public static void main(String[] args) {
        List<String> activeAddresses = new ArrayList<>();
        for (int i = 1; i <= 128; i++) {
            String ipAddress = "194.94.2." + i;
            String pingResult = Net.ping(ipAddress);
            System.out.println(pingResult);
            if (pingResult.contains("Empfangen = 4")) {
                activeAddresses.add(ipAddress);
            }
        }
        System.out.println("Active addresses:");
        for (String address : activeAddresses) {
            System.out.println(address);
        }
    }
}
