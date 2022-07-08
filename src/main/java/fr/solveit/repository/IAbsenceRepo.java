package fr.solveit.repository;
import fr.solveit.model.Absence;
import fr.solveit.model.AbsenceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAbsenceRepo extends JpaRepository<Absence, AbsenceId> {

}
