package vn.com.iuh.fit;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Hệ thống hỗ trợ JSON
        DataProcessor jsonProcessor = new JSONProcessor();
        String jsonData = "{\"name\": \"Cà phê\", \"price\": 25000}";
        System.out.println(jsonProcessor.processData(jsonData));

        // Hệ thống cũ chỉ hỗ trợ XML
        XMLProcessor xmlProcessor = new XMLProcessor();
        DataProcessor adapter = new XMLToJSONAdapter(xmlProcessor);

        // Chuyển đổi JSON sang XML trước khi xử lý
        System.out.println(adapter.processData(jsonData));
    }
}
