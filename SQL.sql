CREATE DATABASE  IF NOT EXISTS `travels` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `travels`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: travels
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `aviao`
--

DROP TABLE IF EXISTS `aviao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aviao` (
  `id` int NOT NULL AUTO_INCREMENT,
  `marca` varchar(30) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `totpoltrona` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aviao`
--

LOCK TABLES `aviao` WRITE;
/*!40000 ALTER TABLE `aviao` DISABLE KEYS */;
/*!40000 ALTER TABLE `aviao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cpf` varchar(14) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `telefone` varchar(16) NOT NULL,
  `email` varchar(40) NOT NULL,
  `cep` varchar(9) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpf` (`cpf`),
  UNIQUE KEY `telefone` (`telefone`),
  UNIQUE KEY `email` (`email`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'111.222.333-44','Flavin','(41) 9 0022-8922','flavindopneu@gmail.com','88888-132'),(2,'765.456.987-90','Shaolin','(41) 9 3245-1090','shaolinmatadordeporco@gmail.com','88132-132'),(4,'105.792.937-50','Mario','(41) 9 9875-1110','aquelemario@gmail.com','88999-132');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passagem`
--

DROP TABLE IF EXISTS `passagem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passagem` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fk_id_cliente` int DEFAULT NULL,
  `dia` int NOT NULL,
  `mes` int NOT NULL,
  `ano` int NOT NULL,
  `horario` decimal(10,0) NOT NULL,
  `destino` varchar(40) NOT NULL,
  `partida` varchar(40) NOT NULL,
  `chegada` varchar(40) NOT NULL,
  `valor` decimal(10,0) NOT NULL,
  `desconto` decimal(10,0) NOT NULL,
  `poltrona` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `poltrona` (`poltrona`),
  KEY `fk_id_cliente` (`fk_id_cliente`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passagem`
--

LOCK TABLES `passagem` WRITE;
/*!40000 ALTER TABLE `passagem` DISABLE KEYS */;
INSERT INTO `passagem` VALUES (2,NULL,10,2,2023,15,'Moldávia','Paraná','Aeroporto desconhecido',1200,10,10);
/*!40000 ALTER TABLE `passagem` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-05 22:30:25
