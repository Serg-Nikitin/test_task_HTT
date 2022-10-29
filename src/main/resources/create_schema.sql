drop all objects;

create sequence global_seq start with 100000;

create table product
(
    id   int sequence global_seq,
    name varchar(100) not null,
    primary key (id)
);

create table category
(
    id   int sequence global_seq,
    name varchar(100) not null,
    primary key (id)
);

create table common_table
(
    id_category int,
    id_product  int,
    primary key (id_category, id_product),
    FOREIGN KEY (id_category) REFERENCES category (id),
    FOREIGN KEY (id_product) REFERENCES product (id)
);


insert into product
values (5, 'wine'),
       (6, 'koumiss'),
       (7, 'orange'),
       (8, 'apple'),
       (9, 'banana'),
       (10, 'raspberry'),
       (11, 'strawberry'),
       (12, 'milk'),
       (13, 'yogurt')
;

insert into category
values (1, 'alcohol'),
       (2, 'fruit'),
       (3, 'berries'),
       (4, 'dairy products');

insert into common_table
values (1, 5),
       (1, 6),
       (2, 7),
       (2, 8),
       (2, 9),
       (3, 10),
       (3, 11),
       (4, 12),
       (4, 13),
       (4, 6);

