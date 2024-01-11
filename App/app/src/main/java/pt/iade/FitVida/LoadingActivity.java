package pt.iade.FitVida;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import pt.iade.fitvida.R;

public class LoadingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        ImageView loadingImageView = findViewById(R.id.imageView3);

        // Carregar a imagem de carregamento
        loadingImageView.setImageResource(R.drawable.lgofit);

        // Aguarde 3 segundos (3000 milissegundos) antes de iniciar a próxima atividade
        int delay = 3000; // Ajuste conforme necessário
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Crie uma intenção para iniciar a próxima atividade
                Intent intent = new Intent(LoadingActivity.this, MainActivity.class);
                startActivity(intent);

                // Feche a atividade de carregamento
                finish();
            }
        }, delay);
    }
}

