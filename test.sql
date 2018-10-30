DROP DATABASE IF EXISTS restaurant;

CREATE DATABASE restaurant;

USE restaurant;

DROP TABLE IF EXISTS food;

CREATE TABLE food(
foodid INT AUTO_INCREMENT,
foodname VARCHAR(50),
price DOUBLE,
discountprice DOUBLE,
description VARCHAR(200),
imgurl VARCHAR(100),
PRIMARY KEY(foodid)
);

INSERT INTO food(foodname,price,discountprice,description,imgurl) VALUES
('Pizza',11.99,10.99,'Topped with pineapples, bacon crumble, bacon strips, and mozzarella cheese.','images/pizza.png'),
('Wings',9.99,8.99,'Raised without antibiotics & sourced from Canadian farms.','images/wings.png'),
('Fries(S)',3.99,3.59,'Small portion of golden brown fries cooked in trans fat free oil.','images/fries.png'),
('Fries(M)',4.99,4.49,'Medium portion of golden brown fries cooked in trans fat free oil.','images/fries.png'),
('Fries(L)',5.99,5.39,'Large portion of golden brown fries cooked in trans fat free oil.','images/fries.png');

DROP TABLE IF EXISTS orders;

CREATE TABLE orders(
orderid INT AUTO_INCREMENT,
orderdate DATETIME,
totalprice DOUBLE,
PRIMARY KEY(orderid)
);

DROP TABLE IF EXISTS orderdetail;

CREATE TABLE orderdetail(
orderdetailid INT AUTO_INCREMENT,
order_id INT,
food_id INT,
foodcount INT,
PRIMARY KEY(orderdetailid)
);

ALTER TABLE orderdetail ADD CONSTRAINT FK_orderid FOREIGN KEY(order_id) REFERENCES orders(orderid);
ALTER TABLE orderdetail ADD CONSTRAINT FK_foodid FOREIGN KEY(food_id) REFERENCES food(foodid);

