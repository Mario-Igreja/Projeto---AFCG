-- MySQL Script generated by MySQL Workbench
-- Thu Jan  4 12:15:07 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema fitme
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema fitme
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `fitme` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `fitme` ;

-- -----------------------------------------------------
-- Table `fitme`.`tipo_exercicio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fitme`.`tipo_exercicio` (
  `tipex_id` INT NOT NULL AUTO_INCREMENT,
  `tipex_nome` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`tipex_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `fitme`.`exercicios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fitme`.`exercicios` (
  `exe_id` INT NOT NULL AUTO_INCREMENT,
  `exe_nome` VARCHAR(100) NOT NULL,
  `exe_tipex_id` INT NOT NULL,
  `dificuldade` INT NULL DEFAULT NULL,
  `calorias_min` INT NULL DEFAULT NULL,
  PRIMARY KEY (`exe_id`),
  INDEX `exercicios_fk_tipo_exercicio` (`exe_tipex_id` ASC) VISIBLE,
  CONSTRAINT `exercicios_fk_tipo_exercicio`
    FOREIGN KEY (`exe_tipex_id`)
    REFERENCES `fitme`.`tipo_exercicio` (`tipex_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `fitme`.`plano`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fitme`.`plano` (
  `pla_id` INT NOT NULL AUTO_INCREMENT,
  `pla_nome` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`pla_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `fitme`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fitme`.`usuario` (
  `usu_id` INT NOT NULL AUTO_INCREMENT,
  `usu_nome` VARCHAR(100) NOT NULL,
  `usu_email` VARCHAR(100) NOT NULL,
  `usu_senha` VARCHAR(100) NOT NULL,
  `usu_genero` ENUM('Masculino', 'Feminino', 'Outro') NULL DEFAULT NULL,
  `usu_altura` FLOAT NULL DEFAULT NULL,
  `usu_peso` FLOAT NULL DEFAULT NULL,
  `usuariocol` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`usu_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `fitme`.`plano_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fitme`.`plano_usuario` (
  `plaus_id` INT NOT NULL AUTO_INCREMENT,
  `plaus_usu_id` INT NOT NULL,
  `plaus_pla_id` INT NOT NULL,
  PRIMARY KEY (`plaus_id`),
  INDEX `plano_usuario_fk_usuario` (`plaus_usu_id` ASC) VISIBLE,
  INDEX `plano_usuario_fk_plano` (`plaus_pla_id` ASC) VISIBLE,
  CONSTRAINT `plano_usuario_fk_plano`
    FOREIGN KEY (`plaus_pla_id`)
    REFERENCES `fitme`.`plano` (`pla_id`),
  CONSTRAINT `plano_usuario_fk_usuario`
    FOREIGN KEY (`plaus_usu_id`)
    REFERENCES `fitme`.`usuario` (`usu_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `fitme`.`tipo_refeicao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fitme`.`tipo_refeicao` (
  `tipref_id` INT NOT NULL AUTO_INCREMENT,
  `tipref_nome` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`tipref_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `fitme`.`receita`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fitme`.`receita` (
  `re_id` INT NOT NULL AUTO_INCREMENT,
  `re_nome` VARCHAR(100) NOT NULL,
  `re_calorias` DECIMAL(5,2) NULL DEFAULT NULL,
  `tiporef_id` INT NOT NULL,
  PRIMARY KEY (`re_id`),
  INDEX `fk_re_tiporef_idx` (`tiporef_id` ASC) VISIBLE,
  CONSTRAINT `fk_re_tiporef`
    FOREIGN KEY (`tiporef_id`)
    REFERENCES `fitme`.`tipo_refeicao` (`tipref_id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `fitme`.`receita_plano`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fitme`.`receita_plano` (
  `repla_id` INT NOT NULL AUTO_INCREMENT,
  `repla_pla_id` INT NOT NULL,
  `repla_re_id` INT NOT NULL,
  PRIMARY KEY (`repla_id`),
  INDEX `receita_plano_fk_plano` (`repla_pla_id` ASC) VISIBLE,
  INDEX `receita_plano_fk_receita` (`repla_re_id` ASC) VISIBLE,
  CONSTRAINT `receita_plano_fk_plano`
    FOREIGN KEY (`repla_pla_id`)
    REFERENCES `fitme`.`plano` (`pla_id`),
  CONSTRAINT `receita_plano_fk_receita`
    FOREIGN KEY (`repla_re_id`)
    REFERENCES `fitme`.`receita` (`re_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `fitme`.`sessao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fitme`.`sessao` (
  `ses_id` INT NOT NULL AUTO_INCREMENT,
  `ses_nome` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`ses_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `fitme`.`sessao_exercicios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fitme`.`sessao_exercicios` (
  `sesexer_id` INT NOT NULL AUTO_INCREMENT,
  `sesexer_ses_id` INT NOT NULL,
  `sesexer_exe_id` INT NOT NULL,
  `sesexer_calorias` DECIMAL(5,2) NULL DEFAULT NULL,
  `sesexer_carga` INT NULL DEFAULT NULL,
  `sesexer_numero_ordem` INT NULL DEFAULT NULL,
  `sesexer_numer_repeticoes` INT NULL DEFAULT NULL,
  PRIMARY KEY (`sesexer_id`),
  INDEX `sessao_exercicios_fk_sessao` (`sesexer_ses_id` ASC) VISIBLE,
  INDEX `sessao_exercicios_fk_exercicios` (`sesexer_exe_id` ASC) VISIBLE,
  CONSTRAINT `sessao_exercicios_fk_exercicios`
    FOREIGN KEY (`sesexer_exe_id`)
    REFERENCES `fitme`.`exercicios` (`exe_id`),
  CONSTRAINT `sessao_exercicios_fk_sessao`
    FOREIGN KEY (`sesexer_ses_id`)
    REFERENCES `fitme`.`sessao` (`ses_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `fitme`.`sessao_exercicios_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fitme`.`sessao_exercicios_usuario` (
  `sexeusu_id` INT NOT NULL AUTO_INCREMENT,
  `sexeusu_sesexer_id` INT NOT NULL,
  `sexeusu_usu_id` INT NOT NULL,
  `sexeusu_repeticoes_feitas` INT NULL DEFAULT NULL,
  PRIMARY KEY (`sexeusu_id`),
  INDEX `sessao_exercicios_usuario_fk_sessao_exercicios` (`sexeusu_sesexer_id` ASC) VISIBLE,
  INDEX `sessao_exercicios_usuario_fk_usuario` (`sexeusu_usu_id` ASC) VISIBLE,
  CONSTRAINT `sessao_exercicios_usuario_fk_sessao_exercicios`
    FOREIGN KEY (`sexeusu_sesexer_id`)
    REFERENCES `fitme`.`sessao_exercicios` (`sesexer_id`),
  CONSTRAINT `sessao_exercicios_usuario_fk_usuario`
    FOREIGN KEY (`sexeusu_usu_id`)
    REFERENCES `fitme`.`usuario` (`usu_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
