package candidatos.service;

import candidatos.model.Candidato;
import candidatos.model.CandidatoDto;
import java.util.List;

public interface CandidatoService {

    Candidato save(CandidatoDto user);

    List<Candidato> findAll();

    void delete(Candidato candidato);

    Candidato findById(Long id);

    void update(Candidato candidato);
}
