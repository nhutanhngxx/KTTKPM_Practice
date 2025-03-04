# State Pattern

`State Pattern` sẽ giúp bạn quản lý trạng thái của nhân viên linh hoạt hơn, cho phép họ thay đổi vai trò mà không cần thay đổi lớp cha `Employee`.

* **Tạo interface** `EmployeeState` để định nghĩa các hành vi.
* **Tách các trạng thái** (`TeamLeaderState`, `DirectorState`,...) thành các class riêng.
* **Thay đổi trạng thái của nhân viên** khi cần.