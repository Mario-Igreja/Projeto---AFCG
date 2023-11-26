package pt.iade.fitvida;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import pt.iade.fitvida.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {
    ActivityRegisterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new RegisterFragment1());


        binding.nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new RegisterFragment2());
            }
        });

        binding.previusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new RegisterFragment1());
            }
        });

        binding.registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RegisterActivity.this, HomeActivity.class);
                startActivity(intent);
            /*
                EditText userName_EditText = (EditText) findViewById(R.id.editText_user_name);
                String username = userName_EditText.getText().toString();

                EditText email_EditText = (EditText) findViewById(R.id.editText_email);
                String email = email_EditText.getText().toString();

                EditText password_EditText = (EditText) findViewById(R.id.editText_password);
                String password = password_EditText.getText().toString();

                EditText birthDate_EditText = (EditText) findViewById(R.id.editText_birth_date);
                String birth_date = birthDate_EditText.getText().toString();

                EditText height_EditText = (EditText) findViewById(R.id.editText_height);
                String height = height_EditText.getText().toString();

                EditText weight_EditText = (EditText) findViewById(R.id.editText_weight);
                String weight = weight_EditText.getText().toString();

                if (!username.equals("") && !email.equals("") && !password.equals("") && !birth_date.equals("") && !height.equals("") && !weight.equals("")){
                    Intent intent = new Intent(RegisterActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
             */

            }
        });

    }


    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.register_frame_layout, fragment);
        fragmentTransaction.commit();
    }

}