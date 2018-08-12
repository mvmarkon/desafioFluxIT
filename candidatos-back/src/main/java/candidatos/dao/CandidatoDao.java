package candidatos.dao;

import candidatos.model.Candidato;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public interface CandidatoDao  extends CrudRepository<Candidato, Long> {

    Candidato findById(String id);
}
