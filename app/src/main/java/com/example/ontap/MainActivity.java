package com.example.ontap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnthithu, btnonluyen, btnintro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnthithu = (Button) findViewById(R.id.btnthithu);
        btnthithu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyenthithu = new Intent(MainActivity.this, MainThiThu.class);
                startActivity(chuyenthithu);

            }
        });

        btnonluyen = (Button) findViewById(R.id.btnonluyen);
        btnonluyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyenol = new Intent(MainActivity.this, MainOnLuyen.class);
                startActivity(chuyenol);
            }
        });

        btnintro = (Button) findViewById(R.id.btnhuongdan);


    }
}