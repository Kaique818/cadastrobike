package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


public class LoginActivity extends AppCompatActivity {
//declarar as variaveis globais veyr

    MaterialButton btnRecuperarSenha, btnCadastraSenha, btnEntrar, abrir;
    TextInputEditText txtEmail, txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //apresentando as variaveis o java para o xml

        btnCadastraSenha = findViewById(R.id.btnCadSenha);
        btnRecuperarSenha = findViewById(R.id.btnRecuperarSenha);
        btnEntrar = findViewById(R.id.btnEntrar);
        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);


        //criando as açoes

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email, password;

                email = txtEmail.getText().toString().trim();
                password = txtSenha.getText().toString().trim();

                if (email.equals("etecia") && password.equals("etecia")) {
                startActivity(new Intent(getApplicationContext(),android.R.menu.class));
                }else {
                    Toast.makeText(getApplicationContext(),
                            "Usuario ou senha inválidos",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnCadastraSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), CadastrarSenhaActivity.class));

            }
        });

        btnRecuperarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RecuperarSenhaActivity.class));

            }

            ;


        });
    }
}