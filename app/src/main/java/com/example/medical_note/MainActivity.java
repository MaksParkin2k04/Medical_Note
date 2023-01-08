package com.example.medical_note;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.medical_note.dataBase.AppDataBase;
import com.example.medical_note.dataBase.Measurement;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MeasurementListAdapter measurementListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button newRecordButton = findViewById(R.id.saveButton);
        newRecordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MainActivity.this, NewRecord.class), 100);
            }
        });

        initRecyclerView();
    }
    private void initRecyclerView(){
         RecyclerView recyclerView = findViewById(R.id.recyclerView);
         recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        measurementListAdapter = new MeasurementListAdapter(this);
        recyclerView.setAdapter(measurementListAdapter);
    }

    private void loadMeasurementList(){
        AppDataBase dataBase = AppDataBase.getDbInstance(this.getApplicationContext());
        List<Measurement> measurementsList = dataBase.measurementDao().getAllMeasurement();
        measurementListAdapter.setMeasurementsList(measurementsList);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 100) {
                loadMeasurementList();
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}