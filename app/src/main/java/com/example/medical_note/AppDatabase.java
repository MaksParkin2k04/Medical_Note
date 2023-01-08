package com.example.medical_note;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Data.class}, version = 1)
abstract class AppDatabase extends RoomDatabase {
    public abstract DataDao getDataDao();


    public static final String DATABASE_NAME = "app_database";
    private static AppDatabase InstanceDatabase = null;

    public static AppDatabase create(@NonNull Context context) {
        if (InstanceDatabase == null) {
            synchronized (AppDatabase.class) {
                InstanceDatabase = Room.databaseBuilder(
                                context.getApplicationContext(),
                                AppDatabase.class,
                                DATABASE_NAME)
                        .build();
            }
        }

        return InstanceDatabase;

    }
}
