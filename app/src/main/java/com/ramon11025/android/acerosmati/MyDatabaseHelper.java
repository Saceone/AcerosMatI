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
    private static final String DATABASE_CREATE = "CREATE TABLE IF NOT EXISTS "+ DATABASE_NAME +
            " (_id INT PRIMARY KEY, nombre TEXT," +
            " c TEXT, mn TEXT, si TEXT, p TEXT," +
            " s TEXT, n TEXT, pb TEXT, ni TEXT, mo TEXT," +
            " cr TEXT, cu TEXT, al TEXT, v TEXT, nb TEXT," +
            " ti TEXT, w TEXT, co TEXT, mg TEXT, b TEXT," +
            " app TEXT, tt TEXT, uest TEXT, tipo TEXT);";

    public MyDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Method is called during creation of the database
    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);

        //ACEROS DE CONSTRUCCION
        //--de uso general
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, p, s, n)" +
                " VALUES (100001, 'Acero de construcción de uso general', 'libro', '<0.17', '<1.4', '0.035-0.045', '0.035-0.045', '0.009-0.012');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, p, s, n)" +
                " VALUES (100002, 'Acero de construcción de uso general', 'libro', '0.18-0.21', '<1.4', '0.035-0.045', '0.035-0.045', '0.009-0.012');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, n)" +
                " VALUES (100003, 'Acero de construcción de uso general', 'libro', '0.20-0.24', '<1.6', '<0.55', '0.035-0.045', '0.035-0.045', '0.009-0.012');");

        //--de fácil mecanización
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s)" +
                " VALUES (100011, 'Acero de fácil mecanización', 'libro', '<0.14', '0.9-1.30', '<0.05', '<0.11', '0.24-0.32');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, pb)" +
                " VALUES (100012, 'Acero de fácil mecanización', 'libro', '<0.14', '0.9-1.30', '<0.05', '<0.11', '0.24-0.32', '0.15-0.35');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s)" +
                " VALUES (100013, 'Acero de fácil mecanización', 'libro', '<0.15', '1.00-1.50', '<0.05', '<0.11', '0.30-0.40');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, pb)" +
                " VALUES (100014, 'Acero de fácil mecanización', 'libro', '<0.15', '1.00-1.50', '<0.05', '<0.11', '0.30-0.40', '0.15-0.35');");

        //--microaleados de estructura ferritico-perlitica
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, n, ni, al, nb, v, ti)" +
                " VALUES (100101, 'Acero microaleado de estructura ferrítico-perlítica', 'libro', '<0.13', '<1.5', '<0.5', '<0.035', '<0.03', '<0.015', '<0.3', '<0.02', '<0.05', '<0.08', '<0.05');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, n, ni, al, nb, v, ti)" +
                " VALUES (100102, 'Acero microaleado de estructura ferrítico-perlítica', 'libro', '<0.14', '<1.6', '<0.5', '<0.035', '<0.03', '<0.015', '<0.3', '<0.02', '<0.05', '<0.1', '<0.05');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, n, ni, al, nb, v, ti)" +
                " VALUES (100103, 'Acero microaleado de estructura ferrítico-perlítica', 'libro', '<0.16', '<1.7', '<0.5', '<0.035', '<0.03', '<0.02', '<0.3', '<0.02', '<0.05', '<0.12', '<0.05');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, n, ni, al, nb, v, ti)" +
                " VALUES (100104, 'Acero microaleado de estructura ferrítico-perlítica', 'libro', '<0.16', '<1.7', '<0.5', '<0.035', '<0.03', '<0.025', '<0.45', '<0.02', '<0.05', '<0.12', '<0.05');");

        //--microaleados de estructura ferritico-perlitica
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, al, nb, v, ti)" +
                " VALUES (100111, 'Acero microaleado de estructura ferrítico-perlítica', 'libro', '<0.12', '<1.3', '<0.5', '<0.025', '<0.02', '<0.015', '<0.09', '<0.2', '<0.15');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, al, nb, v, ti)" +
                " VALUES (100112, 'Acero microaleado de estructura ferrítico-perlítica', 'libro', '<0.12', '<1.5', '<0.5', '<0.025', '<0.02', '<0.015', '<0.09', '<0.2', '<0.15');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, al, nb, v, ti)" +
                " VALUES (100113, 'Acero microaleado de estructura ferrítico-perlítica', 'libro', '<0.12', '<1.6', '<0.5', '<0.025', '<0.015', '<0.015', '<0.09', '<0.2', '<0.15');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, al, nb, v, ti)" +
                " VALUES (100114, 'Acero microaleado de estructura ferrítico-perlítica', 'libro', '<0.12', '<1.6', '<0.5', '<0.025', '<0.015', '<0.015', '<0.09', '<0.2', '<0.15');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, al, nb, v, ti)" +
                " VALUES (100115, 'Acero microaleado de estructura ferrítico-perlítica', 'libro', '<0.12', '<1.7', '<0.5', '<0.025', '<0.015', '<0.015', '<0.09', '<0.2', '<0.15');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, al, nb, v, ti)" +
                " VALUES (100116, 'Acero microaleado de estructura ferrítico-perlítica', 'libro', '<0.12', '<1.8', '<0.5', '<0.025', '<0.015', '<0.015', '<0.09', '<0.2', '<0.15');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, mo, b, al, nb, v, ti)" +
                " VALUES (100117, 'Acero microaleado de estructura ferrítico-perlítica', 'libro', '<0.12', '<1.9', '<0.5', '<0.025', '<0.015', '<0.5', '<0.005', '<0.015', '<0.09', '<0.2', '<0.22');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, mo, b, al, nb, v, ti)" +
                " VALUES (100118, 'Acero microaleado de estructura ferrítico-perlítica', 'libro', '<0.12', '<2', '<0.6', '<0.025', '<0.015', '<0.5', '<0.005', '<0.015', '<0.09', '<0.2', '<0.22');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, mo, b, al, nb, v, ti)" +
                " VALUES (100119, 'Acero microaleado de estructura ferrítico-perlítica', 'libro', '<0.12', '<2.1', '<0.6', '<0.025', '<0.015', '<0.5', '<0.005', '<0.015', '<0.09', '<0.2', '<0.22');");

        //--microaleados de estructura ferritica acicular o bainítica

        //--microaleados IF
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, n, b, al, v)" +
                " VALUES (100121, 'Acero microaleado IF', 'libro', '0.003', '1.2', '0.01', '0.05', '0.01', '0.0025', '0.0015', '0.04', '0.05');");

        //--microaleados DP

        //--CORTEN, con resistencia a la corrosión mejorada
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, ni, cr, cu)" +
                " VALUES (100201, 'Acero con resistencia a la corrosión mejorada (CORTEN)', 'libro', '<0.13', '0.2-0.6', '<0.4', '<0.04', '0.035-0.04', '<0.65', '0.4-0.8', '0.25-0.55');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, ni, cr, cu)" +
                " VALUES (100202, 'Acero con resistencia a la corrosión mejorada (CORTEN)', 'libro', '<0.12', '<1', '<0.75', '0.06-0.15', '0.035-0.04', '<0.65', '0.3-1.25', '0.25-0.55');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, ni, cr, cu)" +
                " VALUES (100203, 'Acero con resistencia a la corrosión mejorada (CORTEN)', 'libro', '<0.16', '0.5-1.5', '<0.5', '0.035-0.04', '0.035-0.04', '<0.65', '0.4-0.8', '0.25-0.55');");

        //--recubiertos

        //--carriles
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, cr)" +
                " VALUES (101001, 'Acero para carriles', 'libro', '0.38-0.62', '0.65-1.25', '0.13-0.6', '<0.04', '0.008-0.04', '<0.15');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, cr)" +
                " VALUES (101002, 'Acero para carriles', 'libro', '0.5-0.6', '1-1.25', '0.2-0.6', '<0.025', '0.008-0.025', '<0.15');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, cr)" +
                " VALUES (101003, 'Acero para carriles', 'libro', '0.6-0.82', '0.65-1.25', '0.13-0.6', '<0.03', '0.008-0.03', '<0.15');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, cr)" +
                " VALUES (101004, 'Acero para carriles', 'libro', '0.53-0.77', '1.25-1.75', '0.13-0.62', '<0.03', '0.008-0.03', '<0.15');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, cr)" +
                " VALUES (101005, 'Acero para carriles', 'libro', '0.58-0.82', '0.75 -1.25', '0.48-1.12', '<0.025', '0.008-0.03', '0.75-1.25');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, cr)" +
                " VALUES (101006, 'Acero para carriles', 'libro', '0.7-0.82', '0.65-1.25', '0.13-0.6', '<0.025', '0.008-0.03', '<0.15');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, cr)" +
                " VALUES (101007, 'Acero para carriles', 'libro', '0.7-0.82', '0.65-1.25', '0.13-0.6', '<0.025', '0.008-0.03', '<0.3');");

        //--cables
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s)" +
                " VALUES (101101, 'Acero para cables', 'libro', '0.35-0.85', '0.4-0.8', '0.10-0.35', '<0.045', '<0.045');");

        //--temple y revenido
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, ni, mo, cr)" +
                " VALUES (110001, 'Acero para temple y revenido', 'libro', '0.17-0.24', '0.4-0.7', '<0.4', '<0.035', '<0.035', '<0.4', '<0.1', '<0.4');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, ni, mo, cr)" +
                " VALUES (110002, 'Acero para temple y revenido', 'libro', '0.42-0.5', '0.5-0.8', '<0.4', '<0.035', '<0.035', '<0.4', '<0.1', '<0.4');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, ni, mo, cr)" +
                " VALUES (110003, 'Acero para temple y revenido', 'libro', '0.57-0.65', '0.6-0.9', '<0.4', '<0.035', '<0.035', '<0.4', '<0.1', '<0.4');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, ni, mo, cr)" +
                " VALUES (110004, 'Acero para temple y revenido', 'libro', '0.25-0.32', '1.3-1.65', '<0.4', '<0.035', '<0.035', '<0.4', '<0.1', '<0.4');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, cr)" +
                " VALUES (110005, 'Acero para temple y revenido', 'libro', '0.35-0.42', '0.5-0.8', '<0.4', '<0.035', '<0.035', '0.4-0.6');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, cr)" +
                " VALUES (110006, 'Acero para temple y revenido', 'libro', '0.38-0.45', '0.6-0.9', '<0.4', '<0.035', '<0.035', '0.9-1.2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, mo, cr)" +
                " VALUES (110007, 'Acero para temple y revenido', 'libro', '0.22-0.29', '0.6-0.9', '<0.4', '<0.035', '<0.035', '0.15-0.3', '0.9-1.2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, mo, cr)" +
                " VALUES (110008, 'Acero para temple y revenido', 'libro', '0.30-0.37', '0.6-0.9', '<0.4', '<0.035', '<0.035', '0.15-0.3', '0.9-1.2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, mo, cr)" +
                " VALUES (110009, 'Acero para temple y revenido', 'libro', '0.46-0.54', '0.6-0.9', '<0.4', '<0.035', '<0.035', '0.15-0.3', '0.9-1.2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, ni, mo, cr)" +
                " VALUES (110010, 'Acero para temple y revenido', 'libro', '0.32-0.40', '0.5-0.8', '<0.4', '<0.035', '<0.035', '0.9-1.2', '0.15-0.3', '0.9-1.2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, ni, mo, cr)" +
                " VALUES (110011, 'Acero para temple y revenido', 'libro', '0.26-0.34', '0.3-0.6', '<0.4', '<0.035', '<0.035', '1.8-2.2', '0.3-0.5', '1.8-2.2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, ni, mo, cr)" +
                " VALUES (110012, 'Acero para temple y revenido', 'libro', '0.32-0.39', '0.3-0.6', '<0.4', '<0.035', '<0.035', '3.6-4.10', '0.25-0.45', '1.6-2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, b)" +
                " VALUES (110013, 'Acero para temple y revenido', 'libro', '0.17-0.23', '1.1-1.4', '<0.4', '<0.035', '<0.035', '0.0008-0.005');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, b, cr)" +
                " VALUES (110014, 'Acero para temple y revenido', 'libro', '0.36-0.42', '1.4-1.7', '<0.4', '<0.035', '<0.035', '0.0008-0.005', '0.3-0.6');");

        //--muelles
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s)" +
                " VALUES (110021, 'Acero para muelles', 'libro', '0.72-0.85', '0.5-0.8', '0.15-0.4', '<0.035', '<0.035');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s)" +
                " VALUES (110022, 'Acero para muelles', 'libro', '0.43-0.5', '0.5-0.8', '1.5-2', '<0.035', '<0.035');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s)" +
                " VALUES (110023, 'Acero para muelles', 'libro', '0.57-0.64', '0.6-0.9', '1.5-2', '<0.035', '<0.035');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, cr)" +
                " VALUES (110024, 'Acero para muelles', 'libro', '0.57-0.64', '0.7-1', '1.5-2', '<0.035', '<0.035', '0.25-0.4');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, cr)" +
                " VALUES (110025, 'Acero para muelles', 'libro', '0.52-0.59', '0.7-1', '0.15-0.4', '<0.035', '<0.035', '0.6-0.9');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, cr, v)" +
                " VALUES (110026, 'Acero para muelles', 'libro', '0.48-0.55', '0.7-1', '0.15-0.4', '<0.035', '<0.035', '0.9-1.2', '0.1-0.2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s, mo, cr, v)" +
                " VALUES (110027, 'Acero para muelles', 'libro', '0.48-0.56', '0.7-1', '0.15-0.4', '<0.035', '<0.035', '0.15-0.25', '0.9-1.2', '0.07-0.12');");


        //ACEROS DE HERRAMIENTAS
        //--al Carbono
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s)" +
                " VALUES (200001, 'Acero de herramientas para trabajo en frío al carbono', 'libro', '0.5-1.4', '0.2-0.7', '<0.4', '<0.025', '<0.025');");

        //--aleados de corte no rápido
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, cr)" +
                " VALUES (201001, 'Acero de herramientas para trabajo en frío aleado de corte no rápido ', 'libro', '1', '1.5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, w)" +
                " VALUES (201002, 'Acero de herramientas para trabajo en frío aleado de corte no rápido ', 'libro', '0.9', '1');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, w)" +
                " VALUES (201003, 'Acero de herramientas para trabajo en frío aleado de corte no rápido ', 'libro', '1.2', '1');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, w)" +
                " VALUES (201004, 'Acero de herramientas para trabajo en frío aleado de corte no rápido ', 'libro', '1.2', '2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, cr, w)" +
                " VALUES (201005, 'Acero de herramientas para trabajo en frío aleado de corte no rápido ', 'libro', '1.3', '0.75', '4');");

        //--grafíticos
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si)" +
                " VALUES (202001, 'Acero de herramientas para trabajo en frío grafítico ', 'libro', '1.5', '0.5', '0.9');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, mo, w)" +
                " VALUES (202002, 'Acero de herramientas para trabajo en frío grafítico ', 'libro', '1.5', '0.3', '0.65', '0.5', '2.5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, al)" +
                " VALUES (202003, 'Acero de herramientas para trabajo en frío grafítico ', 'libro', '1.5', '0.3', '0.25', '0.2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, mo)" +
                " VALUES (202004, 'Acero de herramientas para trabajo en frío grafítico ', 'libro', '1.5', '0.3', '0.8', '0.3');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, mo, cr)" +
                " VALUES (202005, 'Acero de herramientas para trabajo en frío grafítico ', 'libro', '1.5', '1.25', '1', '1.75', '0.5', '0.5');");

        //--indeformables
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, cr, w)" +
                " VALUES (203001, 'Acero de herramientas para trabajo en frío indeformable al Mn ', 'libro', '0.9', '1', '0.5', '0.5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn)" +
                " VALUES (203002, 'Acero de herramientas para trabajo en frío indeformable al Mn ', 'libro', '0.9', '1.6');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, mo, cr)" +
                " VALUES (203003, 'Acero de herramientas para trabajo en frío indeformable al Mn ', 'libro', '1', '2', '1', '1');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, mo, cr)" +
                " VALUES (203004, 'Acero de herramientas para trabajo en frío indeformable al Mn ', 'libro', '1', '3', '1', '1');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, mo, cr)" +
                " VALUES (203005, 'Acero de herramientas para trabajo en frío indeformable al Mn ', 'libro', '0.7', '2.25', '1.35', '1');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, cr)" +
                " VALUES (203010, 'Acero de herramientas para trabajo en frío indeformable al Cr 5% ', 'libro', '1', '1', '5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, cr)" +
                " VALUES (203011, 'Acero de herramientas para trabajo en frío indeformable al Cr 5% ', 'libro', '1.25', '1', '5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, cr)" +
                " VALUES (203020, 'Acero de herramientas para trabajo en frío indeformable al Cr 12% ', 'libro', '2.25', '12');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, cr, v)" +
                " VALUES (203021, 'Acero de herramientas para trabajo en frío indeformable al Cr 12% ', 'libro', '1.5', '1', '12', '1');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, cr)" +
                " VALUES (203022, 'Acero de herramientas para trabajo en frío indeformable al Cr 12% ', 'libro', '2.25', '1', '12');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, cr, co)" +
                " VALUES (203023, 'Acero de herramientas para trabajo en frío indeformable al Cr 12% ', 'libro', '1.5', '1', '12', '3');");

        //--aleados para trabajo de choque (frio)
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si)" +
                " VALUES (204001, 'Acero de herramientas para trabajo en frío aleados para trabajo de choque ', 'libro', '0.6', '0.9', '1.8');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si)" +
                " VALUES (204002, 'Acero de herramientas para trabajo en frío aleados para trabajo de choque ', 'libro', '0.7', '0.9', '2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, mo, v)" +
                " VALUES (204003, 'Acero de herramientas para trabajo en frío aleados para trabajo de choque ', 'libro', '0.7', '0.7', '2', '0.5', '0.25');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, cr, v, w)" +
                " VALUES (204010, 'Acero de herramientas para trabajo en frío aleados para trabajo de choque ', 'libro', '0.5', '1.2', '0.2', '2.5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, mo, cr)" +
                " VALUES (204011, 'Acero de herramientas para trabajo en frío aleados para trabajo de choque ', 'libro', '0.6', '0.6', '0.4', '0.7');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, cr)" +
                " VALUES (204012, 'Acero de herramientas para trabajo en frío aleados para trabajo de choque ', 'libro', '0.5', '0.6', '1');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, cr)" +
                " VALUES (204013, 'Acero de herramientas para trabajo en frío aleados para trabajo de choque ', 'libro', '0.5', '0.6', '1');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, mo)" +
                " VALUES (204014, 'Acero de herramientas para trabajo en frío aleados para trabajo de choque ', 'libro', '0.5', '0.4', '1', '0.5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr, v, w)" +
                " VALUES (204015, 'Acero de herramientas para trabajo en frío aleados para trabajo de choque ', 'libro', '0.5', '0.4', '1', '1.2', '0.15', '2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr, v, w)" +
                " VALUES (204016, 'Acero de herramientas para trabajo en frío aleados para trabajo de choque ', 'libro', '0.35', '0.4', '1', '1.2', '0.15', '2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, cr, v)" +
                " VALUES (204017, 'Acero de herramientas para trabajo en frío aleados para trabajo de choque ', 'libro', '0.9', '0.3', '0.75', '0.15');");

        //--Hadfield
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, p, s)" +
                " VALUES (205001, 'Acero Hadfield ', 'libro', '1.2', '12.5', '0.5', '<0.05', '<0.03');");

        //--rápidos
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, cr, v, w)" +
                " VALUES (206001, 'Acero rápido al W ', 'libro', '0.75', '4', '1', '18');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, cr, v, w)" +
                " VALUES (206002, 'Acero rápido al W ', 'libro', '0.8', '4', '2', '18');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, cr, v, w)" +
                " VALUES (206003, 'Acero rápido al W ', 'libro', '1', '4', '3', '18');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, cr, v, w)" +
                " VALUES (206004, 'Acero rápido al W ', 'libro', '0.8', '4', '4', '14');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, cr, v, w)" +
                " VALUES (206005, 'Acero rápido al W ', 'libro', '1.2', '4', '2', '18');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, cr, v, w)" +
                " VALUES (206101, 'Acero rápido al Mo ', 'libro', '1', '8.75', '4', '2', '1.75');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, cr, v, w)" +
                " VALUES (206102, 'Acero rápido al Mo ', 'libro', '0.8', '8', '4', '1', '1.5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, cr, v, w)" +
                " VALUES (206103, 'Acero rápido al Mo ', 'libro', '1', '5', '4', '2', '6');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, cr, v, w)" +
                " VALUES (206104, 'Acero rápido al Mo ', 'libro', '1', '5', '4', '2.75', '6');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, cr, v, w)" +
                " VALUES (206105, 'Acero rápido al Mo ', 'libro', '1.2', '5', '4', '3', '6');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, cr, v, w)" +
                " VALUES (206106, 'Acero rápido al Mo ', 'libro', '1.3', '4.5', '4', '4', '5.5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, v, w, co)" +
                " VALUES (206201, 'Acero rápido al Co ', 'libro', '0.75', '1', '18', '5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, v, w, co)" +
                " VALUES (206202, 'Acero rápido al Co ', 'libro', '0.8', '2', '18', '8');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, v, w, co)" +
                " VALUES (206203, 'Acero rápido al Co ', 'libro', '0.8', '1.5', '20', '12');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, v, w, co)" +
                " VALUES (206204, 'Acero rápido al Co ', 'libro', '0.75', '2', '14', '5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, v, w, co)" +
                " VALUES (206205, 'Acero rápido al Co ', 'libro', '1.5', '5', '5', '12', '5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, v, w, co)" +
                " VALUES (206206, 'Acero rápido al Co ', 'libro', '0.8', '5', '1.5', '4', '12');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, v, w, co)" +
                " VALUES (206207, 'Acero rápido al Co ', 'libro', '0.8', '8', '1.25', '2', '5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, v, w, co)" +
                " VALUES (206208, 'Acero rápido al Co ', 'libro', '0.9', '8', '2', '2', '8');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, v, w, co)" +
                " VALUES (206209, 'Acero rápido al Co ', 'libro', '0.85', '5', '2', '6', '5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, v, w, co)" +
                " VALUES (206210, 'Acero rápido al Co ', 'libro', '1.25', '3.75', '3.25', '10.5', '10');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, v, w, co)" +
                " VALUES (206211, 'Acero rápido al Co ', 'libro', '1.2', '5', '3', '6', '5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mo, v, w, co)" +
                " VALUES (206212, 'Acero rápido al Co ', 'libro', '1.1', '3.75', '2', '6.5', '5');");

        //--aleados para trabajo de choque (caliente)
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, mo, cr)" +
                " VALUES (207001, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '0.35', '0.5', '0.25', '4.25', '0.5', '1.25');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, mo, cr)" +
                " VALUES (207002, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '0.45', '0.5', '0.25', '3', '0.3', '0.75');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, mo, cr)" +
                " VALUES (207003, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '0.55', '0.5', '0.25', '1.3', '0.2', '0.75');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr, v)" +
                " VALUES (207004, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '0.32', '0.3', '1', '1', '4');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr, v)" +
                " VALUES (207005, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '0.42', '0.3', '1', '1.25', '2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr, v)" +
                " VALUES (207006, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '0.55', '0.3', '1', '1.25', '2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr, v)" +
                " VALUES (207007, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '0.4', '0.3', '1', '5', '5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr, v)" +
                " VALUES (207008, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '0.3', '0.25', '0.25', '3', '9.5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr, v)" +
                " VALUES (207009, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '0.35', '0.25', '0.25', '3', '11');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr, v)" +
                " VALUES (207010, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '0.45', '0.25', '0.25', '3', '15');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, mo, cr)" +
                " VALUES (207011, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '0.6', '0.6', '1', '0.3', '0.8');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, mo, cr)" +
                " VALUES (207012, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '0.65', '0.6', '1', '0.3', '0.8');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, mo, cr)" +
                " VALUES (207013, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '0.35', '0.25', '1', '1', '5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, mo, cr)" +
                " VALUES (207014, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '1.3', '0.25', '1', '0.9', '15');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, mo, cr, v)" +
                " VALUES (207015, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '0.35', '0.4', '1', '1.3', '5', '0.4');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, mo, cr, v)" +
                " VALUES (207016, 'Acero de herramientas para trabajo en caliente aleados para trabajo de choque ', 'libro', '0.3', '0.5', '1', '2.8', '3', '0.5');");

        //--carburo-ferríticos: resistentes al desgaste a alta temperatura
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, si, cr)" +
                " VALUES (208001, 'Acero de herramientas resistente al desgaste a alta temperatura ', 'libro', '1.2-2.3', '1-2', '30-33');");

        //ACEROS INOXIDABLES
        //--martensíticos
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr)" +
                " VALUES (300001, 'Acero inoxidable martensítico ', 'libro', '<0.12', '<1', '<1', '13');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr)" +
                " VALUES (300002, 'Acero inoxidable martensítico ', 'libro', '<0.12', '<1.25', '<1', '13');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr, ni)" +
                " VALUES (300003, 'Acero inoxidable martensítico ', 'libro', '<0.15', '<1', '<1', '13', '2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr, ni)" +
                " VALUES (300004, 'Acero inoxidable martensítico ', 'libro', '<0.2', '<1', '<1', '16', '2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr)" +
                " VALUES (300005, 'Acero inoxidable martensítico ', 'libro', '0.35', '<1', '<1', '13');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr)" +
                " VALUES (300006, 'Acero inoxidable martensítico ', 'libro', '0.65', '<1', '<1', '17');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr)" +
                " VALUES (300007, 'Acero inoxidable martensítico ', 'libro', '0.9-1.2', '<1', '<1', '17');");

        //--ferríticos
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr)" +
                " VALUES (310001, 'Acero inoxidable ferrítico ', 'libro', '0.1', '<1', '<1', '16');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr)" +
                " VALUES (310002, 'Acero inoxidable ferrítico ', 'libro', '0.1', '<1.25', '<1', '16');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr)" +
                " VALUES (310003, 'Acero inoxidable ferrítico ', 'libro', '0.3', '<1', '<1', '27-30');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, n, ni, mo, cr)" +
                " VALUES (310004, 'Acero inoxidable ferrítico ELI ', 'libro', '0.001', '0.015', '2', '4', '29');");

        //--austeníticos
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, cr)" +
                " VALUES (320001, 'Acero inoxidable austenítico ', 'libro', '<0.08', '<2', '<1', '8', '18');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, cr, ti)" +
                " VALUES (320002, 'Acero inoxidable austenítico ', 'libro', '<0.08', '<2', '<1', '8', '18', '5 %C');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, cr)" +
                " VALUES (320003, 'Acero inoxidable austenítico ', 'libro', '<0.12', '<2', '<1', '8', '18');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, mo, cr)" +
                " VALUES (320004, 'Acero inoxidable austenítico ', 'libro', '<0.08', '<2', '<1', '12', '3', '18');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, mo, cr, ti)" +
                " VALUES (320005, 'Acero inoxidable austenítico ', 'libro', '<0.08', '<2', '<1', '12', '3', '18', '5 %C');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, cr)" +
                " VALUES (320006, 'Acero inoxidable austenítico ', 'libro', '<0.08', '<2', '<1', '12', '12');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, n, mo, cr)" +
                " VALUES (320007, 'Acero inoxidable austenítico ', 'libro', '0.15', '18', '0.4', '0.25', '0.5', '10');");

        //--refractarios
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr)" +
                " VALUES (330001, 'Acero inoxidable refractario ', 'libro', '<0.12', '0.3', '2.5', '6');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr, al)" +
                " VALUES (330002, 'Acero inoxidable refractario ', 'libro', '<0.12', '0.3', '1', '6', '0.8');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr, al)" +
                " VALUES (330003, 'Acero inoxidable refractario ', 'libro', '<0.12', '0.6', '1.2', '13', '1');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr, al)" +
                " VALUES (330004, 'Acero inoxidable refractario ', 'libro', '<0.12', '0.6', '1', '18', '1');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, cr)" +
                " VALUES (330005, 'Acero inoxidable refractario ', 'libro', '<0.12', '0.6', '2.5', '8', '18');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, cr, w)" +
                " VALUES (330006, 'Acero inoxidable refractario ', 'libro', '<0.12', '0.6', '1.5', '8', '18', '3');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, cr)" +
                " VALUES (330007, 'Acero inoxidable refractario ', 'libro', '<0.12', '0.6', '2', '10', '20');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, cr)" +
                " VALUES (330008, 'Acero inoxidable refractario ', 'libro', '<0.12', '0.6', '2', '15', '20');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, cr)" +
                " VALUES (330009, 'Acero inoxidable refractario ', 'libro', '<0.12', '0.6', '2', '25', '20');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, cr)" +
                " VALUES (330010, 'Acero inoxidable refractario ', 'libro', '<0.12', '0.6', '1.2', '4', '25');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, cr)" +
                " VALUES (330011, 'Acero inoxidable refractario ', 'libro', '<0.12', '0.6', '2', '12', '25');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, cr)" +
                " VALUES (330012, 'Acero inoxidable refractario ', 'libro', '<0.12', '1.5', '2', '20', '25');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, cr)" +
                " VALUES (330013, 'Acero inoxidable refractario ', 'libro', '<0.12', '1', '2', '30');");

        //--resistentes a alta temperatura
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, mo, cr, ti, w)" +
                " VALUES (340001, 'Acero inoxidable resistente a alta temperatura ', 'libro', '<0.08', '1.5', '0.5', '15', '2', '13', '0.6', '0.6');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, mo, cr, al, ti)" +
                " VALUES (340002, 'Acero inoxidable resistente a alta temperatura ', 'libro', '<0.08', '1.5', '1', '26', '4', '13', '0.1', '1.5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, mo, cr, al, ti)" +
                " VALUES (340003, 'Acero inoxidable resistente a alta temperatura ', 'libro', '<0.08', '1.25', '1', '25', '1.25', '15', '0.35', '2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, n, ni, mo, cr, al, ti)" +
                " VALUES (340004, 'Acero inoxidable resistente a alta temperatura ', 'libro', '0.15', '2', '0.75', '0.15', '15', '1.5', '16', '1', '1.5');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, mo, cr)" +
                " VALUES (340005, 'Acero inoxidable resistente a alta temperatura ', 'libro', '<0.08', '1.5', '0.75', '25', '6', '16');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, mo, cr, ti, w)" +
                " VALUES (340006, 'Acero inoxidable resistente a alta temperatura ', 'libro', '0.3', '1', '0.6', '8', '1.2', '18', '0.3', '1.2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, mo, cr, ti, w)" +
                " VALUES (340007, 'Acero inoxidable resistente a alta temperatura ', 'libro', '0.3', '1', '0.6', '8', '1.5', '18', '0.6', '1.2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, cr, ti)" +
                " VALUES (340008, 'Acero inoxidable resistente a alta temperatura ', 'libro', '<0.08', '1', '0.6', '32', '20', '1');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, mn, si, ni, cr, w)" +
                " VALUES (340009, 'Acero inoxidable resistente a alta temperatura ', 'libro', '0.2', '0.6', '1.2', '13', '23', '3');");

        //--para válvulas
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, si, cr)" +
                " VALUES (350001, 'Acero inoxidable para válvulas ', 'libro', '0.45', '3.5', '9');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, si, cr)" +
                " VALUES (350002, 'Acero inoxidable para válvulas ', 'libro', '2', '0.3', '12');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, si, cr, ni, w)" +
                " VALUES (350003, 'Acero inoxidable para válvulas ', 'libro', '0.45', '1.5', '15', '14', '2');");

        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, c, si, cr, ni, w)" +
                " VALUES (350004, 'Acero inoxidable para válvulas ', 'libro', '0.45', '2.5', '18', '9', '1');");

        //--austeno-ferríticos
        database.execSQL("INSERT INTO " + DATABASE_NAME + " (_id, nombre, tipo, cr, ni, mo)" +
                " VALUES (360001, 'Acero inoxidable austeno-ferrítico ', 'libro', '18-28', '4-6', '1.5-3');");
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