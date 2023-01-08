package com.example.medical_note;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Data {

    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo(name = "sistal_dv")
    public int sistal_dv;

    @ColumnInfo(name = "diost_dv")
    public int diost_dv;

    @ColumnInfo(name = "puls")
    public int puls;

    public long getId() {
        return id;
    }

    public int getSistal_dv() {
        return sistal_dv;
    }

    public void setSistal_dv(int sistal_dv) {
        this.sistal_dv = sistal_dv;
    }

    public int getDiost_dv() {
        return diost_dv;
    }

    public void setDiost_dv(int diost_dv) {
        this.diost_dv = diost_dv;
    }

    public int getPuls() {
        return puls;
    }

    public void setPuls(int puls) {
        this.puls = puls;
    }
}
