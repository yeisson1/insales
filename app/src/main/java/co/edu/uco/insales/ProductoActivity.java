package co.edu.uco.insales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ProductoActivity extends AppCompatActivity {

    private Button NuevoProducto;
    private ImageButton eliminar1, eliminar2, eliminar3;
    private ImageButton ver1, ver2, ver3;
    private ImageButton update1, update2, update3;
    private Button buttonVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        initComponents();
    }

    private void initComponents() {
        NuevoProducto = findViewById(R.id.NuevoProducto);
        eliminar1 = findViewById(R.id.eliminar1);
        eliminar2 = findViewById(R.id.eliminar2);
        eliminar3 = findViewById(R.id.eliminar3);
        ver1 = findViewById(R.id.ver1);
        ver2 = findViewById(R.id.ver2);
        ver3 = findViewById(R.id.ver3);
        update1 = findViewById(R.id.update1);
        update2 = findViewById(R.id.update2);
        update3 = findViewById(R.id.update3);
        buttonVolver = findViewById(R.id.buttonVolver);

        buttonVolver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ver1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductoActivity.this, DetalleProductoActivity.class);
                startActivity(intent);
            }
        });

        ver2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductoActivity.this, DetalleProductoActivity.class);
                startActivity(intent);
            }
        });

        ver3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductoActivity.this, DetalleProductoActivity.class);
                startActivity(intent);
            }
        });

        update1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductoActivity.this, ActualizarProductoActivity.class);
                startActivity(intent);
            }
        });

        update2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductoActivity.this, ActualizarProductoActivity.class);
                startActivity(intent);
            }
        });

        update3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductoActivity.this, ActualizarProductoActivity.class);
                startActivity(intent);
            }
        });

        eliminar1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.eliminar, Toast.LENGTH_SHORT).show();
            }
        });

        eliminar2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.eliminar, Toast.LENGTH_SHORT).show();
            }
        });

        eliminar3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.eliminar, Toast.LENGTH_SHORT).show();
            }
        });

        NuevoProducto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductoActivity.this, NuevoProductoActivity.class);
                startActivity(intent);
            }
        });
    }
}