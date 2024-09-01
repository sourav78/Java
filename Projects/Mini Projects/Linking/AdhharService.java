import java.util.HashMap;
import java.util.Map;

public class AdhharService {
    private static Map<String, Addhar> addharMap = new HashMap<>();

    static {
        addharMap.put("1234567890", new Addhar("1234567890", "sourava", "Hadibandhu sahoo", "Odisha"));
        addharMap.put("1234567894", new Addhar("1234567894", "Ram", "Syam ji", "Goa"));
    }

    public Addhar getAddharByNumber(String addharNumber){
        return addharMap.get(addharNumber);
    }
}
