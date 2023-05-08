import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Tax {
private Map<String, Collection<Firm>> tax = new HashMap<>();

    public Tax() {

}

    @Override
    public String toString() {
        return "Tax{" +
                "tax=" + tax +
                '}';
    }
}
