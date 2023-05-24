-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.1.52-community - MySQL Community Server (GPL)
-- Server OS:                    Win32
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for grand_mobile
DROP DATABASE IF EXISTS `grand_mobile`;
CREATE DATABASE IF NOT EXISTS `grand_mobile` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `grand_mobile`;

-- Dumping structure for table grand_mobile.company
DROP TABLE IF EXISTS `company`;
CREATE TABLE IF NOT EXISTS `company` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `telephone` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table grand_mobile.company: ~2 rows (approximately)
DELETE FROM `company`;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` (`id`, `name`, `telephone`) VALUES
	(1, 'fgdg', '145425424'),
	(2, 'dfgsfg', '456786');
/*!40000 ALTER TABLE `company` ENABLE KEYS */;

-- Dumping structure for table grand_mobile.customer
DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `c_id` varchar(20) NOT NULL,
  `f_name` varchar(45) DEFAULT NULL,
  `l_name` varchar(45) DEFAULT NULL,
  `mobile` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table grand_mobile.customer: ~4 rows (approximately)
DELETE FROM `customer`;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`c_id`, `f_name`, `l_name`, `mobile`) VALUES
	('01', 'sgsdgh', 'dsds', '7545'),
	('C002', 'ishara', 'madusanka', '0721245785'),
	('C003', 'ddd', 'sssss', '0712944854'),
	('C004', 'kkkk', 'llll', '0710164681');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;

-- Dumping structure for table grand_mobile.grn
DROP TABLE IF EXISTS `grn`;
CREATE TABLE IF NOT EXISTS `grn` (
  `grn_id` varchar(20) NOT NULL,
  `date` varchar(20) DEFAULT NULL,
  `supplier_sup_id` varchar(20) DEFAULT NULL,
  `stock_st_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`grn_id`),
  KEY `supplier_sup_id` (`supplier_sup_id`),
  KEY `stock_st_idg` (`stock_st_id`),
  CONSTRAINT `stock_st_idg` FOREIGN KEY (`stock_st_id`) REFERENCES `stock` (`st_id`),
  CONSTRAINT `supplier_sup_id` FOREIGN KEY (`supplier_sup_id`) REFERENCES `supplier` (`sup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table grand_mobile.grn: ~9 rows (approximately)
DELETE FROM `grn`;
/*!40000 ALTER TABLE `grn` DISABLE KEYS */;
INSERT INTO `grn` (`grn_id`, `date`, `supplier_sup_id`, `stock_st_id`) VALUES
	('G001', '2019-06-28', 'sub001', NULL),
	('G002', '2019-07-11', 'sub001', NULL),
	('G003', '2019-07-11', 'sub001', NULL),
	('G004', '2019-07-11', 'sub001', NULL),
	('G005', '2019-07-11', 'sub001', NULL),
	('G006', '2019-07-11', 'sub001', NULL),
	('G007', '2019-07-11', 'sub001', NULL),
	('G008', '2019-07-11', 'sub001', NULL),
	('G009', '2019-07-12', 'sub001', NULL);
/*!40000 ALTER TABLE `grn` ENABLE KEYS */;

-- Dumping structure for table grand_mobile.grn_item
DROP TABLE IF EXISTS `grn_item`;
CREATE TABLE IF NOT EXISTS `grn_item` (
  `grn_item_id` int(11) NOT NULL AUTO_INCREMENT,
  `QTY` int(11) DEFAULT NULL,
  `buying_price` varchar(50) DEFAULT NULL,
  `grn_grn_id` varchar(20) DEFAULT NULL,
  `product_p_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`grn_item_id`),
  KEY `grn_grn_idgg` (`grn_grn_id`),
  KEY `product_p_idgg` (`product_p_id`),
  CONSTRAINT `grn_grn_idgg` FOREIGN KEY (`grn_grn_id`) REFERENCES `grn` (`grn_id`),
  CONSTRAINT `product_p_idgg` FOREIGN KEY (`product_p_id`) REFERENCES `product` (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=88 DEFAULT CHARSET=latin1;

-- Dumping data for table grand_mobile.grn_item: ~19 rows (approximately)
DELETE FROM `grn_item`;
/*!40000 ALTER TABLE `grn_item` DISABLE KEYS */;
INSERT INTO `grn_item` (`grn_item_id`, `QTY`, `buying_price`, `grn_grn_id`, `product_p_id`) VALUES
	(69, 3, '35000', 'G001', 'P001'),
	(70, 2, '25000', 'G001', 'P002'),
	(71, 10, '35000', 'G002', 'P001'),
	(72, 8, '25000', 'G002', 'P002'),
	(73, 5, '15000', 'G002', 'P003'),
	(74, 3, '35000', 'G003', 'P001'),
	(75, 5, '25000', 'G004', 'P002'),
	(76, 2, '35000', 'G005', 'P001'),
	(77, 3, '25000', 'G006', 'P002'),
	(78, 5, '35000', 'G007', 'P001'),
	(79, 5, '38000', 'G007', 'P004'),
	(80, 5, '25000', 'G007', 'P002'),
	(81, 7, '15000', 'G007', 'P003'),
	(82, 2, '35000', 'G008', 'P001'),
	(83, 1, '25000', 'G008', 'P002'),
	(84, 3, '15000', 'G008', 'P003'),
	(85, 5, '38000', 'G008', 'P004'),
	(86, 5, '35000', 'G009', 'P001'),
	(87, 5, '25000', 'G009', 'P002');
/*!40000 ALTER TABLE `grn_item` ENABLE KEYS */;

-- Dumping structure for table grand_mobile.invoice
DROP TABLE IF EXISTS `invoice`;
CREATE TABLE IF NOT EXISTS `invoice` (
  `inv_id` varchar(20) NOT NULL,
  `date` varchar(20) DEFAULT NULL,
  `custormer_c_idi` varchar(20) DEFAULT NULL,
  `stock_st_idi` int(11) DEFAULT NULL,
  PRIMARY KEY (`inv_id`),
  KEY `custormer_c_idi` (`custormer_c_idi`),
  KEY `stock_st_idi` (`stock_st_idi`),
  CONSTRAINT `custormer_c_idi` FOREIGN KEY (`custormer_c_idi`) REFERENCES `customer` (`c_id`),
  CONSTRAINT `stock_st_idi` FOREIGN KEY (`stock_st_idi`) REFERENCES `stock` (`st_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table grand_mobile.invoice: ~10 rows (approximately)
DELETE FROM `invoice`;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` (`inv_id`, `date`, `custormer_c_idi`, `stock_st_idi`) VALUES
	('INV001', '2019-06-28', 'C003', NULL),
	('INV0010', '2019-07-12', 'C002', NULL),
	('INV002', '2019-07-01', 'C002', NULL),
	('INV003', '2019-07-01', 'C003', NULL),
	('INV004', '2019-07-11', 'C004', NULL),
	('INV005', '2019-07-11', 'C003', NULL),
	('INV006', '2019-07-11', 'C003', NULL),
	('INV007', '2019-07-11', 'C003', NULL),
	('INV008', '2019-07-11', 'C003', NULL),
	('INV009', '2019-07-11', 'C002', NULL);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;

-- Dumping structure for table grand_mobile.invoice_item
DROP TABLE IF EXISTS `invoice_item`;
CREATE TABLE IF NOT EXISTS `invoice_item` (
  `inv_item_id` int(11) NOT NULL AUTO_INCREMENT,
  `selling_price` varchar(50) DEFAULT NULL,
  `QTY` int(11) DEFAULT NULL,
  `invoice_inv_id` varchar(20) DEFAULT NULL,
  `customer_c_id` varchar(20) DEFAULT NULL,
  `warranty_id` int(11) DEFAULT NULL,
  `product_p_id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`inv_item_id`),
  KEY `invoice_inv_idii` (`invoice_inv_id`),
  KEY `customer_c_idii` (`customer_c_id`),
  KEY `warranty_id` (`warranty_id`),
  KEY `product_p_id_in` (`product_p_id`),
  CONSTRAINT `customer_c_idii` FOREIGN KEY (`customer_c_id`) REFERENCES `customer` (`c_id`),
  CONSTRAINT `invoice_inv_idii` FOREIGN KEY (`invoice_inv_id`) REFERENCES `invoice` (`inv_id`),
  CONSTRAINT `product_p_id_in` FOREIGN KEY (`product_p_id`) REFERENCES `product` (`p_id`),
  CONSTRAINT `warranty_id` FOREIGN KEY (`warranty_id`) REFERENCES `warranty` (`w_id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=latin1;

-- Dumping data for table grand_mobile.invoice_item: ~17 rows (approximately)
DELETE FROM `invoice_item`;
/*!40000 ALTER TABLE `invoice_item` DISABLE KEYS */;
INSERT INTO `invoice_item` (`inv_item_id`, `selling_price`, `QTY`, `invoice_inv_id`, `customer_c_id`, `warranty_id`, `product_p_id`) VALUES
	(22, '35000', 2, 'INV001', 'C003', 38, 'P001'),
	(23, '52000', 2, 'INV001', 'C003', 39, 'P002'),
	(24, '35000', 1, 'INV002', 'C002', 40, 'P003'),
	(25, '34000', 1, 'INV002', 'C002', 41, 'P001'),
	(26, '15000', 5, 'INV003', 'C003', 42, 'P001'),
	(27, '36000', 2, 'INV004', 'C004', 43, 'P001'),
	(28, '38000', 2, 'INV005', 'C003', 44, 'P001'),
	(29, '30000', 3, 'INV005', 'C003', 45, 'P002'),
	(30, '40000', 10, 'INV005', 'C003', 46, 'P004'),
	(31, '38000', 10, 'INV006', 'C003', 47, 'P001'),
	(32, '30000', 11, 'INV006', 'C003', 48, 'P002'),
	(33, '38000', 10, 'INV007', 'C003', 49, 'P001'),
	(34, '28000', 3, 'INV007', 'C003', 50, 'P002'),
	(35, '20000', 5, 'INV007', 'C003', 51, 'P003'),
	(36, '38000', 10, 'INV008', 'C003', 52, 'P001'),
	(37, '26000', 2, 'INV009', 'C002', 53, 'P002'),
	(38, '40000', 3, 'INV0010', 'C002', 54, 'P001');
/*!40000 ALTER TABLE `invoice_item` ENABLE KEYS */;

-- Dumping structure for table grand_mobile.product
DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `p_id` varchar(20) NOT NULL,
  `brand` varchar(30) DEFAULT NULL,
  `model` varchar(30) DEFAULT NULL,
  `details` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table grand_mobile.product: ~4 rows (approximately)
DELETE FROM `product`;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`p_id`, `brand`, `model`, `details`) VALUES
	('P001', 'samsung', 'j4 2005', 'SAsadsadsadfd'),
	('P002', 'sdsd', 'asdfsdf', 'asfsdfs'),
	('P003', 'dgzdfg', 'ddddd', 'sdgdf'),
	('P004', 'huawei', 'nova 2i 2018', '13mp real cam, 12mp frontcam\n4gb ram, 64gb storege');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

-- Dumping structure for table grand_mobile.stock
DROP TABLE IF EXISTS `stock`;
CREATE TABLE IF NOT EXISTS `stock` (
  `st_id` int(11) NOT NULL AUTO_INCREMENT,
  `status` int(11) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `prduct_p_id` varchar(50) DEFAULT NULL,
  `qty` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`st_id`),
  KEY `stock_pid` (`prduct_p_id`),
  CONSTRAINT `stock_pid` FOREIGN KEY (`prduct_p_id`) REFERENCES `product` (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

-- Dumping data for table grand_mobile.stock: ~4 rows (approximately)
DELETE FROM `stock`;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` (`st_id`, `status`, `date`, `prduct_p_id`, `qty`) VALUES
	(5, NULL, NULL, 'P001', '14'),
	(7, NULL, NULL, 'P002', '14'),
	(9, NULL, NULL, 'P003', '0'),
	(16, NULL, NULL, 'P004', '0');
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;

-- Dumping structure for table grand_mobile.supplier
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE IF NOT EXISTS `supplier` (
  `sup_id` varchar(20) NOT NULL,
  `f_name` varchar(45) DEFAULT NULL,
  `l_name` varchar(45) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `mobile` varchar(12) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`sup_id`),
  KEY `company_id` (`company_id`),
  CONSTRAINT `company_id` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table grand_mobile.supplier: ~2 rows (approximately)
DELETE FROM `supplier`;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` (`sup_id`, `f_name`, `l_name`, `email`, `mobile`, `company_id`) VALUES
	('sub001', 'ddxvxcv', 'xcvxcv', 'cvxcvxcv', '5375675', 1),
	('sub002', 'asdfdasf', 'sdsgdfgd', 'sdsdfsdf', '575654555', 2);
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;

-- Dumping structure for table grand_mobile.users
DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `u_id` varchar(20) NOT NULL DEFAULT '',
  `f_name` varchar(50) DEFAULT NULL,
  `l_name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table grand_mobile.users: ~3 rows (approximately)
DELETE FROM `users`;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`u_id`, `f_name`, `l_name`, `email`, `username`, `password`, `type`) VALUES
	('197856503637', 'anoma', 'jayanthi', 'diluksha574@gmail.com', '315875775975315', '185685985315875885315', 'Chashir'),
	('973664182v', 'dilanka', 'sadaruwan', 'd.sadaru98@gmail.com', '185685985315875885315', '375315185315475175295315875', 'Admin'),
	('985899145v', 'kalani', 'madhushani', 'kala98@gmail.com', '885315985315875685', 'sadaruwan', 'Chashir');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

-- Dumping structure for table grand_mobile.warranty
DROP TABLE IF EXISTS `warranty`;
CREATE TABLE IF NOT EXISTS `warranty` (
  `w_id` int(11) NOT NULL AUTO_INCREMENT,
  `start_date` varchar(20) DEFAULT NULL,
  `end_date` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`w_id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=latin1;

-- Dumping data for table grand_mobile.warranty: ~25 rows (approximately)
DELETE FROM `warranty`;
/*!40000 ALTER TABLE `warranty` DISABLE KEYS */;
INSERT INTO `warranty` (`w_id`, `start_date`, `end_date`) VALUES
	(30, '2019-06-28', '2019-06-28'),
	(31, '2019-06-28', '2019-06-28'),
	(32, '2019-06-28', '2019-06-28'),
	(33, '2019-06-28', '2019-06-28'),
	(34, '2019-06-28', '2019-06-28'),
	(35, '2019-06-28', '2019-06-28'),
	(36, '2019-06-28', '2019-06-28'),
	(37, '2019-06-28', '2019-06-28'),
	(38, '2019-06-28', '2019-06-28'),
	(39, '2019-06-28', '2019-06-28'),
	(40, '2019-07-01', '2020-07-01'),
	(41, '2019-07-01', '2020-07-01'),
	(42, '2019-07-01', '2019-07-01'),
	(43, '2019-07-11', '2019-07-11'),
	(44, '2019-07-11', '2020-07-12'),
	(45, '2019-07-11', '2020-07-12'),
	(46, '2019-07-11', '2019-07-11'),
	(47, '2019-07-11', '2019-07-11'),
	(48, '2019-07-11', '2019-07-11'),
	(49, '2019-07-11', '2019-07-11'),
	(50, '2019-07-11', '2019-07-11'),
	(51, '2019-07-11', '2019-07-11'),
	(52, '2019-07-11', '2019-07-11'),
	(53, '2019-07-11', '2019-07-11'),
	(54, '2019-07-12', '2019-07-12');
/*!40000 ALTER TABLE `warranty` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
