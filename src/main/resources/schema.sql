create table if not exists customer (
    id BIGINT primary key auto_increment,
    name varchar(50),
    email varchar(50)
);