package com.ramon11025.android.acerosmati;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ASUS on 20/02/2016.
 */
public class MyDB{

    private MyDatabaseHelper dbHelper;

    private SQLiteDatabase database;

    public final static String EMP_TABLE="acerosDB"; // name of table

    public final static String EMP_ID="_id"; // id value for field1
    public final static String EMP_NAME="nombre";  // name of field2


    public MyDB(Context context){
        dbHelper = new MyDatabaseHelper(context);
        database = dbHelper.getWritableDatabase();
    }


    public long createRecords(String id, String name){
        ContentValues values = new ContentValues();
        values.put(EMP_ID, id);
        values.put(EMP_NAME, name);
        return database.insert(EMP_TABLE, null, values);
    }

    public Cursor selectRecords() {
        Cursor mCursor = database.rawQuery("SELECT * FROM " + EMP_TABLE, null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor; // iterate to get each value.
    }

    public String getReadableSteel(int mId){
        Cursor mCursor = database.rawQuery("SELECT * FROM " + EMP_TABLE + " WHERE _id = " + mId+";", null);
        if (mCursor != null) {
            mCursor.moveToFirst();
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
            String Data = "";
            int id = mCursor.getInt(_id);
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
            String ni = mCursor.getString(intNi);
            if(ni!=null) Data=Data.concat(", %Ni "+ni);
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
            Data=Data.concat("\n\n");
            return Data;
        }
        else{
            return null;
        }
    }
}