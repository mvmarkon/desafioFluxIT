package candidatos.service;

import candidatos.dao.CandidatoDao;
import candidatos.model.Candidato;
import candidatos.model.CandidatoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Service(value = "candidatoService")
public class CandidatoServiceImpl implements CandidatoService {

    @Autowired
    private CandidatoDao candidatoDao;


    @PersistenceContext
    private EntityManager em;

    @Transactional
    public List<Candidato> findAll() {
        List<Candidato> list = new ArrayList<>();
        candidatoDao.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Transactional
    @Override
    public Candidato findById(Long id) {
        return candidatoDao.findOne(id);
    }

    @Transactional
    @Override
    public Candidato save(CandidatoDto candidato) {
        Candidato newCandidato = new Candidato();
        newCandidato.setNomyapp(candidato.getNomyapp());
        newCandidato.setDni(candidato.getDni());
        newCandidato.setFechaNacimiento(candidato.getFechaNacimiento());
        newCandidato.setDescrDomicilio(candidato.getDescrDomicilio());
        newCandidato.setTelefono(candidato.getTelefono());
        newCandidato.setMail(candidato.getMail());
        newCandidato.setFoto(candidato.getFoto());
        newCandidato.setDescrExperiencia(candidato.getDescrExperiencia());
        newCandidato.setRechazado(false);

        return candidatoDao.save(newCandidato);
    }
    @Transactional
    public void update(Candidato candidato) {
        em.merge(candidato);
    }

    @Transactional
    public void delete(Candidato candidato) {
        candidato.setRechazado(true);
        em.merge(candidato);
    }
}
