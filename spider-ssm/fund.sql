/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50635
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50635
 File Encoding         : 65001

 Date: 16/04/2018 16:11:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for fund
-- ----------------------------
DROP TABLE IF EXISTS `fund`;
CREATE TABLE `fund`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `fundName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '基金名称',
  `fundNo` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '基金编号',
  `releaseDate` datetime(0) NULL DEFAULT NULL COMMENT '发布时间',
  `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '基金类型',
  `profit` decimal(19, 2) NULL DEFAULT NULL COMMENT '万份收益',
  `profit7D` decimal(19, 2) NULL DEFAULT NULL COMMENT '7日年化',
  `profit14D` decimal(19, 2) NULL DEFAULT NULL COMMENT '14日年化',
  `profit28D` decimal(19, 2) NULL DEFAULT NULL COMMENT '28日年化',
  `profit35D` decimal(19, 2) NULL DEFAULT NULL COMMENT '35日年化',
  `profit1M` decimal(19, 2) NULL DEFAULT NULL COMMENT '近1月年化',
  `profit3M` decimal(19, 2) NULL DEFAULT NULL COMMENT '近3月年化',
  `profit6M` decimal(19, 2) NULL DEFAULT NULL COMMENT '近6月年化',
  `profit1Y` decimal(19, 2) NULL DEFAULT NULL COMMENT '近1年年化',
  `profitY` decimal(19, 2) NULL DEFAULT NULL COMMENT '今年来年化',
  `charge` decimal(19, 2) NULL DEFAULT NULL COMMENT '手续费',
  `miniBuy` decimal(19, 2) NULL DEFAULT NULL COMMENT '起购金额',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 259 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
