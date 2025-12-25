CREATE DATABASE roomease;
USE roomease;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100)
);

CREATE TABLE rooms (
    id INT AUTO_INCREMENT PRIMARY KEY,
    room_no VARCHAR(20),
    type VARCHAR(50),
    rent DOUBLE,
    status VARCHAR(20)
);

CREATE TABLE bookings (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    room_id INT,
    booking_date DATE
);

INSERT INTO rooms VALUES
(1,'R101','Single',5000,'Available'),
(2,'R102','Double',8000,'Available');
