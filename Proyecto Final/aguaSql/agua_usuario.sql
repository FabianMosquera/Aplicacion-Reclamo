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
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `IdCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nombreCliente1` varchar(40) NOT NULL,
  `nombreCliente2` varchar(40) DEFAULT NULL,
  `apellidoCliente1` varchar(40) NOT NULL,
  `apellidoCliente2` varchar(40) DEFAULT NULL,
  `tipoIdentificacion` varchar(40) NOT NULL,
  `numeroIdentificacion` int(11) NOT NULL,
  `telefono1` int(11) NOT NULL,
  `telefono2` int(11) DEFAULT NULL,
  `correo` varchar(40) NOT NULL,
  `ciudad` int(11) NOT NULL,
  `direccionResidencia` varchar(40) NOT NULL,
  PRIMARY KEY (`IdCliente`),
  KEY `ciudad` (`ciudad`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`ciudad`) REFERENCES `ciudad` (`IdCiudad`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Ricky ','Fabian','Mosquera','Quintero','Cedula',11334422,3224141,33311242,'ricky@',1,'cra25#'),(2,'Juan','Sebastian','Gomez','Rodriguez','Pasaporte',224455,331144,4433222,'Juan@',1,'cra1#'),(3,'Alejandro','','Rusca','Rodriguez','Pasaporte',224455,876432,334455,'Alejandro@',4,'cra2#'),(4,'Santiago','','Peña','Mosquera','Tarjeta identidad',98687,64322,6432234,'santiago@',4,'cra3#'),(5,'Andres','Felipe','Rodriguez','','DNI',9876546,12345,23464,'andres@',8,'cra4#');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-03 16:11:51
