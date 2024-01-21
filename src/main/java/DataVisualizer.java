package PACKAGE_NAME;import java.util.Map;

public class DataVisualizer {
    public void displayHistogram(Map<Integer, Integer> histogram) {
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println("Age: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}

