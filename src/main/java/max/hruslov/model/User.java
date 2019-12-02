package max.hruslov.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Data
@Table(name = "USERS")
@AllArgsConstructor
@EntityListeners({AuditingEntityListener.class})
public class User extends AbstractAuditable<User, Long> {

    @Id
    @GeneratedValue
    private Long userID;

    @Basic
    @Column
    private String name;

    public User(){}
}