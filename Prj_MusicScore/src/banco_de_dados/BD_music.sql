-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 17-Out-2022 às 23:02
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_musicscore_4`
--
CREATE DATABASE IF NOT EXISTS `bd_musicscore_4` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bd_musicscore_4`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `matricula`
--

CREATE TABLE `matricula` (
  `Nome` varchar(20) NOT NULL,
  `Email` varchar(150) NOT NULL,
  `Senha` varchar(150) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `matricula`
--

INSERT INTO `matricula` (`Nome`, `Email`, `Senha`) VALUES
('fvkhgsdf@gmail.com', 'aaaa', '12345');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `matricula`
--
ALTER TABLE `matricula`
  ADD PRIMARY KEY (`Nome`);
--
-- Banco de dados: `clientes`
--
CREATE DATABASE IF NOT EXISTS `clientes` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `clientes`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblaulunos`
--

CREATE TABLE `tblaulunos` (
  `CodAluno` int(11) NOT NULL,
  `NomeAluno` varchar(40) NOT NULL,
  `FoneAluno` varchar(15) NOT NULL,
  `CEPaluno` varchar(10) NOT NULL,
  `CPFaluno` varchar(15) NOT NULL,
  `DtNascAluno` varchar(20) NOT NULL,
  `EmailAluno` varchar(40) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tblaulunos`
--

INSERT INTO `tblaulunos` (`CodAluno`, `NomeAluno`, `FoneAluno`, `CEPaluno`, `CPFaluno`, `DtNascAluno`, `EmailAluno`) VALUES
(42, 'Bianca Farias da Silva', '11987445623', '08094523', '48956236578', '2005-11-14', 'bianquinha@gmail.com'),
(43, 'Bruno Santos Portugal', '11974552302', '08097452', '12365202898', '2004-11-24', 'portuga@etec.com'),
(44, 'Giovanna da Silva', '11981523698', '23685478', '7895210369', '2005-05-28', 'gigisilva@gmail.com'),
(45, 'Ana Julia Lima de Oliveira', '11975462033', '08048752', '12398560217', '2006-02-27', 'ajlima@gmail.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblcursos`
--

CREATE TABLE `tblcursos` (
  `CodCurso` int(11) NOT NULL,
  `NomeCurso` varchar(30) NOT NULL,
  `CargaHCurso` varchar(20) NOT NULL,
  `DescricaoCurso` varchar(250) NOT NULL,
  `GradeHCurso` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tblcursos`
--

INSERT INTO `tblcursos` (`CodCurso`, `NomeCurso`, `CargaHCurso`, `DescricaoCurso`, `GradeHCurso`) VALUES
(1, 'Curso de Guitarra', '280 horas', 'Aprender a tocar o instrumento e/ou aperfeiçoar suas habilidades. \r\n4 aulas de 50 minutos por semana', '3:20 horas'),
(2, 'Curso de Canto', '320', 'Aprender a cantar e/ou aperfeiçoar suas habilidades. \r\n4 aulas de 1 hora por semana.', '4 horas'),
(3, 'Curso de Piano', '280 horas', 'Aprender a tocar o instrumento e/ou aperfeiçoar suas habilidades. \r\n4 aulas com 50 minutos por semana.', '3:20 horas'),
(4, 'Curso de Violino', '220 horas', 'Aprender a tocar o instrumento e/ou aperfeiçoar suas habilidades. \r\n4 aulas de 1 hora por semana.', '4 horas');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbldisciplinas`
--

CREATE TABLE `tbldisciplinas` (
  `CodCurso` int(11) NOT NULL,
  `CodDisc` int(11) NOT NULL,
  `NomeDisc` varchar(100) NOT NULL,
  `Descricaodisc` varchar(150) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbldisciplinas`
--

INSERT INTO `tbldisciplinas` (`CodCurso`, `CodDisc`, `NomeDisc`, `Descricaodisc`) VALUES
(1, 21, 'Arranjo', 'bruno escreve aqui'),
(2, 22, 'Canto na Música Popular', 'bruno escreve aqui'),
(3, 23, 'História e Linguagem da Música Popular', 'bruno escreve aqui'),
(4, 24, 'Harmonia ', 'bruno escreve aqui');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblprofessores`
--

CREATE TABLE `tblprofessores` (
  `CodProf` int(11) NOT NULL,
  `NomeProf` varchar(70) NOT NULL,
  `CPFprof` varchar(15) NOT NULL,
  `DtNascProf` varchar(20) NOT NULL,
  `EmailProf` varchar(100) NOT NULL,
  `CEPprof` varchar(15) NOT NULL,
  `Telefone` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tblprofessores`
--

INSERT INTO `tblprofessores` (`CodProf`, `NomeProf`, `CPFprof`, `DtNascProf`, `EmailProf`, `CEPprof`, `Telefone`) VALUES
(1, 'Rogério Costa', '78952396802', '1975-10-12', 'rogerioprof@gmail.com', '89563214', '2222-2222'),
(2, 'Fábio de Mello', '52639841256', '1979-03-26', 'fabioprof@escola.com', '74126895', ''),
(3, 'Carlos Alberto', '89523612435', '1962-05-15', 'carlosalb@etec.com', '45698236', ''),
(4, 'Ana Maria Braga', '5693320157', '1968-10-23', 'amariabraga@gmail.com', '89563210', '3333-3333');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblusuario`
--

CREATE TABLE `tblusuario` (
  `Senha` int(11) NOT NULL,
  `Usu` varchar(80) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tblusuario`
--

INSERT INTO `tblusuario` (`Senha`, `Usu`) VALUES
(3727, 'Giovanna Silva'),
(1313, 'Bianca F Silva'),
(123, 'bruno'),
(2805, 'Ana Julia L Oliver');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tblaulunos`
--
ALTER TABLE `tblaulunos`
  ADD PRIMARY KEY (`CodAluno`);

--
-- Índices para tabela `tblcursos`
--
ALTER TABLE `tblcursos`
  ADD PRIMARY KEY (`CodCurso`);

--
-- Índices para tabela `tbldisciplinas`
--
ALTER TABLE `tbldisciplinas`
  ADD PRIMARY KEY (`CodDisc`);

--
-- Índices para tabela `tblprofessores`
--
ALTER TABLE `tblprofessores`
  ADD PRIMARY KEY (`CodProf`);

--
-- Índices para tabela `tblusuario`
--
ALTER TABLE `tblusuario`
  ADD PRIMARY KEY (`Senha`);
--
-- Banco de dados: `phpmyadmin`
--
CREATE DATABASE IF NOT EXISTS `phpmyadmin` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `phpmyadmin`;

-- --------------------------------------------------------

