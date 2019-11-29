package com.example.iriz_techno.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class materi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        Button btn_diponogoro = (Button) findViewById(R.id.b_diponogoro);

        btn_diponogoro .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(materi.this,DIPONOGORO.class);
                startActivity(intent);
            }}
        );
    }
}
