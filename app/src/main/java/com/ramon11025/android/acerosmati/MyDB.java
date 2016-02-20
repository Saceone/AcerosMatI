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

    public final static String EMP_ID="Field1"; // id value for field1
    public final static String EMP_NAME="Field2";  // name of field2


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
        //String[] cols = new String[] {EMP_ID, EMP_NAME};
      //  Cursor mCursor = database.query(true, EMP_TABLE,cols,null
       //         , null, null, null, null, null);
        Cursor mCursor = database.rawQuery("SELECT * FROM " + EMP_TABLE, null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor; // iterate to get each value.
    }
}