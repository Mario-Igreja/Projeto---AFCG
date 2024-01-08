package pt.iade.fitvida;

import static pt.iade.fitvida.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import pt.iade.fitvida.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new home()); // Exibe o fragmento inicial

        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == id.action_plan) {
                // Ação quando o item "Plano" é selecionado
                replaceFragment(new PlanFragment());
                return true;
            } else if (itemId == R.id.action_trainer) {
                // Ação quando o item "Treinador" é selecionado
                replaceFragment(new NutriFragment());
                return true;
            } else if (itemId == R.id.action_home) {
                // Ação quando o item "Início" é selecionado
                replaceFragment(new home());
                return true;
            } else if (itemId == R.id.action_recipes) {
                // Ação quando o item "Receitas" é selecionado
                replaceFragment(new recipes());
                return true;
            } else if (itemId == R.id.action_review) {
                // Ação quando o item "Avaliação" é selecionado
                replaceFragment(new reviem());
                return true;
            }

            return false;
        });
    }




    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(id.frame_layout, fragment);
        fragmentTransaction.commit();
    }

    private class reviem extends Fragment {
    }
}
