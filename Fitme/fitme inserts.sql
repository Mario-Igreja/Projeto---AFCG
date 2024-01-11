-- Inserir usuario
INSERT INTO usuario (usu_nome, usu_email, usu_senha, usu_genero, usu_altura, usu_peso) 
VALUES ('Nome do Usuário', 'email@dominio.com', 'senha', 'Masculino', 187.65, 87.65);
INSERT INTO usuario (usu_nome, usu_email, usu_senha, usu_genero, usu_altura, usu_peso) 
VALUES ('Nome do Usuário', 'email@dominio.com', 'senha', 'Feminino', 169.65, 68.65);

 -- Inserir tipos de refeição
INSERT INTO tipo_refeicao (tipref_nome) VALUES('Frutas');
INSERT INTO tipo_refeicao (tipref_nome) VALUES('Vegetais');
INSERT INTO tipo_refeicao (tipref_nome) VALUES('Proteínas');
INSERT INTO tipo_refeicao (tipref_nome) VALUES('Grãos e Sementes');
INSERT INTO tipo_refeicao (tipref_nome) VALUES('Outros');
INSERT INTO tipo_refeicao (tipref_nome) VALUES('Proteínas e Substitutos de Carne');
INSERT INTO tipo_refeicao (tipref_nome) VALUES('Laticínios e Substitutos');
INSERT INTO tipo_refeicao (tipref_nome) VALUES('Açúcares e Doces'); 
  
  -- Inserção dos dados na tabela receita
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Maçã', 52, 1);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Banana', 89, 1);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Morango', 32, 1);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Abacate', 160, 1);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Pêra', 57, 1);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Abacaxi', 50, 1);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Uva', 69, 1);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Mamão', 43, 1);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Melancia', 30, 1);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Pêssego', 39, 1);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Kiwi', 61, 1);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Manga', 60, 1);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Cereja', 50, 1);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Espinafre', 23, 2);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Brócolis', 55, 2);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Cenoura', 41, 2);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Couve-flor', 25, 2);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Aspargos', 20, 2);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Alface', 5, 2);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Pepino', 16, 2);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Berinjela', 25, 2);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Tomate', 18, 2);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Couve-de-bruxelas', 43, 2);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Feijão-verde cozido', 31, 2);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Aipo', 16, 2);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Pimentão vermelho', 31, 2);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Abóbora-moranga cozida', 26, 2);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Cogumelos', 22, 2);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Peito de frango cozido', 165, 3);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Salmão grelhado', 206, 3);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Ovos cozidos', 155, 3);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Carne de porco grelhada', 143, 3);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Sardinha em lata (em água)', 135, 3);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Camarão cozido', 85, 3);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Peito de peru grelhado', 135, 3);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Carne magra de vaca cozida', 250, 3);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Frango assado', 165, 3);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Bacalhau cozido', 82, 3);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Aveia (cozida)', 68, 4);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Quinoa cozida', 120, 4);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Arroz integral cozido', 111, 4);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Feijão preto cozido', 132, 4);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Lentilhas cozidas', 116, 4);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Amêndoas', 576, 4);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Nozes', 654, 4);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Aveia em flocos', 389, 4);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Arroz branco cozido', 130, 4);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Feijão-verde cozido', 31, 4);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Amendoim torrado', 567, 4);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Semente de chia', 486, 4);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Macarrão de trigo integral cozido', 124, 4);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Batata-doce assada', 90, 5);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Cogumelos', 22, 5);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Mel', 304, 5);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Presunto magro', 110, 5);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Tofu', 144, 6);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Frango assado', 165, 6);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Bacalhau cozido', 82, 6);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Atum enlatado em água', 84, 6);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Presunto magro', 110, 6);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Queijo cottage', 98, 7);
INSERT INTO receita (re_nome, re_calorias, tiporef_id) VALUES('Mel', 304, 8);



