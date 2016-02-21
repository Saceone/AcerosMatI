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
    int [] idArray = {100001,100002,100003,100011,100012,100013,100014,100101,100102,100103,100104,100111,100112,100113,100114,100115,100116,100117,100118,100119,100121,
                      100201,100202,100203,101001,101002,101003,101004,101005,101006,101007,101101,110001,110002,110003,110004,110005,110006,110007,110008,110009,110010,
                      110011,110012,110013,110014,110021,110022,110023,110024,110025,110026,110027,200001,201001,201002,201003,201004,201005,202001,202002,202003,202004,
                      202005,203001,203002,203003,203004,203005,203010,203011,203020,203021,203022,203023,204001,204002,204003,204010,204011,204012,204013,204014,204015,
                      204016,204017,205001,206001,206002,206003,206004,206005,206101,206102,206103,206104,206105,206106,206201,206202,206203,206204,206205,206206,206207,
                      206208,206209,206210,206211,206212,207001,207002,207003,207004,207005,207006,207007,207008,207009,207010,207011,207012,207013,207014,207015,207016,
                      208001,300001,300002,300003,300004,300005,300006,300007,310001,310002,310003,310004,320001,320002,320003,320004,320005,320006,320007,330001,330002,
                      330003,330004,330005,330006,330007,330008,330009,330010,330011,330012,330013,340001,340002,340003,340004,340005,340006,340007,340008,340009,350001,
                      350002,350003,350004,360001};

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
                Random rand = new Random();
                int randomNum = rand.nextInt((171 - 0) + 1) + 0;
                String randomSteel = acerosDB.getReadableSteel(idArray[randomNum]);
                txtRandomSteel.setText(randomSteel);
            }
        });
    }
}

