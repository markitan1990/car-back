CREATE SCHEMA IF NOT EXISTS cars;
SET SEARCH_PATH TO cars;
create table if not exists static_text
(
    id                  bigserial primary key,
    class_id            text,
    description         text
);

create table if not exists car_cards
(
    id bigserial primary key,
    owner text not null default 'mark',
    car_mileage int not null,
    car_year int not null,
    cost int not null,
    car_condition text not null,
    car_engine float not null,
    description text not null,
    transmission text not null
);

create table if not exists car_images
(
    car_cards_id bigint not null,
    link text not null,
    foreign key (car_cards_id) references car_cards (id)
);

create table if not exists brand
(
    car_cards_id bigint not null,
    car_name text not null,
    link text not null,
    foreign key (car_cards_id) references car_cards (id)
);