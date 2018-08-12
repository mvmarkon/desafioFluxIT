package candidatos.controller;

import candidatos.model.Candidato;
import candidatos.model.CandidatoDto;
import candidatos.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;

    @RequestMapping(value="/candidatos", method = RequestMethod.GET)
    public List<Candidato> listCandidato(){
        return candidatoService.findAll();
    }

    @RequestMapping(value="/candidatos/create", method = RequestMethod.POST)
    public Candidato saveUser(@RequestBody CandidatoDto candidato){
        return candidatoService.save(candidato);

    }
    @RequestMapping(value="/candidatos/delete", method = RequestMethod.POST)
    public ResponseEntity<Candidato> deleteUser(@RequestBody Candidato candidato){
        candidatoService.delete(candidato);
        return ResponseEntity.ok(candidato);
    }

    @RequestMapping(value="/candidatos/update", method = RequestMethod.POST)
    public ResponseEntity<Candidato> update(@RequestBody Candidato candidato){
        candidatoService.update(candidato);
        return ResponseEntity.ok(candidato);
    }
    @RequestMapping(value = "/candidatos/{id}", method = RequestMethod.GET)
    public Candidato getOne(@PathVariable(value = "id") Long id) {
        return candidatoService.findById(id);
    }
}
