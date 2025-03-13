package vn.com.iuh.fit;

/**
 * ConcreteTarget - Hệ thống hỗ trợ JSON
 */

public class JSONProcessor implements DataProcessor {
    @Override
    public String processData(String jsonData) {
        return "Processing JSON: " + jsonData;
    }
}
