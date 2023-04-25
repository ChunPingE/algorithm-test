-- 183
CREATE TABLE Customers (
	id INT PRIMARY KEY,
    name VARCHAR(200)
);

CREATE TABLE Orders (
	id INT PRIMARY KEY,
    customerId INT
);

INSERT INTO Customers VALUES (1, 'Joe');
INSERT INTO Customers VALUES (2, 'Henry');
INSERT INTO Customers VALUES (3, 'Sam');
INSERT INTO Customers VALUES (4, 'Max');

INSERT INTO Orders VALUES (1, 3);
INSERT INTO Orders VALUES (2, 1);

SELECT name Customers FROM Customers c LEFT JOIN Orders o ON c.id = o.customerId WHERE customerId IS NULL ;

-- 서브쿼리로 풀어보기
SELECT * FROM Orders;
SELECT * FROM Customers;

SELECT customerId FROM Orders;

SELECT name FROM Customers WHERE id NOT IN (SELECT customerId FROM Orders);









