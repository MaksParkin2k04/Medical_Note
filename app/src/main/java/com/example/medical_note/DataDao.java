package com.example.medical_note;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DataDao {

    @Query("SELECT * FROM data")
    List<Data> getAll();

    @Query("SELECT * FROM data WHERE id = :id")
    Data getById(long id);

    @Insert
    void insert(Data data);

    @Update
    void update(Data data);

    @Delete
    void delete(Data data);
}
