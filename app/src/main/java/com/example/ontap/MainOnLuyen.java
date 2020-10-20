package com.example.ontap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainOnLuyen extends AppCompatActivity {

    Button btnreturn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_on_luyen);

        btnreturn2 = (Button) findViewById(R.id.return2);
        btnreturn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyenmain2 = new Intent(MainOnLuyen.this, MainActivity.class);
                startActivity(chuyenmain2);
            }
        });
    }
}