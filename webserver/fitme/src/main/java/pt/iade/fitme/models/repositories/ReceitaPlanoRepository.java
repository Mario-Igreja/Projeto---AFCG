package pt.iade.fitme.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.fitme.models.ReceitaPlano;
import pt.iade.fitme.models.TipoRefeicao;

public interface ReceitaPlanoRepository extends CrudRepository<ReceitaPlano, Integer> {
}
