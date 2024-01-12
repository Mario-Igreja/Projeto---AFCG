package pt.iade.FitVida;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import pt.iade.fitvida.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void startLogin (View view){
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
        public void startRegister (View view){
            Intent intent = new Intent(this, Register_unique.class);
            startActivity(intent);
        }


}