package pt.iade.FitVida;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import pt.iade.fitvida.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Configurar ações da barra de navegação inferior
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.action_plan) {
                replaceFragment(new PlanFragment());
                return true;
            } else if (itemId == R.id.action_trainer) {
                replaceFragment(new NutriFragment());
                return true;
            } else if (itemId == R.id.action_home) {
                replaceFragment(new home());
                return true;
            } else if (itemId == R.id.action_recipes) {
                replaceFragment(new recipes());
                return true;
            } else if (itemId == R.id.action_review) {
                replaceFragment(new revien());
                return true;
            }

            return false;
        });
    }

    private void replaceFragment(fragment_review review) {
    }
    private void replaceFragment(Nutrico review) {
    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .commit();
    }
}

