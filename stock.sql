-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Apr 05, 2025 at 09:42 AM
-- Server version: 8.0.36
-- PHP Version: 8.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stock`
--

-- --------------------------------------------------------

--
-- Table structure for table `appuser`
--

DROP TABLE IF EXISTS `appuser`;
CREATE TABLE IF NOT EXISTS `appuser` (
  `appuser_pk` int NOT NULL AUTO_INCREMENT,
  `userRole` varchar(50) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `mobileNumber` varchar(50) DEFAULT NULL,
  `username` varchar(200) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`appuser_pk`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `appuser`
--

INSERT INTO `appuser` (`appuser_pk`, `userRole`, `name`, `mobileNumber`, `username`, `password`, `address`, `status`) VALUES
(1, 'Manager', 'Thahirah', '0762590668', 'Manager', 'manager@123', 'Colombo', 'Active'),
(2, 'Cashier', 'Thaiba', '0779557057', 'Cashier', 'cashier@123', 'Kandy', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `category_pk` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`category_pk`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`category_pk`, `name`) VALUES
(1, 'Hair Care'),
(2, 'Skin Care'),
(3, 'Makeup'),
(4, 'Fragrance'),
(5, 'Face Care');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `product_pk` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `price` int DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `category_fk` int DEFAULT NULL,
  PRIMARY KEY (`product_pk`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`product_pk`, `name`, `quantity`, `price`, `description`, `category_fk`) VALUES
(1, 'Dove Cool Moisture Shampoo', 35, 2500, 'Moisturizing shampoo formulated with Nutritive Serum', 1),
(2, 'Vaseline Body Lotion', 30, 2300, 'Intensive Care Aloe Soothe Body Lotion', 2),
(3, 'Seren London Lipstick', 15, 1400, 'Vegan Shine/Matte Lipstick', 3),
(4, 'AVON Today Eau De Toilette', 10, 14700, 'AVON Perfume', 4),
(5, 'Vitamin C Facial Wipes', 20, 1500, 'Cleansing and Moisturising Facial Wipes ', 5),
(6, 'Vatika Shampoo', 30, 1900, 'Cactus & Gergir Hair Fall Control Shampoo', 1),
(7, 'Lynx Body Wash', 20, 2600, 'Black 8h Refreshing Fragrance Body Wash', 2),
(8, 'Seren London Mascara', 30, 1500, 'Volumizing Lift & Curl Mascara', 3),
(9, 'Victoria\'s Secret Fragrance', 20, 10500, 'Pure Seduction Fragrance Mist', 4),
(10, 'Estelin Niacinamide Fade Sport Face Wash', 10, 3000, 'Whitens & Purifies Skin', 5),
(11, 'L\'Oréal Elvive Shampoo', 20, 3400, 'L\'Oréal Elvive Full Restore 5 Shampoo 400ml', 1),
(12, 'Johnson\'s Body Wash', 35, 2800, 'Johnson\'s Softening & Nourishing Body Wash With Almond Oil & Jasmine Aroma 750ml', 2),
(13, 'Seren London Gel Nail Polish', 30, 2000, 'Chip Free and up to 3 weeks of high shine professional finish', 3),
(14, 'Calvin Klein Eau de Parfum Spray', 5, 34950, 'Calvin Klein Eternity for Women Eau de Parfum Spray 100ml', 4),
(15, 'Iris Garden', 25, 1400, 'Iris Garden Revive The Refreshing Face Wash 100ml', 5),
(17, 'Nail Polish', 10, 1000, 'Nail', 3);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
