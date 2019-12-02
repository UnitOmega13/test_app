package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractAuditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Getter @Setter @AllArgsConstructor
@EntityListeners({AuditingEntityListener.class})
public class User extends AbstractAuditable<User, Long> {
    @Basic
    @Column
    private String name;

    public User(){}
}