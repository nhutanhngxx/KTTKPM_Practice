const express = require('express');
const mysql = require('mysql2');

const app = express();
const port = 3000;

// Kết nối với MySQL
const db = mysql.createConnection({
    host: process.env.DB_HOST,
    user: process.env.DB_USER,
    password: process.env.DB_PASSWORD,
    database: process.env.DB_NAME,
});

db.connect((err) => {
    if (err) {
        console.error('Lỗi kết nối MySQL: ', err.stack);
        return;
    }
    console.log('Đã kết nối đến MySQL!');
});

// Một route đơn giản
app.get('/', (req, res) => {
    db.query('SELECT * FROM users', (err, results) => {
        if (err) {
            return res.status(500).send('Lỗi truy vấn MySQL');
        }
        res.json(results);
    });
});

app.listen(port, () => {
    console.log(`Ứng dụng Node.js đang chạy trên cổng ${port}`);
});