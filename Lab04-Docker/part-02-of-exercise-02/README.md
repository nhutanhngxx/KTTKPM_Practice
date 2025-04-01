## Bước 1: Tạo file docker-compose.yml
Tạo một file có tên docker-compose.yml trong thư mục dự án của bạn. Nội dung của file này như sau:
```version: '3'
services:
  mysql:
    image: mysql:8.0
    environment:
      MYSQL_ROOT_PASSWORD: rootpassword
      MYSQL_USER: user
      MYSQL_PASSWORD: password
      MYSQL_DATABASE: mydb
    ports:
      - "3306:3306"
    volumes:
      - mysql-data:/var/lib/mysql
    networks:
      - my-network

volumes:
  mysql-data:

networks:
  my-network:
```

## Bước 2: Chạy Docker Compose
Mở terminal và di chuyển đến thư mục chứa file docker-compose.yml, sau đó chạy lệnh sau để khởi động container:
```docker-compose up -d
```

## Bước 3: Kiểm tra kết nối MySQL
Sau khi container đã chạy, bạn có thể kiểm tra kết nối với MySQL bằng cách sử dụng MySQL client từ máy host hoặc từ bên trong container.
Từ MySQL client trên máy host:
```mysql -h 127.0.0.1 -P 3306 -u user -p
```
Sau đó nhập mật khẩu password.
Từ bên trong container:
Nếu bạn muốn truy cập vào container và sử dụng MySQL client bên trong container, bạn có thể thực hiện lệnh:
```docker exec -it <container_name> mysql -u user -p
```
Trong đó, <container_name> là tên của container MySQL bạn có thể tìm bằng lệnh:
```docker ps
```

## Bước 4: Dừng container
Khi bạn muốn dừng container, sử dụng lệnh sau:
```docker-compose down
```