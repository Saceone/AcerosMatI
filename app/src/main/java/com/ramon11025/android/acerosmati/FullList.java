package com.ramon11025.android.acerosmati;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by ASUS on 21/02/2016.
 */
public class FullList extends AppCompatActivity {
    TextView tv;
    MyDB acerosDB;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_list);

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
            Cursor mCursor = acerosDB.selectRecords();

            int _id = mCursor.getColumnIndex("_id");
            int nombre = mCursor.getColumnIndex("nombre");
            int type = mCursor.getColumnIndex("tipo");
            int intC = mCursor.getColumnIndex("c");
            int intMn = mCursor.getColumnIndex("mn");
            int intSi = mCursor.getColumnIndex("si");
            int intP = mCursor.getColumnIndex("p");
            int intS = mCursor.getColumnIndex("s");
            int intN = mCursor.getColumnIndex("n");
            int intNi = mCursor.getColumnIndex("ni");
            int intMo = mCursor.getColumnIndex("mo");
            int intCr = mCursor.getColumnIndex("cr");
            int intCu = mCursor.getColumnIndex("cu");
            int intAl = mCursor.getColumnIndex("al");
            int intV = mCursor.getColumnIndex("v");
            int intTi = mCursor.getColumnIndex("ti");
            int intW = mCursor.getColumnIndex("w");
            int intCo = mCursor.getColumnIndex("co");
            int intMg = mCursor.getColumnIndex("mg");

            // Check if our result was valid.
            mCursor.moveToFirst();
            if (mCursor != null) {
                // Loop through all Results
                do {
                    String name = mCursor.getString(nombre);
                        if(name!=null) Data=Data.concat(name+"\n");
                    String tipo = mCursor.getString(type);
                    String c = mCursor.getString(intC);
                        if(c!=null) Data=Data.concat("%C "+c);
                    String mn = mCursor.getString(intMn);
                        if(mn!=null) Data=Data.concat(", %Mn "+mn);
                    String si = mCursor.getString(intSi);
                        if(si!=null) Data=Data.concat(", %Si "+si);
                    String p = mCursor.getString(intP);
                        if(p!=null) Data=Data.concat(", %P "+p);
                    String s = mCursor.getString(intS);
                        if(s!=null) Data=Data.concat(", %S "+s);
                    String n = mCursor.getString(intN);
                        if(n!=null) Data=Data.concat(", %N "+n);
                    int id = mCursor.getInt(_id);
                    String ni = mCursor.getString(intNi);
                        if(ni!=null){
                            if(id==360001){
                                Data=Data.concat("%Ni "+ni);
                            }
                            else{
                                Data=Data.concat(", %Ni "+ni);
                            }
                        }
                    String mo = mCursor.getString(intMo);
                        if(mo!=null) Data=Data.concat(", %Mo "+mo);
                    String cr = mCursor.getString(intCr);
                        if(cr!=null) Data=Data.concat(", %Cr "+cr);
                    String cu = mCursor.getString(intCu);
                        if(cu!=null) Data=Data.concat(", %Cu "+cu);
                    String al = mCursor.getString(intAl);
                        if(al!=null) Data=Data.concat(", %Al "+al);
                    String v = mCursor.getString(intV);
                        if(v!=null) Data=Data.concat(", %V "+v);
                    String ti = mCursor.getString(intTi);
                        if(ti!=null) Data=Data.concat(", %Ti "+ti);
                    String w = mCursor.getString(intW);
                        if(w!=null) Data=Data.concat(", %W "+w);
                    String co = mCursor.getString(intCo);
                        if(co!=null) Data=Data.concat(", %Co "+co);
                    String mg = mCursor.getString(intMg);
                        if(mg!=null) Data=Data.concat(", %Mg "+mg);
                    Data =Data.concat("\n\n");
                }while(mCursor.moveToNext());
            }
            tv.setText(Data+"\n");
        }
        catch(Exception e) {
            Log.e("Error", "Error", e);
        } finally {
           /* if (acerosDB != null)
                acerosDB.close();*/
        }
    }
}
