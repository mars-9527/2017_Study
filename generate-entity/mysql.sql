/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.28 : Database - db_sourcepro
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_sourcepro` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_sourcepro`;

/*Table structure for table `t_code` */

DROP TABLE IF EXISTS `t_code`;

CREATE TABLE `t_code` (
  `ENTITY_PRO_DEFINE` text,
  `ENTITY_SETTER` text NOT NULL,
  `ENTITY_GETTER` text NOT NULL,
  `ENTITY_DAO` text,
  `ENTITY_SERVICE` text,
  `ENTITY_DAOIMPL` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_code` */

insert  into `t_code`(`ENTITY_PRO_DEFINE`,`ENTITY_SETTER`,`ENTITY_GETTER`,`ENTITY_DAO`,`ENTITY_SERVICE`,`ENTITY_DAOIMPL`) values ('','	public void set#%ENTITY_NAME_FirstUp#(#%ENTITY_TYPE# #%ENTITY_NAME#) {\r\n		this.#%ENTITY_NAME# = #%ENTITY_NAME#;\r\n	}','	public #%ENTITY_TYPE# get#%ENTITY_NAME_FirstUp#() {\r\n		return #%ENTITY_NAME#;\r\n	}','public interface #%ENTITY_CLASS#Dao {\r\n\r\n	public List<#%ENTITY_CLASS#> find(PageBean pageBean,#%ENTITY_CLASS# #%ENTITY_OBJECT#);\r\n	\r\n	public int count(#%ENTITY_CLASS# #%ENTITY_OBJECT#);\r\n	\r\n	public void add(#%ENTITY_CLASS# #%ENTITY_OBJECT#);\r\n	\r\n	public void update(#%ENTITY_CLASS# #%ENTITY_OBJECT#);\r\n	\r\n	public void delete(int id);\r\n	\r\n	public #%ENTITY_CLASS# loadById(int id);\r\n}',NULL,NULL);

/*Table structure for table `t_entity` */

DROP TABLE IF EXISTS `t_entity`;

CREATE TABLE `t_entity` (
  `ENTITY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ENTITY_NAME` varchar(20) DEFAULT NULL,
  KEY `ENTITY_ID` (`ENTITY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_entity` */

/*Table structure for table `t_property` */

DROP TABLE IF EXISTS `t_property`;

CREATE TABLE `t_property` (
  `PROPERTY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PROPERTY_NAME` varchar(100) DEFAULT NULL,
  `PROPERTY_TYPE` varchar(100) DEFAULT NULL,
  `ENTITY_ID` int(11) DEFAULT NULL,
  KEY `PROPERTY_ID` (`PROPERTY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_property` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
