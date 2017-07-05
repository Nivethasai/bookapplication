
CREATE TABLE books
(
 id INT PRIMARY KEY AUTO_INCREMENT,
 NAME VARCHAR(200) NOT NULL,
 price FLOAT NOT NULL,
 released_date date 
);

insert into books ( name,price,released_date) values ('Technical', 350,'2017-04-10');
insert into books ( name,price,released_date) values ('Aptitude', 200,'2017-01-20');
insert into books ( name,price,released_date) values ('Story', 250, '2017-03-12');
insert into books ( name,price,released_date) values ('Economy', 100,'2016-04-01');
insert into books ( name,price,released_date) values ('History', 150,'2017-03-10');