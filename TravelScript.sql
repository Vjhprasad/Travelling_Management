create database b_ticket;
use b_ticket;
create table bus(name varchar(30),aadharid int(10) not null,source varchar(30),destination varchar(30));
create table train(name varchar(30),aadharid int(10) not null,source varchar(30),destination varchar(30));
create table flight(name varchar(30),aadharid int(10) not null,source varchar(30),destination varchar(30));
create table admin(username varchar(30),password varchar(30),role varchar(20),id int not null);
create table user(username varchar(30),password varchar(30),role varchar(20),id int not null);
insert into admin values('vijay','prasad','admin',1001);
insert into user values('hari','prasad','user',1002);
