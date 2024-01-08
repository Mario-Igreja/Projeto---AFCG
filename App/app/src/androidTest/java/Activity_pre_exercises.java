import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import pt.iade.fitvida.R;

public class Activity_pre_exercises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_exercises);

        // Obter referência para o TextView no layout
        TextView tvNomeExercicio = findViewById(R.id.tvNomeExercicio);

        // Exemplo: Definir o nome do exercício
        String nomeExercicio = "Exemplo de Nome do Exercício";
        tvNomeExercicio.setText(nomeExercicio);

        // Adicione mais lógica conforme necessário
    }
}
