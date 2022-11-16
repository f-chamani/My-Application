package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {
    private LinearLayout btn_new_note;
    private LinearLayout btn_new_clock;
    private
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_new_note=findViewById(R.id.note_linear) ;
        btn_new_note.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity2.this,new_note.class));
        }
    });

        btn_new_clock=findViewById(R.id.new_clock) ;
        btn_new_clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,clock.class));
            }
        });

    }
}