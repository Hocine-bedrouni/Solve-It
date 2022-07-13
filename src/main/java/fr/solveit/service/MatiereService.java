package fr.solveit.service;

import fr.solveit.model.Matiere;
import fr.solveit.repository.IMatiereRepo;
import fr.solveit.repository.IVilleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class MatiereService {
    @Autowired
    private IMatiereRepo iMatiereRepo;

    /**
     * methode qui recupere du Repo les Matieres
     * @return List<Matiere>
     */
    public List<Matiere> findAll(){
        return this.iMatiereRepo.findAll();
    }

    /**
     * methode qui permet de recuperer une Matiere par son id
     * @param id Long, id de la Matiere recherchée
     * @return Matiere
     */
    public Matiere findById(Integer id) {
        Optional<Matiere> optMatiere = this.iMatiereRepo.findById(id);
        if (optMatiere.isPresent()) {
            return optMatiere.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }



    /**
     * methode qui permet d'enregistrer une Matiere
     * @param newMatiere Matiere, la Matiere a enregistrée
     * @return Matiere, la Matiere enregistrée avec son id
     */
    public Matiere create(Matiere newMatiere) {
        return this.iMatiereRepo.save(newMatiere);
    }

    /**
     * methode qui met a jour une Matiere dans ma bdd
     * @param matiere Matiere, la Matiere a mettre à jour
     * @return Matiere, la Matiere mise à jour
     */
    public Matiere update(Matiere matiere) {
        if (! this.iMatiereRepo.existsById(matiere.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE,
                    "impossible de trouver la Matiere a mettre à jour");
        }
        return this.iMatiereRepo.save(matiere);
    }

    /**
     * methode qui supprime une Matiere de la bdd si elle y est
     * puis verifie si elle a bien été supprimée
     * @param id Long, id de la Matiere à supprimer
     * @return Matiere
     */
    public Matiere delete (Integer id) {
        if (! this.iMatiereRepo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "impossible de trouver la Matiere à supprimer");
        }
        Matiere matiereDel = this.findById(id);
        this.iMatiereRepo.deleteById(id);
        if (this.iMatiereRepo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED,
                    "erreur lors de la suppressiion de la Matiere");
        }

        return matiereDel;
    }


}
