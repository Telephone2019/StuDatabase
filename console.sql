PRAGMA foreign_keys = ON;
PRAGMA encoding = 'UTF-8';

-- create table S (
--                    SNO TEXT,
--                    SNAME TEXT not null default '同学',
--                    AGE INTEGER not null,
--                    SEX TEXT not null,
--                    SDEPT TEXT,
--                    primary key (SNO)
-- );
-- create table C (
--                    CNO TEXT,
--                    CNAME TEXT not null default '课程',
--                    CDEPT TEXT,
--                    TNAME TEXT,
--                    primary key (CNO)
-- );
-- create table SC (
--                    SNO TEXT,
--                    CNO TEXT,
--                    GRADE REAL check ( GRADE >= 0 ),
--                    primary key (SNO,CNO),
--                    foreign key (SNO) references S(SNO),
--                    foreign key (CNO) references C(CNO)
-- );

select * from S;
select * from C;
select * from SC;
