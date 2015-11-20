/* create mysql ctodb */
CREATE SCHEMA ctodb;

/* add address table to ctodb */
CREATE TABLE ctodb.address (
  id int(11) unsigned NOT NULL AUTO_INCREMENT,
  surname varchar(20) NOT NULL DEFAULT '',
  firstname varchar(20) NOT NULL DEFAULT '',
  lastname varchar(20) NOT NULL DEFAULT '',
  addressline1 varchar(40) NOT NULL DEFAULT '',
  addressline2 varchar(40) NOT NULL DEFAULT '',
  city varchar(20) NOT NULL DEFAULT '', 
  state varchar(20) NOT NULL DEFAULT '', 
  country  varchar(20) DEFAULT NULL, 
  phonenumber varchar(20) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

commit;