-- Inserir tipos de exercício
INSERT INTO tipo_exercicio (tipex_nome) VALUES ('Aquecimento');
INSERT INTO tipo_exercicio (tipex_nome) VALUES ('Treino de Peito e Braços');
INSERT INTO tipo_exercicio (tipex_nome) VALUES ('Alongamento e Flexibilidade');
INSERT INTO tipo_exercicio (tipex_nome) VALUES ('Treino de Costas e Ombros');
INSERT INTO tipo_exercicio (tipex_nome) VALUES ('Treino de Pernas e Panturrilhas');
INSERT INTO tipo_exercicio (tipex_nome) VALUES ('Treino de Abdômen e Core');
INSERT INTO tipo_exercicio (tipex_nome) VALUES ('Treino de Glúteos e Costas');
INSERT INTO tipo_exercicio (tipex_nome) VALUES ('Treino de Tríceps e Ombros');
INSERT INTO tipo_exercicio (tipex_nome) VALUES ('Treino de Pernas');
INSERT INTO tipo_exercicio (tipex_nome) VALUES ('Caminhada');


-- Inserir exercícios com sistema de dificuldade e calorias
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Saltar a corda', 1, NULL, 10);  -- Aquecimento

INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexão inclinada', 2, 3, 5);   -- Treino de Peito e Braços
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexão com os joelhos', 2, 2, 6);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexões', 2, 3, 5);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexão com os braços abertos', 2, 3, 6);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexão na caixa', 2, 2, 5);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexão hindu', 2, 3, 8);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Supino com os pulsos', 2, 2, 5);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexão losango', 2, 3, 8);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES('Elevações dos braços', 2, 2, 6);

INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Alongamento do tríceps lado (esquerdo ou direito)', 3, 2, 4);  -- Alongamento e Flexibilidade
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Alongamento do bíceps de pé lado (esquerdo ou direito)', 3, 2, 4);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Boca de incêndio à (esquerda ou direita)', 3, 3, 8);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Estocada', 3, 3, 6);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Perna (esquerda ou direita) círculos laterais', 3, 3, 6);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Mede-palmos', 3, 1, 3);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Alongamento do tríceps lado (esquerdo e direito)', 3, 2, 6);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Alongamento do bíceps de pé lado (esquerdo e direito)', 3, 2, 6);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Pulo lateral', 3, 2, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Elevação lateral das pernas deitado (esquerda ou direita)', 3, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Alongamento de quadríceps (esquerda ou direita) na parede', 3, 2, 6);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Levantamento de panturrilha na parede', 3, 2, 6);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Agachamento Sumô e levantamento de panturrilha na parede', 3, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Contração romboide', 3, 2, 6);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Alongamento lateral (esquerdo ou direito) deitado no chão', 3, 2, 6);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Tesouras com os braços', 3, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Postura gato-vaca', 3, 2, 6);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexão de tríceps pronado', 3, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Contração inclinada do romboide', 3, 2, 6);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Postura de criança', 3, 1, 4);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Toque de calcanhar', 3, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Abdominal cruzado', 3, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Montanha', 3, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Ponte lateral (esquerda ou direita)', 3, 2, 12);

INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Levantamento lateral dos braços', 4, 2, 12);  -- Treino de Costas e Ombros
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Círculos com os braços no sentido horário e anti-horário', 4, 2, 12);

INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Pulos com uma perna (esquerda ou direita) para a panturrilha', 5, 3, 15);  -- Treino de Pernas e Panturrilhas
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexão de quadril', 5, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Agachamento sumô', 5, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Chutes horizontais invertidos', 5, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Sentar na parede', 5, 2, 12);

INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Super-homem e nadador', 6, 3, 15);  -- Treino de Abdômen e Core
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Sente-ups', 6, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Abdominal russo', 6, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Ponte de nádegas', 6, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Abdominal de bicicleta', 6, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('V para cima', 6, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Abdominais', 6, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Abdominal cruzado', 6, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Elevação de pernas', 6, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Abdominal de bicicleta', 6, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexões e rotação', 6, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Tábua do lado (direito ou esquerdo)', 6, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexão em degrau', 6, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Afundos de tríceps no chão', 6, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexões militares', 6, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Ganchos alternados', 6, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Burpee', 6, 4, 20);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Tesouras com os braços', 6, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Pulando sem corda', 6, 3, 20);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Abdominal afundo', 6, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Alongamento cobra', 6, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Alongamento de quadríceps (esquerdo ou direito) na parede', 6, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Alongamento joelho no peito lado (esquerdo ou direito)', 6, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Prancha', 6, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Alongamento da coluna lombar lado (esquerdo ou direito)', 6, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Abdominal losango', 6, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Prancha diagonal', 6, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Socos', 6, 2, 12);

INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Ponte nádegas', 7, 2, 12);  -- Treino de Glúteos e Costas

INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Extensão de tríceps', 8, 3, 15);  -- Treino de Tríceps e Ombros
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexão lateral', 8, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexão em degrau', 8, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexão na caixa', 8, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Flexão com perna lateral', 8, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Alongamento de ombros', 8, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Afundar tríceps com a cadeira', 8, 3, 15);

INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Agachamentos', 9, 3, 15);  -- Treino de Pernas
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Elevação lateral das pernas deitado (esquerda ou direita)', 9, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Abdominal afundo', 9, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Pontapés de burro para a (esquerda ou direita)', 9, 2, 12);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Perna curvada como haltere lado (esquerdo ou direito)', 9, 3, 15);
INSERT INTO exercicios (exe_nome, exe_tipex_id, dificuldade, calorias_min) VALUES ('Prancha diagonal', 9, 2, 12);



-- Inserir a sessão de exercícios (iniciantes)
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Braços (Iniciantes)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Pernas (Iniciantes)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Abdômen (Iniciantes)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Peito (Iniciantes)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Costas (Iniciantes)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Glúteos (Iniciantes)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Ombros (Iniciantes)');

-- Inserir a sessão de exercícios (intermediário)
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Braços (Intermediário)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Pernas (Intermediário)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Abdômen (Intermediário)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Peito (Intermediário)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Glúteos (Intermediário)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Costas (Intermediário)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Ombros (Intermediário)');

-- Inserir a sessão de exercícios (avançado)
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Braços (Avançado)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Pernas (Avançado)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Abdômen (Avançado)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Peito (Avançado)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Glúteos (Avançado)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Costas (Avançado)');
INSERT INTO sessao (ses_nome) VALUES ('Sessão de Exercícios para Ombros (Avançado)');



-- Sessão de Exercícios para Braços (Iniciantes)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(1, 1, 2.0, 1, NULL, 10),
(1, 2, 3.0, 1, NULL, 8),
(1, 3, 2.0, 1, NULL, 10),
(1, 4, 2.0, 1, NULL, 12),
(1, 5, 3.0, 1, NULL, 12),
(1, 6, 3.0, 1, NULL, 10);

-- Sessão de Exercícios para Pernas (Iniciantes)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(2, 7, 2.5, 1, NULL, 12),
(2, 8, 2.0, 1, NULL, 10),
(2, 9, 2.5, 1, NULL, 12),
(2, 10, 2.0, 1, NULL, 10),
(2, 11, 2.5, 1, NULL, 12),
(2, 12, 1.0, 1, NULL, 20);

-- Sessão de Exercícios para Glúteos (Iniciantes)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(1, 39, 2.0, 1, NULL, 12),
(1, 40, 2.5, 1, NULL, 12),
(1, 41, 2.0, 1, NULL, 15),
(1, 42, 2.0, 1, NULL, 12),
(1, 43, 2.5, 1, NULL, 15),
(1, 44, 1.5, 1, NULL, 20),
(1, 45, 3.0, 1, NULL, 15),
(1, 46, 2.0, 1, NULL, 15),
(1, 47, 2.0, 1, NULL, 20),
(1, 48, 2.5, 1, NULL, 15);


