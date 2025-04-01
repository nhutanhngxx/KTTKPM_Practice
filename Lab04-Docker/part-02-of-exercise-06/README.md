# BÀI 06 - PHẦN 02: DOCKER COMPOSE FILE

Để chạy WordPress cùng với MySQL bằng Docker Compose, bạn sẽ cần một file cấu hình Docker Compose để định nghĩa hai dịch vụ:
- WordPress: Ứng dụng web quản lý nội dung.
- MySQL: Cơ sở dữ liệu lưu trữ dữ liệu của WordPress

Bước 1: Tạo file docker-compose.yml
Trong thư mục của dự án, tạo một file docker-compose.yml với nội dung sau:
```version: '3.7'

services:
  wordpress:
    image: wordpress:latest
    container_name: wordpress-container
    ports:
      - "8080:80"  # Map cổng 80 của container sang cổng 8080 trên máy host
    environment:
      WORDPRESS_DB_HOST: mysql:3306  # Địa chỉ của dịch vụ MySQL
      WORDPRESS_DB_NAME: wordpress   # Tên database cho WordPress
      WORDPRESS_DB_USER: root        # Username của MySQL
      WORDPRESS_DB_PASSWORD: example # Mật khẩu của MySQL
    volumes:
      - wordpress-data:/var/www/html  # Volume để lưu trữ dữ liệu của WordPress
    restart: always
  mysql:
    image: mysql:5.7
    container_name: mysql-container
    environment:
      MYSQL_ROOT_PASSWORD: example   # Đặt mật khẩu root cho MySQL
      MYSQL_DATABASE: wordpress      # Tạo database cho WordPress
      MYSQL_USER: user               # Tạo user cho MySQL
      MYSQL_PASSWORD: example        # Mật khẩu của user
    volumes:
      - mysql-data:/var/lib/mysql     # Volume để lưu trữ dữ liệu MySQL
    restart: always

volumes:
  wordpress-data:
    driver: local
  mysql-data:
    driver: local
```

## Bước 2: Chạy Docker Compose
Sau khi đã tạo file `docker-compose.yml`, bạn có thể khởi động các dịch vụ bằng lệnh:
```docker-compose up -d
```

## Bước 3: Truy cập WordPress
Sau khi các dịch vụ đã được khởi động, bạn có thể truy cập vào ứng dụng WordPress của mình qua trình duyệt web:
```http://localhost:8080
```

## Bước 4: Kiểm tra các container
Để kiểm tra các container đang chạy, bạn có thể sử dụng lệnh:
```docker ps
```

## Bước 5: Dừng các container
Khi bạn muốn dừng các container, sử dụng lệnh:
```docker-compose down
```
Lệnh này sẽ dừng và xóa các container đang chạy. Dữ liệu của WordPress và MySQL sẽ được lưu trong các volumes nếu bạn đã định nghĩa như trong file `docker-compose.yml`.