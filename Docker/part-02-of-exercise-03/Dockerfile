# Sử dụng Node 18 Alpine làm base image
FROM node:18-alpine

# Thiết lập thư mục làm việc trong container
WORKDIR /app

# Copy package.json và package-lock.json vào container
COPY package.json package-lock.json /app/

# Cài đặt các thư viện cần thiết
RUN npm install

# Copy tất cả các file mã nguồn vào container
COPY . /app/

# Build ứng dụng React
RUN npm run build

# Cài đặt `serve` để chạy ứng dụng React trong môi trường production
RUN npm install -g serve

# Mở cổng 3000 (mặc định của React app khi build)
EXPOSE 3000

# Chạy ứng dụng React với `serve`
CMD ["serve", "-s", "build", "-l", "3000"]
