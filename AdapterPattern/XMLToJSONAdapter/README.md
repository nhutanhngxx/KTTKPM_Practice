# Adapter Design Pattern (Mẫu thiết kế Bộ Chuyển Đổi) trong Java

**1. Định nghĩa**
`Adapter Pattern` là một mẫu thiết kế thuộc nhóm Cấu trúc (`Structural Pattern`), 
giúp chuyển đổi giao diện của một lớp thành một giao diện khác mà client mong muốn. 
Nó giúp kết nối các hệ thống không tương thích với nhau mà không cần sửa đổi code gốc.

**🛠 Ứng dụng thực tế:**

**2. Lợi ích của Adapter Pattern** <br>
✅ Tích hợp hệ thống cũ và mới mà không thay đổi code gốc. <br>
✅ Tái sử dụng mã nguồn: Giúp sử dụng lại class cũ mà không cần chỉnh sửa. <br>
✅ Mở rộng linh hoạt: Dễ dàng thêm các bộ chuyển đổi khác (VD: JPY, EUR...). <br>
✅ Tách biệt rõ ràng giữa hệ thống cũ và hệ thống mới, giúp dễ dàng bảo trì. <br>

**3. Ứng dụng thực tế của Adapter Pattern** <br>
📌 Lập trình game: Chuyển đổi giữa các công cụ đồ họa khác nhau. <br>
📌 Tích hợp API: Kết nối API mới với hệ thống cũ mà không sửa đổi nhiều code.  <br>
📌 Hệ thống thanh toán: Kết nối với nhiều cổng thanh toán khác nhau (PayPal, Stripe, MoMo...). <br>
📌 Trình điều khiển phần cứng: Kết nối giữa phần cứng mới và phần mềm cũ. <br>

# Thiết kế Adapter Pattern

**Client (Ứng dụng chính)** <br>
├── Target (DataProcessor - Xử lý dữ liệu JSON) <br>
│   ├── ConcreteTarget (JSONProcessor - Hệ thống hỗ trợ JSON) <br>
│   ├── Adapter (XMLToJSONAdapter - Chuyển đổi XML sang JSON) <br>
│   ├── Adaptee (XMLProcessor - Hệ thống cũ chỉ hỗ trợ XML) <br>