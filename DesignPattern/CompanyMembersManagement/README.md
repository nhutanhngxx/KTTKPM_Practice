# State Pattern
`State Pattern` sẽ giúp bạn quản lý trạng thái của nhân viên linh hoạt hơn, cho phép họ thay đổi vai trò mà không cần thay đổi lớp cha `Employee`.

* **Tạo interface** `EmployeeState` để định nghĩa các hành vi.
* **Tách các trạng thái** (`TeamLeaderState`, `DirectorState`,...) thành các class riêng.
* **Thay đổi trạng thái của nhân viên** khi cần.

# Strategy Pattern
Mỗi nhân viên có thể sử dụng một chiến lược công việc linh hoạt hơn.

# Decorator Pattern
* Áp dụng `Decorator Pattern` bằng cách thêm lớp `EmployeeDecorator` để mở rộng chức năng của nhân viên.
* Nếu muốn thêm nhiệm vụ đặc biệt cho một số vị trí, ta có thể sử dụng `SpecialTaskDecorator`. Giờ đây, chức vụ Giám đốc sẽ có thêm nhiệm vụ đặc biệt.