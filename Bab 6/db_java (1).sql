-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 05, 2021 at 02:57 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_java`
--

-- --------------------------------------------------------

--
-- Table structure for table `hak_akses`
--

CREATE TABLE `hak_akses` (
  `id_pengguna` varchar(10) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `level` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hak_akses`
--

INSERT INTO `hak_akses` (`id_pengguna`, `nama`, `level`) VALUES
('1', 'Conan', 1),
('2', 'Mitsuhiko', 1),
('3', 'Ayumi', 2),
('4', 'Genta', 2);

-- --------------------------------------------------------

--
-- Table structure for table `pengerjaan_soal`
--

CREATE TABLE `pengerjaan_soal` (
  `id_pengerjaan` int(11) NOT NULL,
  `pengguna` varchar(20) NOT NULL,
  `skor` int(11) NOT NULL,
  `tanggal_pengerjaan` date NOT NULL,
  `jam_pengerjaan` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengerjaan_soal`
--

INSERT INTO `pengerjaan_soal` (`id_pengerjaan`, `pengguna`, `skor`, `tanggal_pengerjaan`, `jam_pengerjaan`) VALUES
(1, 'conan', 90, '2021-03-02', '10:00:00'),
(2, 'ayumi', 80, '2021-03-02', '14:00:00'),
(3, 'genta', 60, '2021-03-02', '12:06:00'),
(4, 'ayumi', 80, '2021-03-02', '10:00:00'),
(5, 'genta', 70, '2021-03-02', '14:00:00'),
(7, 'genta', 20, '2021-03-03', '12:31:12');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pengerjaan_soal`
--
ALTER TABLE `pengerjaan_soal`
  ADD PRIMARY KEY (`id_pengerjaan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pengerjaan_soal`
--
ALTER TABLE `pengerjaan_soal`
  MODIFY `id_pengerjaan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
