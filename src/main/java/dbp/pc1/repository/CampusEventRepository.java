package dbp.pc1.repository;

import dbp.pc1.model.CampusEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampusEventRepository extends JpaRepository<CampusEvent, Long> {
}
