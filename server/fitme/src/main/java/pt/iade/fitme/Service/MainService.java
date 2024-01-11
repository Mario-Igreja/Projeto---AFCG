package pt.iade.fitme.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exemplo.models.Dados;
import com.exemplo.repositories.DadosRepository;
import pt.iade.fitme.models.Repository.DadosRepository;
import pt.iade.fitme.models.Dados;

@Service
    public class MainService {

        @Autowired
        private DadosRepository dadosRepository;

        public String analisarDados(String nome, int numero) {
            // Lógica para analisar nome e número
            // Salvar no banco de dados como exemplo
            Dados dados = new Dados();
            dados.setNome(nome);
            dados.setNumero(numero);
            dadosRepository.save(dados);

            return "Analisando dados: Nome - " + nome + ", Número - " + numero;
        }

        public String processarDados(String nome, int numero) {
            // Lógica para processar nome e número
            // Buscar dados no banco de dados como exemplo
            Dados dados = dadosRepository.findById(1L).orElse(null);

            if (dados != null) {
                return "Processando dados: Nome - " + dados.getNome() + ", Número - " + dados.getNumero();
            } else {
                return "Dados não encontrados";
            }
        }
    }





