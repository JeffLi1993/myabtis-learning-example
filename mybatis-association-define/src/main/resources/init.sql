-- --------------------------------
-- created by Aaron Yang 2018-02-06
-- --------------------------------

USE test;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` INT(11)      DEFAULT NULL,
  `name`   VARCHAR(255) DEFAULT NULL
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Table structure for user_detail
-- ----------------------------
DROP TABLE IF EXISTS `user_detail`;
CREATE TABLE `user_detail` (
  `userid` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'u1');
INSERT INTO `user` VALUES ('2', 'u2');
INSERT INTO `user` VALUES ('3', 'u3');

-- ----------------------------
-- Records of user_detail
-- ----------------------------
INSERT INTO `user_detail` VALUES ('1', '火星大苏打市克拉斯区', 'sdasd5445545');
INSERT INTO `user_detail` VALUES ('2', '水星奥斯卡丹市哈斯卡都镇', 'ssssw5454547777');
INSERT INTO `user_detail` VALUES ('3', '木星艾萨克', 'www654168588');