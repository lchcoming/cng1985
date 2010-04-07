-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.30-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema treedemo
--

CREATE DATABASE IF NOT EXISTS treedemo;
USE treedemo;

--
-- Definition of table `navigate`
--

DROP TABLE IF EXISTS `navigate`;
CREATE TABLE `navigate` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `parentid` int(10) unsigned DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `number` int(10) unsigned DEFAULT NULL,
  `leaf` int(10) unsigned DEFAULT NULL,
  `url` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_navigate_1` (`parentid`),
  CONSTRAINT `FK_navigate_1` FOREIGN KEY (`parentid`) REFERENCES `navigate` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `navigate`
--

/*!40000 ALTER TABLE `navigate` DISABLE KEYS */;
INSERT INTO `navigate` (`id`,`parentid`,`title`,`number`,`leaf`,`url`) VALUES 
 (1,NULL,'系统菜单ff',NULL,0,NULL),
 (2,NULL,'国家',NULL,0,NULL),
 (3,1,'汽车',NULL,0,NULL),
 (4,1,'哈哈',0,0,'null'),
 (5,1,'你好',0,0,'null'),
 (6,1,'分等扥',0,1,'分等扥给'),
 (7,1,'教育',NULL,NULL,NULL),
 (8,2,'美国',NULL,NULL,NULL),
 (9,2,'中国',NULL,NULL,NULL),
 (10,2,'英国',NULL,NULL,NULL),
 (11,1,'it行业',NULL,NULL,NULL),
 (12,11,'百度',NULL,NULL,NULL),
 (13,11,'google',NULL,NULL,NULL),
 (14,NULL,'美容',NULL,NULL,NULL),
 (15,14,'外国美容',NULL,NULL,NULL),
 (16,14,'韩国美容',NULL,NULL,NULL),
 (17,12,'输入法',NULL,NULL,NULL),
 (18,12,'搜索',NULL,NULL,NULL),
 (19,10,'ggg',NULL,NULL,NULL);
/*!40000 ALTER TABLE `navigate` ENABLE KEYS */;


--
-- Definition of table `tree`
--

DROP TABLE IF EXISTS `tree`;
CREATE TABLE `tree` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `treename` varchar(45) DEFAULT NULL,
  `treeparent` int(10) unsigned DEFAULT NULL,
  `updatetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tree_1` (`treeparent`),
  CONSTRAINT `FK_tree_1` FOREIGN KEY (`treeparent`) REFERENCES `tree` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tree`
--

/*!40000 ALTER TABLE `tree` DISABLE KEYS */;
INSERT INTO `tree` (`id`,`treename`,`treeparent`,`updatetime`) VALUES 
 (1,'我的资源库',NULL,NULL),
 (2,'材料',1,NULL),
 (3,'公司',1,NULL),
 (4,'中国',1,NULL),
 (5,'重庆',4,NULL),
 (6,'西安',4,NULL),
 (7,'长寿',5,NULL),
 (8,'上海',4,NULL),
 (9,'北京',4,NULL),
 (10,'云南',4,NULL),
 (11,'海南',4,NULL),
 (12,'it方面',1,NULL),
 (13,'google',12,NULL),
 (14,'百度',12,NULL),
 (15,'教育',1,NULL),
 (16,'世界',1,NULL),
 (17,'经济',1,NULL),
 (18,'美国经济',17,NULL),
 (19,'中国经济',17,NULL),
 (20,'军事',1,NULL),
 (21,'美国军事',20,NULL),
 (22,'中国军事',20,NULL),
 (23,'洪湖',7,NULL),
 (24,'梓潼',7,NULL),
 (25,'凤城',7,NULL),
 (26,'码头村',23,NULL),
 (27,'严家湾',26,NULL),
 (28,'中嘴',27,NULL);
/*!40000 ALTER TABLE `tree` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
