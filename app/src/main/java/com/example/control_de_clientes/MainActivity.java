package com.example.control_de_clientes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private Button add;
    private Button add1;
    private int cont = 0;
    private int cont1 = 0;
    TextView txt;
    TextView txt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.action_add);
        add1 = findViewById(R.id.action_out);

        txt = findViewById(R.id.text1);
        txt1 = findViewById(R.id.text2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont++;
                txt.setText(Integer.toString(cont));

            }
        });

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                cont1++;
                txt1.setText(Integer.toString(cont1));

            }
        });



    }
}
