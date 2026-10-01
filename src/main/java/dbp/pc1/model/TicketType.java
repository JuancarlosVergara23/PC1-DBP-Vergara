package dbp.pc1.model;

import jakarta.persistence.*;
import dbp.pc1.model.CampusEvent;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class TicketType {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Long eventId;

    private String name;

    private int capacity;

    private int registeredCount;

    private String status;

    public TicketType() {}

    public TicketType(Long id, Long eventId, String name, int capacity, int registeredCount, String status) {
        this.id = id;
        this.eventId = eventId;
        this.name = name;
        this.capacity = capacity;
        this.registeredCount = registeredCount;
        this.status = status;
    }
}
