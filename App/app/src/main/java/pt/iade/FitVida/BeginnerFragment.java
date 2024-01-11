package pt.iade.FitVida;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pt.iade.fitvida.R;

public class BeginnerFragment extends AppCompatActivity {

    private TextView textViewWeeks, textViewCalories, textViewDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_beginner);

        // Inicialização dos TextViews
        textViewWeeks = findViewById(R.id.textView6);
        textViewCalories = findViewById(R.id.textView8);
        textViewDays = findViewById(R.id.textView9);

        // Configuração dos botões
        Button buttonPerna = findViewById(R.id.buttonPerna1);
        Button buttonGluteos = findViewById(R.id.buttonGluteos1);
        Button buttonAbdomen = findViewById(R.id.buttonAbdomen1);
        Button buttonPeito = findViewById(R.id.buttonPeito1);
        Button buttonBracos = findViewById(R.id.buttonBracos1);
        Button buttonCostas = findViewById(R.id.buttonCostas1);
        Button buttonOmbros = findViewById(R.id.buttonOmbros1);

        buttonPerna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para o botão Perna
                handleButtonClick("Perna");
            }
        });

        buttonGluteos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para o botão Glúteos
                handleButtonClick("Glúteos");
            }
        });

        buttonAbdomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para o botão Abdômen
                handleButtonClick("Abdômen");
            }
        });

        buttonPeito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para o botão Peito
                handleButtonClick("Peito");
            }
        });

        buttonBracos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para o botão Braços
                handleButtonClick("Braços");
            }
        });

        buttonCostas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para o botão Costas
                handleButtonClick("Costas");
            }
        });

        buttonOmbros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para o botão Ombros
                handleButtonClick("Ombros");
            }
        });
    }

    private void handleButtonClick(String exercise) {
        // Adicione aqui a lógica específica para cada botão
        // Por exemplo, mostrar uma mensagem ou iniciar uma nova atividade
        // Use a variável 'exercise' para determinar qual botão foi clicado
    }

    public void onButtonClick(View view) {
    }
}
