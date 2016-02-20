package com.ramon11025.android.acerosmati;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    MyDB acerosDB;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        tv = (TextView)findViewById(R.id.tv);

        acerosDB = new MyDB(getBaseContext());
        //borrarTabla();
        leerTabla();
    }

    private void borrarTabla() {
        Context cnt = this.getBaseContext();
        cnt.deleteDatabase("acerosDB");
    }

    private void leerTabla() {
        try {
            String Data = "";

            //retrieve data from database
            Cursor c = acerosDB.selectRecords();

            int Column1 = c.getColumnIndex("Field1");
            int Column2 = c.getColumnIndex("Field2");

            // Check if our result was valid.
            c.moveToFirst();
            if (c != null) {
                // Loop through all Results
                do {
                    String field1 = c.getString(Column1);
                    String field2 = c.getString(Column2);
                    Data =Data +field1+"/"+field2+"\n";
                }while(c.moveToNext());
            }
            tv.setText(Data);
        }
        catch(Exception e) {
            Log.e("Error", "Error", e);
        } finally {
           /* if (acerosDB != null)
                acerosDB.close();*/
        }
    }
}

