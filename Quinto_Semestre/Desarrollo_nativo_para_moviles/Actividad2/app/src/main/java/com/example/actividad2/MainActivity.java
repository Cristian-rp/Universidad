package com.example.actividad2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewNombre = findViewById(R.id.textViewNombre);
        Button btnMostrarNombre = findViewById(R.id.btnMostrarNombre);

        btnMostrarNombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewNombre.setText("Cristian Parra");
                textViewNombre.setVisibility(View.VISIBLE);
            }
        });
    }
}