package com.example.medical_note;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.medical_note.dataBase.AppDataBase;
import com.example.medical_note.dataBase.Measurement;

public class NewRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_record);

        final EditText numberSistal = findViewById(R.id.editNumber_Sistal);
        final EditText numberDiastal = findViewById(R.id.editNumber_Diastal);
        final EditText numberPulse = findViewById(R.id.editNumber_Puls);
        final Button newRecordButton = findViewById(R.id.saveButton);
        newRecordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNewRecord(Integer.parseInt(numberSistal.getText().toString()), Integer.parseInt(numberDiastal.getText().toString()), Integer.parseInt(numberPulse.getText().toString()));
            }
        });
    }


    private void saveNewRecord(int numberSistal, int numberDiastal, int numberPulse ) {
        AppDataBase dataBase = AppDataBase.getDbInstance(this.getApplicationContext());
        Measurement measurement = new Measurement();
        Measurement.sistal = numberSistal;
        Measurement.diostal = numberDiastal;
        Measurement.pulse = numberPulse;
        dataBase.measurementDao().insertMeasurement();

        finish();
    }
}