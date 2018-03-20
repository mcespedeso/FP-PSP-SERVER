--Create gender table
CREATE TABLE ps_families.gender
(
  id serial NOT NULL PRIMARY KEY,
  gender character(1),
  description_es character varying(50),
  description_en character varying(50)
);

--Insert default values to gender table
insert into  ps_families.gender (gender, description_es, description_en)
      values ('F', 'Femenino','Female');

insert into  ps_families.gender (gender, description_es, description_en)
      values ('M', 'Masculino','Male');

insert into  ps_families.gender (gender, description_es, description_en)
      values ('O', 'Otra identidad de género','Other gender identity');

insert into  ps_families.gender (gender, description_es, description_en)
      values ('D', 'Me describo como','Self describe');

insert into  ps_families.gender (gender, description_es, description_en)
      values ('P', 'Prefiero no decirlo','Prefer not to say');