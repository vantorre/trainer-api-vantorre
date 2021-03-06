package com.miage.altea.tp.trainer_api.bo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.FetchType.EAGER;

// TODO
@Data
@Entity
public class Trainer { 

    @Id
    private String name; 

    @OneToMany(fetch = EAGER, cascade = CascadeType.ALL)
    private List<Pokemon> team;

    public Trainer() {
    }

    public Trainer(String name) {
        this.name = name;
    }

    @Column
    private String password;

}