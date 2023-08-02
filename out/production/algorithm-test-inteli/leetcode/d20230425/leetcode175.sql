CREATE DATABASE leetcode;
USE leetcode;

CREATE TABLE Person (
	personId INT PRIMARY KEY,
    lastName VARCHAR(200),
    firstName VARCHAR(200)
);

INSERT INTO Person VALUES (1, 'Wang', 'Allen');
INSERT INTO Person VALUES (2, 'Alice', 'Bob');

CREATE TABLE Address (
	addressId INT PRIMARY KEY,
	personId INT, 
    city VARCHAR(200),
    state VARCHAR(200)
);
INSERT INTO Address VALUES (1,2 , 'New York City', 'New York');
INSERT INTO Address VALUES (2,3 , 'leetcode', 'California');

SELECT p.firstName, p.lastName, a.city, a.state FROM Person p LEFT JOIN Address a ON p.personId = a.personId ORDER BY 1;

-- 서브쿼리로 작성하기
SELECT * FROM Person;
SELECT * FROM Address;

SELECT firstName, lastName, 
(SELECT city FROM Address a WHERE p.personId = a.personId) city, 
(SELECT state FROM Address a WHERE p.personId = a.personId) state 
FROM Person p;










