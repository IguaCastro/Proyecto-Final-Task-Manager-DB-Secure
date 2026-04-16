create database taskmanager;
use taskmanager;
create table users(
    id int auto_increment primary key,
    username varchar (50) unique not null,
    password varchar (100) not null
);

create table tasks(
    id int auto_increment primary key,
    title varchar (50) not null,
    description text,
    completed boolean default false,
    user_id int not null,
    foreign key (user_id) references users (id)
);

select * from tasks;
