package pt.iade.FitVida;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pt.iade.fitvida.R;

public class LoginActivity extends AppCompatActivity {

    private EditText userNameEditText;
    private EditText passwordEditText;
    private TextView errorMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userNameEditText = findViewById(R.id.editText_user_name);
        passwordEditText = findViewById(R.id.editText_Password);
        errorMessageTextView = findViewById(R.id.textView_error_message);
        errorMessageTextView.setVisibility(View.INVISIBLE); // Inicialmente invisível
    }

    public void startHome(View view) {
        // Verifica se os campos de usuário e senha estão preenchidos
        if (isFieldsEmpty()) {
            // Exibe a mensagem de erro
            errorMessageTextView.setVisibility(View.VISIBLE);
        } else {
            // Oculta a mensagem de erro
            errorMessageTextView.setVisibility(View.INVISIBLE);

            // Continue para a próxima página ou execute a lógica necessária
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
    }

    private boolean isFieldsEmpty() {
        // Verifica se os campos de usuário e senha estão vazios
        return userNameEditText.getText().toString().isEmpty() || passwordEditText.getText().toString().isEmpty();
    }
}
