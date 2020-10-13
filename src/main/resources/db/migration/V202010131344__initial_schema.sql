CREATE TABLE if not exists employee (
    id serial not null primary key ,
    name varchar(150),
    phone_number varchar(50),
    department varchar(150),
    created_at timestamp with time zone default (now() at time zone 'utc'),
    updated_at timestamp with time zone
);


insert into employee(name, phone_number, department) values ('employee 11', '1111', 'department-1');
insert into employee(name, phone_number, department) values ('employee 12', '1111', 'department-1');
insert into employee(name, phone_number, department) values ('employee 13', '1111', 'department-1');
insert into employee(name, phone_number, department) values ('employee 14', '1111', 'department-1');

insert into employee(name, phone_number, department) values ('employee 21', '2222', 'department-2');
insert into employee(name, phone_number, department) values ('employee 22', '2222', 'department-2');
insert into employee(name, phone_number, department) values ('employee 23', '2222', 'department-2');
insert into employee(name, phone_number, department) values ('employee 24', '2222', 'department-2');