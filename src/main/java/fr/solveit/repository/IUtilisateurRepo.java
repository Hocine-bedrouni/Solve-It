package fr.solveit.repository;

import fr.solveit.model.Formateur;
import fr.solveit.model.Stagiaire;
import fr.solveit.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUtilisateurRepo extends JpaRepository<Utilisateur, String> {

    @Query("select f from Formateur f")
    List<Formateur> findFormateur();

    @Query("select s from Stagiaire s")
    List<Stagiaire> findAllStagiaire();

    @Query("select a from Administration a")
    List<Stagiaire> findAllAdministration();
}
