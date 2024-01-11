package pt.iade.fitme.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.fitme.models.Exercicios;
import pt.iade.fitme.models.TipoRefeicao;

public interface ExerciciosRepository extends CrudRepository<Exercicios, Integer> {
}
