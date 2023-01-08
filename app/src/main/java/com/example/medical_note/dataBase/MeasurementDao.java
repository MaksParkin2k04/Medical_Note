package com.example.medical_note.dataBase;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MeasurementDao {
    @Query("SELECT * FROM measurement")
    List<Measurement> getAllMeasurement();

    @Insert
    void insertMeasurement(Measurement... measurements);

    @Delete
    void delete(Measurement... measurements);















}