-- Sessão de Exercícios para Abdômen (Iniciantes)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(3, 13, 2.0, 1, NULL, 10),
(3, 14, 2.5, 1, NULL, 12),
(3, 15, 1.5, 1, NULL, 15),
(3, 16, 3.0, 1, NULL, 10),
(3, 17, 2.0, 1, NULL, 12),
(3, 18, 2.5, 1, NULL, 10),
(3, 19, 3.0, 1, NULL, 10),
(3, 20, 3.0, 1, NULL, 12),
(3, 21, 3.0, 1, NULL, 15),
(3, 22, 1.5, 1, NULL, 30);

-- Treino de Peito (Iniciantes)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(13, 23, 2.5, 1, NULL, 12),
(13, 1, 1.0, 1, NULL, 15),
(13, 2, 3.0, 1, NULL, 10),
(13, 3, 2.5, 1, NULL, 12),
(13, 24, 2.0, 1, NULL, 12),
(13, 25, 3.0, 1, NULL, 15),
(13, 26, 2.5, 1, NULL, 12),
(13, 4, 2.0, 1, NULL, 15),
(13, 27, 2.5, 1, NULL, 15);

-- Sessão de Exercícios para Ombros (Iniciantes)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(4, 49, 2.0, 1, NULL, 12),
(4, 50, 2.5, 1, NULL, 12),
(4, 51, 2.0, 1, NULL, 15),
(4, 52, 2.0, 1, NULL, 12),
(4, 53, 2.5, 1, NULL, 15),
(4, 54, 1.5, 1, NULL, 20),
(4, 55, 3.0, 1, NULL, 15),
(4, 56, 2.0, 1, NULL, 15),
(4, 57, 2.0, 1, NULL, 20),
(4, 58, 2.5, 1, NULL, 15);

-- Sessão de Exercícios para Costas (Iniciantes)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(7, 59, 2.0, 1, NULL, 12),
(7, 60, 2.5, 1, NULL, 12),
(7, 61, 2.0, 1, NULL, 15),
(7, 62, 2.0, 1, NULL, 12),
(7, 63, 2.5, 1, NULL, 15),
(7, 64, 1.5, 1, NULL, 20),
(7, 65, 3.0, 1, NULL, 15),
(7, 66, 2.0, 1, NULL, 15),
(7, 67, 2.0, 1, NULL, 20),
(7, 68, 2.5, 1, NULL, 15);



-- Sessão de Exercícios para Braços (Intermediários)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(4, 1, 3.0, 2, NULL, 12),
(4, 2, 4.0, 2, NULL, 10),
(4, 3, 3.0, 2, NULL, 12),
(4, 4, 3.0, 2, NULL, 12),
(4, 5, 3.0, 2, NULL, 15),
(4, 6, 3.0, 2, NULL, 15),
(4, 7, 3.0, 2, NULL, 12),
(4, 8, 3.0, 2, NULL, 15),
(4, 9, 3.0, 2, NULL, 10),
(4, 28, 4.0, 2, NULL, 15);

-- Sessão de Exercícios para Pernas (Intermediários)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(5, 7, 4.0, 2, NULL, 12),
(5, 8, 3.0, 2, NULL, 12),
(5, 9, 4.0, 2, NULL, 15),
(5, 10, 3.0, 2, NULL, 12),
(5, 11, 4.0, 2, NULL, 15),
(5, 12, 2.0, 2, NULL, 20),
(5, 29, 4.5, 2, NULL, 12),
(5, 30, 3.5, 2, NULL, 12),
(5, 31, 4.0, 2, NULL, 15),
(5, 32, 3.0, 2, NULL, 20);

-- Sessão de Exercícios para Glúteos (Intermediários)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(2, 39, 3.0, 2, NULL, 15),
(2, 40, 3.5, 2, NULL, 15),
(2, 41, 3.0, 2, NULL, 20),
(2, 42, 3.0, 2, NULL, 15),
(2, 43, 3.5, 2, NULL, 20),
(2, 44, 2.0, 2, NULL, 30),
(2, 45, 4.0, 2, NULL, 15),
(2, 46, 3.0, 2, NULL, 15),
(2, 47, 3.0, 2, NULL, 20),
(2, 48, 3.5, 2, NULL, 15);

