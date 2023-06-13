create database PI;
use PI;
create table ranking (ranking int,
nome varchar(5) not null primary key,
pontos int not null ,
turnos int not null);
drop table ranking;
drop table pistas;

create table pistas (codPista int primary key auto_increment,
palavras char(30) not null unique,
pista varchar(200));

insert into pistas (palavras, pista) values ('print' , 'Qual método de classe que imprime uma String e para a mesma linha?');
insert into pistas (palavras, pista) values ('printf' , 'Qual método de classe que imprime uma String formatada?');
insert into pistas (palavras, pista) values ('javac' , 'Qual compilador de classes em Java?');
insert into pistas (palavras, pista) values ('lang' , 'O pacote de java que é importado automaticamente.');
insert into pistas (palavras, pista) values ('float' , 'Tipo de dados que armazena números de 32 bits com ponto flutuante.');
insert into pistas (palavras, pista) values ('int' , 'Tipo de dados que armazena números inteiros.');
insert into pistas (palavras, pista) values ('double' , 'Tipo de dados que armazena números de 64 bits com ponto flutuante.');
insert into pistas (palavras, pista) values ('public' , 'Modificador que permite o acesso da classe para todas as outras classes do projeto.');
insert into pistas (palavras, pista) values ('private' , 'Modificador que restringe o acesso de outras classes do projeto para a classe atual.');
insert into pistas (palavras, pista) values ('protected' , 'Modificador que permite o acesso da classe para classes filhas ou do mesmo pacote.');
insert into pistas (palavras, pista) values ('random' , 'Método que gera um tipo de dado aleatório.');
insert into pistas (palavras, pista) values ('for' , 'Cláusula de repetição pré-testada usada quando se tem o número exato de loops.');
insert into pistas (palavras, pista) values ('if' , 'Estruta de condição primária.');
insert into pistas (palavras, pista) values ('while' , 'Cláusula de repetição pré-testada usada quando não se sabe o número exato de loops.');
