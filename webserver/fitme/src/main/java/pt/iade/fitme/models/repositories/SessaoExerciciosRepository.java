package pt.iade.fitme.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.fitme.models.SessaoExercicios;
import pt.iade.fitme.models.TipoRefeicao;

public interface SessaoExerciciosRepository extends CrudRepository<SessaoExercicios, Integer> {
}
