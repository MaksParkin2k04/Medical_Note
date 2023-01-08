package com.example.medical_note.dataBase;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Measurement {


    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "sistal")
    public  int sistal;
    @ColumnInfo(name = "diostal")
    public  int diostal;
    @ColumnInfo(name = "pulse")
    public  int pulse;




















}
