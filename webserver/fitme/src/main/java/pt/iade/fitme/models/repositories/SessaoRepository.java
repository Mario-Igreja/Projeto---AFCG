package pt.iade.fitme.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.fitme.models.Sessao;
import pt.iade.fitme.models.TipoRefeicao;

public interface SessaoRepository extends CrudRepository<Sessao, Integer> {
}