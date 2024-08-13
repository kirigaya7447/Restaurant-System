-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 06-Dez-2022 às 13:52
-- Versão do servidor: 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restaurante`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `administracao`
--

CREATE TABLE `administracao` (
  `nivelAdministracao` char(2) NOT NULL,
  `descricaoAdministracao` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `administracao`
--

INSERT INTO `administracao` (`nivelAdministracao`, `descricaoAdministracao`) VALUES
('00', 'FUNCIONÁRIO COMUM: SÓ PERMITE A LEITURA DOS DADOS.'),
('01', 'FUNCIONÁRIO MÉDIO: PERMITE INSERIR, ALTERAR E APAGAR CLIENTES DAS TABELAS.'),
('02', 'ENGENHEIRO/SUPERVISOR: PERMITE EDIÇÃO, ALTERAÇÃO E ENTRADA DE FUNCIONÁRIOS.');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `cpfCliente` char(14) NOT NULL,
  `nomeCliente` varchar(60) DEFAULT NULL,
  `celularCliente` char(18) DEFAULT NULL,
  `emailCliente` varchar(100) DEFAULT NULL,
  `cidadeCliente` varchar(100) DEFAULT NULL,
  `ruaCliente` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`cpfCliente`, `nomeCliente`, `celularCliente`, `emailCliente`, `cidadeCliente`, `ruaCliente`) VALUES
('654.131.315-45', 'HENRIQUE BRAGA FIGUEIREDO', '55 (35) 99984-5646', 'henriqueGostosa@gmail.com', 'POUSO ALEGRE', 'DA MORTE '),
('665.448.888-88', 'CARLOS EDUARDO', '66 (66) 96666-6666', 'yyyyyyyyyyyyyyy@gmail.com', 'yyyyyyyyyyyyy', 'yyyyyyyyyyyyyy');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `cpfFuncionario` char(14) NOT NULL,
  `nomeFuncionario` varchar(60) DEFAULT NULL,
  `senhaFuncionario` text,
  `datacontratoFuncionario` date DEFAULT NULL,
  `horaContratoFuncionario` time DEFAULT NULL,
  `salarioFuncionario` text,
  `funcaoFuncionario` varchar(45) DEFAULT NULL,
  `nivelAdministracao` char(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`cpfFuncionario`, `nomeFuncionario`, `senhaFuncionario`, `datacontratoFuncionario`, `horaContratoFuncionario`, `salarioFuncionario`, `funcaoFuncionario`, `nivelAdministracao`) VALUES
('111.111.111-11', 'SEI LA, TO SEM IDEIA PARA NOMES01', '1', '2022-11-14', '10:15:00', 'R$01500,00', 'ENGENHEIRO DE SOFTWARE ', '02'),
('145.693.445-46', 'ARTHUR BRAGA', '2', '2022-03-05', '13:00:00', 'R$02000,00', 'COZINHEIRO', '01'),
('156.831.136-28', 'CARLOS ALBERTO DE NOBREGA', '1311', '2022-03-02', '12:00:00', 'R$01500,00', 'GARÇOM', '00'),
('156.832.236-29', 'JOAO HENRIQUE COSTA MACIEL', '1211', '2022-11-12', '01:00:00', 'R$01500,00', 'GARÇOM', '02'),
('222.222.222-22', 'ILARILARIE O O O ', '1234567890', '2025-04-04', '23:23:43', 'R$00000,01', 'COZINHEIRO-CHEFE', '01');

-- --------------------------------------------------------

--
-- Estrutura da tabela `registro`
--

CREATE TABLE `registro` (
  `idRegistro` int(9) NOT NULL,
  `acaoRegistro` varchar(100) DEFAULT NULL,
  `cpfAutorRegistro` char(14) DEFAULT NULL,
  `dataRegistro` date DEFAULT NULL,
  `horaRegistro` time DEFAULT NULL,
  `cpfFuncionario` char(14) DEFAULT NULL,
  `cpfCliente` char(14) DEFAULT NULL,
  `idReserva` int(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `registro`
--

INSERT INTO `registro` (`idRegistro`, `acaoRegistro`, `cpfAutorRegistro`, `dataRegistro`, `horaRegistro`, `cpfFuncionario`, `cpfCliente`, `idReserva`) VALUES
(198, 'Sistema finalizado.', '111.111.111-11', '2022-11-25', '10:04:22', NULL, NULL, NULL),
(199, 'Sistema iniciado.', NULL, '2022-11-25', '10:06:52', NULL, NULL, NULL),
(200, 'Tentativa de login fracassada.', '111.111.111-11', '2022-11-25', '10:06:52', NULL, NULL, NULL),
(201, 'Tentativa de login fracassada.', '111.111.111-11', '2022-11-25', '10:06:52', NULL, NULL, NULL),
(202, 'Tentativa de login fracassada.', '111.111.111-11', '2022-11-25', '10:06:52', NULL, NULL, NULL),
(203, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:06:52', NULL, NULL, NULL),
(204, 'Sistema finalizado.', '111.111.111-11', '2022-11-25', '10:06:52', NULL, NULL, NULL),
(205, 'Sistema iniciado.', NULL, '2022-11-25', '10:09:02', NULL, NULL, NULL),
(206, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:09:02', NULL, NULL, NULL),
(207, 'Tentativa de alteração bem-sucedida (Funcionário).', '111.111.111-11', '2022-11-25', '10:09:10', '145.693.445-46', NULL, NULL),
(208, 'Tentativa de inserção bem-sucedida (Funcionário).', '111.111.111-11', '2022-11-25', '10:09:10', '145.693.445-46', NULL, NULL),
(209, 'Tentativa de alteração bem-sucedida (Funcionário).', '111.111.111-11', '2022-11-25', '10:09:10', '111.111.111-11', NULL, NULL),
(210, 'Tentativa de alteração bem-sucedida (Funcionário).', '111.111.111-11', '2022-11-25', '10:09:10', '111.111.111-11', NULL, NULL),
(211, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-25', '10:09:02', NULL, NULL, NULL),
(212, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-25', '10:09:02', NULL, NULL, NULL),
(213, 'Tentativa de login fracassada.', '156.831.136-28', '2022-11-25', '10:09:02', NULL, NULL, NULL),
(214, 'Tentativa de login bem-sucedida.', '156.831.136-28', '2022-11-25', '10:09:02', NULL, NULL, NULL),
(215, 'Usuário efetuou o logout.', '156.831.136-28', '2022-11-25', '10:09:02', NULL, NULL, NULL),
(216, 'Usuário efetuou o logout.', '156.831.136-28', '2022-11-25', '10:09:02', NULL, NULL, NULL),
(217, 'Tentativa de login bem-sucedida.', '145.693.445-46', '2022-11-25', '10:09:02', NULL, NULL, NULL),
(218, 'Sistema finalizado.', '145.693.445-46', '2022-11-25', '10:09:02', NULL, NULL, NULL),
(219, 'Sistema iniciado.', NULL, '2022-11-25', '10:14:46', NULL, NULL, NULL),
(220, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:14:46', NULL, NULL, NULL),
(221, 'Tentativa de inserção bem-sucedida (Funcionário).', '111.111.111-11', '2022-11-25', '10:14:56', NULL, NULL, NULL),
(222, 'Tentativa de inserção bem-sucedida (Funcionário).', '111.111.111-11', '2022-11-25', '10:14:56', '222.222.222-22', NULL, NULL),
(223, 'Tentativa de alteração bem-sucedida (Funcionário).', '111.111.111-11', '2022-11-25', '10:14:56', '222.222.222-22', NULL, NULL),
(224, 'Sistema finalizado.', '111.111.111-11', '2022-11-25', '10:14:46', NULL, NULL, NULL),
(225, 'Sistema iniciado.', NULL, '2022-11-25', '10:16:10', NULL, NULL, NULL),
(226, 'Sistema finalizado.', NULL, '2022-11-25', '10:16:10', NULL, NULL, NULL),
(227, 'Sistema iniciado.', NULL, '2022-11-25', '10:18:54', NULL, NULL, NULL),
(228, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:18:54', NULL, NULL, NULL),
(229, 'Sistema finalizado.', '111.111.111-11', '2022-11-25', '10:18:54', NULL, NULL, NULL),
(230, 'Sistema iniciado.', NULL, '2022-11-25', '10:30:05', NULL, NULL, NULL),
(231, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:30:05', NULL, NULL, NULL),
(232, 'Sistema finalizado.', '111.111.111-11', '2022-11-25', '10:30:05', NULL, NULL, NULL),
(233, 'Sistema iniciado.', NULL, '2022-11-25', '10:31:56', NULL, NULL, NULL),
(234, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:31:56', NULL, NULL, NULL),
(235, 'Sistema finalizado.', '111.111.111-11', '2022-11-25', '10:31:56', NULL, NULL, NULL),
(236, 'Sistema iniciado.', NULL, '2022-11-25', '10:32:50', NULL, NULL, NULL),
(237, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:32:50', NULL, NULL, NULL),
(238, 'Sistema finalizado.', '111.111.111-11', '2022-11-25', '10:32:50', NULL, NULL, NULL),
(239, 'Sistema iniciado.', NULL, '2022-11-25', '10:33:22', NULL, NULL, NULL),
(240, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:33:22', NULL, NULL, NULL),
(241, 'Sistema finalizado.', '111.111.111-11', '2022-11-25', '10:33:22', NULL, NULL, NULL),
(242, 'Sistema iniciado.', NULL, '2022-11-25', '10:35:52', NULL, NULL, NULL),
(243, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:35:52', NULL, NULL, NULL),
(244, 'Sistema finalizado.', '111.111.111-11', '2022-11-25', '10:35:52', NULL, NULL, NULL),
(245, 'Sistema iniciado.', NULL, '2022-11-25', '10:36:37', NULL, NULL, NULL),
(246, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:36:37', NULL, NULL, NULL),
(247, 'Sistema finalizado.', '111.111.111-11', '2022-11-25', '10:36:37', NULL, NULL, NULL),
(248, 'Sistema iniciado.', NULL, '2022-11-25', '10:37:51', NULL, NULL, NULL),
(249, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:37:51', NULL, NULL, NULL),
(250, 'Sistema finalizado.', '111.111.111-11', '2022-11-25', '10:37:51', NULL, NULL, NULL),
(251, 'Sistema iniciado.', NULL, '2022-11-25', '10:38:38', NULL, NULL, NULL),
(252, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:38:38', NULL, NULL, NULL),
(253, 'Sistema finalizado.', '111.111.111-11', '2022-11-25', '10:38:38', NULL, NULL, NULL),
(254, 'Sistema iniciado.', NULL, '2022-11-25', '10:43:39', NULL, NULL, NULL),
(255, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:43:39', NULL, NULL, NULL),
(256, 'Sistema finalizado.', '111.111.111-11', '2022-11-25', '10:43:39', NULL, NULL, NULL),
(257, 'Sistema iniciado.', NULL, '2022-11-25', '10:44:36', NULL, NULL, NULL),
(258, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:44:36', NULL, NULL, NULL),
(259, 'Tentativa de alteração bem-sucedida (Funcionário).', '111.111.111-11', '2022-11-25', '10:44:42', '222.222.222-22', NULL, NULL),
(260, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-25', '10:44:36', NULL, NULL, NULL),
(261, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-25', '10:44:36', NULL, NULL, NULL),
(262, 'Sistema finalizado.', NULL, '2022-11-25', '10:44:36', NULL, NULL, NULL),
(263, 'Sistema iniciado.', NULL, '2022-11-25', '10:46:43', NULL, NULL, NULL),
(264, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:46:43', NULL, NULL, NULL),
(265, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-25', '10:46:43', NULL, NULL, NULL),
(266, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-25', '10:46:43', NULL, NULL, NULL),
(267, 'Sistema finalizado.', NULL, '2022-11-25', '10:46:43', NULL, NULL, NULL),
(268, 'Sistema iniciado.', NULL, '2022-11-25', '10:47:36', NULL, NULL, NULL),
(269, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:47:36', NULL, NULL, NULL),
(270, 'Sistema finalizado.', '111.111.111-11', '2022-11-25', '10:47:36', NULL, NULL, NULL),
(271, 'Sistema iniciado.', NULL, '2022-11-25', '10:47:51', NULL, NULL, NULL),
(272, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:47:51', NULL, NULL, NULL),
(273, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-25', '10:47:51', NULL, NULL, NULL),
(274, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-25', '10:47:51', NULL, NULL, NULL),
(275, 'Sistema finalizado.', NULL, '2022-11-25', '10:47:51', NULL, NULL, NULL),
(276, 'Sistema iniciado.', NULL, '2022-11-25', '10:48:19', NULL, NULL, NULL),
(277, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '10:48:19', NULL, NULL, NULL),
(278, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-25', '10:48:19', NULL, NULL, NULL),
(279, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-25', '10:48:19', NULL, NULL, NULL),
(280, 'Tentativa de login fracassada.', '156.831.136-28', '2022-11-25', '10:48:19', NULL, NULL, NULL),
(281, 'Tentativa de login fracassada.', '156.831.136-28', '2022-11-25', '10:48:19', NULL, NULL, NULL),
(282, 'Tentativa de login bem-sucedida.', '156.831.136-28', '2022-11-25', '10:48:19', NULL, NULL, NULL),
(283, 'Usuário efetuou o logout.', '156.831.136-28', '2022-11-25', '10:48:19', NULL, NULL, NULL),
(284, 'Usuário efetuou o logout.', '156.831.136-28', '2022-11-25', '10:48:19', NULL, NULL, NULL),
(285, 'Sistema finalizado.', NULL, '2022-11-25', '10:48:19', NULL, NULL, NULL),
(286, 'Sistema iniciado.', NULL, '2022-11-25', '11:10:59', NULL, NULL, NULL),
(287, 'Tentativa de login fracassada.', '   .   .   -', '2022-11-25', '11:10:59', NULL, NULL, NULL),
(288, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '11:10:59', NULL, NULL, NULL),
(289, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-25', '11:10:59', NULL, NULL, NULL),
(290, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-25', '11:10:59', NULL, NULL, NULL),
(291, 'Tentativa de login fracassada.', '156.831.136-28', '2022-11-25', '11:10:59', NULL, NULL, NULL),
(292, 'Tentativa de login bem-sucedida.', '156.831.136-28', '2022-11-25', '11:10:59', NULL, NULL, NULL),
(293, 'Usuário efetuou o logout.', '156.831.136-28', '2022-11-25', '11:10:59', NULL, NULL, NULL),
(294, 'Usuário efetuou o logout.', '156.831.136-28', '2022-11-25', '11:10:59', NULL, NULL, NULL),
(295, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-25', '11:10:59', NULL, NULL, NULL),
(296, 'Sistema finalizado.', '111.111.111-11', '2022-11-25', '11:10:59', NULL, NULL, NULL),
(297, 'Sistema iniciado.', NULL, '2022-11-29', '11:24:21', NULL, NULL, NULL),
(298, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-29', '11:24:21', NULL, NULL, NULL),
(299, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-29', '11:24:21', NULL, NULL, NULL),
(300, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-29', '11:24:21', NULL, NULL, NULL),
(301, 'Sistema finalizado.', NULL, '2022-11-29', '11:24:21', NULL, NULL, NULL),
(302, 'Sistema iniciado.', NULL, '2022-11-29', '11:26:11', NULL, NULL, NULL),
(303, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-29', '11:26:11', NULL, NULL, NULL),
(304, 'Tentativa de inserção bem-sucedida (Reserva).', '111.111.111-11', '2022-11-29', '11:29:37', NULL, '665.448.888-88', NULL),
(305, 'Sistema iniciado.', NULL, '2022-11-29', '11:30:58', NULL, NULL, NULL),
(306, 'Sistema finalizado.', NULL, '2022-11-29', '11:30:58', NULL, NULL, NULL),
(307, 'Sistema finalizado.', '111.111.111-11', '2022-11-29', '11:26:11', NULL, NULL, NULL),
(308, 'Sistema iniciado.', NULL, '2022-11-29', '11:32:50', NULL, NULL, NULL),
(309, 'Sistema finalizado.', NULL, '2022-11-29', '11:32:50', NULL, NULL, NULL),
(310, 'Sistema iniciado.', NULL, '2022-11-29', '11:48:32', NULL, NULL, NULL),
(311, 'Tentativa de login bem-sucedida.', '156.832.236-29', '2022-11-29', '11:48:32', NULL, NULL, NULL),
(312, 'Tentativa de alteração bem-sucedida (Funcionário).', '156.832.236-29', '2022-11-29', '11:49:16', '222.222.222-22', NULL, NULL),
(313, 'Tentativa de alteração bem-sucedida (Funcionário).', '156.832.236-29', '2022-11-29', '11:49:16', '222.222.222-22', NULL, NULL),
(314, 'Tentativa de inserção bem-sucedida (Funcionário).', '156.832.236-29', '2022-11-29', '11:49:16', '222.222.222-22', NULL, NULL),
(315, 'Tentativa de alteração bem-sucedida (Funcionário).', '156.832.236-29', '2022-11-29', '11:49:16', '111.111.111-11', NULL, NULL),
(316, 'Usuário efetuou o logout.', '156.832.236-29', '2022-11-29', '11:48:32', NULL, NULL, NULL),
(317, 'Usuário efetuou o logout.', '156.832.236-29', '2022-11-29', '11:48:32', NULL, NULL, NULL),
(318, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-29', '11:48:32', NULL, NULL, NULL),
(319, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-29', '11:48:32', NULL, NULL, NULL),
(320, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-29', '11:48:32', NULL, NULL, NULL),
(321, 'Tentativa de login bem-sucedida.', '156.832.236-29', '2022-11-29', '11:48:32', NULL, NULL, NULL),
(322, 'Tentativa de remoção bem-sucedida (Clientes).', '156.832.236-29', '2022-11-29', '11:51:32', NULL, NULL, NULL),
(323, 'Tentativa de remoção bem-sucedida (Clientes).', '156.832.236-29', '2022-11-29', '11:51:32', NULL, NULL, NULL),
(324, 'Sistema finalizado.', '156.832.236-29', '2022-11-29', '11:48:32', NULL, NULL, NULL),
(325, 'Sistema iniciado.', NULL, '2022-11-29', '11:53:27', NULL, NULL, NULL),
(326, 'Tentativa de login bem-sucedida.', '156.832.236-29', '2022-11-29', '11:53:27', NULL, NULL, NULL),
(327, 'Tentativa de remoção bem-sucedida (Reserva).', '156.832.236-29', '2022-11-29', '11:53:48', NULL, NULL, NULL),
(328, 'Tentativa de remoção bem-sucedida (Clientes).', '156.832.236-29', '2022-11-29', '11:53:37', NULL, NULL, NULL),
(329, 'Tentativa de remoção bem-sucedida (Reserva).', '156.832.236-29', '2022-11-29', '11:53:48', NULL, NULL, NULL),
(330, 'Tentativa de alteração bem-sucedida (Clientes).', '156.832.236-29', '2022-11-29', '11:53:37', NULL, '665.448.888-88', NULL),
(331, 'Sistema finalizado.', '156.832.236-29', '2022-11-29', '11:53:27', NULL, NULL, NULL),
(332, 'Sistema iniciado.', NULL, '2022-11-29', '11:55:48', NULL, NULL, NULL),
(333, 'Tentativa de login bem-sucedida.', '156.832.236-29', '2022-11-29', '11:55:48', NULL, NULL, NULL),
(334, 'Sistema finalizado.', '156.832.236-29', '2022-11-29', '11:55:48', NULL, NULL, NULL),
(335, 'Sistema iniciado.', NULL, '2022-11-29', '11:56:38', NULL, NULL, NULL),
(336, 'Tentativa de login bem-sucedida.', '156.832.236-29', '2022-11-29', '11:56:38', NULL, NULL, NULL),
(337, 'Tentativa de inserção bem-sucedida (Clientes).', '156.832.236-29', '2022-11-29', '11:56:52', NULL, '654.131.315-45', NULL),
(338, 'Tentativa de inserção bem-sucedida (Reserva).', '156.832.236-29', '2022-11-29', '11:58:14', NULL, '654.131.315-45', NULL),
(339, 'Tentativa de remoção bem-sucedida (Reserva).', '156.832.236-29', '2022-11-29', '11:58:14', NULL, '654.131.315-45', NULL),
(340, 'Sistema finalizado.', '156.832.236-29', '2022-11-29', '11:56:38', NULL, NULL, NULL),
(341, 'Sistema iniciado.', NULL, '2022-11-29', '12:02:19', NULL, NULL, NULL),
(342, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-29', '12:02:19', NULL, NULL, NULL),
(343, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-29', '12:02:19', NULL, NULL, NULL),
(344, 'Usuário efetuou o logout.', '111.111.111-11', '2022-11-29', '12:02:19', NULL, NULL, NULL),
(345, 'Tentativa de login bem-sucedida.', '156.832.236-29', '2022-11-29', '12:02:19', NULL, NULL, NULL),
(346, 'Sistema finalizado.', '156.832.236-29', '2022-11-29', '12:02:19', NULL, NULL, NULL),
(347, 'Sistema iniciado.', NULL, '2022-11-29', '12:03:42', NULL, NULL, NULL),
(348, 'Tentativa de login bem-sucedida.', '156.832.236-29', '2022-11-29', '12:03:42', NULL, NULL, NULL),
(349, 'Tentativa de inserção bem-sucedida (Reserva).', '156.832.236-29', '2022-11-29', '12:04:04', NULL, '665.448.888-88', NULL),
(350, 'Sistema finalizado.', '156.832.236-29', '2022-11-29', '12:03:42', NULL, NULL, NULL),
(351, 'Sistema iniciado.', NULL, '2022-11-29', '12:05:46', NULL, NULL, NULL),
(352, 'Tentativa de login bem-sucedida.', '156.832.236-29', '2022-11-29', '12:05:46', NULL, NULL, NULL),
(353, 'Tentativa de alteração bem-sucedida (Funcionário).', '156.832.236-29', '2022-11-29', '12:05:58', '111.111.111-11', NULL, NULL),
(354, 'Usuário efetuou o logout.', '156.832.236-29', '2022-11-29', '12:05:46', NULL, NULL, NULL),
(355, 'Usuário efetuou o logout.', '156.832.236-29', '2022-11-29', '12:05:46', NULL, NULL, NULL),
(356, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-11-29', '12:05:46', NULL, NULL, NULL),
(357, 'Tentativa de remoção bem-sucedida (Reserva).', '111.111.111-11', '2022-11-29', '12:06:48', NULL, NULL, NULL),
(358, 'Tentativa de inserção fracassada (Clientes).', '111.111.111-11', '2022-11-29', '12:06:39', NULL, '665.448.888-88', NULL),
(359, 'Sistema finalizado.', '111.111.111-11', '2022-11-29', '12:05:46', NULL, NULL, NULL),
(360, 'Sistema iniciado.', NULL, '2022-12-06', '11:36:06', NULL, NULL, NULL),
(361, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-12-06', '11:36:06', NULL, NULL, NULL),
(362, 'Sistema finalizado.', '111.111.111-11', '2022-12-06', '11:36:06', NULL, NULL, NULL),
(363, 'Sistema iniciado.', NULL, '2022-12-06', '11:39:26', NULL, NULL, NULL),
(364, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-12-06', '11:39:26', NULL, NULL, NULL),
(365, 'Sistema finalizado.', '111.111.111-11', '2022-12-06', '11:39:26', NULL, NULL, NULL),
(366, 'Sistema iniciado.', NULL, '2022-12-06', '11:41:21', NULL, NULL, NULL),
(367, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-12-06', '11:41:21', NULL, NULL, NULL),
(368, 'Sistema finalizado.', '111.111.111-11', '2022-12-06', '11:41:21', NULL, NULL, NULL),
(369, 'Sistema iniciado.', NULL, '2022-12-06', '11:49:19', NULL, NULL, NULL),
(370, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-12-06', '11:49:19', NULL, NULL, NULL),
(371, 'Sistema finalizado.', '111.111.111-11', '2022-12-06', '11:49:19', NULL, NULL, NULL),
(372, 'Sistema iniciado.', NULL, '2022-12-06', '11:50:22', NULL, NULL, NULL),
(373, 'Tentativa de login bem-sucedida.', '111.111.111-11', '2022-12-06', '11:50:22', NULL, NULL, NULL),
(374, 'Tentativa de remoção bem-sucedida (Reserva).', '111.111.111-11', '2022-12-06', '11:50:28', NULL, NULL, NULL),
(375, 'Tentativa de remoção bem-sucedida (Reserva).', '111.111.111-11', '2022-12-06', '11:50:28', NULL, NULL, NULL),
(376, 'Tentativa de remoção bem-sucedida (Reserva).', '111.111.111-11', '2022-12-06', '11:50:28', NULL, NULL, NULL),
(377, 'Tentativa de inserção bem-sucedida (Reserva).', '111.111.111-11', '2022-12-06', '11:50:28', NULL, '665.448.888-88', NULL),
(378, 'Sistema finalizado.', '111.111.111-11', '2022-12-06', '11:50:22', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(9) NOT NULL,
  `cpfCliente` char(14) DEFAULT NULL,
  `cpfFuncionario` char(14) DEFAULT NULL,
  `dataReserva` date DEFAULT NULL,
  `entradaHoraReserva` time DEFAULT NULL,
  `saidaHoraReserva` time DEFAULT NULL,
  `mesaReserva` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `reserva`
--

INSERT INTO `reserva` (`idReserva`, `cpfCliente`, `cpfFuncionario`, `dataReserva`, `entradaHoraReserva`, `saidaHoraReserva`, `mesaReserva`) VALUES
(5, '665.448.888-88', '156.831.136-28', '2022-12-03', '14:00:00', '14:00:00', '4');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administracao`
--
ALTER TABLE `administracao`
  ADD PRIMARY KEY (`nivelAdministracao`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cpfCliente`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`cpfFuncionario`),
  ADD KEY `funcionario_administracao_niveladministracao` (`nivelAdministracao`);

--
-- Indexes for table `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`idRegistro`),
  ADD KEY `registro_funcionario` (`cpfFuncionario`),
  ADD KEY `idReserva` (`idReserva`),
  ADD KEY `cpfCliente` (`cpfCliente`);

