create table payment_authorizations(

    id bigint not null auto_increment,
    credit_card_number char(18) not null,
    cvv char(3) not null,
    brand varchar(30) not null,
    exp_date char(6) not null,
    card_owner varchar(40),
    is_success tinyint not null,
    primary key(id)
);