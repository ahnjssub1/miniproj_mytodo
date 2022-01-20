use mydb2;
show tables;
create table todoboard(
no int auto_increment,
title varchar(100),
memo varchar(200),
state varchar(20) default 'TODO',
modi varchar(20),
primary key(no));

desc todoboard;
insert into todoboard(title, memo) values('title1', 'memo1');
select * from todoboard;