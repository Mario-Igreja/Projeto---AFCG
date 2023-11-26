-- tabela atualizada

-- Tabela de Tipo de Exercício
CREATE TABLE tipo_exercicio (
  tipex_id INT NOT NULL AUTO_INCREMENT,
  tipex_nome VARCHAR(100) NOT NULL,
  
  PRIMARY KEY (tipex_id)
);

-- Tabela de Exercícios
CREATE TABLE exercicios (
  exe_id INT NOT NULL AUTO_INCREMENT,
  exe_nome VARCHAR(100) NOT NULL,
  exe_tipex_id INT NOT NULL,
  
  PRIMARY KEY (exe_id),
);

-- Tabela de Sessão
CREATE TABLE sessao (
  ses_id INT NOT NULL AUTO_INCREMENT,
  ses_nome VARCHAR(100) NOT NULL,
  
  PRIMARY KEY (ses_id)
);

-- Tabela de Plano
CREATE TABLE plano (
  pla_id INT NOT NULL AUTO_INCREMENT,
  pla_nome VARCHAR(100) NOT NULL,
  
  PRIMARY KEY (pla_id)
);

-- Tabela de Usuário
CREATE TABLE usuario (
  usu_id INT NOT NULL AUTO_INCREMENT,
  usu_nome VARCHAR(100) NOT NULL,
  usu_email VARCHAR(100) NOT NULL,
  usu_senha VARCHAR(100) NOT NULL,
  usu_genero ENUM('Masculino','Feminino','Outro'),
  usu_altura DECIMAL(3,2), 
  usu_peso DECIMAL(5,2),
  
  PRIMARY KEY (usu_id)
);

-- Tabela de Plano do Usuário
CREATE TABLE plano_usuario (
  plaus_id INT NOT NULL AUTO_INCREMENT,
  plaus_usu_id INT NOT NULL,
  plaus_pla_id INT NOT NULL,
  
  PRIMARY KEY (plaus_id),
);

-- Tabela de Sessão de Exercícios
CREATE TABLE sessao_exercicios (
  sesexer_id INT NOT NULL AUTO_INCREMENT,
  sesexer_ses_id INT NOT NULL,
  sesexer_exe_id INT NOT NULL,
  sesexer_calorias DECIMAL(5,2),
  sesexer_carga INT,
  sesexer_numero_ordem INT,
  sesexer_numer_repeticoes INT,
  
  PRIMARY KEY (sesexer_id),
);

-- Tabela de Sessão de Exercícios do Usuário
CREATE TABLE sessao_exercicios_usuario (
  sexeusu_id INT NOT NULL AUTO_INCREMENT,
  sexeusu_sesexer_id INT NOT NULL,
  sexeusu_usu_id INT NOT NULL,
  sexeusu_repeticoes_feitas INT,
  
  PRIMARY KEY (sexeusu_id),
);

-- Tabela de Receita
CREATE TABLE receita (
  re_id INT NOT NULL AUTO_INCREMENT,
  re_nome VARCHAR(100) NOT NULL,
  re_calorias DECIMAL(5,2),
  re_carboidratos DECIMAL(5,2),
  re_gordura DECIMAL(5,2),
  re_proteinas DECIMAL(5,2),
  
  PRIMARY KEY (re_id)
);

-- Tabela Receita Plano
CREATE TABLE receita_plano (
  repla_id INT NOT NULL AUTO_INCREMENT,
  repla_pla_id INT NOT NULL,
  repla_re_id INT NOT NULL,
  
  PRIMARY KEY (repla_id),
);

-- Tabela Tipo de Refeição
CREATE TABLE tipo_refeicao (
  tipref_id INT NOT NULL AUTO_INCREMENT,
  tipref_nome VARCHAR(100) NOT NULL,
  
  PRIMARY KEY (tipref_id)
);

-- Foreign Keys

-- Tabela de Exercícios
ALTER TABLE exercicios
ADD CONSTRAINT exercicios_fk_tipo_exercicio
FOREIGN KEY (exe_tipex_id) REFERENCES tipo_exercicio(tipex_id);
ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Tabela Plano do Usuário
ALTER TABLE plano_usuario
ADD CONSTRAINT plano_usuario_fk_usuario
FOREIGN KEY (plaus_usu_id) REFERENCES usuario(usu_id),

ADD CONSTRAINT plano_usuario_fk_plano
FOREIGN KEY (plaus_pla_id) REFERENCES plano(pla_id);
ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Tabela de Sessão de Exercícios
ALTER TABLE sessao_exercicios
ADD CONSTRAINT sessao_exercicios_fk_sessao
FOREIGN KEY (sesexer_ses_id) REFERENCES sessao(ses_id),

ADD CONSTRAINT sessao_exercicios_fk_exercicios
FOREIGN KEY (sesexer_exe_id) REFERENCES exercicios(exe_id);
ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Tabela de Sessão de Exercícios do Usuário
ALTER TABLE sessao_exercicios_usuario
ADD CONSTRAINT sessao_exercicios_usuario_fk_sessao_exercicios
FOREIGN KEY (sexeusu_sesexer_id) REFERENCES sessao_exercicios(sesexer_id),

ADD CONSTRAINT sessao_exercicios_usuario_fk_usuario
FOREIGN KEY (sexeusu_usu_id) REFERENCES usuario(usu_id);
ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Tabela Receita Plano
ALTER TABLE receita_plano
ADD CONSTRAINT receita_plano_fk_plano
FOREIGN KEY (repla_pla_id) REFERENCES plano(pla_id),

ADD CONSTRAINT receita_plano_fk_receita
FOREIGN KEY (repla_re_id) REFERENCES receita(re_id);
ON DELETE NO ACTION ON UPDATE NO ACTION;