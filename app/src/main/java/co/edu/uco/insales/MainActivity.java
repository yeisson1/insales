package co.edu.uco.insales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private Button buttonProveedores;
    private Button buttonProductos;
    private Button buttonVentas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents() {
        buttonProveedores = findViewById(R.id.buttonProveedores);
        buttonProductos = findViewById(R.id.buttonProductos);
        buttonVentas = findViewById(R.id.buttonVentas);

        buttonProveedores.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProveedorActivity.class);
                startActivity(intent);
            }
        });

        buttonProductos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProductoActivity.class);
                startActivity(intent);
            }
        });

        buttonVentas.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VentasActivity.class);
                startActivity(intent);
            }
        });
    }
}