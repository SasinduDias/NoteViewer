package com.example.NoteViewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class login extends AppCompatActivity {
    EditText et_email,et_password;
    RelativeLayout btn_login;
    TextView tv_sign_up,reset;
    String passwordPattern="[a-zA-Z0-9\\\\!\\\\@\\\\#\\\\$]{8,24}";
    String emailPattern="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    FirebaseAuth mAuth;
    String Uid;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}