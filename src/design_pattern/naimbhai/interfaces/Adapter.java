package design_pattern.naimbhai.interfaces;
import java.util.List;
import java.util.Map;

public interface Adapter {
    boolean valid();
    Map<String,List<String>> reason();
}
