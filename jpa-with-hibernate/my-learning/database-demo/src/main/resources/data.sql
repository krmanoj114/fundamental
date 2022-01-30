create table person
(
 id integer not null,
 name varchar(255) not null,
 location varchar(255),
 birth_date timestamp,
 primary key(id)
);

Insert into PERSON (id, birth_date, location, name)
    values(1001, sysdate(),'Begusarai', 'Manoj');
Insert into PERSON (id, birth_date, location, name)
    values(1002, sysdate(), 'Bokaro', 'Sunita');
Insert into PERSON (id, birth_date, location, name)
    values(1003, sysdate(), 'Delhi', 'Shreya');


