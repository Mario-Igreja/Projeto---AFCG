package pt.iade.FitVida;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pt.iade.fitvida.R;

public class sleep_mode extends AppCompatActivity {

    private TextView countdownTextView = findViewById(R.id.countdownTextView);
    private Button startButton = findViewById(R.id.startButton);
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
            }
        });
    }

    private void startTimer() {
        // Defina o tempo desejado em milissegundos (exemplo: 5 minutos)
        long totalTimeInMillis = 5 * 60 * 1000;

        // Configurar o CountDownTimer
        countDownTimer = new CountDownTimer(totalTimeInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                updateCountdownText(millisUntilFinished);
            }

            @Override
            public void onFinish() {
                countdownTextView.setText("Temporizador Concluído!");
            }
        };

        // Iniciar o temporizador
        countDownTimer.start();
    }

    private void updateCountdownText(long millisUntilFinished) {
        int minutes = (int) (millisUntilFinished / 1000) / 60;
        int seconds = (int) (millisUntilFinished / 1000) % 60;

        String timeLeftFormatted = String.format("%02d:%02d", minutes, seconds);
        countdownTextView.setText(timeLeftFormatted);
    }
}
