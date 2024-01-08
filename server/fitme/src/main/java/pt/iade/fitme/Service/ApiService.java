package pt.iade.fitme.Service;

import org.springframework.stereotype.Service;
import pt.iade.fitme.models.Dado;

import java.util.List;

@Service
public class ApiService {
    public List<Dado> obterDados() {
        Dado.add(new Dado("Nome1", "Valor1"));
        Dado.add(new Dado("Nome2", "Valor2"));
        return dados;
    }
}
