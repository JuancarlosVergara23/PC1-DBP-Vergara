package dbp.pc1.repository;

import dbp.pc1.model.TicketType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketTypeRepository extends JpaRepository<TicketType, Long> {
}
