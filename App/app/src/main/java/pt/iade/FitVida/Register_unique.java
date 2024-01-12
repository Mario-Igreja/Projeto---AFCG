package pt.iade.FitVida;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import pt.iade.fitvida.R;

public class Register_unique extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(pt.iade.fitvida.R.layout.activity_register_unique);

        replaceFragment(new RegisterFragment1());

        // Configura os botões de navegação
        ImageView backButton = findViewById(R.id.back);
        ImageView forwardButton = findViewById(R.id.forward);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Método para lidar com o clique no botão "Back"
                replaceFragment(new RegisterFragment1());
            }
        });
        forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Método para lidar com o clique no botão "Back"
                replaceFragment(new RegisterFragment2());
            }
        });


    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.register_frame_layout, fragment)
                .commit();
    }
}