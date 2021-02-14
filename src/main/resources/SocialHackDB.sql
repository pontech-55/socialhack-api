-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: socialhack
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `centros`
--

DROP TABLE IF EXISTS `centros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `centros` (
  `ID` varchar(50) NOT NULL,
  `NOME` varchar(50) DEFAULT NULL,
  `DIRECCION` varchar(255) DEFAULT NULL,
  `CONCELLO` varchar(50) DEFAULT NULL,
  `CP` varchar(10) DEFAULT NULL,
  `TELEFONO` varchar(10) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `TIPO` varchar(50) DEFAULT NULL,
  `NOME_ENTIDADE` varchar(255) DEFAULT NULL,
  `ENT_ANIMO_LUCRO` tinyint(1) DEFAULT NULL,
  `ACTIVIDAD` varchar(50) DEFAULT NULL,
  `WEB` varchar(100) DEFAULT NULL,
  `DESCRIPCION` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `centros`
--

LOCK TABLES `centros` WRITE;
/*!40000 ALTER TABLE `centros` DISABLE KEYS */;
INSERT INTO `centros` VALUES ('0_95','CENTRO DE DIA DE ALZHEIMER DE VIGO','AVDA. BEIRAMAR,NUM 51','VIGO','36202.0','986296951','dir.cdbeiramar@afaga.com','MAIORES','XUNTA DE GALICIA',0,'CENTRO DE DÍA, ALZHEIMER','https://afaga.com/','En  Afaga Alzheimer temos un obxectivo: ser unha entidade profesionalizada e independente que mellore a calidade de vida das persoas con demencia e dos seus familiares, que busque e ofreza especialización e innovación e, por suposto, que promova, a investigación. Queremos un futuro mellor para as persoas que teñen enfermidades  neurodegenerativas e ti podes axudarnos a construílo.'),('1083_4','ALBERGUE DIGNIDAD','RUA TOLEDO 9 BAIXO','VIGO','36205.0','662428239','dignidadferrol@hotmail.com','INCLUSION','ASOCIACION DIGNIDAD - GALICIA',0,'ALBERGUE','https://www.arela.org/','A Asociación ARELA ten como misión o desenvolvemento integral da infancia e da mocidade de Galicia, en risco de exclusión, en situación de desprotección ou en conflito social, fomentando iniciativas de intervención e prevención nestas situacións, de calidade e normalizadoras, cun compromiso continuo pola xustiza social, a través da implicación das persoas que a constitúen.'),('115_3','CENTRO DE DIA NOSA SEÑORA DAS DORES','RUA ANTONIA FERRÍN MOREIRAS, Nº 17','LALÍN','36500.0','986781897','direccion@residenciadasdores.es, info@residenciadasdores.es','MAIORES','ASOCIACION PROTECCION ANCIÁNS DE LALIN E A SÚA COMARCA',0,'CENTRO DE DÍA','https://asdoresresidencia.es/','O noso centro conta con uns servizos destinados a mellorar a calidade de vida das persoas maiores. Contamos con prazas concertadas coa Xunta de Galicia e prazas privadas.'),('23_6','CENTRO DE DIA CRUZ ROJA ESPAÑOLA PONTEVEDRA','CRUZ VERMELLA 26','PONTEVEDRA','36002.0','986852115','pontevedra@cruzroja.es','MAIORES','CRUZ ROJA ESPAÑOLA',0,'CENTRO DE DÍA','https://www.cruzvermella.org/sede/alberguevilagarcia/','Centro de día dirigido a personas mayores con alguna limitación o con autonomía reducida. Prestamos servicios de fisioterapia, actividades de orientación, ocio y tiempo libre. El centro cuenta con salas de rehabilitación y terapia, sala de actividades, comedor, baños y duchas geriátricas y transporte adaptado.'),('4168_6','CASA DE FAMILIA ARELA ATLANTIDA','AVDA ATLANTIDA, 98 7º D','VIGO','36208.0','986241986','atlantida@arela.org','MENORES','ASOCIACION ARELA',0,'CENTRO RESIDENCIAL','http://www.dignidadgalicia.org/','Somos una Asociación que trabaja para recuperar la dignidad que toda persona tiene desde su origen y que, por diferentes circunstancias sociales, culturales, laborales, políticas, religiosas, etc., se le arrebató en menor o mayor medida.'),('47_2','CENTRO OCUPACIONAL ASPANAEX','MAESTROS GOLDAR, 18','VIGO','36213.0','986208395','direccion@aspanaex.org','DISCAPACIDADE','ASOCIACION A FAVOR DE LAS PERSONAS CON DISCAPACIDAD INTELECTUAL DE LA PROVINCIA DE PONTEVEDRA',0,'CENTRO OCUPACIONAL','https://www.sanxerome.com/','La Asociación San Xerome Emiliani de A Guarda (Pontevedra) es una organización sin ánimo de lucro promovida por madres, padres, familiares y amigos/as de personas con diversidad intelectual, que facilita a dicho colectivo y a sus familias apoyos y servicios profesionalizados que favorezcan su crecimiento personal, integración socio-laboral, igualdad de oportunidades, desarrollo comunitario e inclusión.'),('64_1','CENTRO OCUPACIONAL-PRELABORAL SAN XEROME EMILIANI','RÚA GALICIA, 23','GUARDA (A)','36780.0','986613719','administracion@sanxerome.com','DISCAPACIDADE','ASOCIACION SAN XEROME EMILIANI',0,'CENTRO OCUPACIONAL','https://www.sanxerome.com/','La Asociación San Xerome Emiliani de A Guarda (Pontevedra) es una organización sin ánimo de lucro promovida por madres, padres, familiares y amigos/as de personas con diversidad intelectual, que facilita a dicho colectivo y a sus familias apoyos y servicios profesionalizados que favorezcan su crecimiento personal, integración socio-laboral, igualdad de oportunidades, desarrollo comunitario e inclusión.'),('64_2','CENTRO DE DÍA SAN XEROME EMILIANI','RÚA GALICIA, 23','GUARDA (A)','36780.0','986613719','administracion@sanxerome.com','DISCAPACIDADE','ASOCIACION SAN XEROME EMILIANI',0,'CENTRO DE DÍA','http://www.apamp.org/','La misión de APAMP es contribuir al desarrollo del proyecto de  vida de cada persona con parálisis cerebral o afín, prestando los apoyos necesarios, y facilitando oportunidades para que pueda tomar sus propias decisiones y participar activamente en la sociedad.'),('6650_1','CENTRO DE DIA BO LAR','RUA CONDE DE TORRECEDEIRA, Nº 12 BAJO B','VIGO','36202.0','886118170','bolar@bolar.es','MAIORES','BOLAR ASISTENCIA, S.L.',1,'CENTRO DE DÍA','https://www.bolar.es/','Bo-Lar somos un espacio dinámico de atención diurna en el que atendemos las necesidades básicas, personales, terapéuticas y socioculturales de nuestros mayores, promoviendo la motivación, participación y autoestima de manera individualizada para mejorar sus habilidades físicas y cognitivas.');
/*!40000 ALTER TABLE `centros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donaciones`
--

DROP TABLE IF EXISTS `donaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donaciones` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `ID_CENTROS` varchar(50) DEFAULT NULL,
  `LOCALIDAD` varchar(50) DEFAULT NULL,
  `ITEM` varchar(30) DEFAULT NULL,
  `DESCRIPCION` varchar(1000) DEFAULT NULL,
  `URGENCIA` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_centros_donacion` (`ID_CENTROS`),
  CONSTRAINT `fk_centros_donacion` FOREIGN KEY (`ID_CENTROS`) REFERENCES `centros` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donaciones`
--

LOCK TABLES `donaciones` WRITE;
/*!40000 ALTER TABLE `donaciones` DISABLE KEYS */;
INSERT INTO `donaciones` VALUES (6,'4168_6','Vigo','Material Escolar','Libretas, bolígrafos, lapis de cores...','Media'),(7,'1083_4','Vigo','Mantas','Mantiñas calentiñas para o invierno','Alta'),(8,'64_2','GUARDA (A)','Instrumentos','Precisamos instrumentos para o noso grupo de XeRock!','Baixa');
/*!40000 ALTER TABLE `donaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `NOME` varchar(50) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `ISENTITY` tinyint(1) DEFAULT NULL,
  `PASSWORD` blob,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `voluntariado`
