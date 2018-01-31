CREATE DATABASE test;

USE test;

CREATE TABLE `node` (
  `id` bigint(20) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `role` (
  `roleid` int(11) DEFAULT NULL,
  `rolename` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user` (
  `userid` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_role` (
  `userid` int(11) DEFAULT NULL,
  `roleid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of node
-- ----------------------------
INSERT INTO `node` VALUES ('1', '1', '0');
INSERT INTO `node` VALUES ('2', '2', '0');
INSERT INTO `node` VALUES ('3', '3', '0');
INSERT INTO `node` VALUES ('4', '4', '1');
INSERT INTO `node` VALUES ('5', '5', '2');
INSERT INTO `node` VALUES ('6', '6', '2');
INSERT INTO `node` VALUES ('7', '7', '3');
INSERT INTO `node` VALUES ('8', '8', '3');
INSERT INTO `node` VALUES ('9', '9', '3');

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'r1');
INSERT INTO `role` VALUES ('2', 'r2');
INSERT INTO `role` VALUES ('3', 'r3');

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'u1');
INSERT INTO `user` VALUES ('2', 'u2');
INSERT INTO `user` VALUES ('3', 'u3');

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1');
INSERT INTO `user_role` VALUES ('1', '2');
INSERT INTO `user_role` VALUES ('1', '3');
INSERT INTO `user_role` VALUES ('2', '1');
INSERT INTO `user_role` VALUES ('3', '2');