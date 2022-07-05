package fr.solveit.repository;

import fr.solveit.model.FeuilleEmargement;
import fr.solveit.model.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFeuilleEmargementRepo extends JpaRepository<FeuilleEmargement, String> {
}
