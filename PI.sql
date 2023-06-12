create database PI;
use PI;
create table ranking (ranking int,
nome varchar(5) not null primary key,
pontos int not null ,
turnos int not null);
alter table ranking add unique (ranking);

create table pistas (codPista int primary key auto_increment,
palavras char(30) not null unique,
pista varchar(200));

insert into pistas (palavras, pista) values ('a','bbbb'), ('b', 'ccccc');
select* from pistas;