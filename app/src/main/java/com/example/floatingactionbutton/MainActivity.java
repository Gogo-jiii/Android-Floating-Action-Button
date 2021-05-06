package com.example.floatingactionbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fabDefault, fabMini;
    ExtendedFloatingActionButton fabExtended;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabDefault = findViewById(R.id.fabDefault);
        fabMini = findViewById(R.id.fabMini);
        fabExtended = findViewById(R.id.fabExtended);

        fabDefault.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Default Fab", Toast.LENGTH_SHORT).show();
            }
        });

        fabMini.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Mini Fab", Toast.LENGTH_SHORT).show();
            }
        });

        fabExtended.shrink();
        fabExtended.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Extended Fab", Toast.LENGTH_SHORT).show();
                if (fabExtended.isExtended()) {
                    fabExtended.shrink();
                }else {
                    fabExtended.extend();
                }
            }
        });
    }
}