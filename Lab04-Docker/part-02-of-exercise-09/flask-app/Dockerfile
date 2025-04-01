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
