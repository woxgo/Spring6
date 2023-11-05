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

 Date: 05/11/2023 09:42:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `real_name` varchar(255) DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_user
-- ----------------------------
BEGIN;
INSERT INTO `t_user` (`id`, `real_name`, `age`) VALUES (2, '??', 20);
INSERT INTO `t_user` (`id`, `real_name`, `age`) VALUES (3, '王五', 20);
INSERT INTO `t_user` (`id`, `real_name`, `age`) VALUES (4, '??', 20);
INSERT INTO `t_user` (`id`, `real_name`, `age`) VALUES (5, '王五', 20);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
