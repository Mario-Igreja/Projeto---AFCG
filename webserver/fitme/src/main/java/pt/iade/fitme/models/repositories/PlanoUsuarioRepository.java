package pt.iade.fitme.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.fitme.models.PlanoUsuario;
import pt.iade.fitme.models.TipoRefeicao;

public interface PlanoUsuarioRepository extends CrudRepository<PlanoUsuario, Integer> {
}