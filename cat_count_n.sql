use bankdb;

create table job_count_n(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table job_count_n select job,count(job) from data_n group by(job);
insert overwrite local directory '/home/edureka/Desktop/count_data/job_n' row format delimited fields terminated by ',' select * from job_count_n;

create table marital_count_n(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table marital_count_n select marital,count(marital) from data_n group by(marital); 
insert overwrite local directory '/home/edureka/Desktop/count_data/marital_n' row format delimited fields terminated by ',' select * from marital_count_n;


create table education_count_n(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table education_count_n select education,count(education) from data_n group by(education);
insert overwrite local directory '/home/edureka/Desktop/count_data/education_n' row format delimited fields terminated by ',' select * from education_count_n;

create table default_count_n(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table default_count_n select default_,count(default_) from data_n group by(default_);  
insert overwrite local directory '/home/edureka/Desktop/count_data/default_n' row format delimited fields terminated by ',' select * from default_count_n;

create table housing_count_n(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table housing_count_n select housing,count(housing) from data_n group by(housing);
insert overwrite local directory '/home/edureka/Desktop/count_data/housing_n' row format delimited fields terminated by ',' select * from housing_count_n;

create table loan_count_n(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table loan_count_n select loan,count(loan) from data_n group by(loan);  
insert overwrite local directory '/home/edureka/Desktop/count_data/loan_n' row format delimited fields terminated by ',' select * from loan_count_n;

create table contact_count_n(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table contact_count_n select contact,count(contact) from data_n group by(contact);
insert overwrite local directory '/home/edureka/Desktop/count_data/contact_n' row format delimited fields terminated by ',' select * from contact_count_n;

create table month_count_n(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table month_count_n select month,count(month) from data_n group by(month);
insert overwrite local directory '/home/edureka/Desktop/count_data/month_n' row format delimited fields terminated by ',' select * from month_count_n;


create table poutcome_count_n(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table poutcome_count_n select poutcome,count(poutcome) from data_n group by(poutcome); 
insert overwrite local directory '/home/edureka/Desktop/count_data/poutcome_n' row format delimited fields terminated by ',' select * from poutcome_count_n;


create table target_count_n(category varchar(20),count_ int)
row format delimited
fields terminated by ',';
insert into table target_count_n select target,count(target) from data_n group by(target);
insert overwrite local directory '/home/edureka/Desktop/count_data/target_n' row format delimited fields terminated by ',' select * from target_count_n;
