package com.ramon11025.android.acerosmati;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by ASUS on 20/02/2016.
 */
public class MyDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "acerosDB";

    private static final int DATABASE_VERSION = 2;

    // Database creation sql statement
    private static final String DATABASE_CREATE = "CREATE TABLE IF NOT EXISTS "+ DATABASE_NAME + " (Field1 VARCHAR, Field2 INT(3));";

    public MyDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //context.deleteDatabase(DATABASE_NAME);
    }

    // Method is called during creation of the database
    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (Field1, Field2)" + " VALUES ('POLEASA', 666);");
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (Field1, Field2)" + " VALUES ('DEMIGRANTE', 333);");
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (Field1, Field2)" + " VALUES ('This is Pole', 0000)");
    }

    // Method is called during an upgrade of the database,
    @Override
    public void onUpgrade(SQLiteDatabase database,int oldVersion,int newVersion){
        Log.w(MyDatabaseHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        database.execSQL("DROP TABLE IF EXISTS "+ DATABASE_NAME);
        onCreate(database);
    }
}