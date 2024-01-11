package pt.iade.FitVida;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import pt.iade.fitvida.R;

public class PlanFragment extends Fragment {

    private RecyclerView recyclerView;
    private ImageView btnIcon;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_plan, container, false);

        // Inicializando os componentes da interface
        recyclerView = rootView.findViewById(R.id.app_list);
        btnIcon = rootView.findViewById(R.id.btnIcon);

        // Configurando o onClickListener para o botão
        btnIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implemente a lógica desejada quando o botão for clicado
                // Por exemplo, abrir uma nova tela ou executar alguma ação
            }
        });

        // TODO: Configurar o RecyclerView e fornecer dados através do adapter

        return rootView;
    }
}
