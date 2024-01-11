package pt.iade.FitVida;

import static pt.iade.FitVida.home_page.ARG_PARAM1;
import static pt.iade.FitVida.home_page.ARG_PARAM2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import pt.iade.fitvida.R;

public class recipes extends Fragment {

    public recipes() {
        // Required empty public constructor
    }

    public static recipes newInstance(String param1, String param2) {
        recipes fragment = new recipes();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recipes, container, false);

        Button buttonNovo1 = view.findViewById(R.id.buttonFrutas);
        Button buttonNovo2 = view.findViewById(R.id.buttonVegetais);
        Button buttonNovo3 = view.findViewById(R.id.buttonProteinas);
        Button buttonNovo4 = view.findViewById(R.id.buttonGraoSementes);
        Button buttonNovo5 = view.findViewById(R.id.buttonProteinasSubstitutos);
        Button buttonNovo6 = view.findViewById(R.id.buttonLaticiniosSubstitutos);
        Button buttonNovo7 = view.findViewById(R.id.buttonAcucaresDoces);

        buttonNovo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para o botão Novo 1
                openFragment(new frutas());
            }
        });

        buttonNovo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para o botão Novo 2
                openFragment(new Vegetais());
            }
        });

        buttonNovo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para o botão Novo 3
                openFragment(new Proteina());
            }
        });

        buttonNovo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para o botão Novo 1
                openFragment(new Grao());
            }
        });

        buttonNovo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para o botão Novo 2
                openFragment(new Carnes());
            }
        });

        buttonNovo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para o botão Novo 3
                openFragment(new Laticinios());
            }
        });
        buttonNovo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para o botão Novo 1
                openFragment(new Doces());
            }
        });

        return view;
    }

    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.register_frame_layout, fragment);
        transaction.addToBackStack(null);  // Adiciona o fragmento à pilha de retorno
        transaction.commit();
    }
}
