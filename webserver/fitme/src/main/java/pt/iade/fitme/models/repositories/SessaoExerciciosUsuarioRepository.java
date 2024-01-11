package pt.iade.fitme.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.fitme.models.SessaoExerciciosUsuario;
import pt.iade.fitme.models.TipoRefeicao;

public interface SessaoExerciciosUsuarioRepository extends CrudRepository<SessaoExerciciosUsuario, Integer> {
}
