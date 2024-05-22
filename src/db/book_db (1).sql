-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 17, 2023 at 05:10 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `book_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_admin`
--

CREATE TABLE `tbl_admin` (
  `admin_id` int(20) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `birthdate` varchar(50) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `password` varchar(60) NOT NULL,
  `image` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_admin`
--

INSERT INTO `tbl_admin` (`admin_id`, `firstname`, `lastname`, `birthdate`, `contact`, `password`, `image`) VALUES
(54, 'm', 'm', 'm', 'm', 'YsZqel3XDDFGYYBjw0TlMebUtZ43mAhEPOlis6vWPFo=', 'src/images/334256446_561069242657536_3448056622890430431_n.jpg'),
(77, 'James', 'Reid', '12-12-2001', '09225084268', 'WZRHGrsBESr8wYFZ9sx0tPURuZgG2lmzyvWpwXPKz8U=', 'src/images/2.png'),
(78, 'admin', 'qwert', '23-9-2001', '123456789098', 'qwerty', 'src/images/icons8-reports-58.png'),
(79, 'Admin1', 'daiai', '12-2-2001', '4567875441', 'jGl25bVBBBW96Qi9Te4V37Fnqchz/Eu4qB9vKrRIqRg=', 'src/images/314466845_639556497895149_3729489075579029508_n.jpg'),
(80, 'ada', 'afar', '12-2-2001', '26627272', 'gagag', 'src/images/325030867_1157840014935431_6736237560901497665_n.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_appointment`
--

CREATE TABLE `tbl_appointment` (
  `book_id` int(10) NOT NULL,
  `student_name` varchar(20) NOT NULL,
  `book_number` varchar(21) NOT NULL,
  `book_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_appointment`
--

INSERT INTO `tbl_appointment` (`book_id`, `student_name`, `book_number`, `book_name`) VALUES
(18, 'John Nicole', '3', 'Jungle Book'),
(19, 'Cardo Dalisay', '4', 'SuperBook'),
(20, 'May Ann', '5', 'Marvels'),
(21, 'Ashley Borinaga', '6', 'DC comics'),
(22, 'Anne Curtis', '7', 'Its Showtime'),
(23, 'Darla Gwapa', '8', 'SuperPretty');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_lib`
--

CREATE TABLE `tbl_lib` (
  `lib_id` int(10) NOT NULL,
  `student_id` int(10) NOT NULL,
  `book_id` int(10) NOT NULL,
  `book_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_lib`
--

INSERT INTO `tbl_lib` (`lib_id`, `student_id`, `book_id`, `book_status`) VALUES
(1, 22, 22, 'Goods'),
(2, 21, 21, 'Bad'),
(3, 23, 23, 'Very Good'),
(4, 18, 18, 'Scratch'),
(5, 19, 19, 'broke');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_students`
--

CREATE TABLE `tbl_students` (
  `student_id` int(10) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `birthdate` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `address` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_students`
--

INSERT INTO `tbl_students` (`student_id`, `firstname`, `lastname`, `birthdate`, `gender`, `address`) VALUES
(18, 'John', 'Lawas', '12-20-2001', 'Male', 'Minglanilla'),
(19, 'Cardo', 'Dalisay', '12-2-2009', 'Male', 'Gullas'),
(20, 'May', 'Ann', '1-9-2001', 'Female', 'Singapore'),
(21, 'Ashley', 'Borinaga', '2-20-2008', 'Female', 'Manila'),
(22, 'Anne', 'Curtis', '2-20-2006', 'Female', 'Tungkop'),
(23, 'Darla', 'Gwapa', '3-9-2004', 'Female', 'Heaven');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_admin`
--
ALTER TABLE `tbl_admin`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `tbl_appointment`
--
ALTER TABLE `tbl_appointment`
  ADD PRIMARY KEY (`book_id`);

--
-- Indexes for table `tbl_lib`
--
ALTER TABLE `tbl_lib`
  ADD PRIMARY KEY (`lib_id`),
  ADD KEY `lib_book` (`book_id`),
  ADD KEY `lib_student` (`student_id`);

--
-- Indexes for table `tbl_students`
--
ALTER TABLE `tbl_students`
  ADD PRIMARY KEY (`student_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_admin`
--
ALTER TABLE `tbl_admin`
  MODIFY `admin_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=81;

--
-- AUTO_INCREMENT for table `tbl_appointment`
--
ALTER TABLE `tbl_appointment`
  MODIFY `book_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `tbl_lib`
--
ALTER TABLE `tbl_lib`
  MODIFY `lib_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_students`
--
ALTER TABLE `tbl_students`
  MODIFY `student_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_lib`
--
ALTER TABLE `tbl_lib`
  ADD CONSTRAINT `lib_book` FOREIGN KEY (`book_id`) REFERENCES `tbl_appointment` (`book_id`),
  ADD CONSTRAINT `lib_student` FOREIGN KEY (`student_id`) REFERENCES `tbl_students` (`student_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
