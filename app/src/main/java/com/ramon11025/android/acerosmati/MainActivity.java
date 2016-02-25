package com.ramon11025.android.acerosmati;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnFullList;
    Button btnRandomSteel;
    TextView txtRandomSteel;

    MyDB acerosDB;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        acerosDB = new MyDB(getBaseContext());

        txtRandomSteel=(TextView)findViewById(R.id.txtRandomSteel);

        btnFullList=(Button)findViewById(R.id.btnFullList);
        btnFullList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),FullList.class);
                startActivity(i);
            }
        });

        btnRandomSteel=(Button)findViewById(R.id.btnRandomSteel);
        btnRandomSteel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), RandomSteel.class);
                startActivity(i);
            }
        });
    }
}

