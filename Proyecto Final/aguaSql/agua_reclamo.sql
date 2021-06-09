-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: agua
-- ------------------------------------------------------
-- Server version	5.7.29-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `reclamo`
--

DROP TABLE IF EXISTS `reclamo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reclamo` (
  `IdReclamo` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(250) NOT NULL,
  `fechaHoraReclamo` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `IaFactura` longblob NOT NULL,
  `fechaHoraRevision` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `IdClientefk` int(11) NOT NULL,
  `idtrfk` int(11) NOT NULL,
  `idServicio_Al_Clientefk` int(11) DEFAULT NULL,
  PRIMARY KEY (`IdReclamo`),
  KEY `IdClientefk` (`IdClientefk`),
  KEY `idtrfk` (`idtrfk`),
  KEY `reclamo_ibfk_3` (`idServicio_Al_Clientefk`),
  CONSTRAINT `reclamo_ibfk_1` FOREIGN KEY (`IdClientefk`) REFERENCES `usuario` (`IdCliente`),
  CONSTRAINT `reclamo_ibfk_2` FOREIGN KEY (`idtrfk`) REFERENCES `tipo_reclamo` (`idtr`),
  CONSTRAINT `reclamo_ibfk_3` FOREIGN KEY (`idServicio_Al_Clientefk`) REFERENCES `funcionario` (`idServicio_Al_Cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reclamo`
--

LOCK TABLES `reclamo` WRITE;
/*!40000 ALTER TABLE `reclamo` DISABLE KEYS */;
INSERT INTO `reclamo` VALUES (4,'Test','2021-05-31 16:41:46',_binary 'null','2021-05-31 11:41:46',1,2,1),(5,'Recibi mala atencion cuando venian a soluconar el prblema de agua en el sector','2021-06-03 16:02:41',_binary 'null','2021-06-03 11:02:41',1,3,1),(6,'Sigue presentando prblemas de fuga de agua en el sector','2021-06-03 16:04:17',_binary 'null','2021-06-03 11:04:17',1,4,1);
/*!40000 ALTER TABLE `reclamo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-03 16:11:50
