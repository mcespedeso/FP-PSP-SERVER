--Create gender table
CREATE TABLE ps_families.gender
(
  id serial NOT NULL PRIMARY KEY,
  gender character(1),
  description_key character varying(50)
);

--Insert default values to gender table
insert into  ps_families.gender (gender, description_Key)
      values ('F', 'gender.female');

insert into  ps_families.gender (gender, description_key)
      values ('M', 'gender.male');

insert into  ps_families.gender (gender, description_key)
      values ('O', 'gender.genderOtherIdentity');

insert into  ps_families.gender (gender, description_key)
      values ('D', 'gender.selfDescribe');

insert into  ps_families.gender (gender, description_key)
      values ('P', 'gender.preferNotToSay');