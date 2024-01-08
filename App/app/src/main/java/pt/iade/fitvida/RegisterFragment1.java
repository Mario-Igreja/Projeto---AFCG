package pt.iade.fitvida;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link registerFragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
class RegisterFragment1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    static final String ARG_PARAM1 = "param1";
    static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RegisterFragment1() {
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
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register2, container, false);

        // Retrieving user inputs
         TextInputLayout userNameLayout = view.findViewById(R.id.textInputLayout_user_name);
          EditText userNameEditText = view.findViewById(R.id.editText_user_name);

         DatePicker datePicker = view.findViewById(R.id.datePicker);

      TextInputLayout heightLayout = view.findViewById(R.id.textInputLayout_height);
          EditText heightEditText = view.findViewById(R.id.editText_height);



           TextInputLayout weightLayout = view.findViewById(R.id.textInputLayout_weight);
          EditText weightEditText = view.findViewById(R.id.editText_weight);

        // Example: Retrieving data when a button is clicked
        Button registerButton = view.findViewById(R.id.register_button);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve user inputs
                String userName = userNameEditText.getText().toString();
                // Retrieve other inputs similarly

                // Perform any additional processing or validation as needed
                // ...

                // Example: Displaying a toast message with the user's name
                Toast.makeText(getActivity(), "User Name: " + userName, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
