package fr.solveit.repository;

import fr.solveit.model.Absence;
import fr.solveit.model.AbsenceId;
import fr.solveit.model.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAbsenceRepo extends JpaRepository<Absence, AbsenceId> {
}
