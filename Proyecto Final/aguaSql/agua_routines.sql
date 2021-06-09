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
-- Temporary view structure for view `consultarfuncionariotiporeclamo`
--

DROP TABLE IF EXISTS `consultarfuncionariotiporeclamo`;
/*!50001 DROP VIEW IF EXISTS `consultarfuncionariotiporeclamo`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `consultarfuncionariotiporeclamo` AS SELECT 
 1 AS `nombreFuncionario1`,
 1 AS `nombreTipo`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `consultarfuncionariotiporeclamo`
--

/*!50001 DROP VIEW IF EXISTS `consultarfuncionariotiporeclamo`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `consultarfuncionariotiporeclamo` AS select `f`.`nombreFuncionario1` AS `nombreFuncionario1`,`tr`.`nombreTipo` AS `nombreTipo` from ((`funcionario` `f` join `reclamo` `r`) join `tipo_reclamo` `tr`) where ((`f`.`idServicio_Al_Cliente` = `r`.`idServicio_Al_Clientefk`) and (`r`.`IdReclamo` = `tr`.`idtr`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Dumping routines for database 'agua'
--
/*!50003 DROP PROCEDURE IF EXISTS `updateFuncionario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `updateFuncionario`(in f_idServicio_Al_Cliente int, in f_nombreFuncionario1 VARCHAR(30), 
in f_nombreFuncionario2 VARCHAR(30), in f_apellidoFuncionario1 VARCHAR(30), in f_apellidoFuncionario2 VARCHAR(30), 
in f_telefonoSC VARCHAR(20), in f_correoSC VARCHAR(20))
BEGIN
update funcionario
set 
nombreFuncionario1= f_nombreFuncionario1,
nombreFuncionario2= f_nombreFuncionario2, 
apellidoFuncionario1= f_apellidoFuncionario1,
apellidoFuncionario2= f_apellidoFuncionario2,
telefonoSC = f_telefonoSC,
correoSC = f_correoSC
where
idServicio_Al_Cliente = f_idServicio_Al_Cliente;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-03 16:11:52
