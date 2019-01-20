create database bankdb;
use bankdb;

create table data(age int,job varchar(20),marital varchar(20),education varchar(20),default_ varchar(20),balance int,housing varchar(3),loan varchar(2),contact varchar(20),day int,month varchar(4),duration int,campaign int,pdays int,previous_ int,poutcome varchar(20),target varchar(20))
row format delimited
fields terminated by ',';
load data inpath 'bankdata/bank.csv' overwrite into table data;

create table data_y(age int,job varchar(20),marital varchar(20),education varchar(20),default_ varchar(20),balance int,housing varchar(3),loan varchar(2),contact varchar(20),day int,month varchar(4),duration int,campaign int,pdays int,previous_ int,poutcome varchar(20),target varchar(20))
row format delimited
fields terminated by ',';
insert into table data_y select * from data where target='"yes"'; 

create table data_n(age int,job varchar(20),marital varchar(20),education varchar(20),default_ varchar(20),balance int,housing varchar(3),loan varchar(2),contact varchar(20),day int,month varchar(4),duration int,campaign int,pdays int,previous_ int,poutcome varchar(20),target varchar(20))
row format delimited
fields terminated by ',';
insert into table data_n select * from data where target='"no"';