--

DROP TABLE IF EXISTS `voluntariado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `voluntariado` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `ID_CENTROS` varchar(50) DEFAULT NULL,
  `TITULO` varchar(50) DEFAULT NULL,
  `DURACION` varchar(100) DEFAULT NULL,
  `URGENCIA` varchar(10) DEFAULT NULL,
  `LOCALIDAD` varchar(100) DEFAULT NULL,
  `DESCRIPCION` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_centros` (`ID_CENTROS`),
  CONSTRAINT `fk_centros` FOREIGN KEY (`ID_CENTROS`) REFERENCES `centros` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `voluntariado`
--

LOCK TABLES `voluntariado` WRITE;
/*!40000 ALTER TABLE `voluntariado` DISABLE KEYS */;
INSERT INTO `voluntariado` VALUES (4,'23_6','Dinamizador de Actividades','1.5 horas/semana','Baixa','Pontevedra','Descripcion: Bailes, talleres de memoria, grupo de costura e manualidades… Cruz Vermella orgaliza todas estas actividades para os nosos maiores. Coa axuda do equipo, organizarás e conducirás actividades de grupo. Non te preocupes se non tes experiencia, nós axudaremoste con todo proporcionandote material, tecnoloxías, e toda a información que precises! Tes algunha outra suxerencia de actividade? Vén e compártea!'),(5,'64_2','Dinamizador de Actividades - Xardineria','2.0 horas/semana','Media','GUARDA (A)','Voluntariado no Viveiro do San Xerome. Un gustazo ! Se estás aburrid@ na casa, súmate que fas moita falta. Á parte de axudar aos demais, crecerá o teu xardín interior'),(6,'4168_6','Charlas Divulgativas en Colexios','Esporádico en horario de mañana','Baixa','Vigo','Precisamos a alguén con disponibilidade de mañás para dar charlas divulgativas para os alumnos de 2ºe 4º de ESO, cun claro obxectivo preventivo das condutas infractoras máis salientables nos adolescentes, facendo especial fincapé no acoso escolar, as redes sociais, o maltrato familiar… e en todos aqueles temas e situacións que viven de preto os adolescentes, explicando as consecuencias legais e a responsabilidade dos menores nestas. Temos o material preparado, e axudarémoste con todo o que precises!');
/*!40000 ALTER TABLE `voluntariado` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-14  2:46:47
