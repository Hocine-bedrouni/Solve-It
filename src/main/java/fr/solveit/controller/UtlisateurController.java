package fr.solveit.controller;

import fr.solveit.model.*;
import fr.solveit.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/utilisateurs")
public class UtlisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("/formateurs")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Formateur> findAllFormateur(){
        return utilisateurService.findAllFormateur();
    }
    @GetMapping("/stagiaires")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Stagiaire> findAllStagiaire(){
        return utilisateurService.findAllStagiaire();
    }
    @GetMapping("/administration")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Administration> findAllAdministration(){
        return utilisateurService.findAllAdministration();
    }
    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Utilisateur> findAll() {return utilisateurService.findAll();}
    @GetMapping("/{numsecu}")
    @ResponseStatus(code= HttpStatus.OK)
    public Utilisateur findById(@PathVariable String numsecu) {
        return utilisateurService.findById(numsecu);
    }
    @GetMapping("/stagiaires/{date}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Stagiaire> findByAbsence(@PathVariable Date date){ return utilisateurService.findByAbsence(date);}
    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Utilisateur create(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.create(utilisateur);
    }

    @PostMapping("/{numsecu}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Utilisateur update(@RequestBody Utilisateur utilisateur,@PathVariable String numsecu) {
        if (!numsecu.equals(utilisateur.getNumSecu())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvais compte a mettre à jour");
        }
        return utilisateurService.update(utilisateur);
    }

    @DeleteMapping("/{numsecu}")
    @ResponseStatus(code=HttpStatus.ACCEPTED)
    public Utilisateur delete(@PathVariable String numsecu) {
        return utilisateurService.delete(numsecu);
    }
}
