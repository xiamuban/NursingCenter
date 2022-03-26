/*
 Navicat Premium Data Transfer

 Source Server         : MySql
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : nursingcenter

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 26/03/2022 12:50:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bed
-- ----------------------------
DROP TABLE IF EXISTS `bed`;
CREATE TABLE `bed`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `create_time` datetime(6) NULL DEFAULT NULL,
  `create_by` int(0) NULL DEFAULT NULL,
  `is_deleted` int(0) NULL DEFAULT NULL,
  `room_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bed_status` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `position_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bed
-- ----------------------------
INSERT INTO `bed` VALUES (1, '2018-06-28 15:24:39.000000', 0, 0, '101', '2', '0', '01');
INSERT INTO `bed` VALUES (2, NULL, NULL, 0, '101', '2', '0', '02');
INSERT INTO `bed` VALUES (3, NULL, NULL, 0, '202', '2', '0', '03');
INSERT INTO `bed` VALUES (4, NULL, NULL, 0, '302', '2', '0', '04');
INSERT INTO `bed` VALUES (5, NULL, NULL, 0, '202', '1', '0', '05');
INSERT INTO `bed` VALUES (6, NULL, NULL, 0, '502', '1', '0', '06');
INSERT INTO `bed` VALUES (7, NULL, NULL, 0, '402', '1', '0', '07');
INSERT INTO `bed` VALUES (8, NULL, NULL, 0, '102', '2', '0', '08');

-- ----------------------------
-- Table structure for cust_food
-- ----------------------------
DROP TABLE IF EXISTS `cust_food`;
CREATE TABLE `cust_food`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `add_date` datetime(0) NULL DEFAULT NULL,
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `del_flag` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cust_id` int(0) NULL DEFAULT NULL,
  `food_id` int(0) NULL DEFAULT NULL,
  `food_date` datetime(0) NULL DEFAULT NULL,
  `food_week` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cust_food
-- ----------------------------
INSERT INTO `cust_food` VALUES (1, '2021-09-01 13:37:29', NULL, NULL, 1, 2, '2021-09-01 13:37:45', 1);
INSERT INTO `cust_food` VALUES (2, '2021-09-01 15:48:52', NULL, NULL, 1, 4, '2021-09-01 15:49:04', 5);
INSERT INTO `cust_food` VALUES (3, '2021-09-01 15:52:36', NULL, NULL, 5, 6, '2021-09-01 15:52:42', 4);
INSERT INTO `cust_food` VALUES (4, '2021-09-01 16:29:32', NULL, NULL, 6, 14, '2021-09-01 16:29:52', 6);
INSERT INTO `cust_food` VALUES (5, '2021-09-01 16:29:34', NULL, NULL, 7, 8, '2021-09-01 16:29:54', 7);
INSERT INTO `cust_food` VALUES (6, '2021-09-01 17:23:31', NULL, NULL, 1, 12, '2021-09-01 17:23:46', 4);
INSERT INTO `cust_food` VALUES (10, '2021-09-02 08:45:34', NULL, NULL, 6, 5, NULL, 1);
INSERT INTO `cust_food` VALUES (11, '2021-09-02 08:46:24', NULL, NULL, 5, 3, NULL, 2);
INSERT INTO `cust_food` VALUES (12, '2021-09-03 01:26:29', NULL, NULL, 5, 13, NULL, 6);
INSERT INTO `cust_food` VALUES (13, '2022-01-07 03:26:22', NULL, NULL, 5, 2, NULL, 2);

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `create_time` datetime(6) NULL DEFAULT NULL,
  `create_by` int(0) NULL DEFAULT NULL,
  `is_deleted` int(0) NULL DEFAULT NULL,
  `customer_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `customer_age` int(0) NULL DEFAULT NULL,
  `customer_sex` int(0) NULL DEFAULT NULL,
  `idcard` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `room_number` int(0) NULL DEFAULT NULL,
  `elder_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `checkin_date` datetime(6) NULL DEFAULT NULL,
  `expiration_date` datetime(6) NULL DEFAULT NULL,
  `contact_tel` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bed_id` int(0) NULL DEFAULT NULL,
  `psychosomatic_state` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `attention` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  `height` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `marital_status` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `weight` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `blood_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `filepath` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES (1, '2018-07-02 10:30:30.113000', 0, 0, '李艳', 63, 1, '210102195505051253', 502, '1', '2021-09-02 00:00:00.000000', '2020-12-31 00:00:00.000000', '13901020304', 1, '1', '暂无', '1955-05-05', '162', '1', '76', 'A', 'c3047500-90de-4800-8041-116110692546.jpg');
INSERT INTO `customer` VALUES (5, NULL, 1, 0, '大白', 66, 2, '27272727', 502, '3', '2021-08-30 07:12:16.132000', '2021-09-02 16:00:00.000000', '5787852', 3, '1', '老人心脏不好！', NULL, '166', '0', '132', 'O', 'aa6dee42-c1b7-4348-9adc-fcd6fcfd17eb.jpg');
INSERT INTO `customer` VALUES (6, NULL, 0, 1, '小白', 80, 2, '2452452452', 102, '1', '2021-07-30 07:46:13.000000', '2021-11-10 16:00:00.000000', '52542452', 4, '1', '无', NULL, '166', '0', '132', 'O', '469b70bf-e97e-4b30-9f19-3dce74be8b8b.jpg');
INSERT INTO `customer` VALUES (7, NULL, 0, 0, '小蓝', 72, 2, '5272272422', 102, '3', '2021-05-30 07:47:20.000000', '2021-11-25 16:00:00.000000', '242424242', 2, '1', '无', NULL, '166', '1', '132', 'O', '1681f221-ecc1-4d7e-bff8-b02ed9abe6d8.jpg');
INSERT INTO `customer` VALUES (8, NULL, NULL, 0, '小红', 62, 2, '2727272727', 502, '5', '2021-09-02 03:25:45.761000', '2021-11-23 16:00:00.000000', '272727272', 8, '1', '暂无', NULL, '162', '1', '128', 'B', '571c08f2-897f-4588-a4d2-7951622896ad.jpg');
INSERT INTO `customer` VALUES (11, NULL, NULL, 1, 'lxh', 70, 1, '272727', 502, '2', '2021-09-03 01:23:28.163000', '2021-09-15 16:00:00.000000', '57572', 6, '1', 'wu', NULL, '162', '1', '128', 'B', '3ba6934d-806a-4b5c-aae7-bde0b2e4112f.jpg');
INSERT INTO `customer` VALUES (12, NULL, NULL, 0, '4234', 423, 1, '423', 502, '1', '2022-03-23 14:27:42.587000', NULL, '423', NULL, '1', '', NULL, '162', '1', '128', 'B', '');
INSERT INTO `customer` VALUES (13, NULL, NULL, 0, '345', 5345, 1, '54', 502, '1', '2022-03-23 14:28:22.622000', '2022-03-23 16:00:00.000000', '54', 4, '1', '', NULL, '162', '1', '128', 'B', '');
INSERT INTO `customer` VALUES (14, NULL, NULL, 0, '345', 5345, 1, '54', 502, '1', '2022-03-23 14:28:23.633000', '2022-03-23 16:00:00.000000', '54', 4, '1', '', NULL, '162', '1', '128', 'B', '');
INSERT INTO `customer` VALUES (15, NULL, NULL, 0, '345', 5345, 1, '54', 502, '1', '2022-03-23 14:28:23.992000', '2022-03-23 16:00:00.000000', '54', 4, '1', '', NULL, '162', '1', '128', 'B', '');
INSERT INTO `customer` VALUES (16, NULL, NULL, 0, '345', 5345, 1, '54', 502, '1', '2022-03-23 14:28:24.166000', '2022-03-23 16:00:00.000000', '54', 4, '1', '', NULL, '162', '1', '128', 'B', '');
INSERT INTO `customer` VALUES (17, NULL, NULL, 0, '345', 5345, 1, '54', 502, '1', '2022-03-23 14:28:24.334000', '2022-03-23 16:00:00.000000', '54', 4, '1', '', NULL, '162', '1', '128', 'B', '');
INSERT INTO `customer` VALUES (18, NULL, NULL, 0, '345', 5345, 1, '54', 502, '1', '2022-03-23 14:28:25.220000', '2022-03-23 16:00:00.000000', '54', 4, '1', '', NULL, '162', '1', '128', 'B', '');
INSERT INTO `customer` VALUES (19, NULL, NULL, 0, '345', 5345, 1, '54', 502, '1', '2022-03-23 14:28:25.391000', '2022-03-23 16:00:00.000000', '54', 4, '1', '', NULL, '162', '1', '128', 'B', '');

-- ----------------------------
-- Table structure for food
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `category` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `label` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` double(10, 2) NULL DEFAULT NULL,
  `photo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `momal_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES (2, '山竹', '5', '1', 5.00, '8714c324-df09-44c9-b610-7eae9c034322.jpg', '1');
INSERT INTO `food` VALUES (3, '香蕉', '5', '1', 6.00, '2d6bdcb4-97b4-4173-a286-8a8962b31e90.jpg', '0');
INSERT INTO `food` VALUES (4, '菠萝', '5', '2', 7.00, 'ed24e5b5-5d5a-44d3-b8a9-6e596e42843d.jpg', '0');
INSERT INTO `food` VALUES (5, '哈蜜瓜', '5', '1', 8.00, 'e7a329d6-23e5-4828-b8fb-4507f4cb1c07.jpg', '0');
INSERT INTO `food` VALUES (6, '草莓', '5', '2', 10.00, 'ff2bcfd6-33cb-469f-b3a9-36877782cfba.jpg', '0');
INSERT INTO `food` VALUES (7, '桔子', '5', '2', 8.00, '31876632-5bef-406b-9449-8263f4883ab9.jpg', '0');
INSERT INTO `food` VALUES (8, '豆腐', '3', '4', 4.00, '2d3c4fa3-87f0-4410-bdf8-ad25eaefe2af.jpg', '1');
INSERT INTO `food` VALUES (10, '红烧狮子头', '1', '3', 12.00, '41b69605-b6f3-43cf-89a5-e652033597f8.jpg', '0');
INSERT INTO `food` VALUES (11, '小笼包', '4', '6', 6.00, 'eb4f1906-beab-4e85-b38a-c6ad901f9c55.jpg', '0');
INSERT INTO `food` VALUES (12, '小蛋糕', '4', '1', 7.00, '9f594791-f457-40af-ad32-efc05650e889.jpg', '0');
INSERT INTO `food` VALUES (13, '牛排', '1', '3', 10.00, '5a77b567-1049-49f5-91c3-a84cd6404e77.jpg', '0');
INSERT INTO `food` VALUES (14, '牛排套餐', '6', '3', 25.00, 'eb8106cc-a356-4e4f-90d3-4d95df3411e0.jpg', '0');
INSERT INTO `food` VALUES (16, '土豆丝', '2', '6', 8.00, 'a370d30f-1e95-4e8a-8216-53b0c0a90ed8.jpg', '1');

-- ----------------------------
-- Table structure for meal_calendar
-- ----------------------------
DROP TABLE IF EXISTS `meal_calendar`;
CREATE TABLE `meal_calendar`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `custfood_id` int(0) NULL DEFAULT NULL,
  `add_date` datetime(0) NULL DEFAULT NULL,
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `supply_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of meal_calendar
-- ----------------------------
INSERT INTO `meal_calendar` VALUES (1, 1, '2021-09-01 13:37:58', NULL, NULL, '1');
INSERT INTO `meal_calendar` VALUES (2, 1, '2021-09-01 15:39:21', NULL, NULL, '2');
INSERT INTO `meal_calendar` VALUES (4, 2, '2021-09-01 16:30:35', NULL, NULL, '3');
INSERT INTO `meal_calendar` VALUES (5, 3, '2021-09-01 16:30:33', NULL, NULL, '2');
INSERT INTO `meal_calendar` VALUES (6, 4, '2021-09-01 16:30:37', NULL, NULL, '3');
INSERT INTO `meal_calendar` VALUES (7, 5, '2021-09-01 16:30:39', NULL, NULL, '2');
INSERT INTO `meal_calendar` VALUES (12, 10, '2021-09-02 08:45:34', NULL, NULL, '1');
INSERT INTO `meal_calendar` VALUES (13, 11, '2021-09-02 08:46:24', NULL, NULL, '1');
INSERT INTO `meal_calendar` VALUES (14, 12, '2021-09-03 01:26:29', NULL, NULL, '3');
INSERT INTO `meal_calendar` VALUES (15, 13, '2022-01-07 03:26:22', NULL, NULL, '2');

-- ----------------------------
-- Table structure for nursing_content
-- ----------------------------
DROP TABLE IF EXISTS `nursing_content`;
CREATE TABLE `nursing_content`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `level_id` int(0) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` double(10, 2) NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of nursing_content
-- ----------------------------
INSERT INTO `nursing_content` VALUES (1, 1, '(A)早晨服务', 20.00, '(1)向老人问好\n(2)通风、整理床铺\n(3)送开水\n(4)打扫居室卫生，整理内务\n(5)送早餐\n');
INSERT INTO `nursing_content` VALUES (2, 1, '(A)上午服务', 10.00, '(1)护理查房\n(2)陪老人谈心聊天，组织老人参加文娱活动\n(3)登记营养餐\n(4)老人需要时帮助处理一-些生活琐事，如写信、购物等\n(5)送午餐\n(6)督促午睡\n');
INSERT INTO `nursing_content` VALUES (3, 1, '(A)下午服务', 50.00, '(1)整理床铺\n(2)打扫卫生\n(3)送开水\n(4)送午茶\n(5)督促老人洗头、冲凉\n(6) 更换衣服、床上用品\n(7)送晚餐\n');
INSERT INTO `nursing_content` VALUES (4, 1, '(A)晚间服务', 50.00, '(1)组织老人收看新闻联播或收听粤曲\n(2)督促老人睡前洗足\n(3) 晚间问安，听取老人意见\n(4)督促按时就寝\n');
INSERT INTO `nursing_content` VALUES (5, 2, '(B)早晨服务', 60.00, '(1)向老人问好\n(2)协助起床、穿衣、梳洗\n(3)协助大小便\n(4)通风、整理床铺\n(5)送开水\n(6)打扫居室卫生，整理内务\n(7)协助进早餐\n');
INSERT INTO `nursing_content` VALUES (6, 2, '(B)晚间服务', 80.00, '(1)组织老人收看新闻联播或收听粤曲\n(2)协助老人睡前洗足\n(3) 晚间问安，听取老人意见\n(4)协助大小便，按时就寝\n');
INSERT INTO `nursing_content` VALUES (7, 3, '(C)下午服务', 100.00, '(1)帮助起床、穿衣、梳洗\n(2)帮助床上大小便\n(3)打扫卫生\n(4)送开水\n(5)床前或轮椅喂午茶(或胃管喂午茶)\n(6)床上洗头、洗澡\n(7) 更换衣服、床上用品(随脏随湿随换)\n(8)床前或轮椅喂晚餐(或胃管喂晚餐)\n');
INSERT INTO `nursing_content` VALUES (9, 4, '(D)中午服务', 60.00, '(1)整理床铺\n(2)打扫卫生\n(3)送开水\n(4)送午茶\n(5)督促老人洗头、冲凉\n(6) 更换衣服、床上用品');

-- ----------------------------
-- Table structure for nursing_level
-- ----------------------------
DROP TABLE IF EXISTS `nursing_level`;
CREATE TABLE `nursing_level`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `add_date` datetime(0) NULL DEFAULT NULL,
  `level_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `level_status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of nursing_level
-- ----------------------------
INSERT INTO `nursing_level` VALUES (1, '2021-09-02 15:46:52', 'A', '0');
INSERT INTO `nursing_level` VALUES (2, '2021-08-31 14:26:11', 'B', '0');
INSERT INTO `nursing_level` VALUES (3, '2021-08-31 14:26:26', 'C', '1');
INSERT INTO `nursing_level` VALUES (4, '2021-08-31 14:26:28', 'D', '0');
INSERT INTO `nursing_level` VALUES (8, '2021-09-03 01:24:21', 'E', '0');

-- ----------------------------
-- Table structure for nursing_records
-- ----------------------------
DROP TABLE IF EXISTS `nursing_records`;
CREATE TABLE `nursing_records`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `add_date` datetime(0) NULL DEFAULT NULL,
  `cust_id` int(0) NULL DEFAULT NULL,
  `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nursing_time` datetime(0) NULL DEFAULT NULL,
  `nursing_content` int(0) NULL DEFAULT NULL,
  `nursing_num` int(0) NULL DEFAULT NULL,
  `nurse_id` int(0) NULL DEFAULT NULL COMMENT '护理人员',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of nursing_records
-- ----------------------------
INSERT INTO `nursing_records` VALUES (1, '2021-08-31 16:23:54', 1, '0', '2021-08-31 16:24:06', 1, NULL, 2);
INSERT INTO `nursing_records` VALUES (2, '2021-08-31 09:29:19', 5, '0', '2021-08-04 16:00:00', 2, NULL, 2);
INSERT INTO `nursing_records` VALUES (3, '2021-08-31 13:52:14', 7, '0', '2021-09-04 00:00:00', 9, NULL, 3);
INSERT INTO `nursing_records` VALUES (5, '2021-09-02 08:41:37', 7, '0', '2021-09-17 00:00:00', 6, NULL, 3);
INSERT INTO `nursing_records` VALUES (6, '2021-09-02 08:42:47', 8, '0', '2021-09-17 00:00:00', 6, NULL, 2);
INSERT INTO `nursing_records` VALUES (7, '2021-09-03 01:25:24', 5, '0', '2021-09-11 00:00:00', 5, NULL, 3);

-- ----------------------------
-- Table structure for outgoing
-- ----------------------------
DROP TABLE IF EXISTS `outgoing`;
CREATE TABLE `outgoing`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `create_time` datetime(6) NOT NULL,
  `create_by` int(0) NOT NULL,
  `update_time` datetime(6) NOT NULL,
  `update_by` int(0) NOT NULL,
  `is_deleted` int(0) NOT NULL,
  `outgoing_reason` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `outgoing_time` datetime(6) NOT NULL,
  `expected_return_time` datetime(6) NOT NULL,
  `actual_return_time` datetime(6) NOT NULL,
  `escorted` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `relation` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `escorted_tel` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `audit_status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of outgoing
-- ----------------------------

-- ----------------------------
-- Table structure for retreat
-- ----------------------------
DROP TABLE IF EXISTS `retreat`;
CREATE TABLE `retreat`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `create_time` datetime(6) NULL DEFAULT NULL,
  `customer_id` int(0) NOT NULL,
  `retreat_time` datetime(6) NULL DEFAULT NULL,
  `retreat_reason` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `audit_status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of retreat
-- ----------------------------
INSERT INTO `retreat` VALUES (3, '2021-08-30 12:42:00.930000', 6, NULL, '住宿条件不满意', '0');
INSERT INTO `retreat` VALUES (11, '2021-09-02 08:32:55.620000', 10, NULL, '条件差', '0');
INSERT INTO `retreat` VALUES (12, '2021-09-03 01:23:43.226000', 11, NULL, '条件不满意', '2');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `create_time` datetime(6) NOT NULL,
  `create_by` int(0) NOT NULL,
  `is_deleted` int(0) NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '2021-08-27 13:00:28.000000', 1, 0, '护士');
INSERT INTO `role` VALUES (2, '2021-08-27 13:01:06.000000', 1, 0, '医生');
INSERT INTO `role` VALUES (3, '2021-08-27 13:01:33.000000', 1, 0, '护工');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` int(0) NULL DEFAULT NULL,
  `create_time` datetime(6) NULL DEFAULT NULL,
  `age` int(0) NULL DEFAULT NULL,
  `create_by` int(0) NULL DEFAULT NULL,
  `is_deleted` int(0) NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(254) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', 1, '2018-06-26 14:46:55.699693', 24, 0, 0, '123', 'aa@s.cq', '123456');
INSERT INTO `user` VALUES (2, '小白', 1, '2021-08-31 14:01:20.000000', 22, 0, 0, '123', NULL, NULL);
INSERT INTO `user` VALUES (3, '大白', 2, '2021-08-31 14:02:47.000000', 20, 0, 0, '123', NULL, NULL);
INSERT INTO `user` VALUES (4, '小蓝', 2, '2021-08-31 14:03:17.000000', 25, 0, 0, '123', NULL, NULL);
INSERT INTO `user` VALUES (5, '小绿', 2, '2021-08-31 14:03:50.000000', 20, 0, 0, '123', NULL, NULL);
INSERT INTO `user` VALUES (6, '小黑', 1, '2021-09-02 16:43:38.000000', 22, 0, 0, '123', NULL, NULL);
INSERT INTO `user` VALUES (7, '小黑', 1, '2021-09-02 16:43:38.000000', 22, 0, 0, '123', NULL, NULL);
INSERT INTO `user` VALUES (8, '小黑', 1, '2021-09-02 16:43:38.000000', 22, 0, 0, '123', NULL, NULL);
INSERT INTO `user` VALUES (9, '小黑', 1, '2021-09-02 16:43:38.000000', 22, 0, 0, '123', NULL, NULL);
INSERT INTO `user` VALUES (10, '小黑', 1, '2021-09-02 16:43:38.000000', 22, 0, 0, '123', NULL, NULL);

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `id` int(0) NOT NULL,
  `user_id` int(0) NOT NULL,
  `role_id` int(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (1, 1, 1);
INSERT INTO `user_role` VALUES (2, 2, 3);
INSERT INTO `user_role` VALUES (3, 3, 3);
INSERT INTO `user_role` VALUES (4, 4, 2);
INSERT INTO `user_role` VALUES (5, 6, 3);
INSERT INTO `user_role` VALUES (6, 5, 3);

-- ----------------------------
-- Table structure for verify
-- ----------------------------
DROP TABLE IF EXISTS `verify`;
CREATE TABLE `verify`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `con_id` int(0) NULL DEFAULT NULL,
  `idea` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `user_id` int(0) NULL DEFAULT NULL,
  `add_date` datetime(0) NULL DEFAULT NULL,
  `status` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `type` int(0) NULL DEFAULT NULL COMMENT '审核类型，1外出审核、2退住审核',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 43 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of verify
-- ----------------------------
INSERT INTO `verify` VALUES (40, 3, '不通过', 1, '2021-08-31 03:01:14', '0', 1);
INSERT INTO `verify` VALUES (41, 6, '通过', 1, '2021-09-02 08:20:45', '2', 1);
INSERT INTO `verify` VALUES (42, 11, '不通过', 1, '2021-09-02 08:33:14', '0', 1);
INSERT INTO `verify` VALUES (43, 12, '通过', 1, '2021-09-03 01:24:00', '2', 1);

SET FOREIGN_KEY_CHECKS = 1;
