package com.example.yishafang.healthpro;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.yishafang.healthpro.Listener.OnSignInClickListener;

/**
 * Created by yishafang on 8/27/15.
 */
public class SignInActivity extends Activity {

    private Button signInButton;
    private Button toSignUpButton;
    private EditText usernameField;
    private EditText passwordField;

    private String username;
    private String password;

    OnSignInClickListener onSignInClickListener;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.sign_in);

        usernameField = (EditText) findViewById(R.id.user_name);
        passwordField = (EditText) findViewById(R.id.password);

        signInButton = (Button) findViewById(R.id.sign_in_button);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("SignInActivity: ", "signIn button clicked");
                // ....
            }
        });

        toSignUpButton = (Button) findViewById(R.id.to_sign_up_button);
        toSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ......
            }
        });
    }


}
