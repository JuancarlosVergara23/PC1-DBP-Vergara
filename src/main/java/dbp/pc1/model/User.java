package dbp.pc1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Email
    private String email;

    private String password;

    private String role;

    public User() {}

    public User(Long id, String name, String email, String password, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @OneToOne(mappedBy = "organizerId", optional = false)
    private CampusEvent User;

    public CampusEvent getUser() {
        return User;
    }

    public void setUser(CampusEvent user) {
        User = user;
    }
}
