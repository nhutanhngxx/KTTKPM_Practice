package vn.com.iuh.fit;
import org.json.JSONObject;
import org.json.XML;

public class XMLToJSONAdapter implements DataProcessor {

    private XMLProcessor xmlProcessor;

    public XMLToJSONAdapter(XMLProcessor xmlProcessor) {
        this.xmlProcessor = xmlProcessor;
    }

    // Chuyển đổi JSON thành XML trước khi gửi đến hệ thống cũ
    @Override
    public String processData(String jsonData) {
        String xmlData = jsonToXml(jsonData);
        return xmlProcessor.processXML(xmlData);
    }

    // Hàm chuyển đổi từ JSON sang XML
    private String jsonToXml(String jsonData) {
        JSONObject jsonObject = new JSONObject(jsonData);
        return XML.toString(jsonObject);
    }

    // Hàm chuyển đổi từ XML sang JSON (có thể sử dụng nếu cần)
    public String xmlToJson(String xmlData) {
        JSONObject jsonObject = XML.toJSONObject(xmlData);
        return jsonObject.toString();
    }

}
