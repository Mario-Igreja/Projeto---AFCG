package pt.iade.fitme.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.fitme.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}