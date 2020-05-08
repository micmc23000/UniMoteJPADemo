CREATE DATABASE  IF NOT EXISTS `unimote1` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `unimote1`;
-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: unimote1
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `masterremote`
--

DROP TABLE IF EXISTS `masterremote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `masterremote` (
  `keyID` int NOT NULL,
  `keyName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`keyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `masterremote`
--

LOCK TABLES `masterremote` WRITE;
/*!40000 ALTER TABLE `masterremote` DISABLE KEYS */;
INSERT INTO `masterremote` VALUES (1,'KEY_0'),(2,'KEY_1'),(3,'KEY_2'),(4,'KEY_3'),(5,'KEY_4'),(6,'KEY_5'),(7,'KEY_6'),(8,'KEY_7'),(9,'KEY_8'),(10,'KEY_9'),(11,'KEY_UP'),(12,'KEY_DOWN'),(13,'KEY_LEFT'),(14,'KEY_RIGHT'),(15,'KEY_RED'),(16,'KEY_GREEN'),(17,'KEY_BLUE'),(18,'KEY_YELLOW'),(19,'KEY_END'),(20,'KEY_PAGEUP'),(21,'KEY_PAGEDOWN'),(22,'KEY_REWIND'),(23,'KEY_FASTFORWARD'),(24,'KEY_NEXT'),(25,'KEY_PREVIOUS'),(26,'KEY_MUTE'),(27,'KEY_CHANNELDOWN'),(28,'KEY_CHANNELUP'),(29,'KEY_OK'),(30,'KEY_MENU'),(31,'KEY_INFO'),(32,'KEY_PAUSE'),(33,'KEY_PLAY'),(34,'KEY_PLAYPAUSE'),(35,'KEY_RECORD'),(36,'KEY_VOLUMEUP'),(37,'KEY_VOLUMEDOWN'),(38,'KEY_POWER'),(39,'KEY_STOP'),(40,'KEY_F11vo_fullscreen'),(41,'TBD_AUDIO_DELAY_UP'),(42,'TBD_AUDIO_DELAY_DOWN'),(43,'KEY_CLEAR'),(44,'KEY_ENTER'),(45,'KEY_DELETE'),(46,'KEY_EPG'),(47,'KEY_CYCLEWINDOWS'),(48,'KEY_TUNER'),(49,'TBD_CYCLE_COLOR_CTRL'),(50,'TBD_NEXT_FAVO_CHAN'),(51,'TBD_TOGGLE_FAVO_STATUS'),(52,'TBD_INCREASE_SPEED'),(53,'TBD_DECREASE_SPEED'),(54,'X_TBD'),(55,'TBD_NUMERIC_POUND'),(56,'TBD_NUMERICSTAR'),(57,'KEY_BACK'),(58,'KEY_TV'),(59,'KEY_HOME'),(60,'KEY_NUMERIC_STAR'),(61,'KEY_NUMERIC_POUND'),(62,'X_WTF'),(63,'esac'),(64,'KEY_${1^*}'),(65,'KEY_EXIT'),(66,'KEY_LEF'),(67,'KEY_KPASTERISK'),(68,'KEY_AUDIO'),(69,'KEY_BACKSPACE'),(70,'KEY_CANCEL'),(71,'KEY_CD'),(72,'KEY_CLOSE'),(73,'KEY_DVD'),(74,'KEY_EMAIL'),(75,'KEY_EJECTCD'),(76,'KEY_ESC'),(77,'KEY_RADIO'),(78,'KEY_DIRECTORY'),(79,'KEY_FORWARD'),(80,'KEY_HELP'),(81,'KEY_LANGUAGE'),(82,'KEY_LIST'),(83,'KEY_MAX'),(84,'KEY_KPMINUS'),(85,'KEY_MODE'),(86,'KEY_MP3'),(87,'X_KEY_ONDEMAND'),(88,'KEY_OPTIONS'),(89,'KEY_PHONE'),(90,'KEY_PC'),(91,'X_KEY_PLAYMODE'),(92,'X_KEY_PLAYLIST'),(93,'KEY_QUIT'),(94,'KEY_AGAIN'),(95,'KEY_SELECT'),(96,'KEY_SETUP'),(97,'KEY_SLEEP'),(98,'KEY_SLOW'),(99,'KEY_SPACE'),(100,'KEY_SUBTITLE'),(101,'KEY_TAB'),(102,'KEY_TEXT'),(103,'KEY_TIME'),(104,'KEY_TITLE'),(105,'KEY_VCR'),(106,'KEY_VIDEO'),(107,'KEY_WWW'),(108,'KEY_ZOOM'),(109,'KEY_ZOOMIN'),(110,'KEY_ZOOMOUT'),(111,'KEY_KPPLUS'),(112,'KEY_DOT');
/*!40000 ALTER TABLE `masterremote` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `remote`
--

DROP TABLE IF EXISTS `remote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `remote` (
  `keyNumber` int NOT NULL,
  `keyName` varchar(45) DEFAULT NULL,
  `irCode` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`keyNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `remote`
--

LOCK TABLES `remote` WRITE;
/*!40000 ALTER TABLE `remote` DISABLE KEYS */;
/*!40000 ALTER TABLE `remote` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usercommand`
--

DROP TABLE IF EXISTS `usercommand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usercommand` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `IRCode` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Name_UNIQUE` (`Name`),
  UNIQUE KEY `Description_UNIQUE` (`Description`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usercommand`
--

LOCK TABLES `usercommand` WRITE;
/*!40000 ALTER TABLE `usercommand` DISABLE KEYS */;
/*!40000 ALTER TABLE `usercommand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'unimote1'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-08 18:16:49
