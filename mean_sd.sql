use bankdb;

create table mean_y(age int,balance int,day int,duration int,campaign int,pdays int,previous_ int)
row format delimited
fields terminated by ',';
insert into table mean_y select avg(age),avg(balance),avg(day),avg(duration),avg(campaign),avg(pdays),avg(previous_) from data_y;
insert overwrite local directory '/home/edureka/Desktop/Prediction_Project/mean_sd/mean_y' row format delimited fields terminated by ',' select * from mean_y;

create table mean_n(age int,balance int,day int,duration int,campaign int,pdays int,previous_ int)
row format delimited
fields terminated by ',';
insert into table mean_n select avg(age),avg(balance),avg(day),avg(duration),avg(campaign),avg(pdays),avg(previous_) from data_n;
insert overwrite local directory '/home/edureka/Desktop/Prediction_Project/mean_sd/mean_n' row format delimited fields terminated by ',' select * from mean_n;

create table sd_y(age int,balance int,day int,duration int,campaign int,pdays int,previous_ int)
row format delimited
fields terminated by ',';
insert into table sd_y select stddev(age),stddev(balance),stddev(day),stddev(duration),stddev(campaign),stddev(pdays),stddev(previous_) from data_y;
insert overwrite local directory '/home/edureka/Desktop/Prediction_Project/mean_sd/sd_y' row format delimited fields terminated by ',' select * from sd_y;

create table sd_n(age int,balance int,day int,duration int,campaign int,pdays int,previous_ int)
row format delimited
fields terminated by ',';
insert into table sd_n select stddev(age),stddev(balance),stddev(day),stddev(duration),stddev(campaign),stddev(pdays),stddev(previous_) from data_n;
insert overwrite local directory '/home/edureka/Desktop/Prediction_Project/mean_sd/sd_n' row format delimited fields terminated by ',' select * from sd_n;