-- Sessão de Exercícios para Abdômen (Intermediários)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(6, 13, 3.0, 2, NULL, 15),
(6, 14, 3.0, 2, NULL, 15),
(6, 15, 3.0, 2, NULL, 20),
(6, 16, 4.0, 2, NULL, 20),
(6, 17, 3.0, 2, NULL, 15),
(6, 18, 4.0, 2, NULL, 20),
(6, 19, 4.0, 2, NULL, 15),
(6, 20, 4.0, 2, NULL, 20),
(6, 21, 4.0, 2, NULL, 15),
(6, 22, 2.0, 2, NULL, 45);

-- Treino de Peito (Intermediários)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(14, 23, 4.0, 2, NULL, 20),
(14, 1, 1.5, 2, NULL, 15),
(14, 2, 4.0, 2, NULL, 10),
(14, 3, 3.0, 2, NULL, 12),
(14, 24, 3.5, 2, NULL, 12),
(14, 25, 4.5, 2, NULL, 15),
(14, 26, 4.0, 2, NULL, 20),
(14, 4, 3.0, 2, NULL, 20),
(14, 27, 4.0, 2, NULL, 20);

-- Sessão de Exercícios para Ombros (Intermediários)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(5, 49, 3.0, 2, NULL, 15),
(5, 50, 3.5, 2, NULL, 15),
(5, 51, 3.0, 2, NULL, 20),
(5, 52, 3.0, 2, NULL, 15),
(5, 53, 3.5, 2, NULL, 20),
(5, 54, 2.0, 2, NULL, 30),
(5, 55, 4.0, 2, NULL, 15),
(5, 56, 3.0, 2, NULL, 15),
(5, 57, 3.0, 2, NULL, 20),
(5, 58, 3.5, 2, NULL, 15);

-- Sessão de Exercícios para Costas (Intermediários)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(8, 59, 3.0, 2, NULL, 15),
(8, 60, 3.5, 2, NULL, 15),
(8, 61, 3.0, 2, NULL, 20),
(8, 62, 3.0, 2, NULL, 15),
(8, 63, 3.5, 2, NULL, 20),
(8, 64, 2.0, 2, NULL, 30),
(8, 65, 4.0, 2, NULL, 15),
(8, 66, 3.0, 2, NULL, 15),
(8, 67, 3.0, 2, NULL, 20),
(8, 68, 3.5, 2, NULL, 15);


-- Sessão de Exercícios para Braços (Avançados)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(7, 1, 5.0, 3, NULL, 15),
(7, 2, 5.0, 3, NULL, 12),
(7, 3, 5.0, 3, NULL, 15),
(7, 33, 5.0, 3, NULL, 20),
(7, 5, 5.0, 3, NULL, 15),
(7, 34, 5.0, 3, NULL, 20),
(7, 35, 5.0, 3, NULL, 15),
(7, 36, 5.0, 3, NULL, 15),
(7, 9, 5.0, 3, NULL, 15),
(7, 28, 6.0, 3, NULL, 15);

-- Sessão de Exercícios para Pernas (Avançados)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(8, 7, 6.0, 3, NULL, 15),
(8, 8, 5.0, 3, NULL, 15),
(8, 9, 6.0, 3, NULL, 20),
(8, 10, 5.0, 3, NULL, 15),
(8, 11, 6.0, 3, NULL, 20),
(8, 12, 3.0, 3, NULL, 30),
(8, 37, 7.0, 3, NULL, 15),
(8, 38, 6.0, 3, NULL, 15),
(8, 31, 6.5, 3, NULL, 20),
(8, 32, 5.0, 3, NULL, 30);

