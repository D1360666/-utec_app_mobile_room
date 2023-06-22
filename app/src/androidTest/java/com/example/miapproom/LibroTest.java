package com.example.miapproom;

import static org.junit.Assert.assertTrue;

import android.app.Application;
import android.content.Context;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.miapproom.libreria.dao.LibroDao;
import com.example.miapproom.libreria.database.AppDatabase;
import com.example.miapproom.libreria.entities.Libro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class LibroTest {
    private LibroDao libroDao;
    private AppDatabase appDatabase;

    @Before
    public void createDB(){
        Context context = ApplicationProvider.getApplicationContext();
        appDatabase = Room.inMemoryDatabaseBuilder(context, AppDatabase.class).build();
        libroDao = appDatabase.libroDao();
    }

    @After
    public void closeDb(){
        appDatabase.close();
    }

    @Test
    public void findByNombreTest() throws Exception{
        Libro libro = new Libro();
        libro.setId(1);
        libro.setNombre("libro");

        libroDao.insert(libro);

        Libro encontrado = libroDao.findByNombre("libro");

        assertTrue("No se encontró el libro", libro.getId()==encontrado.getId());
    }
}
