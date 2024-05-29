package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song {
    @Id
    int id;
    String name;

    Song(int id,String name){
        this.id = id;
        this.name = name;
    }
}
