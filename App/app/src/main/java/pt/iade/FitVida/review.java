package pt.iade.FitVida;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import pt.iade.fitvida.R;

public class review extends AppCompatActivity {

    private FrameLayout frameLayout = findViewById(R.id.register_frame_layout);
    private RadioGroup radioGroupOpcoes = findViewById(R.id.radioGroupOpcoes);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_reviem);

        // Defina um listener para o RadioGroup
        radioGroupOpcoes.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Chama o método para exibir o fragment correspondente à opção selecionada
                exibirFragment(checkedId);
            }
        });
    }

    // Método para exibir o fragment correspondente à opção selecionada
    private void exibirFragment(int checkedId) {
        fragment_status2 fragment;

        if (checkedId == R.id.radioButtonDia) {
            fragment = new fragment_status2(); // Substitua com o seu fragment para Semana
        } else if (checkedId == R.id.radioButtonMes) {
            fragment = new fragment_status2(); // Substitua com o seu fragment para Mês
        } else if (checkedId == R.id.radioButtonAno) {
            fragment = new fragment_status2(); // Substitua com o seu fragment para Ano
        } else {
            return;
        }

        // Inicia a transação de fragmento
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Limpa a pilha de fragmentos
        limparPilhaDeFragmentos(fragmentManager);

        // Substitui o conteúdo do FrameLayout pelo fragment atual
        realizarTransacaoDeFragmento(fragmentManager, fragment);
    }

    // Função para limpar a pilha de fragmentos
    private void limparPilhaDeFragmentos(FragmentManager fragmentManager) {
        fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }

    // Função para realizar a transação de fragmento
    private void realizarTransacaoDeFragmento(FragmentManager fragmentManager, fragment_status2 fragment) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.register_frame_layout, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
