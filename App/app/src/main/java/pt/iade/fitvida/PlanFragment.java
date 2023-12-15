package pt.iade.fitvida;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

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

        // Inicialize o botão
        Button buttonLayoutCaminhada = view.findViewById(R.id.buttonLayoutCaminhada);

        buttonLayoutCaminhada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Código a ser executado quando o botão for clicado

                // Inicie a nova Activity (substitua .class pela sua Activity desejada)
                Intent intent = new Intent(getActivity(), .class);
                startActivity(intent);

                buttonLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Código a ser executado quando o botão for clicado

                        // Inicie a nova Activity (substitua .class pela sua Activity desejada)
                        Intent intent = new Intent(getActivity(), .class);
                        startActivity(intent);
            }
        });

        return view;
    }
}
