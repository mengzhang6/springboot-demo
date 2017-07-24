/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : boot

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2017-07-21 15:57:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '14', '2009-06-17');
INSERT INTO `user` VALUES ('2', '李四', '22', '1999-11-26');
INSERT INTO `user` VALUES ('3', '王五', '25', '2010-06-24');
INSERT INTO `user` VALUES ('4', '露宝', '23', '1994-06-15');
