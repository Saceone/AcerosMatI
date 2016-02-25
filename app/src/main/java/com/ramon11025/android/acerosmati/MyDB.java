package com.ramon11025.android.acerosmati;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.Random;

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

    public String getClasificacion (int mId){
        Cursor mCursor = database.rawQuery("SELECT * FROM " + EMP_TABLE + " WHERE _id = " + mId+";", null);
        if (mCursor != null) {
            mCursor.moveToFirst();
            int nombre = mCursor.getColumnIndex("nombre");
            String Data = "";
            String name = mCursor.getString(nombre);
            if(name!=null) Data=Data.concat(name);

            return Data;
        }
        else{
            return null;
        }
    }

    public String getComposicion(int id) {
        Cursor mCursor = database.rawQuery("SELECT * FROM " + EMP_TABLE + " WHERE _id = " + id+";", null);
        if (mCursor != null) {
            mCursor.moveToFirst();
            int intId = mCursor.getColumnIndex("_id");
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
            String _id = mCursor.getString(intId);
            Log.d("LOG: ",_id);
            String c = setElement(mCursor.getString(intC));
                if(c!=null) Data=Data.concat("%C "+c);
            String mn = setElement(mCursor.getString(intMn));
                if(mn!=null) Data=Data.concat(", %Mn "+mn);
            String si = setElement(mCursor.getString(intSi));
                if(si!=null) Data=Data.concat(", %Si "+si);
            String p = setElement(mCursor.getString(intP));
                if(p!=null) Data=Data.concat(", %P "+p);
            String s = setElement(mCursor.getString(intS));
                if(s!=null) Data=Data.concat(", %S "+s);
            String n = setElement(mCursor.getString(intN));
                if(n!=null) Data=Data.concat(", %N "+n);
            String ni = setElement(mCursor.getString(intNi));
                if(ni!=null)Data=Data.concat(", %Ni "+ni);
            String mo = setElement(mCursor.getString(intMo));
                if(mo!=null) Data=Data.concat(", %Mo "+mo);
            String cr = setElement(mCursor.getString(intCr));
                if(cr!=null) Data=Data.concat(", %Cr "+cr);
            String cu = setElement(mCursor.getString(intCu));
                if(cu!=null) Data=Data.concat(", %Cu "+cu);
            String al = setElement(mCursor.getString(intAl));
                if(al!=null) Data=Data.concat(", %Al "+al);
            String v = setElement(mCursor.getString(intV));
                if(v!=null) Data=Data.concat(", %V "+v);
            String ti = setElement(mCursor.getString(intTi));
                if(ti!=null) Data=Data.concat(", %Ti "+ti);
            String w = setElement(mCursor.getString(intW));
                if(w!=null) Data=Data.concat(", %W "+w);
            String co = setElement(mCursor.getString(intCo));
                if(co!=null) Data=Data.concat(", %Co "+co);
            String mg = setElement(mCursor.getString(intMg));
                if(mg!=null) Data=Data.concat(", %Mg "+mg);
            //Data=Data.concat("\n\n");
            return Data;
        }
        else{
            return null;
        }
    }

    private String setElement(String s){
        String number="";
        if(s!=null){
            if(s.contains("<")){
                s=s.substring(1);
                int min = 0;
                double max = Double.parseDouble(s);
                Random rand = new Random();
                int decimales=1;
                if(s.contains(".")){
                    decimales = s.length()-2;
                }
                double element = getRandomValue(rand, min, max, decimales);
                s = String.valueOf(element);
                number = s.substring(0,2+decimales);
            }
            else if(s.contains("-")){
                String [] lims = s.split("-");
                double min = Double.parseDouble(lims[0]);
                double max = Double.parseDouble(lims[1]);
                Random rand = new Random();
                int decimales=1;
                if(lims[0].contains(".")){
                    decimales=lims[0].length()-2;
                }
                double element = getRandomValue(rand, min, max, decimales);
                s = String.valueOf(element);
                number = s.substring(0,2+decimales);
            }
            else{
                number=s;
            }
        }
        else{
            return s;
        }
        if(number.equals("0.0")) {
            number="0.1";
        }
        if(number.equals("0.00")){
            number="0.01";
        }
        return number;
    }

    public static double getRandomValue(final Random random,
                                        final double lowerBound,
                                        final double upperBound,
                                        final int decimalPlaces){

        if(lowerBound < 0){
            throw new IllegalArgumentException("Put UNO message here");
        }
        if(upperBound <= lowerBound )throw new IllegalArgumentException("Put DOS message here");
        if(decimalPlaces < 0)throw new IllegalArgumentException("Put TRES message here");

        final double dbl =
                ((random == null ? new Random() : random).nextDouble() //
                        * (upperBound - lowerBound))
                        + lowerBound;
        return dbl;

    }
}