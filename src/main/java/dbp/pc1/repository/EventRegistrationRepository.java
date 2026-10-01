package dbp.pc1.repository;

import dbp.pc1.model.EventRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRegistrationRepository extends JpaRepository<EventRegistration, Long> {
}
