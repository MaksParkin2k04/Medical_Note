package com.example.medical_note;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void Save_Button(View view) {
        TextView textView = findViewById(R.id.Save_View);
        EditText editText_Sis = findViewById(R.id.editNumber_Sistal);
        EditText editText_Diast = findViewById(R.id.editNumber_Diastal);
        EditText editText_Puls = findViewById(R.id.editNumber_Puls);
        textView.setText("Систалическое давление: " + editText_Sis.getText() + "\nДиастолическое давление: " + editText_Diast.getText()  + "\nПульс: " + editText_Puls.getText() );


    }
}