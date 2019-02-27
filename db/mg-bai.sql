/*
 Navicat Premium Data Transfer

 Source Server         : 本机mysql
 Source Server Type    : MySQL
 Source Server Version : 50642
 Source Host           : localhost:3306
 Source Schema         : mg-bai

 Target Server Type    : MySQL
 Target Server Version : 50642
 File Encoding         : 65001

 Date: 27/02/2019 19:53:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for banner_img
-- ----------------------------
DROP TABLE IF EXISTS `banner_img`;
CREATE TABLE `banner_img` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `imgUrl` varchar(256) DEFAULT NULL,
  `imgName` varchar(256) DEFAULT NULL,
  `linkUrl` varchar(256) DEFAULT '',
  `sort` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of banner_img
-- ----------------------------
BEGIN;
INSERT INTO `banner_img` VALUES (1, 'https://cdn.aegisa.cn/cefc5ec80c6d49308698cf24c2deb7ad9.JPG-small', '33d1ec', '', 10);
INSERT INTO `banner_img` VALUES (2, 'https://cdn.aegisa.cn/b1926c1a5ef34d00ad19d6c2f26887c72.jpeg-small', 'dfg321', '', 20);
COMMIT;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `img_url` varchar(256) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
BEGIN;
INSERT INTO `category` VALUES (1, '鲜花', 0, NULL, '2019-02-27 19:03:20');
INSERT INTO `category` VALUES (2, '宝宝', 0, NULL, '2019-02-27 19:03:33');
INSERT INTO `category` VALUES (3, '菊花', 1, 'https://cdn.aegisa.cn/27b84489ac804173a36d6e80fc4737e9a.jpg', '2019-02-27 19:03:46');
INSERT INTO `category` VALUES (4, '月季', 1, 'https://cdn.aegisa.cn/c7d68c6853414ab99665db4b3e5a9546i.jpg', '2019-02-27 19:04:09');
INSERT INTO `category` VALUES (5, '小香宝', 2, 'https://cdn.aegisa.cn/c7d68c6853414ab99665db4b3e5a9546i.jpg', '2019-02-27 19:04:31');
COMMIT;

-- ----------------------------
-- Table structure for upload_img
-- ----------------------------
DROP TABLE IF EXISTS `upload_img`;
CREATE TABLE `upload_img` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img_name` varchar(256) DEFAULT NULL,
  `cdn_url` varchar(512) DEFAULT NULL,
  `upload_time` datetime DEFAULT NULL,
  `description` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of upload_img
-- ----------------------------
BEGIN;
INSERT INTO `upload_img` VALUES (3, '444c32ac691a41289a238112af0f52600.jpeg', 'https://cdn.aegisa.cn/444c32ac691a41289a238112af0f52600.jpeg', '2019-02-16 13:12:33', '这个人很懒，什么都没写');
INSERT INTO `upload_img` VALUES (4, 'cefc5ec80c6d49308698cf24c2deb7ad9.JPG', 'https://cdn.aegisa.cn/cefc5ec80c6d49308698cf24c2deb7ad9.JPG', '2019-02-16 13:40:23', '这个人很懒，什么都没写');
INSERT INTO `upload_img` VALUES (5, 'b1926c1a5ef34d00ad19d6c2f26887c72.jpeg', 'https://cdn.aegisa.cn/b1926c1a5ef34d00ad19d6c2f26887c72.jpeg', '2019-02-16 21:45:34', '这个人很懒，什么都没写');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
