# LAB 04

## Bước 1: Tạo file docker-compose.yml
Tạo một file có tên docker-compose.yml trong thư mục dự án của bạn. Nội dung của file này như sau:
```version: '3'
services:
  nginx:
    image: nginx:latest
    ports:
      - "8080:80"
````

## Bước 2: Chạy Docker Compose
Mở terminal và di chuyển đến thư mục chứa file docker-compose.yml, sau đó chạy lệnh sau để khởi động container:
```docker-compose up
```

## Bước 3: Kiểm tra
Mở trình duyệt và truy cập vào `http://localhost:8080`. Bạn sẽ thấy trang chủ mặc định của Nginx.

## Bước 4: Dừng container
Khi bạn muốn dừng container, bạn có thể sử dụng lệnh:
```docker-compose down
````