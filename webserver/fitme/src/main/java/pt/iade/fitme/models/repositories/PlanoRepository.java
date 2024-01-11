package pt.iade.fitme.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.fitme.models.Plano;
import pt.iade.fitme.models.TipoRefeicao;

public interface PlanoRepository extends CrudRepository<Plano, Integer> {
}