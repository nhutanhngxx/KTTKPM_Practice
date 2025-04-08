## Bước 1: Tạo ứng dụng Flask
Đầu tiên, tạo một ứng dụng Flask đơn giản. Bạn có thể tạo một thư mục mới, ví dụ flask-app, để chứa mã nguồn Flask và Dockerfile.

### 1.1 Tạo thư mục flask-app
```
mkdir flask-app
cd flask-app
```

### 1.2 Tạo file app.py (Ứng dụng Flask đơn giản)
```
from flask import Flask
app = Flask(__name__)
@app.route('/')
def hello_world():
    return "Hello, Docker and Flask!"
if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
```

## Bước 2: Tạo Dockerfile
Bây giờ, bạn cần tạo một Dockerfile để xây dựng image Docker cho ứng dụng Flask.

### 2.1 Tạo file Dockerfile
```
# Sử dụng image Python chính thức từ Docker Hub
FROM python:3.8-slim

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép file requirements.txt vào container
COPY requirements.txt .

# Cài đặt các thư viện cần thiết
RUN pip install --no-cache-dir -r requirements.txt

# Sao chép mã nguồn vào container
COPY . .

# Mở cổng 5000 cho Flask
EXPOSE 5000

# Chạy ứng dụng Flask
CMD ["python", "app.py"]
```

## Bước 3: Tạo requirements.txt
Tiếp theo, bạn cần tạo một tệp requirements.txt để chỉ định các thư viện cần thiết cho ứng dụng Flask.

### Tạo file requirements.txt
```
Flask==2.1.1
Werkzeug==2.1.0
```

## Bước 4: Tạo Docker Compose Configuration
Bây giờ, bạn cần tạo một tệp docker-compose.yml để định nghĩa các dịch vụ cho ứng dụng Flask.

### Tạo file docker-compose.yml
```
version: '3.8'
services:
  flask-app:
    build: .
    ports:
      - "5000:5000"
    restart: always
```