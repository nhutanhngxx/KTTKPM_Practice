# COMPOSITE DESIGN PATTERN (MẪU THIẾT KẾ TỔNG HỢP)

## ĐỊNH NGHĨA
**Composite Design Pattern** là một mẫu thiết kế thuộc nhóm cấu trúc (structural pattern), 
cho phép bạn tổ chức các đối tượng theo cấu trúc cây để biểu diễn mối quan hệ phần - tổng thể (part-whole). 
Mẫu này giúp xử lý các đối tượng riêng lẻ và nhóm đối tượng theo cùng một cách, 
rất hữu ích khi làm việc với các hệ thống phân cấp, chẳng hạn như hệ thống tệp tin (file system) 
hoặc cấu trúc sản phẩm trong sản xuất.

## CÁC THÀNH PHẦN CHÍNH
**1. Component (Thành phần chung):** Là giao diện hoặc lớp cơ sở chung cho cả Leaf và Composite.
Định nghĩa các phương thức chung mà cả hai loại đối tượng có thể thực hiện.

**2. Leaf (Lá - Đối tượng đơn lẻ):** Đại diện cho các đối tượng đơn không có con.
Cung cấp cách triển khai cụ thể cho các phương thức được định nghĩa trong Component.

**3. Composite (Nhóm - Đối tượng chứa nhiều thành phần con):** Có thể chứa cả Leaf lẫn Composite khác.
Thực hiện các thao tác trên tất cả các thành phần con bên trong nó.

**4. Client (Mã sử dụng):** Tương tác với đối tượng thông qua giao diện Component,
mà không cần quan tâm đối tượng đó là Leaf hay Composite.

## LỢI ÍCH CỦA COMPOSITE PATTERN
**1. Đơn giản hóa mã nguồn:** `Client` không cần quan tâm đang làm việc với đối tượng đơn lẻ hay nhóm đối tượng. 

**2. Tính linh hoạt cao:** Dễ dàng thêm hoặc xóa đối tượng con mà không ảnh hưởng đến các phần khác của hệ thống. 

**3. Hỗ trợ cấu trúc cây:** Phù hợp để làm việc với các hệ thống có quan hệ phân cấp. 

## ỨNG DỤNG THỰC TẾ
**1. Hệ thống file (File system):** Tập tin (`File`) là `Leaf`, thư mục (`Folder`) là `Composite`.

**2. Giao diện đồ họa (GUI):** Một `Panel` chứa nhiều `Button`, `TextField`, `Label`...

**3. Cấu trúc tổ chức công ty:** Nhân viên cấp thấp (`Leaf`), quản lý (`Composite` chứa nhiều nhân viên dưới quyền).
