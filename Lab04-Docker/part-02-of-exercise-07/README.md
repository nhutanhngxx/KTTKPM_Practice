# BÀI 07 - PHẦN 02: DOCKER COMPOSE FILE

Để chạy MongoDB và Mongo Express với Docker Compose, bạn cần tạo một file docker-compose.yml để cấu hình và khởi động cả hai dịch vụ:
MongoDB: Đây là cơ sở dữ liệu NoSQL.
Mongo Express: Đây là một ứng dụng web đơn giản dùng để quản lý MongoDB qua giao diện web.
Dưới đây là các bước thực hiện:
## Bước 1: Tạo file docker-compose.yml
Tạo một file docker-compose.yml với nội dung như sau:
```version: '3.7'

services:
  mongo:
    image: mongo:latest
    container_name: mongo-container
    ports:
      - "27017:27017"  # Mở cổng MongoDB (cổng mặc định)
    volumes:
      - mongo-data:/data/db  # Dữ liệu MongoDB được lưu trong volume để duy trì khi container restart
    restart: always

  mongo-express:
    image: mongo-express:latest
    container_name: mongo-express-container
    ports:
      - "8081:8081"  # Mở cổng cho Mongo Express trên cổng 8081
    environment:
      - ME_CONFIG_MONGODB_URL=mongodb://mongo:27017/  # Địa chỉ MongoDB container
    depends_on:
      - mongo  # Đảm bảo MongoDB khởi động trước
    restart: always

volumes:
  mongo-data:
    driver: local
```

## Bước 2: Chạy Docker Compose
Sau khi đã tạo xong file docker-compose.yml, bạn có thể chạy các dịch vụ bằng lệnh sau:
```docker-compose up -d```
Lệnh này sẽ:
- Tải các image cần thiết (nếu chưa có).
- Khởi động các container MongoDB và Mongo Express.

## Bước 3: Truy cập Mongo Express
Sau khi Docker Compose đã chạy thành công, bạn có thể truy cập vào Mongo Express thông qua trình duyệt web tại địa chỉ:
```http://localhost:8081
```

