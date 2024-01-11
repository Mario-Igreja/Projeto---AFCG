package pt.iade.FitVida;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import pt.iade.fitvida.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Inicia o fragmento RegisterFragment1
        loadFragment(new RegisterFragment1());

        // Configura os botões de navegação
        ImageView backButton = findViewById(R.id.back);
        ImageView forwardButton = findViewById(R.id.forward);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Método para lidar com o clique no botão "Back"
                onBackPressed();
            }
        });

        forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Método para lidar com o clique no botão "Forward"
                startRegisterFragment2();
            }
        });

        // Se necessário, pode adicionar lógica adicional aqui.
    }

    // Método para substituir o fragmento atual no FrameLayout
    private void loadFragment(Fragment fragment) {
        // Obtém o FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Inicia uma transação de fragmento
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // Substitui o fragmento atual pelo novo fragmento
        fragmentTransaction.replace(R.id.register_frame_layout, fragment);
        // Adiciona a transação à pilha para que o usuário possa voltar para o fragmento anterior
        fragmentTransaction.addToBackStack(null);
        // Confirma a transação
        fragmentTransaction.commit();
    }

    // Método para iniciar o RegisterFragment2
    private void startRegisterFragment2() {
        loadFragment(new RegisterFragment2());
    }

    // Sobrescreve o método onBackPressed para lidar com o clique no botão "Back"
    @Override
    public void onBackPressed() {
        // Verifica se há fragmentos na pilha antes de lidar com o clique no botão "Back"
        if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            // Se houver fragmentos na pilha, remove o fragmento atual
            getSupportFragmentManager().popBackStack();
        } else {
            // Se não houver fragmentos na pilha, chama o comportamento padrão (encerra a atividade)
            super.onBackPressed();
        }
    }
}
