-- Gerado por Oracle SQL Developer Data Modeler 23.1.0.087.0806
--   em:        2023-10-01 20:47:52 BRT
--   site:      Oracle Database 12c
--   tipo:      Oracle Database 12c



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE login (
    usarname     NVARCHAR2(1) NOT NULL,
    password     NVARCHAR2(1),
    user_id_user NUMBER NOT NULL
);

CREATE UNIQUE INDEX login__idx ON
    login (
        user_id_user
    ASC );

ALTER TABLE login ADD CONSTRAINT login_pk PRIMARY KEY ( usarname );

CREATE TABLE payment_area (
    name_card      NVARCHAR2(1) NOT NULL,
    number_card    NVARCHAR2(1),
    month_validity NUMBER,
    year_validity  NUMBER,
    cvv_card       NUMBER,
    installments   NUMBER,
    login_usarname NVARCHAR2(1) NOT NULL
);

ALTER TABLE payment_area ADD CONSTRAINT payment_area_pk PRIMARY KEY ( name_card,
                                                                      login_usarname );

CREATE TABLE registration_forms (
    name             NVARCHAR2(1) NOT NULL,
    email            NVARCHAR2(1),
    usarname         NVARCHAR2(1),
    password         NVARCHAR2(1),
    confirm_password NVARCHAR2(1),
    login_usarname   NVARCHAR2(1) NOT NULL
);

ALTER TABLE registration_forms ADD CONSTRAINT registration_forms_pk PRIMARY KEY ( name,
                                                                                  login_usarname );

CREATE TABLE rent_your_car (
    model                             NVARCHAR2(1),
    year                              NUMBER,
    available                         NUMBER,
    registration_forms_name           NVARCHAR2(1) NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    registration_forms_login_usarname NVARCHAR2(1) NOT NULL,
    login_usarname                    NVARCHAR2(1) NOT NULL
);

ALTER TABLE rent_your_car
    ADD CONSTRAINT rent_your_car_pk PRIMARY KEY ( registration_forms_name,
                                                  registration_forms_login_usarname,
                                                  login_usarname );

CREATE TABLE "USER" (
    id_user    NUMBER NOT NULL,
    name       NVARCHAR2(1),
    email      NVARCHAR2(1),
    password   NVARCHAR2(1),
    date_birth NUMBER,
    phone      NVARCHAR2(1)
);

ALTER TABLE "USER" ADD CONSTRAINT user_pk PRIMARY KEY ( id_user );

ALTER TABLE login
    ADD CONSTRAINT login_user_fk FOREIGN KEY ( user_id_user )
        REFERENCES "USER" ( id_user );

ALTER TABLE payment_area
    ADD CONSTRAINT payment_area_login_fk FOREIGN KEY ( login_usarname )
        REFERENCES login ( usarname );

ALTER TABLE registration_forms
    ADD CONSTRAINT registration_forms_login_fk FOREIGN KEY ( login_usarname )
        REFERENCES login ( usarname );

ALTER TABLE rent_your_car
    ADD CONSTRAINT rent_your_car_login_fk FOREIGN KEY ( login_usarname )
        REFERENCES login ( usarname );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE rent_your_car
    ADD CONSTRAINT rent_your_car_registration_forms_fk FOREIGN KEY ( registration_forms_name,
                                                                     registration_forms_login_usarname )
        REFERENCES registration_forms ( name,
                                        login_usarname );



-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             5
-- CREATE INDEX                             1
-- ALTER TABLE                             10
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- TSDP POLICY                              0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   2
-- WARNINGS                                 0
