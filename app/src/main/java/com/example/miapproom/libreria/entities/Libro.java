package com.example.miapproom.libreria.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Libro {
    @PrimaryKey
    private int id;
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
