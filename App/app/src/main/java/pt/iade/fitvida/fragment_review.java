package pt.iade.fitvida;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class fragment_review extends AppCompatActivity {

    private RadioGroup radioGroupOpcoes;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_reviem);

        radioGroupOpcoes = findViewById(R.id.radioGroupOpcoes);
        textViewResultado = findViewById(R.id.textViewProgresso);

        // Configurar listener para o RadioGroup
        radioGroupOpcoes.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButtonSelecionado = findViewById(checkedId);
                if (radioButtonSelecionado != null) {
                    String opcaoSelecionada = radioButtonSelecionado.getText().toString();
                    exibirProgresso("Opção selecionada: " + opcaoSelecionada);
                }
            }
        });
    }

    private void exibirProgresso(String Progresso) {
        textViewResultado.setText(Progresso);
    }
}
