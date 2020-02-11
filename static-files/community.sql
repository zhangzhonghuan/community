create database community_db;
user community_db;

CREATE TABLE USER(
    ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    ACCOUNT_ID VARCHAR(100),
    NAME VARCHAR(50),
    TOKEN CHAR(36),
    GMT_CREATE BIGINT,
    GMT_MODIFIED BIGINT
);

alter table USER add bio varchar(256) null;

create table question
(
	id int auto_increment,
	title varchar(50),
	description text,
	gmt_create bigint,
	gmt_modified bigint,
	creator int,
	comment_count int default 0,
	view_count int default 0,
	like_count int default 0,
	tag varchar(256),
	constraint question_pk
		primary key (id)
);

alter table USER add avatar_url varchar(100);

create table comment
(
    id bigint auto_increment primary key,
    parent_id bigint not null,
    type int not null,
    commentator int not null,
    gmt_create bigint not null,
    gmt_modified bigint not null,
    like_count bigint default 0
);

alter table COMMENT add content varchar(1024);
alter table question modify id bigint NOT NULL;
alter table `user` modify id bigint NOT NULL;
alter table question modify creator bigint not null;
alter table `comment` modify commentator bigint not null;
alter table comment add comment_count int default 0;

create table notification
(
    id bigint auto_increment primary key,
    notifier bigint not null,
    receiver bigint not null,
    outerid bigint not null,
    type int not null,
    gmt_create bigint not null,
    status int default 0 not null
);

alter table notification add notifier_name varchar(100) null;
alter table notification add outer_title varchar(256) null;
alter table question modify id bigint auto_increment not null;
alter table `user` modify id bigint auto_increment not null;

create table nav
(
    id int auto_increment primary key not null,
    title varchar(100),
    url varchar(256),
    priority int default 0,
    gmt_create bigint,
    gmt_modified bigint,
    status int
);

create table ad
(
    id int auto_increment primary key not null,
    title varchar(256) DEFAULT NULL,
    url varchar(512) DEFAULT NULL,
    image varchar(256) DEFAULT NULL,
    gmt_start bigint,
    gmt_end bigint,
    gmt_create bigint,
    gmt_modified bigint,
    status int,
    pos varchar(10) NOT NULL
);


