-- one string comment
/*
more string comment
*/
create table goods (
id integer primary key,
title varchar(30),
quantity integer check (quantity > 0),
price integer,
in_stock char(1) check(in_stock in ('Y','N'))
);
create table goods_2 (
id integer primary key,
title varchar(30),
quantity integer check (quantity > 0),
price integer,
in_stock char(1) check(in_stock in ('Y','N'))
);
drop database Group_35_36_2;
	
select * from goods;

create database Group_35_36_2;
use Group_35_36_2;


insert into goods (id, title, quantity, price, in_stock) values(1, 'apple', 4, 300, 'Y');
															
                                                               