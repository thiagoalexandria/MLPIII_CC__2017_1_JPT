# Host: localhost  (Version 5.7.18-log)
# Date: 2017-06-13 06:10:58
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "carro"
#

DROP TABLE IF EXISTS `carro`;
CREATE TABLE `carro` (
  `codigo` int(3) NOT NULL,
  `marca` char(30) NOT NULL,
  `modelo` char(30) NOT NULL,
  `preco` double(20,0) NOT NULL DEFAULT '0',
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "carro"
#

INSERT INTO `carro` VALUES (231,'Mercedes-Benz','Classe C',300),(400,'Uno','Mille',10),(533,'Chevrolet','Onix',20),(555,'Jaguar','f-Type',100);

#
# Structure for table "cliente"
#

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `nome` char(30) NOT NULL,
  `cpf` char(30) NOT NULL,
  `telefone` char(30) NOT NULL DEFAULT 'NULL',
  `email` char(30) NOT NULL,
  `rua` char(30) NOT NULL,
  `bairro` char(30) NOT NULL,
  `cidade` char(30) NOT NULL,
  `numero` int(11) NOT NULL,
  `uf` char(2) NOT NULL,
  PRIMARY KEY (`cpf`),
  UNIQUE KEY `cpf` (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "cliente"
#


#
# Structure for table "alug_carro"
#

DROP TABLE IF EXISTS `alug_carro`;
CREATE TABLE `alug_carro` (
  `codigo` int(3) NOT NULL,
  `cpf` char(30) NOT NULL,
  KEY `codigo` (`codigo`),
  KEY `cpf` (`cpf`),
  CONSTRAINT `alug_carro_ibfk_1` FOREIGN KEY (`codigo`) REFERENCES `carro` (`codigo`),
  CONSTRAINT `alug_carro_ibfk_2` FOREIGN KEY (`cpf`) REFERENCES `cliente` (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "alug_carro"
#


#
# Structure for table "moto"
#

DROP TABLE IF EXISTS `moto`;
CREATE TABLE `moto` (
  `codigom` int(3) NOT NULL,
  `marcam` char(30) NOT NULL,
  `modelom` char(30) NOT NULL,
  `precom` double(20,0) NOT NULL DEFAULT '0',
  PRIMARY KEY (`codigom`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "moto"
#

INSERT INTO `moto` VALUES (123,'BMW','S1000-RR',100),(124,'Ducati','Superleggera',150),(989,'Shineray','50-cc',5);

#
# Structure for table "pedidoc"
#

DROP TABLE IF EXISTS `pedidoc`;
CREATE TABLE `pedidoc` (
  `Id` int(11) NOT NULL DEFAULT '0',
  `nomeinquilino` char(30) DEFAULT NULL,
  `marcacarro` char(30) DEFAULT NULL,
  `modelocarro` char(30) DEFAULT NULL,
  `codcarro` char(30) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "pedidoc"
#


#
# Structure for table "pedidom"
#

DROP TABLE IF EXISTS `pedidom`;
CREATE TABLE `pedidom` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `nomeinquilino` char(30) DEFAULT NULL,
  `marcamoto` char(30) DEFAULT NULL,
  `modelomoto` char(30) DEFAULT NULL,
  `codmoto` char(30) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1607188925 DEFAULT CHARSET=utf8;

#
# Data for table "pedidom"
#

