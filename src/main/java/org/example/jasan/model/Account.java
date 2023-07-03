package org.example.jasan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity(name = "account")
public class Account {
    @Id
    private String username;
    private String password;
    private boolean enabled;
}
