package com.example.medical_note.dataBase;

import android.content.Context;

import androidx.room.ColumnInfo;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Measurement.class}, version =  1)
public abstract class AppDataBase extends RoomDatabase {

    public abstract MeasurementDao measurementDao();

    private static AppDataBase INSTANCE;

    public static AppDataBase getDbInstance(Context context) {

        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDataBase.class, "Measurement")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }


}





















