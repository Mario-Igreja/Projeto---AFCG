package pt.iade.FitVida;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputLayout;

import pt.iade.fitvida.R;

public class RegisterFragment1 extends Fragment {

    private EditText editTextUserName, editTextHeight, editTextWeight;
    private DatePicker datePicker;
    private TextInputLayout textInputLayoutUserName, textInputLayoutHeight, textInputLayoutWeight;
    private Button nextButton;


    // Seção para inicializar os componentes da interface do usuário (por exemplo, botões, EditTexts)
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflar o layout para este fragmento
        View rootView = inflater.inflate(R.layout.fragment_register1, container, false);

        // Inicializar os componentes da interface do usuário
        editTextUserName = rootView.findViewById(R.id.editText_user_name);
        editTextHeight = rootView.findViewById(R.id.editText_height);
        editTextWeight = rootView.findViewById(R.id.editText_weight);

        textInputLayoutUserName = rootView.findViewById(R.id.textInputLayout_user_name);
        textInputLayoutHeight = rootView.findViewById(R.id.textInputLayout_height);
        textInputLayoutWeight = rootView.findViewById(R.id.textInputLayout_weight);

        datePicker = rootView.findViewById(R.id.datePicker);

        nextButton = rootView.findViewById(R.id.forward);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Adicione a lógica para lidar com o clique no botão próximo, se necessário
            }
        });

        // Inicializar outros componentes da interface do usuário, se necessário

        return rootView;
    }
}
