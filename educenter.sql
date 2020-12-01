/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : educenter

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2020-10-16 00:02:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_attachment
-- ----------------------------
DROP TABLE IF EXISTS `tb_attachment`;
CREATE TABLE `tb_attachment` (
  `attachment_id` int(11) NOT NULL AUTO_INCREMENT,
  `attachment_url` varchar(100) COLLATE utf8_bin NOT NULL,
  `filename` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `filesize` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `c_id` int(11) DEFAULT NULL,
  `train_id` int(11) DEFAULT NULL,
  `s_id` int(11) DEFAULT NULL,
  `t_id` int(11) DEFAULT NULL,
  `attachment_type` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `attachment_time` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`attachment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_attachment
-- ----------------------------
INSERT INTO `tb_attachment` VALUES ('1', '‪D:\\\\JavaEE\\\\educenter\\downloads\\\\', 'Activity.ppt', '800KB', '2', null, null, '1001', '课件', '2020-03-30');
INSERT INTO `tb_attachment` VALUES ('2', '‪D:\\\\JavaEE\\\\educenter\\downloads\\\\', 'words.PNG', '69.2KB', '2', null, null, '1001', '图片', '2020-03-30');
INSERT INTO `tb_attachment` VALUES ('3', 'D:\\JavaEE\\Educenter\\downloads', 'Java后台开发_陈伟林.pdf', '47KB', '1', null, null, '1001', 'application/pdf', 'Wed Apr 01 15:56:15 CST 2020');
INSERT INTO `tb_attachment` VALUES ('4', 'D:\\JavaEE\\Educenter\\downloads\\', 'Java工程师_陈伟林.pdf', '61KB', '1', null, null, '1001', 'application/pdf', 'Wed Apr 01 16:04:53 CST 2020');
INSERT INTO `tb_attachment` VALUES ('5', 'D:\\JavaEE\\Educenter\\downloads\\', 'date.c', '1KB', '1', null, null, '1001', 'application/octet-stream', 'Wed Apr 01 17:52:54 CST 2020');
INSERT INTO `tb_attachment` VALUES ('6', 'D:\\JavaEE\\Educenter\\downloads\\', 'date.c', '0KB', null, '1', null, '1', 'application/octet-stream', 'Wed Apr 01 22:19:51 CST 2020');

-- ----------------------------
-- Table structure for tb_blog
-- ----------------------------
DROP TABLE IF EXISTS `tb_blog`;
CREATE TABLE `tb_blog` (
  `blog_id` int(11) NOT NULL AUTO_INCREMENT,
  `blog_time` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `blog_title` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `blog_content` varchar(3000) COLLATE utf8_bin DEFAULT NULL,
  `blog_writer` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `blog_img` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`blog_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_blog
-- ----------------------------
INSERT INTO `tb_blog` VALUES ('1', '2020/2/20', 'The Expenses You Are Thinking.', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem.\r\n\r\nLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem s\r\n\r\nLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam,', 'Jonathon', 'post-1.jpg');
INSERT INTO `tb_blog` VALUES ('2', 'August 13, 2019', 'Tips to Succeed in an Online Course', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem.\r\n\r\nLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem s\r\n\r\nLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam,', 'Jonathon Drew', 'post-2.jpg');
INSERT INTO `tb_blog` VALUES ('3', 'August 24, 2018', 'Orientation Program for the new students', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem.\r\n\r\nLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem s\r\n\r\nLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam,', 'Alex Pitt', 'post-3.jpg');

-- ----------------------------
-- Table structure for tb_contact
-- ----------------------------
DROP TABLE IF EXISTS `tb_contact`;
CREATE TABLE `tb_contact` (
  `contact_id` int(11) NOT NULL AUTO_INCREMENT,
  `contact_time` varchar(45) COLLATE utf8_bin NOT NULL,
  `contact_title` varchar(100) COLLATE utf8_bin NOT NULL,
  `contact_name` varchar(45) COLLATE utf8_bin NOT NULL,
  `contact_email` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `contact_tel` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `contact_content` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`contact_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_contact
-- ----------------------------
INSERT INTO `tb_contact` VALUES ('1', '2020/2/10', 'Lorem ipsum ', 'Lorem ipsum ', 'Lorem ipsum ', '510006', 'Lorem ipsum ');

-- ----------------------------
-- Table structure for tb_course
-- ----------------------------
DROP TABLE IF EXISTS `tb_course`;
CREATE TABLE `tb_course` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(30) COLLATE utf8_bin NOT NULL,
  `c_credit` float DEFAULT NULL,
  `c_class` int(11) DEFAULT NULL,
  `c_desc` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  `c_plan` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  `c_content` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  `c_test` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  `c_img` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `c_date` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `c_type` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `t_name` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `t_id` int(11) NOT NULL,
  `sch_name` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `m_name` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_course
-- ----------------------------
INSERT INTO `tb_course` VALUES ('1', 'c语言程序设计', '4', '21', 'c语言程序设计', 'plan', 'c语言程序设计', 'lalala', 'course-2.jpg', '02-14-2018', '人文学科', 'Jacke Masito', '1', '广东药科大学', null);
INSERT INTO `tb_course` VALUES ('2', '摄影', '4', '21', '摄影', 'plan', '摄影', 'lalala', 'course-1.jpg', '02-14-2018', '人文学科', 'Clark Malik', '1', '广东药科大学', null);
INSERT INTO `tb_course` VALUES ('3', '编程设计入门', '4', '21', '编程设计入门', 'plan', '编程设计入门', 'lalala', 'course-2.jpg', '02-14-2018', '工学', 'John Doe', '1', '广东药科大学', null);
INSERT INTO `tb_course` VALUES ('4', '生活方式的档案', '4', '21', '生活方式的档案', 'plan', '生活方式的档案', 'lalala', 'course-3.jpg', '02-14-2018', '人文学科', 'Jacke Masito', '2', '广东药科大学', null);
INSERT INTO `tb_course` VALUES ('5', '完全自由职业', '4', '21', '完全自由职业', 'plan', '完全自由职业', 'lalala', 'course-4.jpg', '02-14-2018', '人文学科', 'Jacke Masito', '2', '广东药科大学', null);
INSERT INTO `tb_course` VALUES ('6', '品牌设计', '4', '21', '品牌设计', 'plan', '品牌设计', 'lalala', 'course-5.jpg', '02-14-2018', '人文学科', 'Jacke Masito', '2', '广东药科大学', null);
INSERT INTO `tb_course` VALUES ('7', '艺术设计', '4', '21', '艺术设计', 'plan', '艺术设计', 'lalala', 'course-6.jpg', '02-14-2018', '人文学科', 'Jacke Masito', '2', '广东药科大学', null);

-- ----------------------------
-- Table structure for tb_dept
-- ----------------------------
DROP TABLE IF EXISTS `tb_dept`;
CREATE TABLE `tb_dept` (
  `d_id` int(11) NOT NULL AUTO_INCREMENT,
  `d_name` varchar(30) COLLATE utf8_bin NOT NULL,
  `d_chairman` varchar(20) COLLATE utf8_bin NOT NULL,
  `d_email` varchar(30) COLLATE utf8_bin NOT NULL,
  `d_tel` mediumtext COLLATE utf8_bin NOT NULL,
  `d_desc` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  `sch_id` int(11) NOT NULL,
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_dept
-- ----------------------------
INSERT INTO `tb_dept` VALUES ('1', '医药信息工程学院', '蔡永明', 'gdpu@edu.cn', 0x3531303036, '医药信息工程学院', '1');

-- ----------------------------
-- Table structure for tb_event
-- ----------------------------
DROP TABLE IF EXISTS `tb_event`;
CREATE TABLE `tb_event` (
  `event_id` int(11) NOT NULL AUTO_INCREMENT,
  `event_fee` int(11) DEFAULT NULL,
  `event_writer` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `event_date` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `event_time` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `event_location` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `event_img` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `event_title` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `event_content` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`event_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_event
-- ----------------------------
INSERT INTO `tb_event` VALUES ('1', '889', 'Lorem ipsum ', '2020/2/10', '5 a.m.', 'Harvard, Usa', 'event-1.jpg', 'Toward a public philosophy of justice', 'Toward a public philosophy of justice');
INSERT INTO `tb_event` VALUES ('2', '998', 'Lorem ipsum ', '2020/2/10', '9 p.m.', 'Cambridge, USA', 'event-2.jpg', 'Research seminar in clinical science.', 'Research seminar in clinical science.');
INSERT INTO `tb_event` VALUES ('3', '1000', 'Lorem ipsum ', '2020/2/10', '8 a.m.', 'Dhanmondi Lake, Dhaka', 'event-3.jpg', 'Firefly training in trauma-informed yoga', 'Firefly training in trauma-informed yoga');

-- ----------------------------
-- Table structure for tb_if_take_course
-- ----------------------------
DROP TABLE IF EXISTS `tb_if_take_course`;
CREATE TABLE `tb_if_take_course` (
  `if_take_id` int(11) NOT NULL AUTO_INCREMENT,
  `if_take_course` char(1) COLLATE utf8_bin NOT NULL DEFAULT '1',
  `if_input_grade` char(1) COLLATE utf8_bin NOT NULL DEFAULT '1',
  PRIMARY KEY (`if_take_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_if_take_course
-- ----------------------------
INSERT INTO `tb_if_take_course` VALUES ('1', '1', '1');

-- ----------------------------
-- Table structure for tb_major
-- ----------------------------
DROP TABLE IF EXISTS `tb_major`;
CREATE TABLE `tb_major` (
  `m_id` int(11) NOT NULL AUTO_INCREMENT,
  `d_id` int(11) NOT NULL,
  `m_name` varchar(20) COLLATE utf8_bin NOT NULL,
  `m_assistant` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `m_tel` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `m_desc` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`m_id`),
  KEY `fk_dept` (`d_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_major
-- ----------------------------
INSERT INTO `tb_major` VALUES ('1', '1', '计算机科学与技术', '李恬婷', '510006', '计算机科学与技术');

-- ----------------------------
-- Table structure for tb_message
-- ----------------------------
DROP TABLE IF EXISTS `tb_message`;
CREATE TABLE `tb_message` (
  `message_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_id` int(11) DEFAULT NULL,
  `t_id` int(11) DEFAULT NULL,
  `o_id` int(11) DEFAULT NULL,
  `c_id` int(11) DEFAULT NULL,
  `message_time` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `message_date` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `status` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `title` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `content` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`message_id`),
  KEY `fk_message_sid` (`s_id`),
  KEY `fk_message_tid` (`t_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_message
-- ----------------------------
INSERT INTO `tb_message` VALUES ('1', '1', '1', null, '1', '5 pm', '2020/2/15', '1', '成绩汇报', '该门课你成绩为80分');

-- ----------------------------
-- Table structure for tb_new
-- ----------------------------
DROP TABLE IF EXISTS `tb_new`;
CREATE TABLE `tb_new` (
  `new_id` int(11) NOT NULL AUTO_INCREMENT,
  `new_title` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `new_time` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `new_from` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `new_writer` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `new_img` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `new_type` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `new_translator` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `new_content` varchar(10000) COLLATE utf8_bin DEFAULT NULL,
  `new_cn` varchar(5000) COLLATE utf8_bin DEFAULT NULL,
  `new_en` varchar(5000) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`new_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_new
-- ----------------------------
INSERT INTO `tb_new` VALUES ('1', '麦当劳推出香薰蜡烛！但这个香型你可能会怕', '2020-03-01 13:40', '沪江英语', 'Fast Company', 'new_1.png', 'hot', '菲菲', 'It’s a romantic dinner at home. You light some candles to . . . you know . . . set the mood. You’ve placed them strategically around the room for optimal sensory bliss—the mantel, the shelf, the window sill, the table.\r\n你要在家里吃一顿浪漫晚餐，要点上一些蜡烛烘托气氛……你懂的，你特意把蜡烛放在房间里视觉效果最好的地方：壁炉架、置物架、窗台和桌子上。', '你要在家里吃一顿浪漫晚餐，要点上一些蜡烛烘托气氛……你懂的，你特意把蜡烛放在房间里视觉效果最好的地方：壁炉架、置物架、窗台和桌子上。', 'It’s a romantic dinner at home. You light some candles to . . . you know . . . set the mood. You’ve placed them strategically around the room for optimal sensory bliss—the mantel, the shelf, the window sill, the table.');
INSERT INTO `tb_new` VALUES ('2', 'Quora精选：如何才能改变现状？', '2020-03-06 00:00', '沪江英语', 'Quora用户', 'new_2.jpg', 'quora', '菲菲', 'What can I do to change my life?\r\n我怎么才能改变自己的人生？\r\n \r\n\r\n获得42.5k 好评的回答@Kawsur Abeddin：\r\n\r\n1.Stop Facebooking/ twitting\r\n1.别再看Facebook/推特了\r\n2.Stop posting everything in Facebook/Twitter\r\n2.别再往Facebook/推特上发东西了。\r\n3.Keep your emotion in you\r\n3.情绪不外露\r\n4.If you know something good then be the perfect one in that. If you are good at anything, never do it for free!! That will help you to earn and to maintain your life.\r\n4.如果某件事你懂一点儿，那就把它变成你所擅长的。擅长的事都不要免费去做！擅长的事能帮你赚钱维持生计。\r\n5.Try to be a own satisfied person. Stay happy with what you have.\r\n5.努力做到自我满足。知足常乐。\r\n6.Never judge others\r\n6.永远不要评判别人\r\n7.If you think that you don\'t make a mistake but people still blaming on you, fight for that.\r\n7.如果你认为自己没错，却有人在指责你，怼回去！\r\n8.Stop Lying. I\'m serious. Stop lying. Not a single word.\r\n8.别再说谎了，我是认真的，别再说谎了，一个字都不行。\r\n9.Think before you move. Count every single step you make & made.\r\n9.三思后行，现在或过去的每一步都要脚踏实地。\r\n10.Don\'t let others talk over you\r\n10.不要被别人说服\r\n11.Listen carefully then reply perfectly. If you don\'t understand anything then ask it again then make a reply.\r\n11.仔细倾听，认真答复。如果有什么不明白的，多问一遍再回答。\r\n12.Always try to smile. Even at your bad situation.\r\n12.总要面带微笑，即使自己境况不好。\r\n13.Mark your failure & make that your stamp.\r\n13.牢记失败，以之为鉴。\r\nChanging life isn\'t that easy to do, because you have some bad habit. You have to overcome that at first.\r\n改变生活并非易事，因为你还有一些坏习惯，你需要先改掉这些坏毛病。\r\n \r\n\r\n获得304.5k好评的回答@Elena Ledoux：\r\n\r\nIf I tell you, are you going to do it?\r\n如果我说了，你会照做吗？\r\n1.Put the phone down after you read this.\r\n1.读完这个就把手机放下。\r\n2.Get off the couch.\r\n2.离开沙发。\r\n3.Take a sheet of paper and write down top 3 things you want to have in your life. Better yet, take a cork board and pin the images of your top dreams.\r\n3.找张纸写下你生活中最想拥有的3个东西。最好再找个软木板，把你最想要的东西的图片钉在上面。\r\n4.Every morning ask yourself what are you going to do today to get closer to your dreams.\r\n4.每天早晨问问自己为了离梦想更进一步今天要做什么。\r\n5.Every evening, ask yourself if you\'ve done what you promised yourself.\r\n5.每天晚上问问自己你是否兑现了承诺。\r\nThat\'s it. If you do the above, your life will change.\r\n就这些，如果你都能做到，那生活就会改变。\r\nThe key to any change is action.\r\n任何改变的关键都是行动。', '我怎么才能改变自己的人生？\r\n \r\n\r\n获得42.5k 好评的回答@Kawsur Abeddin：\r\n\r\n1.别再看Facebook/推特了\r\n2.别再往Facebook/推特上发东西了。\r\n3.情绪不外露\r\n4.如果某件事你懂一点儿，那就把它变成你所擅长的。擅长的事都不要免费去做！擅长的事能帮你赚钱维持生计。\r\n5.努力做到自我满足。知足常乐。\r\n6.永远不要评判别人\r\n7.如果你认为自己没错，却有人在指责你，怼回去！\r\n8.别再说谎了，我是认真的，别再说谎了，一个字都不行。\r\n9.三思后行，现在或过去的每一步都要脚踏实地。\r\n10.不要被别人说服\r\n11.仔细倾听，认真答复。如果有什么不明白的，多问一遍再回答。\r\n12.总要面带微笑，即使自己境况不好。\r\n13.牢记失败，以之为鉴。\r\n改变生活并非易事，因为你还有一些坏习惯，你需要先改掉这些坏毛病。\r\n \r\n\r\n获得304.5k好评的回答@Elena Ledoux：\r\n\r\n如果我说了，你会照做吗？\r\n1.读完这个就把手机放下。\r\n2.离开沙发。\r\n3.找张纸写下你生活中最想拥有的3个东西。最好再找个软木板，把你最想要的东西的图片钉在上面。\r\n4.每天早晨问问自己为了离梦想更进一步今天要做什么。\r\n5.每天晚上问问自己你是否兑现了承诺。\r\n就这些，如果你都能做到，那生活就会改变。\r\n任何改变的关键都是行动。', 'What can I do to change my life?\r\n \r\n\r\n获得42.5k 好评的回答@Kawsur Abeddin：\r\n\r\n1.Stop Facebooking/ twitting\r\n2.Stop posting everything in Facebook/Twitter\r\n3.Keep your emotion in you\r\n4.If you know something good then be the perfect one in that. If you are good at anything, never do it for free!! That will help you to earn and to maintain your life.\r\n5.Try to be a own satisfied person. Stay happy with what you have.\r\n6.Never judge others\r\n7.If you think that you don\'t make a mistake but people still blaming on you, fight for that.\r\n8.Stop Lying. I\'m serious. Stop lying. Not a single word.\r\n9.Think before you move. Count every single step you make & made.\r\n10.Don\'t let others talk over you\r\n11.Listen carefully then reply perfectly. If you don\'t understand anything then ask it again then make a reply.\r\n12.Always try to smile. Even at your bad situation.\r\n13.Mark your failure & make that your stamp.\r\nChanging life isn\'t that easy to do, because you have some bad habit. You have to overcome that at first.\r\n \r\n\r\n获得304.5k好评的回答@Elena Ledoux：\r\n\r\nIf I tell you, are you going to do it?\r\n1.Put the phone down after you read this.\r\n2.Get off the couch.\r\n3.Take a sheet of paper and write down top 3 things you want to have in your life. Better yet, take a cork board and pin the images of your top dreams.\r\n4.Every morning ask yourself what are you going to do today to get closer to your dreams.\r\n5.Every evening, ask yourself if you\'ve done what you promised yourself.\r\nThat\'s it. If you do the above, your life will change.\r\nThe key to any change is action.\r\nWhat can I do to change my life?\r\n \r\n\r\n获得42.5k 好评的回答@Kawsur Abeddin：\r\n\r\n1.Stop Facebooking/ twitting\r\n2.Stop posting everything in Facebook/Twitter\r\n3.Keep your emotion in you\r\n4.If you know something good then be the perfect one in that. If you are good at anything, never do it for free!! That will help you to earn and to maintain your life.\r\n5.Try to be a own satisfied person. Stay happy with what you have.\r\n6.Never judge others\r\n7.If you think that you don\'t make a mistake but people still blaming on you, fight for that.\r\n8.Stop Lying. I\'m serious. Stop lying. Not a single word.\r\n9.Think before you move. Count every single step you make & made.\r\n10.Don\'t let others talk over you\r\n11.Listen carefully then reply perfectly. If you don\'t understand anything then ask it again then make a reply.\r\n12.Always try to smile. Even at your bad situation.\r\n13.Mark your failure & make that your stamp.\r\nChanging life isn\'t that easy to do, because you have some bad habit. You have to overcome that at first.\r\n \r\n\r\n获得304.5k好评的回答@Elena Ledoux：\r\n\r\nIf I tell you, are you going to do it?\r\n1.Put the phone down after you read this.\r\n2.Get off the couch.\r\n3.Take a sheet of paper and write down top 3 things you want to have in your life. Better yet, take a cork board and pin the images of your top dreams.\r\n4.Every morning ask yourself what are you going to do today to get closer to your dreams.\r\n5.Every evening, ask yourself if you\'ve done what you promised yourself.\r\nThat\'s it. If you do the above, your life will change.\r\nThe key to any change is action.\r\n');
INSERT INTO `tb_new` VALUES ('3', '一词日历：《行尸走肉》漫画版完结，这对剧意味着什么？', '2019-07-15 18:00', '沪江英语', '沪江英语', 'new_3.jpg', 'word', '泸江英语', '2019.07.15\r\n\r\n周一 Monday\r\n\r\nlucrative\r\n [\'lukrətɪv] \r\nadj. 有利可图的\r\n\r\n\r\n\r\nAfter last month\'s shocking death of Rick Grimes, this month\'s issue of The Walking Dead comic has done something even more shocking: end. \r\n上月瑞克·格莱姆斯令人震惊地死去后，这月的《行尸走肉》漫画做出了更令人震惊的事：完结了。\r\nAccording to ComicBook.com, Robert Kirkman\'s tremendously lucrative comic series that serves as the source material for AMC\'s The Walking Dead is over, with no advance warning, with Issue #193, out Wednesday, bringing the story that started in 2003 to an end.\r\n根据漫画书网的消息，罗伯特·柯克曼的吸金漫画系列，也就是AMC电视台《行尸走肉》的素材来源，完结了，之前没有任何预告。这个从2003年开始连载的故事在周三发行的193期中完结。\r\nThe plot of the issue is being kept under wraps for now, but it will serve as an epilogue to the death of Rick Grimes, which happened across #191 and #192.\r\n这期漫画的情节还处于保密状态，但是这将为191期和192期瑞克·格莱姆斯的死收场。\r\n\"I hate knowing what\'s coming,\" Kirkman wrote in the Letter Hacks section of Issue #193, which leaked on Reddit. \"\r\n“我讨厌剧透。”柯克曼在193期的信件黑客板块中写道，他的话泄露在Reddit网站上。\r\nSo what does this mean for AMC\'s The Walking Dead, which will return for Season 10 in the fall? \r\n那么这对于AMC即将在秋季回归的《行尸走肉》第十季来说意味着什么呢？\r\nHonestly, probably not much, beyond reminding us that everything is finite and The Walking Dead will end someday. \r\n老实说，可能没什么大影响。只能提醒我们一切都是有限的，《行尸走肉》总有一天会完结的。\r\nThe show is currently adapting somewhere around Issue #150, so it has some time before the source material runs out, though it looks like the Ohio storyline that emerges around Issue #169 may get adapted into the Rick Grimes movies, since there are some parallels between the Commonwealth and the helicopter people who took him in Season 9. \r\n这部剧目前大约改编到了150期，离素材用完还有一段时间，虽然看起来169期左右的俄亥俄州的情节要被改变成瑞克·格莱姆斯电影，因为在这个州和坐直升飞机带走他的人之间有一些平行之处。\r\nIn that case, The Walking Dead will probably run out of source material to adapt after Season 10. But then chief content officer Scott Gimple and showrunner Angela Kang and their writers will just come up with original material. \r\n这种情况下，第十季之后， 《行尸走肉》可能就没有素材来进行改编了。但是首席内容官斯科特·金普勒和制片人安吉拉·康以及他们的编剧会创作出原创素材。\r\nThe show has never been directly beholden to the comics anyway. It always gets \"remixed,\" with storylines happening with different characters and different deaths and in different order, etc.\r\n这部剧也从未直接忠实于漫画，而是总是“合成”。不同的情节涉及不同的人物、不同的死亡，发生顺序也不同，诸如此类。\r\nIn any case, The Walking Dead franchise will soldier on, with the mothership show, Fear the Walking Dead, the untitled third series, and the Rick Grimes TV movie trilogy with Andrew Lincoln all in various stages of their lifespan.\r\n不管怎样，《行尸走肉》剧都会继续下去。未命名的第三季电视剧《行尸之惧》和安德鲁·林肯出演的瑞克·格莱姆斯电影三部曲都在各自生命周期的不同阶段。\r\n \r\n\r\n今日词汇\r\n\r\nlucrative\r\n [\'lukrətɪv] \r\nadj. 有利可图的\r\n\r\n \r\na lucrative deal 有利可图的交易\r\n\r\nHe decided to turn his hobby into a lucrative sideline.  \r\n\r\n他决定把自己的爱好变成赚钱的副业.', '2019.07.15\r\n\r\n周一 Monday\r\n\r\nlucrative\r\n [\'lukrətɪv] \r\nadj. 有利可图的\r\n\r\n\r\n\r\n上月瑞克·格莱姆斯令人震惊地死去后，这月的《行尸走肉》漫画做出了更令人震惊的事：完结了。\r\n根据漫画书网的消息，罗伯特·柯克曼的吸金漫画系列，也就是AMC电视台《行尸走肉》的素材来源，完结了，之前没有任何预告。这个从2003年开始连载的故事在周三发行的193期中完结。\r\n这期漫画的情节还处于保密状态，但是这将为191期和192期瑞克·格莱姆斯的死收场。\r\n“我讨厌剧透。”柯克曼在193期的信件黑客板块中写道，他的话泄露在Reddit网站上。\r\n那么这对于AMC即将在秋季回归的《行尸走肉》第十季来说意味着什么呢？\r\n老实说，可能没什么大影响。只能提醒我们一切都是有限的，《行尸走肉》总有一天会完结的。\r\n这部剧目前大约改编到了150期，离素材用完还有一段时间，虽然看起来169期左右的俄亥俄州的情节要被改变成瑞克·格莱姆斯电影，因为在这个州和坐直升飞机带走他的人之间有一些平行之处。\r\n这种情况下，第十季之后， 《行尸走肉》可能就没有素材来进行改编了。但是首席内容官斯科特·金普勒和制片人安吉拉·康以及他们的编剧会创作出原创素材。\r\n这部剧也从未直接忠实于漫画，而是总是“合成”。不同的情节涉及不同的人物、不同的死亡，发生顺序也不同，诸如此类。\r\n不管怎样，《行尸走肉》剧都会继续下去。未命名的第三季电视剧《行尸之惧》和安德鲁·林肯出演的瑞克·格莱姆斯电影三部曲都在各自生命周期的不同阶段。\r\n \r\n\r\n今日词汇\r\n\r\nlucrative\r\n [\'lukrətɪv] \r\nadj. 有利可图的\r\n\r\n \r\na lucrative deal 有利可图的交易\r\n\r\nHe decided to turn his hobby into a lucrative sideline.  \r\n\r\n他决定把自己的爱好变成赚钱的副业.', '2019.07.15\r\n\r\n周一 Monday\r\n\r\nlucrative\r\n [\'lukrətɪv] \r\nadj. 有利可图的\r\n\r\n\r\n\r\nAfter last month\'s shocking death of Rick Grimes, this month\'s issue of The Walking Dead comic has done something even more shocking: end. \r\nAccording to ComicBook.com, Robert Kirkman\'s tremendously lucrative comic series that serves as the source material for AMC\'s The Walking Dead is over, with no advance warning, with Issue #193, out Wednesday, bringing the story that started in 2003 to an end.\r\nThe plot of the issue is being kept under wraps for now, but it will serve as an epilogue to the death of Rick Grimes, which happened across #191 and #192.\r\n\"I hate knowing what\'s coming,\" Kirkman wrote in the Letter Hacks section of Issue #193, which leaked on Reddit. \"\r\nSo what does this mean for AMC\'s The Walking Dead, which will return for Season 10 in the fall? \r\nHonestly, probably not much, beyond reminding us that everything is finite and The Walking Dead will end someday. \r\nThe show is currently adapting somewhere around Issue #150, so it has some time before the source material runs out, though it looks like the Ohio storyline that emerges around Issue #169 may get adapted into the Rick Grimes movies, since there are some parallels between the Commonwealth and the helicopter people who took him in Season 9. \r\nIn that case, The Walking Dead will probably run out of source material to adapt after Season 10. But then chief content officer Scott Gimple and showrunner Angela Kang and their writers will just come up with original material. \r\nThe show has never been directly beholden to the comics anyway. It always gets \"remixed,\" with storylines happening with different characters and different deaths and in different order, etc.\r\nIn any case, The Walking Dead franchise will soldier on, with the mothership show, Fear the Walking Dead, the untitled third series, and the Rick Grimes TV movie trilogy with Andrew Lincoln all in various stages of their lifespan.\r\n \r\n\r\n今日词汇\r\n\r\nlucrative\r\n [\'lukrətɪv] \r\nadj. 有利可图的\r\n\r\n \r\na lucrative deal 有利可图的交易\r\n\r\nHe decided to turn his hobby into a lucrative sideline.  \r\n\r\n他决定把自己的爱好变成赚钱的副业.');
INSERT INTO `tb_new` VALUES ('4', '抖音的日活用户超过4亿', '2020-01-19 14:35', '沪江英语', 'Tech Crunch', 'seechina.jpg', 'seechina', '菲菲', 'China’s TikTok, which has taken the world by storm, is working its magic in its home nation, too.\r\n中国的抖音已风靡全球，在国内也很火爆。\r\nThe Chinese version of TikTok, called Douyin, has amassed 400 million daily active users, parent company ByteDance revealed in its annual report this week (in Chinese). This is an impressive growth for the addictive video app, which had 250 million daily active users in January last year. (A ByteDance spokesperson confirmed the figures to TechCrunch.)\r\n“抖音”是TikTok的中国版本，其母公司字节跳动本周公布了（汉语）年报，显示日活跃用户达4亿。对于这款令人上瘾的视频应用来说，这一发展速度惊人，去年一月份的日活跃用户为2.5亿（一位字节跳动的发言人向TechCrunch博客证实了这一数据）。\r\nThe report, which describes the user behavior and trends, illustrates the cultural difference between China and the U.S., said Katherine Wu, an investor at New York-based firm Notation Capital .\r\n纽约的Notation Capital公司的投资人Katherine Wu说，年报描述了用户行为和趋势，说明了中美两国的文化差异。\r\n“Things that trend in these two countries are insanely different. For example: knowledge-based content is extremely popular in China, and less so in the U.S. Also, this was wild to me: those creators that did the most dance videos in China are users born in the 60s (!!), whereas in the US, it seems that it’s mostly teenagers who are creating the dances,” she wrote.\r\n她写道：“这两个国家的趋势截然不同，比如：知识性内容在中国很流行，但在美国稍差一些。而且，这一点对我来说很疯狂：中国最喜欢拍舞蹈视频的是60后（！！），但在美国，好像是年轻人最喜欢拍舞蹈视频。”\r\nByteDance claimed that Douyin has established itself as the largest knowledge, culture and art platform in China. (Douyin is only available in mainland China.) Indeed, 14.89 million “knowledge-based content videos” were shared on the app last year, it claimed.\r\n字节跳动称抖音已成为中国最大的知识、文化和艺术平台（抖音只能在中国大陆使用）。该公司称，事实上，去年在抖音上有1489万“知识类视频”被分享。\r\nCiting an example, one of the world’s most valued startups claimed that one user alone who posts videos about chemistry reached 130 million people last year. On the art and culture front, videos that revolved around those topics had 543.1 billion plays on Douyin last year, it claimed. (TechCrunch was not able to independently verify the authenticity of the claims.)\r\n举个例子，世界上最有价值的一家初创公司称，去年一个发布关于化学的视频的用户就被1.3亿人看到了。该公司称，在艺术和文化领域，去年抖音上与这些话题有关的视频就有5431亿的播放量。（TechCrunch博客不能独立核实所说内容的真实性）\r\nEducation has become a crucial use case for ByteDance. TikTok, which is estimated to have clocked more than $50 million in revenue last year, already counts educational content as one of the most consumed categories on its app across the world. The app launched an educational campaign in India last year, where it has amassed more than 200 million users.\r\n教育已经成为字节跳动的一个主要用例。据估计抖音去年收入超5000万美元，教育内容成为该应用在全球消费最多的一个类别。该应用去年在印度发起了一项教育活动，用户已超过2亿。', '中国的抖音已风靡全球，在国内也很火爆。\r\n“抖音”是TikTok的中国版本，其母公司字节跳动本周公布了（汉语）年报，显示日活跃用户达4亿。对于这款令人上瘾的视频应用来说，这一发展速度惊人，去年一月份的日活跃用户为2.5亿（一位字节跳动的发言人向TechCrunch博客证实了这一数据）。\r\n纽约的Notation Capital公司的投资人Katherine Wu说，年报描述了用户行为和趋势，说明了中美两国的文化差异。\r\n她写道：“这两个国家的趋势截然不同，比如：知识性内容在中国很流行，但在美国稍差一些。而且，这一点对我来说很疯狂：中国最喜欢拍舞蹈视频的是60后（！！），但在美国，好像是年轻人最喜欢拍舞蹈视频。”\r\n字节跳动称抖音已成为中国最大的知识、文化和艺术平台（抖音只能在中国大陆使用）。该公司称，事实上，去年在抖音上有1489万“知识类视频”被分享。\r\n举个例子，世界上最有价值的一家初创公司称，去年一个发布关于化学的视频的用户就被1.3亿人看到了。该公司称，在艺术和文化领域，去年抖音上与这些话题有关的视频就有5431亿的播放量。（TechCrunch博客不能独立核实所说内容的真实性）\r\n教育已经成为字节跳动的一个主要用例。据估计抖音去年收入超5000万美元，教育内容成为该应用在全球消费最多的一个类别。该应用去年在印度发起了一项教育活动，用户已超过2亿。', 'China’s TikTok, which has taken the world by storm, is working its magic in its home nation, too.\r\nThe Chinese version of TikTok, called Douyin, has amassed 400 million daily active users, parent company ByteDance revealed in its annual report this week (in Chinese). This is an impressive growth for the addictive video app, which had 250 million daily active users in January last year. (A ByteDance spokesperson confirmed the figures to TechCrunch.)\r\nThe report, which describes the user behavior and trends, illustrates the cultural difference between China and the U.S., said Katherine Wu, an investor at New York-based firm Notation Capital .\r\n“Things that trend in these two countries are insanely different. For example: knowledge-based content is extremely popular in China, and less so in the U.S. Also, this was wild to me: those creators that did the most dance videos in China are users born in the 60s (!!), whereas in the US, it seems that it’s mostly teenagers who are creating the dances,” she wrote.\r\nByteDance claimed that Douyin has established itself as the largest knowledge, culture and art platform in China. (Douyin is only available in mainland China.) Indeed, 14.89 million “knowledge-based content videos” were shared on the app last year, it claimed.\r\nCiting an example, one of the world’s most valued startups claimed that one user alone who posts videos about chemistry reached 130 million people last year. On the art and culture front, videos that revolved around those topics had 543.1 billion plays on Douyin last year, it claimed. (TechCrunch was not able to independently verify the authenticity of the claims.)\r\nEducation has become a crucial use case for ByteDance. TikTok, which is estimated to have clocked more than $50 million in revenue last year, already counts educational content as one of the most consumed categories on its app across the world. The app launched an educational campaign in India last year, where it has amassed more than 200 million users.\r\n');
INSERT INTO `tb_new` VALUES ('5', '《怪奇物语》编剧透露第4季，将和这5部电影有关', '2019-10-18 14:05', '沪江英语', 'TV Guide', 'tv.jpg', 'tv', '菲菲', 'Most of these pics arrived well outside of the time period we might expect Stranger Things 4 to take place in — if tradition holds, that\'d be somewhere around 1986 — but we can still venture a few guesses as to how these films might have an impact on Stranger Things 4 for fun, right?\r\n这些影片中大部分的上映时间都不是我们预计中《怪奇物语4》设定的时间，习惯上该剧会发生在1986年左右。但我们仍然可以大胆猜测这些电影对《怪奇物语4》有什么影响，猜着玩吧。\r\n\r\n\r\nThe Peanut Butter Solution is a 1985 French comedy-horror film in which a kid sees a gaggle of ghosts and experiences \"The Fright,\" a condition that causes his hair to fall out. The remedy to his early onset baldness is — you guessed it — a peanut butter solution, but the kid mucks the recipe up, and things go hair-wire from there.\r\n《魔发》是1985年的一部法国喜剧恐怖电影，剧中一个孩子看到了一群鬼，并经历了“恐怖”症，使他失去了所有头发。你猜对了，治疗他早期秃顶的方法就是花生酱，但这个孩子把配方搞砸了，情况就开始变得一团糟。\r\nThe Fisher King is a 1991 dramedy about a cocky radio host who inadvertently triggers a mass murder event and ventures to help the husband of one of the victims, a deluded man on a mission to find the Holy Grail.\r\n《渔王》是1991年的一部正喜剧，讲述了一个傲慢的之声主持人无意中引发大规模谋杀，并冒险去帮助一个受害者的丈夫，这个人妄图寻找圣杯。\r\nBill and Ted\'s Bogus Journey is the 1991 sequel to Bill and Ted\'s Excellent Adventure. Like the first film, the movie centers on the eponymous duo as they hang out with people from other time periods, but this time, they also take a trip to Hell and have to battle with Death over games like Twister and Clue\r\n1991年播出的《比尔和特德历险记》是《阿比阿弟的冒险》的续集。和第一部一样，这部剧主要讲述了这对同名的二人组和其他时代的人一起出去玩的故事，但这一次他们还去了地狱，和死神比赛玩Twister and Clue游戏。\r\nYou\'ve Got Mail is perhaps the most confounding part of this list because the 1998 rom-com has absolutely nothing to do with the supernatural.\r\n《电子情书》可能是这些电影中最令人费解的，因为这部1998年的浪漫喜剧和超自然力量一点关系都没有。\r\nOrdinary People is a highly decorated 1980 drama film about a family that gets ripped apart by the death of one son and the suicide attempt of the other.\r\n《普通人》是1980年的一部剧情片，讲述了一家人因为一个儿子的离世和另一个儿子自杀未遂而支离破碎的故事。', '这些影片中大部分的上映时间都不是我们预计中《怪奇物语4》设定的时间，习惯上该剧会发生在1986年左右。但我们仍然可以大胆猜测这些电影对《怪奇物语4》有什么影响，猜着玩吧。\r\n\r\n\r\n《魔发》是1985年的一部法国喜剧恐怖电影，剧中一个孩子看到了一群鬼，并经历了“恐怖”症，使他失去了所有头发。你猜对了，治疗他早期秃顶的方法就是花生酱，但这个孩子把配方搞砸了，情况就开始变得一团糟。\r\n《渔王》是1991年的一部正喜剧，讲述了一个傲慢的之声主持人无意中引发大规模谋杀，并冒险去帮助一个受害者的丈夫，这个人妄图寻找圣杯。\r\n1991年播出的《比尔和特德历险记》是《阿比阿弟的冒险》的续集。和第一部一样，这部剧主要讲述了这对同名的二人组和其他时代的人一起出去玩的故事，但这一次他们还去了地狱，和死神比赛玩Twister and Clue游戏。\r\n《电子情书》可能是这些电影中最令人费解的，因为这部1998年的浪漫喜剧和超自然力量一点关系都没有。\r\n《普通人》是1980年的一部剧情片，讲述了一家人因为一个儿子的离世和另一个儿子自杀未遂而支离破碎的故事。', 'Most of these pics arrived well outside of the time period we might expect Stranger Things 4 to take place in — if tradition holds, that\'d be somewhere around 1986 — but we can still venture a few guesses as to how these films might have an impact on Stranger Things 4 for fun, right?\r\n\r\n\r\nThe Peanut Butter Solution is a 1985 French comedy-horror film in which a kid sees a gaggle of ghosts and experiences \"The Fright,\" a condition that causes his hair to fall out. The remedy to his early onset baldness is — you guessed it — a peanut butter solution, but the kid mucks the recipe up, and things go hair-wire from there.\r\nThe Fisher King is a 1991 dramedy about a cocky radio host who inadvertently triggers a mass murder event and ventures to help the husband of one of the victims, a deluded man on a mission to find the Holy Grail.\r\nBill and Ted\'s Bogus Journey is the 1991 sequel to Bill and Ted\'s Excellent Adventure. Like the first film, the movie centers on the eponymous duo as they hang out with people from other time periods, but this time, they also take a trip to Hell and have to battle with Death over games like Twister and Clue\r\nYou\'ve Got Mail is perhaps the most confounding part of this list because the 1998 rom-com has absolutely nothing to do with the supernatural.\r\nOrdinary People is a highly decorated 1980 drama film about a family that gets ripped apart by the death of one son and the suicide attempt of the other.\r\n');
INSERT INTO `tb_new` VALUES ('6', '优衣库高能新app：街上看见好衣服？拍照就能搜', '2019-12-01 18:34', '沪江英语', 'Fast Company', 'new_6.png', 'fashion', '菲菲', 'If you’re scrolling through Instagram and find an outfit you love, Uniqlo wants to help you re-create it.\r\n你在刷Instagram时要是发现了喜欢的衣服，优衣库希望能帮你得到这件衣服。\r\nThe Japanese apparel brand worked with design firm I&Co to create a mobile app called StyleHint that allows users to upload photos of clothes and be matched with similar styles from the site.\r\n这家日本的服装品牌和设计公司I&Co合作打造了一款名为StyleHint的移动应用程序，用户可以上传衣服照片，就可以匹配到官网上的相似款式。\r\nTo launch this technology, Uniqlo partnered with Google’s Cloud Vision image analysis, applying the image recognition technology to clothes.\r\n优衣库为了推出这一技术，和谷歌的图像分析工具Cloud Vision合作，将这一图像识别技术应用到衣服上。\r\n\r\n\r\nThe app functions like a social media platform, much like Instagram, allowing you to follow other users.\r\n这款应用程序的功能像社交平台，非常像Instagram，你可以访问其他用户。\r\nYou can upload and share images of your favorite outfits and see what other people are posting.\r\n你可以上传并分享最喜欢的服装的图片，还可以看看别人上传的图片。\r\nThroughout the process, the StyleHint technology will identify similar garments from Uniqlo and purchase items immediately through the app.\r\nStyleHint应用的技术在这一过程中能找到优衣库相似的服装，并通过应用程序立刻购买该商品。\r\nTo launch the app, Uniqlo is partnering with fashion influencer Olivia Perez.\r\n为了推出这个应用程序，优衣库和时尚博主Olivia Perez进行合作。', '你在刷Instagram时要是发现了喜欢的衣服，优衣库希望能帮你得到这件衣服。\r\n这家日本的服装品牌和设计公司I&Co合作打造了一款名为StyleHint的移动应用程序，用户可以上传衣服照片，就可以匹配到官网上的相似款式。\r\n优衣库为了推出这一技术，和谷歌的图像分析工具Cloud Vision合作，将这一图像识别技术应用到衣服上。\r\n\r\n\r\n这款应用程序的功能像社交平台，非常像Instagram，你可以访问其他用户。\r\n你可以上传并分享最喜欢的服装的图片，还可以看看别人上传的图片。\r\nStyleHint应用的技术在这一过程中能找到优衣库相似的服装，并通过应用程序立刻购买该商品。\r\n为了推出这个应用程序，优衣库和时尚博主Olivia Perez进行合作。', 'If you’re scrolling through Instagram and find an outfit you love, Uniqlo wants to help you re-create it.\r\nThe Japanese apparel brand worked with design firm I&Co to create a mobile app called StyleHint that allows users to upload photos of clothes and be matched with similar styles from the site.\r\nTo launch this technology, Uniqlo partnered with Google’s Cloud Vision image analysis, applying the image recognition technology to clothes.\r\n\r\n\r\nThe app functions like a social media platform, much like Instagram, allowing you to follow other users.\r\nYou can upload and share images of your favorite outfits and see what other people are posting.\r\nThroughout the process, the StyleHint technology will identify similar garments from Uniqlo and purchase items immediately through the app.\r\nTo launch the app, Uniqlo is partnering with fashion influencer Olivia Perez.\r\n');
INSERT INTO `tb_new` VALUES ('7', '工作多年之后转行是否值得？', '2019-01-01 00:45', '沪江英语', 'Quora', 'work.jpg', 'work', '糖果姐', 'When you’re in your 30s you’ve reached a critical point in your career. You’ve got a good amount of experience under your belt, you’ve been promoted a few times, and you’ve got a decent salary.\r\n你已经30多岁了，那么你就到达了事业发展的关键点。你已具备丰富的工作经验，多次获得晋升，以及早已获得一份相当不错的薪水了。\r\nBut, as Stephen Covey said:\r\n但是，正如Stephen Covey（史蒂芬·柯维，美国著名管理学大师）所说：\r\n\r\n“It doesn’t really matter how fast you’re going if you’re heading in the wrong direction.”“\r\n如果你正往错误的方向前进，那速度多快就根本不重要了。”\r\nHaving the right goals in place is fundamental to successfully achieving them, and for that achievement to really contribute to your happiness and life satisfaction. So the number one priority at this stage is getting clarity on what your priorities actually are!\r\n能否设定明智的目标对于能否顺利完成它们来说是至关重要的，并且这种达到目标的成功确实能使你感到快乐以及生活满足感。所以当前要务就是你得弄清自己的首要事情是什么！\r\nA great way to do this is to define your personal values, getting to a list of your top three is ideal. Then ask yourself if these values are really reflected in your career and your lifestyle today. If not, you can go about setting goals that are aligned with those values, and then creating an action plan to achieve those goals.\r\n有一个很好的方法，那就是明确个人价值观，把最主要3个列出来就足够了。然后问问自己这些价值观能否真实反映你当前的职业状态与生活方式。如果不能，那么设定一些与这些价值观相关的目标，然后设计一份行动计划去实现它们。\r\n\r\nSigns that you should move on\r\n出现以下情况时，你就该做出改变了：\r\n\r\n1. Your key strengths and skills are not being leveraged:\r\n1.你的特长与技能并没有利用起来。\r\nIf you find that you’re unable to use your experience and abilities in your current role, it may be time to look for a role that’s a better fit for your profile. The same applies if you’re not being recognised and appreciated for the value you’re adding to the business.\r\n如果你发现在当前的职位中无法把自己的经验与能力运用起来，那么也许就该找另外一份与你的个人特长更匹配的职业了。同样这也适用于个人投入工作中的价值特征没被认可或欣赏的情况。\r\n\r\n2.You’ve stopped learning and growing:\r\n2.你已停止学习与进步。\r\nIf every aspect of your role starts to feel routine, if you’re constantly bored and you feel you no longer have any opportunities to grow either in this role or in another role at your current company, then you’d do better to seek a new challenge.\r\n如果当前的职位方方面面都让你感到平淡乏味，如果你总是觉得无聊并且你认为自己无法在当前的公司获得任何发展的机会了，无论职位如何，你都得寻找新的挑战了。\r\n\r\n3.The positives no longer outweigh the negatives:\r\n3.利处不再大于弊处：\r\nIf your salary no longer makes up for the stress and overtime, if the fun times become less and less frequent, if the interesting projects no longer compensate for the dull tasks, then you may want to look for a job where the balance is more in your favour.\r\n如果你的薪水再也无法抵消压力和加班对你造成的负面影响，如果快乐的时光越来越少越来越渺茫，有趣的项目不再抵消日常的琐事，那么你也许就该找另外一份让你感到心理平衡的工作了。\r\n\r\n4.Your values are misaligned with the company’s:\r\n4. 你的价值观与公司的不一致：\r\nIf you find yourself disagreeing with the overall company direction, or your boss’s decisions are counter to what you believe, and fundamentally you realise that your values are not aligned with those of the company, the right thing for both you and your boss will be to find a role that’s a better match for what you believe in.\r\n如果你发现自己并不同意公司的总体发展方向，或者老板的决定与你的信念背道而驰，并且重要的是你意识到你的所坚信的价值观与公司的价值观并不一致，那么你和老板该做的就是寻找另外一个与你的价值观更相符的职位了。\r\n\r\n5. You have a burning desire to do something else:\r\n5. 你急切希望做别的事情。\r\nIf your gut tells you it’s time to move on, if you have a passion that you’ve been dreaming of following for years, if you have a business idea that’s clearly formed in your head, then now may be the time to make it a reality; even if it means starting at a lower level.\r\n如果你的内心告诉你该放手了，如果你有一个早已梦想多年希望完成的愿望，如果你有一个早已了然于心的经商点子，那么现在也许就是时候实现它了，即使这意味着从较低水平开始着手。\r\nQuestions you can ask yourself:\r\n在做决定前，可以问问自己这些问题：\r\nWhat is my current job giving me (in terms of tangible benefits as well as things like satisfaction and growth)? What’s missing?\r\n我目前的工作给了我什么（可以从物质利益还有满意度和职业发展方面考虑）？缺少了什么东西？\r\nWhere am I headed in my current role? (This is also a question for your boss.)\r\n我当前职位的前进方向是什么？（这也是给老板提的问题）\r\nWhere do I see myself in five years? Ten?\r\n五年后我会是怎样的？十年后呢？\r\nWhat would this career change give me?\r\n这次改变职业会给我带来什么影响？\r\nWhat to do next:\r\n接下来该这么做：\r\nThe next steps will depend on your reasons for wanting to change, and your answers to those questions above. You may decide that you simply need to change to a similar job in a different company, or perhaps a different industry; you may be looking to move into the non-profit sector; or maybe you want to start your own business. As a general guide, if you haven\'t already I would advise you to do some research on what it would take for you to make that move.\r\n接下来就该取决于你想改变职业的理由了，以及你对上面的这些问题的答案。可能你只是想转换到别的公司，或不一样的行业担任类似的职位；也许你希望加入一家非盈利机构；或你想自主创业。根据常规，如果你还没决定好我就会建议你多做资料搜集，以确定自己为何想要转行。\r\nHave a look at the roles that are currently being advertised: Does your profile fit the job description? Are there skills that you need to develop, courses you need to take, in order to be qualified? What books can you read about this new industry or field to get better informed? What conferences and networking events can you go to in order to connect with people who are already there?\r\n浏览一下当前正在招募的职位描述：你的个人履历符合要求吗？你是否需要培养所需的技能，是否需要参与一些课程以便自己获得资格证明？关于新的行业领域需要阅读哪些书籍以获得更好的信息？你能参与哪些会议或建立社交关系的晚会以便更好地联系行业里的前辈？\r\nMoney is often the biggest concern for people making such a big change, especially if you\'re facing the prospect of a cut in your salary. If this is a worry, then it’s best to sit down sooner rather than later and take a proper look at your finances. Do you need to start cutting down on your expenses to have a buffer for when you decide to quit? How long will it take you to save this amount, i.e. what deadline can you give yourself to actually quit your job?\r\n金钱通常都是人们在考虑此类重大改变时最关注的问题，特别在你可能面临着薪水的锐减时。如果这是一个让你担忧的问题，那么你还得坐下来好好评估一下自己的经济状况。你是否需要节省一笔开支以备辞职时作为缓冲的需要？多久才能存到那一笔钱，也就是说你给自己辞职的最后期限是什么时候？\r\nIf you’re really unsure of whether the career change is the right move for you or not, or you just want some extra support from someone who is objective and unbiased, then you can also consider working with a career coach.\r\n如果你真的不确定职业变换是不是一个好的决定，或者你很希望获得那些能够客观，不偏不倚看待事情的朋友的支持，那么你也可以考虑与职业导师好好地合作，共同解决这个难题。\r\nGood luck!\r\n祝你好运！', '你已经30多岁了，那么你就到达了事业发展的关键点。你已具备丰富的工作经验，多次获得晋升，以及早已获得一份相当不错的薪水了。\r\n但是，正如Stephen Covey（史蒂芬·柯维，美国著名管理学大师）所说：\r\n\r\n如果你正往错误的方向前进，那速度多快就根本不重要了。”\r\n能否设定明智的目标对于能否顺利完成它们来说是至关重要的，并且这种达到目标的成功确实能使你感到快乐以及生活满足感。所以当前要务就是你得弄清自己的首要事情是什么！\r\n有一个很好的方法，那就是明确个人价值观，把最主要3个列出来就足够了。然后问问自己这些价值观能否真实反映你当前的职业状态与生活方式。如果不能，那么设定一些与这些价值观相关的目标，然后设计一份行动计划去实现它们。\r\n\r\n出现以下情况时，你就该做出改变了：\r\n\r\n1.你的特长与技能并没有利用起来。\r\n如果你发现在当前的职位中无法把自己的经验与能力运用起来，那么也许就该找另外一份与你的个人特长更匹配的职业了。同样这也适用于个人投入工作中的价值特征没被认可或欣赏的情况。\r\n\r\n2.你已停止学习与进步。\r\n如果当前的职位方方面面都让你感到平淡乏味，如果你总是觉得无聊并且你认为自己无法在当前的公司获得任何发展的机会了，无论职位如何，你都得寻找新的挑战了。\r\n\r\n3.利处不再大于弊处：\r\n如果你的薪水再也无法抵消压力和加班对你造成的负面影响，如果快乐的时光越来越少越来越渺茫，有趣的项目不再抵消日常的琐事，那么你也许就该找另外一份让你感到心理平衡的工作了。\r\n\r\n4. 你的价值观与公司的不一致：\r\n如果你发现自己并不同意公司的总体发展方向，或者老板的决定与你的信念背道而驰，并且重要的是你意识到你的所坚信的价值观与公司的价值观并不一致，那么你和老板该做的就是寻找另外一个与你的价值观更相符的职位了。\r\n\r\n5. 你急切希望做别的事情。\r\n如果你的内心告诉你该放手了，如果你有一个早已梦想多年希望完成的愿望，如果你有一个早已了然于心的经商点子，那么现在也许就是时候实现它了，即使这意味着从较低水平开始着手。\r\n在做决定前，可以问问自己这些问题：\r\n我目前的工作给了我什么（可以从物质利益还有满意度和职业发展方面考虑）？缺少了什么东西？\r\n我当前职位的前进方向是什么？（这也是给老板提的问题）\r\n五年后我会是怎样的？十年后呢？\r\n这次改变职业会给我带来什么影响？\r\n接下来该这么做：\r\n接下来就该取决于你想改变职业的理由了，以及你对上面的这些问题的答案。可能你只是想转换到别的公司，或不一样的行业担任类似的职位；也许你希望加入一家非盈利机构；或你想自主创业。根据常规，如果你还没决定好我就会建议你多做资料搜集，以确定自己为何想要转行。\r\n浏览一下当前正在招募的职位描述：你的个人履历符合要求吗？你是否需要培养所需的技能，是否需要参与一些课程以便自己获得资格证明？关于新的行业领域需要阅读哪些书籍以获得更好的信息？你能参与哪些会议或建立社交关系的晚会以便更好地联系行业里的前辈？\r\n金钱通常都是人们在考虑此类重大改变时最关注的问题，特别在你可能面临着薪水的锐减时。如果这是一个让你担忧的问题，那么你还得坐下来好好评估一下自己的经济状况。你是否需要节省一笔开支以备辞职时作为缓冲的需要？多久才能存到那一笔钱，也就是说你给自己辞职的最后期限是什么时候？\r\n如果你真的不确定职业变换是不是一个好的决定，或者你很希望获得那些能够客观，不偏不倚看待事情的朋友的支持，那么你也可以考虑与职业导师好好地合作，共同解决这个难题。\r\n祝你好运！', 'When you’re in your 30s you’ve reached a critical point in your career. You’ve got a good amount of experience under your belt, you’ve been promoted a few times, and you’ve got a decent salary.\r\nBut, as Stephen Covey said:\r\n\r\n“It doesn’t really matter how fast you’re going if you’re heading in the wrong direction.”“\r\nHaving the right goals in place is fundamental to successfully achieving them, and for that achievement to really contribute to your happiness and life satisfaction. So the number one priority at this stage is getting clarity on what your priorities actually are!\r\nA great way to do this is to define your personal values, getting to a list of your top three is ideal. Then ask yourself if these values are really reflected in your career and your lifestyle today. If not, you can go about setting goals that are aligned with those values, and then creating an action plan to achieve those goals.\r\n\r\nSigns that you should move on\r\n\r\n1. Your key strengths and skills are not being leveraged:\r\nIf you find that you’re unable to use your experience and abilities in your current role, it may be time to look for a role that’s a better fit for your profile. The same applies if you’re not being recognised and appreciated for the value you’re adding to the business.\r\n\r\n2.You’ve stopped learning and growing:\r\nIf every aspect of your role starts to feel routine, if you’re constantly bored and you feel you no longer have any opportunities to grow either in this role or in another role at your current company, then you’d do better to seek a new challenge.\r\n\r\n3.The positives no longer outweigh the negatives:\r\nIf your salary no longer makes up for the stress and overtime, if the fun times become less and less frequent, if the interesting projects no longer compensate for the dull tasks, then you may want to look for a job where the balance is more in your favour.\r\n\r\n4.Your values are misaligned with the company’s:\r\nIf you find yourself disagreeing with the overall company direction, or your boss’s decisions are counter to what you believe, and fundamentally you realise that your values are not aligned with those of the company, the right thing for both you and your boss will be to find a role that’s a better match for what you believe in.\r\n\r\n5. You have a burning desire to do something else:\r\nIf your gut tells you it’s time to move on, if you have a passion that you’ve been dreaming of following for years, if you have a business idea that’s clearly formed in your head, then now may be the time to make it a reality; even if it means starting at a lower level.\r\nQuestions you can ask yourself:\r\nWhat is my current job giving me (in terms of tangible benefits as well as things like satisfaction and growth)? What’s missing?\r\nWhere am I headed in my current role? (This is also a question for your boss.)\r\nWhere do I see myself in five years? Ten?\r\nWhat would this career change give me?\r\nWhat to do next:\r\nThe next steps will depend on your reasons for wanting to change, and your answers to those questions above. You may decide that you simply need to change to a similar job in a different company, or perhaps a different industry; you may be looking to move into the non-profit sector; or maybe you want to start your own business. As a general guide, if you haven\'t already I would advise you to do some research on what it would take for you to make that move.\r\nHave a look at the roles that are currently being advertised: Does your profile fit the job description? Are there skills that you need to develop, courses you need to take, in order to be qualified? What books can you read about this new industry or field to get better informed? What conferences and networking events can you go to in order to connect with people who are already there?\r\nMoney is often the biggest concern for people making such a big change, especially if you\'re facing the prospect of a cut in your salary. If this is a worry, then it’s best to sit down sooner rather than later and take a proper look at your finances. Do you need to start cutting down on your expenses to have a buffer for when you decide to quit? How long will it take you to save this amount, i.e. what deadline can you give yourself to actually quit your job?\r\nIf you’re really unsure of whether the career change is the right move for you or not, or you just want some extra support from someone who is objective and unbiased, then you can also consider working with a career coach.\r\nGood luck!\r\n');
INSERT INTO `tb_new` VALUES ('8', '《破产姐妹》口语养成之“奇思妙想”', '2020-03-02 13:14', '沪江英语', '小阳', 'new_8.jpg', 'topic', '小阳', '1.get a blow out for this\r\n\r\n【原句】Well, at least I didn’t get a blow out for this.(S06E02)\r\n【翻译】幸好我没为此额外花销。\r\n【场景】Caroline他们终于等来自己甜品酒吧店的开业，开业倒计时，门外一位潮流名人跟Earl被允许先进店尝鲜，却被之前的木偶艺人打断了，他得知Caroline他们想用Han的酒水经营证后警告他们会收到罚款单，而后Caroline和Max又将饭店拥有权归还给Han，算来即使开罚单，对他们也没啥开销。\r\n\r\n【讲解】\r\n\r\nblow n.\r\n\r\n①（用拳头或武器的）重击。如a sharp blow to the stomach对肚子猛的一击。\r\n\r\n②打击；不幸。\r\n\r\n③吹；擤（鼻子）；吹奏（乐器）。a blow on the trumpet吹小号。\r\n\r\n④（在空气清新的地方）散步。\r\n\r\n扩展blow作为动词，blow out 吹灭（突然爆裂；吹胀；突然冒出；烧断）。\r\n\r\n【例句】\r\n\r\nLosing his job was a severe blow to his confidence.\r\n失去工作对他的自信心是个沉重的打击。\r\nShall we go out for a blow?\r\n我们出去散散步怎么样？\r\n\r\n\r\n2.make stuff up\r\n\r\n【原句】What I’m saying is you make stuff up. (S06E02)\r\n【翻译】我是说你有奇思妙想。\r\n【场景】Max在开业仪式泡汤后告诉Caroline关于Randy分手的事情，他们因为各种提规则而彻底的分了，而Caroline听后一旁安慰和鼓励Max，希望她和Randy之间有个好结局。\r\n\r\n【讲解】\r\n\r\nmake sth up编造（借口、故事等）。= to invent something, such as an excuse or a story, often in order to deceive\r\n\r\n如made up an excuse编造借口。\r\n\r\nmake up 和解，言归于好。\r\n\r\n【例句】\r\n\r\nWe often quarrel but we always make it up soon after.\r\n我们常吵架，但总是很快就和好了。\r\nMy dad was always really good at making up stories.\r\n我爸爸一直很善于编故事。', '1.get a blow out for this\r\n\r\n【翻译】幸好我没为此额外花销。\r\n【场景】Caroline他们终于等来自己甜品酒吧店的开业，开业倒计时，门外一位潮流名人跟Earl被允许先进店尝鲜，却被之前的木偶艺人打断了，他得知Caroline他们想用Han的酒水经营证后警告他们会收到罚款单，而后Caroline和Max又将饭店拥有权归还给Han，算来即使开罚单，对他们也没啥开销。\r\n\r\n【讲解】\r\n\r\nblow n.\r\n\r\n①（用拳头或武器的）重击。如a sharp blow to the stomach对肚子猛的一击。\r\n\r\n②打击；不幸。\r\n\r\n③吹；擤（鼻子）；吹奏（乐器）。a blow on the trumpet吹小号。\r\n\r\n④（在空气清新的地方）散步。\r\n\r\n扩展blow作为动词，blow out 吹灭（突然爆裂；吹胀；突然冒出；烧断）。\r\n\r\n【例句】\r\n\r\n失去工作对他的自信心是个沉重的打击。\r\n我们出去散散步怎么样？\r\n\r\n\r\n2.make stuff up\r\n\r\n【翻译】我是说你有奇思妙想。\r\n【场景】Max在开业仪式泡汤后告诉Caroline关于Randy分手的事情，他们因为各种提规则而彻底的分了，而Caroline听后一旁安慰和鼓励Max，希望她和Randy之间有个好结局。\r\n\r\n【讲解】\r\n\r\nmake sth up编造（借口、故事等）。= to invent something, such as an excuse or a story, often in order to deceive\r\n\r\n如made up an excuse编造借口。\r\n\r\nmake up 和解，言归于好。\r\n\r\n【例句】\r\n\r\n我们常吵架，但总是很快就和好了。\r\n我爸爸一直很善于编故事。', '1.get a blow out for this\r\n\r\n【原句】Well, at least I didn’t get a blow out for this.(S06E02)\r\n【场景】Caroline他们终于等来自己甜品酒吧店的开业，开业倒计时，门外一位潮流名人跟Earl被允许先进店尝鲜，却被之前的木偶艺人打断了，他得知Caroline他们想用Han的酒水经营证后警告他们会收到罚款单，而后Caroline和Max又将饭店拥有权归还给Han，算来即使开罚单，对他们也没啥开销。\r\n\r\n【讲解】\r\n\r\nblow n.\r\n\r\n①（用拳头或武器的）重击。如a sharp blow to the stomach对肚子猛的一击。\r\n\r\n②打击；不幸。\r\n\r\n③吹；擤（鼻子）；吹奏（乐器）。a blow on the trumpet吹小号。\r\n\r\n④（在空气清新的地方）散步。\r\n\r\n扩展blow作为动词，blow out 吹灭（突然爆裂；吹胀；突然冒出；烧断）。\r\n\r\n【例句】\r\n\r\nLosing his job was a severe blow to his confidence.\r\nShall we go out for a blow?\r\n\r\n\r\n2.make stuff up\r\n\r\n【原句】What I’m saying is you make stuff up. (S06E02)\r\n【场景】Max在开业仪式泡汤后告诉Caroline关于Randy分手的事情，他们因为各种提规则而彻底的分了，而Caroline听后一旁安慰和鼓励Max，希望她和Randy之间有个好结局。\r\n\r\n【讲解】\r\n\r\nmake sth up编造（借口、故事等）。= to invent something, such as an excuse or a story, often in order to deceive\r\n\r\n如made up an excuse编造借口。\r\n\r\nmake up 和解，言归于好。\r\n\r\n【例句】\r\n\r\nWe often quarrel but we always make it up soon after.\r\nMy dad was always really good at making up stories.\r\n');

-- ----------------------------
-- Table structure for tb_notice
-- ----------------------------
DROP TABLE IF EXISTS `tb_notice`;
CREATE TABLE `tb_notice` (
  `notice_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_id` int(11) DEFAULT NULL,
  `t_id` int(11) DEFAULT NULL,
  `o_id` int(11) DEFAULT NULL,
  `sup_id` int(11) DEFAULT NULL,
  `notice_time` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `notice_date` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `notice_writer` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `title` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `content` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  `status` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`notice_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_notice
-- ----------------------------
INSERT INTO `tb_notice` VALUES ('1', '2', '1', null, null, '8 am', '2020/2/15', '平台管理员', '请尽快选课', '选课在今天11点开始', '未读');

-- ----------------------------
-- Table structure for tb_organization
-- ----------------------------
DROP TABLE IF EXISTS `tb_organization`;
CREATE TABLE `tb_organization` (
  `o_id` int(11) NOT NULL AUTO_INCREMENT,
  `o_account` varchar(45) COLLATE utf8_bin NOT NULL,
  `o_psw` varchar(20) COLLATE utf8_bin NOT NULL,
  `o_name` varchar(20) COLLATE utf8_bin NOT NULL,
  `o_email` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  `o_tel` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `o_title` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `o_desc` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  `o_location` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`o_id`),
  UNIQUE KEY `o_accout_UNIQUE` (`o_account`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_organization
-- ----------------------------
INSERT INTO `tb_organization` VALUES ('1', 'william', 'william', '伟林', 'williamchancwl@163.com', '43214', '新媒体文化', '教育', '广州');
INSERT INTO `tb_organization` VALUES ('2', 'williamcwl', 'williamcwl', '韦林文化', 'williamchancwl@163.com', '15217635717', '新媒体文化', '教育', '上海');

-- ----------------------------
-- Table structure for tb_problem
-- ----------------------------
DROP TABLE IF EXISTS `tb_problem`;
CREATE TABLE `tb_problem` (
  `problem_id` int(11) NOT NULL AUTO_INCREMENT,
  `author` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `question` varchar(5000) COLLATE utf8_bin DEFAULT NULL,
  `result` char(1) COLLATE utf8_bin DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `answerA` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `answerB` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `answerC` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `answerD` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`problem_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_problem
-- ----------------------------
INSERT INTO `tb_problem` VALUES ('1', 'william', 'Social change is more likely to occur in societies where there is a mixture of different kinds of people than in societies where people are similar in many ways. The simple reason for this is that there are more different ways of looking at things present in the first kind of society. There are more ideas, more disagreements in interest, and more groups and organizations with different beliefs. In addition, there is\r\n\r\n　　usually a greater worldly interest and greater tolerance in mixed societies. All these factors tend to promote social change by opening more areas of life to decision. In a society where people are quite similar in many ways, there are fewer occasions for people to see the need or the opportunity for change because everything seems to be the same. And although conditions may not be satisfactory, they are at least customary and undisputed.\r\n\r\n　　Within a society, social change is also likely to occur more frequently and more readily in the material aspects of the culture than in the non-material, for example, in technology rather than in values; in what has been learned later in life rather than what was learned early; in the less basic and less emotional aspects of society than in their opposites; in the simple elements rather than in the complex ones; in form rather than in substance; and in elements that are acceptable to the culture rather than in strange elements.\r\n\r\n　　Furthermore, social change is easier if it is gradual. For example, it comes more readily in human relations on a continuous scale rather than one with sharp dichotomies. This is one reason why change has not come more quickly to Black Americans as compared to other American minorities, because of the sharp difference in appearance between them and their white counterparts.\r\n\r\n　　1.The passage is mainly discussing __________ .', 'B', '2', 'the necessity of social change', 'certain factors that determine the ease with which social changes occur', 'two different societies', 'certain factors that promote social change');
INSERT INTO `tb_problem` VALUES ('2', 'william', '2. ______ is one of the factors that tend to promote social change.', 'B', '2', 'Joint interest', 'Different points of view', 'Less emotional people', 'Advanced technology');
INSERT INTO `tb_problem` VALUES ('3', 'william', '3. According to the passage, which of the following is NOT true?', 'B', '2', 'Social change tends to meet with more difficulty in basic and emotional aspects of society.', 'Disagreement with and argument about conditions tend to slow down social change.', 'Social change is more likely to occur in the material aspect of society.', 'Social change is less likely to occur in what people learned when they were young.');
INSERT INTO `tb_problem` VALUES ('4', 'william', '4. The expression \"greater tolerance\"(paragraph 1) refers to _____ .', 'C', '2', '\"greater willingness to accept social change\"', '\"quicker adaptation to changing circumstances\"', '\"more respect for different beliefs and behavior\"', '\"geeater readiness to agree to different opinions and ideas\"');
INSERT INTO `tb_problem` VALUES ('5', 'william', '5. Social change is less likely to occur in a society where people are quite similar in many ways because ________ .', 'A', '2', 'people there have got so accustomed to their conditions that they seldom think it necessary to change', 'people there have identical needs that can be satisfied without much difficulty', 'people there are easy to please', 'people there are less disputed');

-- ----------------------------
-- Table structure for tb_school
-- ----------------------------
DROP TABLE IF EXISTS `tb_school`;
CREATE TABLE `tb_school` (
  `sch_id` int(11) NOT NULL AUTO_INCREMENT,
  `sch_name` varchar(20) COLLATE utf8_bin NOT NULL,
  `sch_chairman` varchar(20) COLLATE utf8_bin NOT NULL,
  `sch_email` varchar(30) COLLATE utf8_bin NOT NULL,
  `sch_tel` varchar(20) COLLATE utf8_bin NOT NULL,
  `sch_location` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `sch_desc` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`sch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_school
-- ----------------------------
INSERT INTO `tb_school` VALUES ('1', '广东药科大学', '郭姣', 'gdpu@edu.cn', '510006', '广州大学城', '中国四大药科大学之一');

-- ----------------------------
-- Table structure for tb_slide
-- ----------------------------
DROP TABLE IF EXISTS `tb_slide`;
CREATE TABLE `tb_slide` (
  `slide_id` int(11) NOT NULL AUTO_INCREMENT,
  `slide_img` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `slide_title` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `slide_content` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`slide_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_slide
-- ----------------------------
INSERT INTO `tb_slide` VALUES ('1', 'banner-1.jpg', '您的美好未来是我们的使命', ' Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod');
INSERT INTO `tb_slide` VALUES ('2', 'banner-2.jpg', '您的美好未来是我们的使命', ' Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod');
INSERT INTO `tb_slide` VALUES ('3', 'banner-3.jpg', '您的美好未来是我们的使命', ' Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod');

-- ----------------------------
-- Table structure for tb_student
-- ----------------------------
DROP TABLE IF EXISTS `tb_student`;
CREATE TABLE `tb_student` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_account` varchar(20) COLLATE utf8_bin NOT NULL,
  `s_psw` varchar(20) COLLATE utf8_bin NOT NULL,
  `s_name` varchar(20) COLLATE utf8_bin NOT NULL,
  `s_email` varchar(30) COLLATE utf8_bin NOT NULL,
  `s_tel` char(20) COLLATE utf8_bin NOT NULL,
  `s_sex` char(2) COLLATE utf8_bin DEFAULT '男',
  `s_birthday` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `sch_id` int(11) DEFAULT NULL,
  `d_id` int(11) DEFAULT NULL,
  `m_id` int(11) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`s_id`),
  UNIQUE KEY `s_account_UNIQUE` (`s_account`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_student
-- ----------------------------
INSERT INTO `tb_student` VALUES ('1', '1600502213', '1600502213', '张锋文', '1600502213@gdpu.com', '15217635717', '男', '1997-02-07', '1', '1', '1', '1');
INSERT INTO `tb_student` VALUES ('2', '1600502215', '1600502215', '陈伟林', '2587860630@qq.com', '15217637517', '男', '1997-01-21', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for tb_stu_course
-- ----------------------------
DROP TABLE IF EXISTS `tb_stu_course`;
CREATE TABLE `tb_stu_course` (
  `stucourse_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_id` int(11) NOT NULL,
  `c_id` int(11) NOT NULL,
  `t_id` int(11) NOT NULL,
  `grade` float DEFAULT NULL,
  `schedule` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `status` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `c_name` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`stucourse_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_stu_course
-- ----------------------------
INSERT INTO `tb_stu_course` VALUES ('3', '2', '2', '1', '88', '100%', '结课', '摄影');
INSERT INTO `tb_stu_course` VALUES ('4', '2', '3', '1', '80', '100%', '选课', '编程设计入门');
INSERT INTO `tb_stu_course` VALUES ('5', '2', '1', '1', '90', '100%', '选课', 'c语言程序设计');

-- ----------------------------
-- Table structure for tb_stu_task
-- ----------------------------
DROP TABLE IF EXISTS `tb_stu_task`;
CREATE TABLE `tb_stu_task` (
  `stu_task_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_id` int(11) NOT NULL,
  `s_id` int(11) NOT NULL,
  `t_id` int(11) NOT NULL,
  `t_type` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `time` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `title` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `start` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `end` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `content` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  `status` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`stu_task_id`),
  KEY `fk_task_cid` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_stu_task
-- ----------------------------
INSERT INTO `tb_stu_task` VALUES ('1', '1', '2', '1', '作业', '一周', '完成一个教学管理系统', '2020/2/15', '2020/2/28', '完成一个教学管理系统', '未完成');

-- ----------------------------
-- Table structure for tb_stu_train
-- ----------------------------
DROP TABLE IF EXISTS `tb_stu_train`;
CREATE TABLE `tb_stu_train` (
  `stu_train_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_id` int(11) DEFAULT NULL,
  `train_id` int(11) DEFAULT NULL,
  `t_id` int(11) DEFAULT NULL,
  `grade` float DEFAULT NULL,
  `schedule` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `status` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `train_name` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`stu_train_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_stu_train
-- ----------------------------
INSERT INTO `tb_stu_train` VALUES ('1', '2', '1', '1', '85', '已完成', '已交项目', 'JavaEE实训2');

-- ----------------------------
-- Table structure for tb_superuser
-- ----------------------------
DROP TABLE IF EXISTS `tb_superuser`;
CREATE TABLE `tb_superuser` (
  `sup_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '账号',
  `sup_account` varchar(45) COLLATE utf8_bin NOT NULL,
  `sup_psw` varchar(20) COLLATE utf8_bin NOT NULL,
  `sup_name` varchar(20) COLLATE utf8_bin NOT NULL,
  `sup_email` varchar(30) COLLATE utf8_bin NOT NULL,
  `sup_tel` char(15) COLLATE utf8_bin NOT NULL,
  `sup_sex` char(2) COLLATE utf8_bin DEFAULT '男',
  `sup_birthday` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `sup_authority` int(11) DEFAULT NULL,
  PRIMARY KEY (`sup_id`),
  UNIQUE KEY `sup_account_UNIQUE` (`sup_account`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_superuser
-- ----------------------------
INSERT INTO `tb_superuser` VALUES ('1', '1600502215', '1600502215', '陈伟林', '2587860630@qq.com', '15217637517', '男', '1997-01-21', '2');
INSERT INTO `tb_superuser` VALUES ('2', 'william', 'william', 'william', 'williamchancwl@163.com', '15217637517', '男', '1997-01-21', '5');

-- ----------------------------
-- Table structure for tb_teacher
-- ----------------------------
DROP TABLE IF EXISTS `tb_teacher`;
CREATE TABLE `tb_teacher` (
  `t_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_account` varchar(45) COLLATE utf8_bin NOT NULL,
  `t_psw` varchar(20) COLLATE utf8_bin NOT NULL,
  `t_name` varchar(45) COLLATE utf8_bin NOT NULL,
  `t_email` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  `t_tel` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `t_sex` char(2) COLLATE utf8_bin DEFAULT '男',
  `t_title` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `t_img` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `sch_id` int(11) DEFAULT NULL,
  `d_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`t_id`),
  UNIQUE KEY `t_accout_UNIQUE` (`t_account`),
  KEY `fk_deptid` (`sch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_teacher
-- ----------------------------
INSERT INTO `tb_teacher` VALUES ('1', '1001', '1001', 'Jacke Masito', '1001@edu.cn', '510006', '男', '教授', 'teacher-1.jpg', '1', '1');
INSERT INTO `tb_teacher` VALUES ('2', '1002', '1002', 'Clark Malik', '1002@163.com', '15217635717', '男', '副教授', 'teacher-2.jpg', '1', '1');
INSERT INTO `tb_teacher` VALUES ('3', '1003', '1003', 'John Doe', '1003@163.com', '510006', '男', '副教授', 'teacher-3.jpg', '1', '1');
INSERT INTO `tb_teacher` VALUES ('4', '1004', '1004', 'Alex Rook', '1003@163.com', '510006', '男', '讲师', 'teacher-1.jpg', '1', '1');
INSERT INTO `tb_teacher` VALUES ('5', '1005', '1005', 'Din Martin', '1003@163.com', '510006', '男', '讲师', 'teacher-2.jpg', '1', '1');
INSERT INTO `tb_teacher` VALUES ('6', '1006', '1006', 'Raka Jim', '1003@163.com', '510006', '男', '讲师', 'teacher-3.jpg', '1', '1');
INSERT INTO `tb_teacher` VALUES ('7', '1007', '1007', 'Devid Luis', '1003@163.com', '510006', '男', '讲师', 'teacher-3.jpg', '1', '1');
INSERT INTO `tb_teacher` VALUES ('8', '1008', '1008', 'Zim Cook', '1008@163.com', '510007', '男', '讲师', 'teacher-2.jpg', '1', '1');
INSERT INTO `tb_teacher` VALUES ('9', '1009', '1009', 'Duis Riu', '1009@163.com', '510009', '男', '教授', 'teacher-3.jpg', '1', '1');
INSERT INTO `tb_teacher` VALUES ('10', '1010', '1010', 'Duis Riu', '1010@163.com', '510010', '男', '副教授', 'teacher-1.jpg', '1', '1');
INSERT INTO `tb_teacher` VALUES ('11', '1011', '1011', 'Duis Riu', '1011@163.com', '510011', '男', '讲师', 'teacher-2.jpg', '1', '1');

-- ----------------------------
-- Table structure for tb_train
-- ----------------------------
DROP TABLE IF EXISTS `tb_train`;
CREATE TABLE `tb_train` (
  `train_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_id` int(11) DEFAULT NULL,
  `t_id` int(11) DEFAULT NULL,
  `o_id` int(11) DEFAULT NULL,
  `time` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `start` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `end` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `title` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `content` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  `status` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`train_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_train
-- ----------------------------
INSERT INTO `tb_train` VALUES ('1', '2', '1', null, '20天', '2020/1/15', '2020/2/15', '商务日常用语', '1. 商务用语 2. 商务情景表达 3. 职场交流', '已完成');
