/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50635
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50635
File Encoding         : 65001

Date: 2017-09-27 11:25:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_person
-- ----------------------------
DROP TABLE IF EXISTS `tbl_person`;
CREATE TABLE `tbl_person` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(4) DEFAULT NULL,
  `birth` datetime DEFAULT NULL,
  `registerTime` datetime DEFAULT NULL,
  `salary` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_person
-- ----------------------------
INSERT INTO `tbl_person` VALUES ('1', '李小四', '27', '2017-02-15 00:00:00', '2017-02-15 00:00:00', '3000.05');
INSERT INTO `tbl_person` VALUES ('2', 'z3', '22', '2017-02-15 00:00:00', '2017-02-15 14:36:29', '9500.35');
INSERT INTO `tbl_person` VALUES ('7', 'z4', '88', '1988-10-19 00:00:00', '2017-01-01 09:30:00', '111000');
INSERT INTO `tbl_person` VALUES ('8', 'z5', '66', '1988-10-11 00:00:00', '2017-02-01 09:30:00', '9999');
INSERT INTO `tbl_person` VALUES ('9', 'z6', '666', '1988-10-11 23:59:23', '2017-02-01 09:30:00', '99999');
INSERT INTO `tbl_person` VALUES ('12', 'z4', '22', '2017-02-22 14:53:08', '2017-02-22 14:53:08', '9500.35');
INSERT INTO `tbl_person` VALUES ('13', 'z4', '22', '2017-02-22 14:59:44', '2017-02-22 14:59:44', '9500.35');
INSERT INTO `tbl_person` VALUES ('14', 'z4', '22', '2017-02-22 14:59:47', '2017-02-22 14:59:47', '9500.35');
INSERT INTO `tbl_person` VALUES ('15', 'z4', '22', '2017-02-22 15:25:16', '2017-02-22 15:25:16', '9500.35');
INSERT INTO `tbl_person` VALUES ('16', 'z4', '22', '2017-02-22 15:30:19', '2017-02-22 15:30:19', '9500.35');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(40) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('admin', '123');
