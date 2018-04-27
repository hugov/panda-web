CREATE SCHEMA `panda-web-db` ;

CREATE TABLE `panda-web-db`.`categoria` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(50) NULL,
  `situacao` INT NULL,
  PRIMARY KEY (`id`))
COMMENT = 'Tabela responsável pelo armazenamento da categoria.';