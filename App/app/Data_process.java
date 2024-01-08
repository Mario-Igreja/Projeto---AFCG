import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Data_process extends AppCompatActivity {

    private EditText editTextAltura;
    private EditText editTextPeso;
    private EditText editTextProgressoDiario;
    private TextView textViewResultados;

    private double altura;
    private double peso;
    private int dia = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_progresso);

        editTextAltura = findViewById(R.id.editTextAltura);
        editTextPeso = findViewById(R.id.editTextPeso);
        editTextProgressoDiario = findViewById(R.id.editTextProgressoDiario);
        textViewResultados = findViewById(R.id.textViewResultados);

        Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularResultadosDiarios();
            }
        });

        altura = obterAlturaDoUsuario();
        peso = obterPesoDoUsuario();
    }

    private double obterAlturaDoUsuario() {
        // Implementação da lógica para obter a altura do usuário
        // Substitua isso com a interação com a interface do usuário no Android
        // (por exemplo, usar editTextAltura.getText().toString() para obter o valor)
        return Double.parseDouble(editTextAltura.getText().toString());
    }

    private double obterPesoDoUsuario() {
        // Implementação da lógica para obter o peso do usuário
        // Substitua isso com a interação com a interface do usuário no Android
        return Double.parseDouble(editTextPeso.getText().toString());
    }

    private double obterProgressoDiario() {
        // Implementação da lógica para obter o progresso diário
        // Substitua isso com a interação com a interface do usuário no Android
        return Double.parseDouble(editTextProgressoDiario.getText().toString());
    }

    private void calcularResultadosDiarios() {
        double progressoDiario = obterProgressoDiario();

        // Implementação da lógica para atualizar as métricas do usuário
        // Substitua isso com a lógica adequada conforme sua aplicação
        altura += progressoDiario * 0.01;
        peso -= progressoDiario * 0.1;

        // Exibindo os resultados diários
        exibirResultadosDiarios(dia++, progressoDiario, altura, peso);
    }

    private void exibirResultadosDiarios(int dia, double progressoDiario, double altura, double peso) {
        // Implementação da lógica para exibir os resultados diários
        // Substitua isso com a lógica adequada conforme sua aplicação
        String resultados = "Resultados do dia " + dia + ":\n" +
                "Progresso Diário: " + progressoDiario + "%\n" +
                "Altura atual: " + altura + " metros\n" +
                "Peso atual: " + peso + " kg\n\n";

        // Atualizando o TextView com os resultados
        textViewResultados.append(resultados);
    }
}
