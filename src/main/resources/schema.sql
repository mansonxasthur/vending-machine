create table if not exists products (
    id int auto_increment primary key,
    seller_id varchar(255) not null,
    product_name varchar(255) not null,
    amount_available int default 0,
    cost varchar(10) not null
);