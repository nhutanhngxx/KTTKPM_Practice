## Bước 1: Tạo file docker-compose.yml
Trong thư mục của dự án, tạo một file docker-compose.yml với nội dung sau:
```version: '3'
services:
  redis:
    image: redis:latest
    container_name: redis-container
    ports:
      - "6379:6379"
    volumes:
      - redis-data:/data
    restart: always

volumes:
  redis-data:
    driver: local
```

## Bước 2: Chạy Docker Compose
Sau khi tạo xong file docker-compose.yml, bạn có thể chạy Redis bằng lệnh sau:
```docker-compose up -d
```

## Bước 3: Kiểm tra container Redis
Sau khi container Redis đã chạy, bạn có thể kiểm tra nó bằng cách sử dụng lệnh:
```docker ps
```

## Bước 4: Kết nối với Redis
Để kết nối với Redis, bạn có thể sử dụng Redis CLI hoặc các ứng dụng kết nối Redis từ máy chủ của bạn. Ví dụ, nếu bạn cài đặt Redis trên máy local, bạn có thể kết nối đến Redis bằng lệnh:
```redis-cli -h 127.0.0.1 -p 6379
```
Hoặc nếu bạn muốn kết nối trực tiếp vào Redis container từ môi trường Docker, bạn có thể sử dụng lệnh sau:
```docker exec -it redis-container redis-cli
```
