package com.example.miapproom.libreria.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.miapproom.libreria.entities.Libro;

import java.util.List;

@Dao
public interface LibroDao {
    @Query("SELECT * FROM Libro")
    List<Libro> findAll();

    @Insert
    void insert(Libro libro);

    @Update
    void update(Libro libro);

    @Delete
    void delete(Libro libro);

    @Query("SELECT * FROM Libro WHERE id = :id")
    Libro findById(int id);

    @Query("SELECT * FROM LIBRO WHERE nombre LIKE :nombre")
    Libro findByNombre(String nombre);

}
