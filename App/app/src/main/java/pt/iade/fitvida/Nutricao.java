package pt.iade.fitvida;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import pt.iade.fitvida.R;
import pt.iade.fitvida.advanced;
import pt.iade.fitvida.beginner;
import pt.iade.fitvida.medium;
import pt.iade.fitvida.warm_up;

public class Nutricao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_nutri);  // Substitua pelo nome real do seu layout XML

        // Configuração dos botões
        Button btnAquecimento = findViewById(R.id.buttonAquecimento);
        Button btnIniciante = findViewById(R.id.buttonIniciante);
        Button btnIntermediario = findViewById(R.id.buttonIntermediario);
        Button btnAvancado = findViewById(R.id.buttonAvancado);

        // Definindo a ação para cada botão
        btnAquecimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirFragmento(new warm_up());
            }
        });

        btnIniciante.setOnClickListener(new View.OnClickListener() {
            class fragment_beginner extends Fragment {
            }

            @Override
            public void onClick(View v) {
                abrirFragmento(new beginner());
            }
        });

        btnIntermediario.setOnClickListener(new View.OnClickListener() {
            class fragment_medium extends Fragment {
            }

            @Override
            public void onClick(View v) {
                abrirFragmento(new medium());
            }
        });

        btnAvancado.setOnClickListener(new View.OnClickListener() {
            class fragment_advanced extends Fragment {
            }

            @Override
            public void onClick(View v) {
                abrirFragmento(new advanced());
            }
        });
    }

    // Método para substituir o conteúdo do contêiner pelo fragmento fornecido
    private void abrirFragmento(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.framelayout1, fragment);  // Substitua pelo ID real do seu contêiner de fragmentos
        transaction.addToBackStack(null);
        transaction.commit();
    }
}

