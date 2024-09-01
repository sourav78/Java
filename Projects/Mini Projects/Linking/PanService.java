import java.util.HashMap;
import java.util.Map;

public class PanService {
    private static Map<String, Pan> panMap = new HashMap<>();

    static {
        panMap.put(
            "PAN1232",
            new Pan(
                "PAN1232",
                "1234567890",
                "FI Bank",
                "Stocks, SIP"
            )
        );
        panMap.put(
            "PAN1243",
            new Pan(
                "PAN1243",
                "1234567894",
                "SBI Bank",
                "FD"
            )
        );
    }

    public Pan getPanByAddharNumber(String addharNumber){
        for (Pan pan: panMap.values()){
            if (pan.getAddharNumber().equals(addharNumber)){
                return pan;
            }
        }

        return null;
    }
}
