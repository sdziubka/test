create table if not exists user
(
    id            bigint auto_increment primary key,
    first_name    varchar(255),
    last_name     varchar(255),
    middle_name   varchar(255),
    login         varchar(255) unique not null,
    gender        varchar(10),
    date_of_birth date
) CHARACTER SET = utf8;
