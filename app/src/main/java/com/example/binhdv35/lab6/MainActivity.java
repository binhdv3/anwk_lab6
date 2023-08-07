package com.example.binhdv35.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView tv_resutl;
    private Button btnFtoC, btnCtoF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.ed);
        btnFtoC = findViewById(R.id.btn_FtoC);
        btnCtoF = findViewById(R.id.btn_CtoF);
        tv_resutl = findViewById(R.id.tv_resutl);

        
    }
}