package pt.iade.FitVida;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputLayout;

import pt.iade.fitvida.R;

public class RegisterFragment2 extends Fragment {

    private EditText editTextEmail, editTextPassword, editTextPassword2;
    private TextInputLayout textInputLayoutEmail, textInputLayoutPassword, textInputLayoutPassword2;



    // Seção para inicializar os componentes da interface do usuário
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflar o layout para este fragmento
        View rootView = inflater.inflate(R.layout.fragment_register2, container, false);

        // Inicializar os componentes da interface do usuário
        editTextEmail = rootView.findViewById(R.id.editText_email);
        editTextPassword = rootView.findViewById(R.id.editText_password);
        editTextPassword2 = rootView.findViewById(R.id.editText_password2);

        textInputLayoutEmail = rootView.findViewById(R.id.textInputLayout_email);
        textInputLayoutPassword = rootView.findViewById(R.id.textInputLayout_password);
        textInputLayoutPassword2 = rootView.findViewById(R.id.textInputLayout_password2);

        // Inicializar outros componentes da interface do usuário, se necessário
        // Exemplo: TextView textViewMessage = rootView.findViewById(R.id.textView_message);

        return rootView;
    }
}
