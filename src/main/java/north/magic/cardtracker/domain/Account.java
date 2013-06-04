package north.magic.cardtracker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author North
 */
@Entity
public class Account {

    @Id
    private Long id;
    @Column(length = 64, nullable = false, unique = true)
    private String name;
    @Column(length = 64, nullable = false)
    private String password;
    @Column(length = 64, nullable = false)
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
