package pt.iade.fitvida;

import static pt.iade.fitvida.RegisterFragment1.ARG_PARAM1;
import static pt.iade.fitvida.RegisterFragment1.ARG_PARAM2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

public class registerFragment2 extends Fragment {

    private TextInputLayout textInputLayoutEmail;
    private TextInputLayout textInputLayoutPassword;
    private TextInputLayout textInputLayoutPassword2;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextPassword2;

    public registerFragment2() {
        // Required empty public constructor
    }

    public static registerFragment2 newInstance(String param1, String param2) {
        registerFragment2 fragment = new registerFragment2();
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
            String mParam1 = getArguments().getString(ARG_PARAM1);
            String mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register2, container, false);

        // Referenciando os elementos do layout
        textInputLayoutEmail = view.findViewById(R.id.textInputLayout_email);
        textInputLayoutPassword = view.findViewById(R.id.textInputLayout_password);
        textInputLayoutPassword2 = view.findViewById(R.id.textInputLayout_password2);
        editTextEmail = view.findViewById(R.id.editText_email);
        editTextPassword = view.findViewById(R.id.editText_password);
        editTextPassword2 = view.findViewById(R.id.editText_password2);

        // Adicione aqui a lógica necessária, se necessário

        return view;
    }
}
