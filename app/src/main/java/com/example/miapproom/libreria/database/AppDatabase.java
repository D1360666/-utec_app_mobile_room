package com.example.miapproom.libreria.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.miapproom.libreria.dao.LibroDao;
import com.example.miapproom.libreria.entities.Libro;

@Database(entities = {Libro.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{
    public abstract LibroDao libroDao();
}
