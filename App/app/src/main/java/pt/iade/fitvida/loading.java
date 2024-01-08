package pt.iade.fitvida;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class loading extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        // Aguarde 3 segundos (3000 milissegundos) antes de iniciar a próxima atividade
        int delay = 3000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Crie uma intenção para iniciar a próxima atividade
                Intent intent = new Intent(loading.this, MainActivity.class);
                startActivity(intent);

                // Feche a atividade de carregamento
                finish();
            }
        }, delay);
    }
}
