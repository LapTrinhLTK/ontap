package com.example.ontap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainThiThu extends AppCompatActivity {

    Button btnreturn1, chonde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_thi_thu);

        btnreturn1 = (Button) findViewById(R.id.return1);
        btnreturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyenmain1 = new Intent(MainThiThu.this, MainActivity.class);
                startActivity(chuyenmain1);
            }
        });

        chonde = (Button) findViewById(R.id.deso1);
        chonde = (Button) findViewById(R.id.deso2);
        chonde = (Button) findViewById(R.id.deso3);
        chonde = (Button) findViewById(R.id.deso4);
        chonde = (Button) findViewById(R.id.deso5);
        chonde = (Button) findViewById(R.id.deso6);
        chonde = (Button) findViewById(R.id.deso7);
        chonde = (Button) findViewById(R.id.deso8);
        chonde = (Button) findViewById(R.id.deso9);
        chonde = (Button) findViewById(R.id.deso10);

        chonde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}