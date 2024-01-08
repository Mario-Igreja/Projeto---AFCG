package pt.iade.fitvida;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class PlanFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public PlanFragment() {
        // Required empty public constructor
    }

    public static PlanFragment newInstance(String param1, String param2) {
        PlanFragment fragment = new PlanFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_plan, container, false);

        // Inicialize os elementos do layout
        TextView textView6 = view.findViewById(R.id.textView6);
        TextView textView10 = view.findViewById(R.id.textView10);
        TextView textView9 = view.findViewById(R.id.textView9);
        TextView textView12 = view.findViewById(R.id.textView12);
        TextView textView13 = view.findViewById(R.id.textView13);
        RecyclerView appListRecyclerView = view.findViewById(R.id.app_list);
        ImageView btnIconImageView = view.findViewById(R.id.btnIcon);

        // Configurar um clique no ícone para abrir a FragmentActivity
        btnIconImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Código a ser executado quando o ícone for clicado
                // Inicie a nova FragmentActivity (substitua .class pela sua FragmentActivity desejada)
                Intent intent = new Intent(getActivity(), PlanFragment.class);
                startActivity(intent);
            }
        });

        // Adicione funcionalidades adicionais conforme necessário
        // Por exemplo, configurar um adaptador para a RecyclerView, etc.

        return view;
    }
}
