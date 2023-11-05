/*
 Navicat Premium Data Transfer

 Source Server         : local PengYang@123
 Source Server Type    : MySQL
 Source Server Version : 50651
 Source Host           : localhost:3306
 Source Schema         : py

 Target Server Type    : MySQL
 Target Server Version : 50651
 File Encoding         : 65001

 Date: 05/11/2023 09:42:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_act
-- ----------------------------
DROP TABLE IF EXISTS `t_act`;
CREATE TABLE `t_act` (
  `actno` varchar(100) NOT NULL COMMENT '账户',
  `balance` double DEFAULT NULL COMMENT '余额',
  PRIMARY KEY (`actno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_act
-- ----------------------------
BEGIN;
INSERT INTO `t_act` (`actno`, `balance`) VALUES ('act-001', 40000);
INSERT INTO `t_act` (`actno`, `balance`) VALUES ('act-002', 10000);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
