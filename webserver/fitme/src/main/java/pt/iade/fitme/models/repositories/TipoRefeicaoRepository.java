package pt.iade.fitme.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.fitme.models.TipoRefeicao;
import pt.iade.fitme.models.Usuario;

public interface TipoRefeicaoRepository extends CrudRepository<TipoRefeicao, Integer> {
}