--
-- Indexes for table `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `reserva_cliente` (`cpfCliente`),
  ADD KEY `reserva_funcionario` (`cpfFuncionario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `registro`
--
ALTER TABLE `registro`
  MODIFY `idRegistro` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=379;
--
-- AUTO_INCREMENT for table `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD CONSTRAINT `funcionario_administracao_niveladministracao` FOREIGN KEY (`nivelAdministracao`) REFERENCES `administracao` (`nivelAdministracao`);

--
-- Limitadores para a tabela `registro`
--
ALTER TABLE `registro`
  ADD CONSTRAINT `registro_funcionario` FOREIGN KEY (`cpfFuncionario`) REFERENCES `funcionario` (`cpfFuncionario`),
  ADD CONSTRAINT `registro_ibfk_1` FOREIGN KEY (`idReserva`) REFERENCES `reserva` (`idReserva`),
  ADD CONSTRAINT `registro_ibfk_2` FOREIGN KEY (`cpfCliente`) REFERENCES `cliente` (`cpfCliente`);

--
-- Limitadores para a tabela `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_cliente` FOREIGN KEY (`cpfCliente`) REFERENCES `cliente` (`cpfCliente`),
  ADD CONSTRAINT `reserva_funcionario` FOREIGN KEY (`cpfFuncionario`) REFERENCES `funcionario` (`cpfFuncionario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
