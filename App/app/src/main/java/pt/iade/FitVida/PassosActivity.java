package pt.iade.FitVida;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pt.iade.fitvida.R;

public class PassosActivity extends AppCompatActivity implements SensorEventListener {

    private SensorManager sensorManager;
    private TextView stepCountTextView;
    private int stepCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passos);

        stepCountTextView = findViewById(R.id.stepCountTextView);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        // Verifica se o acelerômetro está disponível no dispositivo
        if (sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) != null) {
            // Registra o listener do acelerômetro
            Sensor accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
            sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
        } else {
            // Aviso: O dispositivo não possui acelerômetro
        }
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        // Implemente a lógica para detectar passos
        // Este exemplo simples considera um passo quando ocorre um "shake"
        stepCount++;
        stepCountTextView.setText("Passos: " + stepCount);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        // Método obrigatório, mas não utilizado neste exemplo
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Desregistra o listener do acelerômetro quando a Activity é destruída
        sensorManager.unregisterListener(this);
    }
}
