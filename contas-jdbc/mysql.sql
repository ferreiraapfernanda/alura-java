CREATE TABLE `Conta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `agencia` varchar(255) DEFAULT NULL,
  `banco` varchar(255) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `titular` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;