package dbp.pc1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@Entity
public class EventRegistration {

    @Id
    @GeneratedValue
    private Long id;

    private Long eventId;

    private Long ticketTypeId;

    private Long attendeeId;

    private ZonedDateTime registeredAt;

    private String status;

    public EventRegistration() {}

}
