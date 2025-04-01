# Sử dụng image Node.js chính thức
FROM node:14

# Đặt thư mục làm việc trong container
WORKDIR /usr/src/app

# Sao chép package.json và package-lock.json vào container
COPY package*.json ./

# Cài đặt các phụ thuộc
RUN npm install

# Sao chép toàn bộ mã nguồn vào container
COPY . .

# Mở cổng 3000 để truy cập vào ứng dụng
EXPOSE 3000

# Chạy ứng dụng Node.js
CMD ["node", "index.js"]
