package com.example.nombrepoo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Variables de la clase (atributos)
    private TextView textViewNombre;
    private Button btnMostrarNombre;
    private Persona persona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar todo
        inicializarVistas();
        crearPersona();
        configurarBoton();
    }

    // Método para conectar con los elementos del XML
    private void inicializarVistas() {
        textViewNombre = findViewById(R.id.textViewNombre);
        btnMostrarNombre = findViewById(R.id.btnMostrarNombre);
    }

    // Método para crear el objeto Persona
    private void crearPersona() {
        persona = new Persona("Cristian Parra");
    }

    // Método para programar el botón
    private void configurarBoton() {
        btnMostrarNombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mostrar el nombre usando el método get de la clase Persona
                textViewNombre.setText(persona.getNombre());
                textViewNombre.setVisibility(View.VISIBLE);
                btnMostrarNombre.setText("Nombre mostrado");
            }
        });
    }

    /**
     * Clase Persona
     * Tiene un atributo privado (encapsulado)
     * Tiene constructor y métodos get
     */
    class Persona {
        // Atributo privado: solo se accede desde métodos de esta clase
        private String nombre;

        // Constructor: se ejecuta al crear el objeto
        public Persona(String nombre) {
            this.nombre = nombre; // this.nombre es el atributo, nombre es el parámetro
        }

        // Método público para obtener el nombre (getter)
        public String getNombre() {
            return nombre;
        }
    }
}