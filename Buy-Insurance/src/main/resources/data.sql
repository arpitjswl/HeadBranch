--Customer Data
Insert into  Customer (first_name, last_name, cust_contact, customer_age) values ('Arpit', 'Jaiswal', 9209829799, 26);
Insert into  Customer (first_name, last_name, cust_contact, customer_age) values ('Anuj', 'Jaiswal', 9226760167, 23);
Insert into  Customer (first_name, last_name, cust_contact, customer_age) values ('Ankur', 'Jaiswal', 9960510807, 56);
Insert into  Customer (first_name, last_name, cust_contact, customer_age) values ('Vinay', 'Jaiswal', 9993699757, 61);
Insert into  Customer (first_name, last_name, cust_contact, customer_age) values ('Sachin', 'Jaiswal', 8517956896, 45);

--Plans Table data
INSERT INTO Plans (plan_name, plan_premium, plan_coverage, co_payment, plan_type,insurance_provider)
VALUES ('iProtect Smart', 9000, 600000, 10, 'HEALTH', 'ICICI');
INSERT INTO Plans (plan_name, plan_premium, plan_coverage, co_payment, plan_type,insurance_provider)
VALUES ('Click 2 Protect 3D Plus', 1000, 700000, 12, 'TERM', 'HDFC');
INSERT INTO Plans (plan_name, plan_premium, plan_coverage, co_payment, plan_type,insurance_provider)
VALUES ('Bajaj Allianz life Smart Protect Goal', 4000, 800000, 9, 'HEALTH', 'BAJAJ ALLIANZ');



insert into user values(101, sysdate(), 'John');  
insert into user values(102, sysdate(), 'Robert');  
insert into user values(104, sysdate(), 'Andrew');  
insert into user values(105, sysdate(), 'Jack');  
insert into posts values(111, 'first post', 101);  
insert into posts values(112, 'second post', 101);  
insert into posts values(113, 'third post', 104);  