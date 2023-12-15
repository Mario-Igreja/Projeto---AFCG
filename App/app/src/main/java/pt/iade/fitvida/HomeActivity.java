package pt.iade.fitvida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;

import pt.iade.fitvida.databinding.ActivityHomeBinding;
import pt.iade.fitvida.databinding.ActivityMainBinding;


public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new PlanFragment());

        binding.bottomNavigation.setOnItemSelectedListener(item -> {

            if(item.getItemId() == R.id.action_plan){
                // Ação quando o item "Home" é selecionado
                replaceFragment(new PlanFragment());
            }
            else if(item.getItemId() == R.id.action_find_out){
                // Ação quando o item "Find Out" é selecionado
                replaceFragment(new NutriFragment());
            }
            else{
                // Ação quando o item "Report" é selecionado
                replaceFragment(new ReportFragment());
            }

            return true;
        });
    }


    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}