desc tb_address;
desc tb_user;

select * from  tb_user;
select * from  tb_address;

delete  from  tb_user where id=109;
delete  from  tb_address where id=109;


CREATE SEQUENCE address_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE user_seq START WITH 1 INCREMENT BY 1;

ALTER TABLE tb_address
DROP COLUMN user_id;