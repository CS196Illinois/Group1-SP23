package com.example.tester;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.tester.databinding.FragmentLoginBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Login#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Login extends Fragment {

    EditText username, password;
    Button loginButton;

    String correctUsername = "admin";
    String correctPassword = "Password123";

    private FragmentLoginBinding binding;

    public Login() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Login.
     */
    // TODO: Rename and change types and number of parameters
    public static Login newInstance(String param1, String param2) {
        Login fragment = new Login();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentLoginBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }


    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        username = (EditText) getView().findViewById(R.id.username);
        password = (EditText) getView().findViewById(R.id.password);
        loginButton = (Button) getView().findViewById(R.id.button);

        loginButton.setOnClickListener(v -> {
            if (TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())) {
                Toast.makeText(this.getActivity(), "Empty data provided", Toast.LENGTH_LONG).show();
            } else if (username.getText().toString().equals(correctUsername)) {
                if (password.getText().toString().equals(correctPassword)) {
                    Toast.makeText(this.getActivity(), "Successful login", Toast.LENGTH_LONG).show();
                    NavHostFragment.findNavController(Login.this)
                            .navigate(R.id.action_login_to_FirstFragment);
                } else {
                    Toast.makeText(this.getActivity(), "Incorrect password", Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(this.getActivity(), "Invalid Username/Password Try again", Toast.LENGTH_LONG).show();
            }
        });
    }
}


/*

package com.example.cs124loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button loginButton;

    String correctUsername = "admin";
    String correctPassword = "Password123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.button);

        loginButton.setOnClickListener(v -> {
            if (TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())) {
                Toast.makeText(MainActivity.this, "Empty data provided", Toast.LENGTH_LONG).show();
            } else if (username.getText().toString().equals(correctUsername)) {
                if (password.getText().toString().equals(correctPassword)) {
                    Toast.makeText(MainActivity.this, "Successful login", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Incorrect password", Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(MainActivity.this, "Invalid Username/Password Try again", Toast.LENGTH_LONG).show();
            }
        });
    }
}

 */