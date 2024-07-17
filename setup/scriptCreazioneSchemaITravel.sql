
CREATE SCHEMA IF NOT EXISTS `itravel`;
USE `itravel` ;

-- -----------------------------------------------------
-- Table `itravel`.`luogo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itravel`.`luogo` (
  `id_luogo` INT NOT NULL,
  `citta` VARCHAR(45) NOT NULL,
  `indirizzo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_luogo`));


-- -----------------------------------------------------
-- Table `itravel`.`itinerario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itravel`.`itinerario` (
  `id_itinerario` INT NOT NULL,
  `partenza_id` INT NOT NULL,
  `arrivo_id` INT NOT NULL,
  `data_partenza` DATETIME NULL DEFAULT NULL,
  `data_arrivo` DATETIME NULL DEFAULT NULL,
  `durata_viaggio` TIME NULL DEFAULT NULL,
  PRIMARY KEY (`id_itinerario`),
  CONSTRAINT `itinerario_arrivo_fk`
    FOREIGN KEY (`arrivo_id`)
    REFERENCES `itravel`.`luogo` (`id_luogo`),
  CONSTRAINT `itinerario_partenza_fk`
    FOREIGN KEY (`partenza_id`)
    REFERENCES `itravel`.`luogo` (`id_luogo`));

-- -----------------------------------------------------
-- Table `itravel`.`mezzo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itravel`.`mezzo` (
  `id_mezzo` INT NOT NULL,
  `targa` VARCHAR(45) NOT NULL,
  `marca` VARCHAR(45) NULL DEFAULT NULL,
  `anno_produzione` INT NULL DEFAULT NULL,
  `alimentazione` VARCHAR(45) NULL DEFAULT NULL,
  `capienza` INT NOT NULL,
  `posti_occupati` INT NULL DEFAULT NULL,
  `posti_liberi` INT NULL DEFAULT NULL,
  `itinerario_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id_mezzo`, `targa`),
  CONSTRAINT `mezzo_itinerario_fk`
    FOREIGN KEY (`itinerario_id`)
    REFERENCES `itravel`.`itinerario` (`id_itinerario`));


-- -----------------------------------------------------
-- Table `itravel`.`autista`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itravel`.`autista` (
  `id_autista` INT NOT NULL,
  `nome` VARCHAR(45) NULL DEFAULT NULL,
  `cognome` VARCHAR(45) NULL DEFAULT NULL,
  `data_nascita` DATETIME NULL DEFAULT NULL,
  `documento` VARCHAR(45) NULL DEFAULT NULL,
  `tipo_patente` VARCHAR(45) NULL DEFAULT NULL,
  `mezzo_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id_autista`),
  CONSTRAINT `autista_mezzo_fk`
    FOREIGN KEY (`mezzo_id`)
    REFERENCES `itravel`.`mezzo` (`id_mezzo`));


-- -----------------------------------------------------
-- Table `itravel`.`passeggero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itravel`.`passeggero` (
  `id_passeggero` INT NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `cognome` VARCHAR(45) NOT NULL,
  `eta` INT NULL DEFAULT NULL,
  `tipo_documento` VARCHAR(45) NOT NULL,
  `numero_documento` VARCHAR(45) NOT NULL,
  `tipo_passeggero` VARCHAR(45) NULL DEFAULT NULL,
  `passeggerocol` VARCHAR(45) NOT NULL,
  `itinerario_id` INT NOT NULL,
  `mezzo_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id_passeggero`),
  CONSTRAINT `passeggero_itinerario_fk`
    FOREIGN KEY (`itinerario_id`)
    REFERENCES `itravel`.`itinerario` (`id_itinerario`),
  CONSTRAINT `passeggero_mezzo_fk`
    FOREIGN KEY (`mezzo_id`)
    REFERENCES `itravel`.`mezzo` (`id_mezzo`));


-- -----------------------------------------------------
-- Table `itravel`.`posto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itravel`.`posto` (
  `id_posto` INT NOT NULL,
  `numeroPosto` VARCHAR(45) NULL DEFAULT NULL,
  `passeggero_id` INT NULL DEFAULT NULL,
  `mezzo_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id_posto`),
  CONSTRAINT `posto_mezzo_fk`
    FOREIGN KEY (`mezzo_id`)
    REFERENCES `itravel`.`mezzo` (`id_mezzo`),
  CONSTRAINT `posto_passeggero_fk`
    FOREIGN KEY (`passeggero_id`)
    REFERENCES `itravel`.`passeggero` (`id_passeggero`));