-- Sessão de Exercícios para Glúteos (Avançados)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(3, 39, 4.0, 3, NULL, 15),
(3, 40, 4.5, 3, NULL, 15),
(3, 41, 4.0, 3, NULL, 20),
(3, 42, 4.0, 3, NULL, 15),
(3, 43, 4.5, 3, NULL, 20),
(3, 44, 2.5, 3, NULL, 30),
(3, 45, 5.0, 3, NULL, 15),
(3, 46, 4.0, 3, NULL, 15),
(3, 47, 4.0, 3, NULL, 20),
(3, 48, 4.5, 3, NULL, 15);

-- Sessão de Exercícios para Abdômen (Avançados)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(9, 13, 5.0, 3, NULL, 15),
(9, 14, 5.0, 3, NULL, 15),
(9, 15, 5.0, 3, NULL, 20),
(9, 16, 6.0, 3, NULL, 20),
(9, 17, 5.0, 3, NULL, 15),
(9, 18, 6.0, 3, NULL, 20),
(9, 19, 6.0, 3, NULL, 15),
(9, 20, 6.0, 3, NULL, 20),
(9, 21, 6.0, 3, NULL, 15),
(9, 22, 3.0, 3, NULL, 45);

-- Treino de Peito (Avançados)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(15, 23, 6.0, 3, NULL, 20),
(15, 1, 2.0, 3, NULL, 15),
(15, 2, 5.0, 3, NULL, 10),
(15, 3, 4.0, 3, NULL, 12),
(15, 24, 4.5, 3, NULL, 12),
(15, 25, 6.0, 3, NULL, 15),
(15, 26, 5.0, 3, NULL, 20),
(15, 4, 4.0, 3, NULL, 20),
(15, 27, 6.0, 3, NULL, 20);

-- Sessão de Exercícios para Ombros (Avançados)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(6, 49, 4.0, 3, NULL, 15),
(6, 50, 4.5, 3, NULL, 15),
(6, 51, 4.0, 3, NULL, 20),
(6, 52, 4.0, 3, NULL, 15),
(6, 53, 4.5, 3, NULL, 20),
(6, 54, 2.5, 3, NULL, 30),
(6, 55, 5.0, 3, NULL, 15),
(6, 56, 4.0, 3, NULL, 15),
(6, 57, 4.0, 3, NULL, 20),
(6, 58, 4.5, 3, NULL, 15);

-- Sessão de Exercícios para Costas (Avançados)
INSERT INTO sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES
(9, 59, 4.0, 3, NULL, 15),
(9, 60, 4.5, 3, NULL, 15),
(9, 61, 4.0, 3, NULL, 20),
(9, 62, 4.0, 3, NULL, 15),
(9, 63, 4.5, 3, NULL, 20),
(9, 64, 2.5, 3, NULL, 30),
(9, 65, 5.0, 3, NULL, 15),
(9, 66, 4.0, 3, NULL, 15),
(9, 67, 4.0, 3, NULL, 20),
(9, 68, 4.5, 3, NULL, 15);


INSERT INTO fitme.sessao_exercicios (sesexer_ses_id, sesexer_exe_id, sesexer_calorias, sesexer_carga, sesexer_numero_ordem, sesexer_numer_repeticoes)
VALUES (1, 2, 300.00, 15, 1, 10);

INSERT INTO fitme.sessao_exercicios_usuario (sexeusu_sesexer_id, sexeusu_usu_id, sexeusu_repeticoes_feitas)
VALUES (1, 1, 10);

-- Inserir na tabela Plano
INSERT INTO `fitme`.`plano` (`pla_id`, `pla_nome`) VALUES (1, 'treino'), (2, 'alimentação');

-- Inserir na tabela Plano_usuario
INSERT INTO plano_usuario (plaus_usu_id, plaus_pla_id)
VALUES (1, 1);

-- Inserir na tabela receita_Plano
INSERT INTO `fitme`.`receita_plano` (`repla_id`, `repla_pla_id`, `repla_re_id`) VALUES (1, 1, 1), (2, 1, 2), (3, 2, 1);
