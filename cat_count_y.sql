use bankdb;

create table job_count_y(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table job_count_y select job,count(job) from data_y group by(job);
insert overwrite local directory '/home/edureka/Desktop/count_data/job_y' row format delimited fields terminated by ',' select * from job_count_y;

create table marital_count_y(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table marital_count_y select marital,count(marital) from data_y group by(marital); 
insert overwrite local directory '/home/edureka/Desktop/count_data/marital_y' row format delimited fields terminated by ',' select * from marital_count_y;


create table education_count_y(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table education_count_y select education,count(education) from data_y group by(education);
insert overwrite local directory '/home/edureka/Desktop/count_data/education_y' row format delimited fields terminated by ',' select * from education_count_y;

create table default_count_y(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table default_count_y select default_,count(default_) from data_y group by(default_);  
insert overwrite local directory '/home/edureka/Desktop/count_data/default_y' row format delimited fields terminated by ',' select * from default_count_y;

create table housing_count_y(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table housing_count_y select housing,count(housing) from data_y group by(housing);
insert overwrite local directory '/home/edureka/Desktop/count_data/housing_y' row format delimited fields terminated by ',' select * from housing_count_y;

create table loan_count_y(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table loan_count_y select loan,count(loan) from data_y group by(loan);  
insert overwrite local directory '/home/edureka/Desktop/count_data/loan_y' row format delimited fields terminated by ',' select * from loan_count_y;

create table contact_count_y(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table contact_count_y select contact,count(contact) from data_y group by(contact);
insert overwrite local directory '/home/edureka/Desktop/count_data/contact_y' row format delimited fields terminated by ',' select * from contact_count_y;

create table month_count_y(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table month_count_y select month,count(month) from data_y group by(month);
insert overwrite local directory '/home/edureka/Desktop/count_data/month_y' row format delimited fields terminated by ',' select * from month_count_y;


create table poutcome_count_y(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table poutcome_count_y select poutcome,count(poutcome) from data_y group by(poutcome); 
insert overwrite local directory '/home/edureka/Desktop/count_data/poutcome_y' row format delimited fields terminated by ',' select * from poutcome_count_y;


create table target_count_y(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table target_count_y select target,count(target) from data_y group by(target);
insert overwrite local directory '/home/edureka/Desktop/count_data/target_y' row format delimited fields terminated by ',' select * from target_count_y;
