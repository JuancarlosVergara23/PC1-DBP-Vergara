package dbp.pc1.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import dbp.pc1.model.User;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
public class CampusEvent {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Long organizerId;

    private String title;

    private String description;

    private String category;

    private ZonedDateTime eventDate;

    private String location;

    private String status;

    public CampusEvent() {}

    public CampusEvent(Long id, Long organizerId, String title, String description, String category, ZonedDateTime eventDate, String location, String status) {
        this.id = id;
        this.organizerId = organizerId;
        this.title = title;
        this.description = description;
        this.category = category;
        this.eventDate = eventDate;
        this.location = location;
        this.status = status;
    }

}
