drop database if exists meteogalicia;
create database meteogalicia;
use meteogalicia;

CREATE TABLE provincia (
  _id int(11) primary key auto_increment,
  nome varchar(20) NOT NULL
) ENGINE=InnoDB;

CREATE TABLE estacion (
  _id int(11) NOT NULL primary key auto_increment,
  nome varchar(50) NOT NULL,
  concello varchar(500) NOT NULL,
  idprovincia int(11) NOT NULL,
  FOREIGN KEY (idprovincia) REFERENCES provincia (_id)
) ENGINE=InnoDB;

insert into provincia
values (1, 'A Coruña'),
(2, 'Lugo'),
(3, 'Ourense'),
(4, 'Pontevedra');

INSERT INTO estacion VALUES(10045,'Mabegondo','Abegondo',1);
INSERT INTO estacion VALUES(10053,'Campus Lugo','Lugo',2);
INSERT INTO estacion VALUES(10057,'Alto do Rodicio','Maceda',3);
INSERT INTO estacion VALUES(10061,'Mouriscade','Lalín',4);
INSERT INTO estacion VALUES(10062,'Ancares','Cervantes',2);
INSERT INTO estacion VALUES(10064,'Lourizán','Pontevedra',4);
INSERT INTO estacion VALUES(10086,'Fornelos de montes','Fornelos de Montes',4);
INSERT INTO estacion VALUES(10088,'Fragavella','Abadín',2);
INSERT INTO estacion VALUES(10095,'Sergude','Boqueixón',1);
INSERT INTO estacion VALUES(10099,'Bóveda','Bóveda',2);
INSERT INTO estacion VALUES(10106,'A Pontenova','A Pontenova',2);
INSERT INTO estacion VALUES(10109,'Amiudal','Avión',3);
INSERT INTO estacion VALUES(10110,'Baltar','Baltar',3);
INSERT INTO estacion VALUES(10111,'Entrimo','Entrimo',3);
INSERT INTO estacion VALUES(10112,'Gandarela','Celanova',3);
INSERT INTO estacion VALUES(10113,'Monte Medo','Baños de Molgas',3);
INSERT INTO estacion VALUES(10118,'Burela','Burela',2);
INSERT INTO estacion VALUES(10120,'Pereira','Forcarei',4);
INSERT INTO estacion VALUES(10121,'Rebordelo','Cotobade',4);
INSERT INTO estacion VALUES(10123,'Ourense-Ciencias','Ourense',3);
INSERT INTO estacion VALUES(10126,'Ons','Bueu',4);
INSERT INTO estacion VALUES(10127,'Caldas de Reis','Caldas de Reis',4);
INSERT INTO estacion VALUES(10130,'Lardeira','Carballeda de Valdeorras',3);
INSERT INTO estacion VALUES(10133,'Xesteiras','Cuntis',4);
INSERT INTO estacion VALUES(10136,'O Xipro','A Fonsagrada',2);
INSERT INTO estacion VALUES(10138,'Xares','A Veiga',3);
INSERT INTO estacion VALUES(10140,'Sabón','Arteixo',1);
INSERT INTO estacion VALUES(10143,'Cariño','Cariño',1);
INSERT INTO estacion VALUES(10144,'Raído-Arzúa','Arzúa',1);
INSERT INTO estacion VALUES(10146,'Castro R. de Lea','Castro de Rei',2);
INSERT INTO estacion VALUES(10152,'Coruña','A Coruña',1);
INSERT INTO estacion VALUES(10161,'Vigo-Campus','Vigo',4);
INSERT INTO estacion VALUES(10202,'Alto do Faro','Chantada',2);
INSERT INTO estacion VALUES(10203,'Alto de Cerredo','A Fonsagrada',2);
INSERT INTO estacion VALUES(10204,'Casaio','Carballeda de Valdeorras',3);
INSERT INTO estacion VALUES(10800,'Camariñas','Camariñas',1);
INSERT INTO estacion VALUES(14000,'Coruña Dique','A Coruña',1);
INSERT INTO estacion VALUES(14003,'Punta Langosteira','Arteixo',1);
INSERT INTO estacion VALUES(14004,'Coruña San Diego','A Coruña',1);
INSERT INTO estacion VALUES(19067,'Castrelo','Cambados',4);