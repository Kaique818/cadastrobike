package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    CardView bikes, acessorios, manutencao, dicas, locais, eventos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.menu_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bikes = findViewById(R.id.MenuBike);
        acessorios = findViewById(R.id.MenuAcessorio);
        manutencao = findViewById(R.id.MenuManuten);
        dicas = findViewById(R.id.MenuDica);
        locais = findViewById(R.id.MenuLocais);
        eventos = findViewById(R.id.MenuEvent);

        bikes.setOnClickListener(this);
        acessorios.setOnClickListener(this);
        manutencao.setOnClickListener(this);
        dicas.setOnClickListener(this);
        locais.setOnClickListener(this);
        eventos.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.MenuBike){
            startActivity(new Intent(getApplicationContext(), BikesActivity.class));
            finish();
        } if (view.getId() == R.id.MenuAcessorio){
            startActivity(new Intent(getApplicationContext(), AcessorioActivity.class));
            finish();
        } if (view.getId() == R.id.MenuManuten){
            startActivity(new Intent(getApplicationContext(), ManutenActivity.class));
            finish();
        } if (view.getId() == R.id.MenuDica){
            startActivity(new Intent(getApplicationContext(), DicasActivity.class));
            finish();
        } if (view.getId() == R.id.MenuLocais){
            startActivity(new Intent(getApplicationContext(), LocaisActivity.class));
            finish();
        } if (view.getId() == R.id.MenuEvent){
            startActivity(new Intent(getApplicationContext(), EventoActivity.class));
            finish();
        }

    }
}