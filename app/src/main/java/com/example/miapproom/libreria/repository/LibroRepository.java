package com.example.miapproom.libreria.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.miapproom.libreria.dao.LibroDao;
import com.example.miapproom.libreria.database.AppDatabase;
import com.example.miapproom.libreria.entities.Libro;

import java.util.List;

public class LibroRepository {
    private LibroDao libroDao;
    private LiveData<List<Libro>>libros;

    public LibroRepository(Application application){
        AppDatabase db = AppDatabase.getInstance(application);
        libroDao = db.libroDao();
        libros = libroDao.findAll();
    }

}
