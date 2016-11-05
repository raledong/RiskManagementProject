drop table if exists users;
create table users(
	user_id int auto_increment primary key,
    user_password varchar(64) not null,
    user_name varchar(255) not null,
    user_gender int default 0,
    user_role int default 1
)default charset = utf8;
alter table users auto_increment=10000000;

drop table if exists projects;
create table projects(
	project_id int auto_increment primary key,
    manager_id int default -1
    
)default charset = utf8;