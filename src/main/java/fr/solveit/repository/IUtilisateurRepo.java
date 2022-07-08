package fr.solveit.repository;

import fr.solveit.model.Formateur;
import fr.solveit.model.Stagiaire;
import fr.solveit.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface IUtilisateurRepo extends JpaRepository<Utilisateur, String> {

    @Query("select f from Formateur f")
    List<Formateur> findAllFormateur();


    @Query("select s from Stagiaire s")
    List<Stagiaire> findAllStagiaire();

    @Query("select a from Administration a")
    List<Stagiaire> findAllAdministration();
    @Query("select s from Stagiaire s left join s.session se left join Absence a where a.session = s.session and se.date_debut = :date")
    List<Stagiaire> findByAbsence(@Param("date") Date date);












}
