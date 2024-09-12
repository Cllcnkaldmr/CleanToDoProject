CREATE DATABASE  IF NOT EXISTS `to_do_list`;
USE `to_do_list`;
DROP TABLE IF EXISTS todo;
--
-- Table structure for table `todo`
--
CREATE TABLE `todo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `task` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


INSERT INTO `to_do_list`.`todo` (`id`, `task`, `details`) VALUES ('1', 'Study', 'Please complete studying Vue :(');
