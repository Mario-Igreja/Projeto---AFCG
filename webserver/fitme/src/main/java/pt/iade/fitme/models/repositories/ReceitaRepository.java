package pt.iade.fitme.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.fitme.models.Receita;
import pt.iade.fitme.models.TipoRefeicao;

public interface ReceitaRepository extends CrudRepository<Receita, Integer> {
}