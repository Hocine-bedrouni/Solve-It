package fr.solveit.repository;

import fr.solveit.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUtilisateurRepo extends JpaRepository<Utilisateur, String> {
}
