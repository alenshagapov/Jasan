package org.example.jasan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
@Entity(name = "users")
public class Users {
    @Id
    private int id;

    private String name;
    private String surname;
    private int age;

    public String getUserInfo(){
        return this.surname + " " + this.name + " " + this.age;
    }

}
