import java.util.HashMap;
import java.util.Map;

public class Medlemsavgift {
    private Medlem medlem;
    private Map<Integer, Boolean> betalingsStatus;

    public Medlemsavgift(Medlem medlem) {
        this.medlem = medlem;
        this.betalingsStatus = new HashMap<>();
    }

    public void setBetalingsStatus(int aar, boolean betalt) {
        betalingsStatus.put(aar, betalt);
    }

    public boolean getBetalingsStatus(int aar) {
        return betalingsStatus.getOrDefault(aar, false);
    }

    // Flere metoder etter behov
}