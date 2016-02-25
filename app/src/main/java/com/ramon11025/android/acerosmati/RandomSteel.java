package com.ramon11025.android.acerosmati;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Random;

/**
 * Created by ASUS on 21/02/2016.
 */
public class RandomSteel extends AppCompatActivity {
    Button btnGenerateSteel;
    Button btnClasificacion;
    Button btnUest;
    Button btnApp;
    Button btnTT;

    TextView txtComposición;
    TextView txtClasificación;
    TextView txtUest;
    TextView txtCaracteristicasPpales;
    TextView txtOtrasCaracteristicas;

    CheckBox chkBruto;
    CheckBox chkTT;
    CheckBox chkFrio;
    CheckBox chkCaliente;
    CheckBox chkUest;
    CheckBox chkApp;
    CheckBox chkSelectAll;

    int [] idBruto={100001,100002,100003,100011,100012,100013,100014,100101,100102,100103,100104,100111,100112,100113,100114,100115,100116,100117,100118,100119,100121,100201,100202,100203,101001,101002,101003,101004,101005,101006,101007,101101};
    int [] idTT={110001,110002,110003,110004,110005,110006,110007,110008,110009,110010,110011,110012,110013,110014,110021,110022,110023,110024,110025,110026,110027};
    int [] idFrio={200001,201001,201002,201003,201004,201005,202001,202002,202003,202004,202005,203001,203002,203003,203004,203005,203010,203011,203020,203021,203022,203023,204001,204002,204003,204010,204011,204012,204013,204014,204015,204016,204017,205001};
    int [] idCaliente={206001,206002,206003,206004,206005,206101,206102,206103,206104,206105,206106,206201,206202,206203,206204,206205,206206,206207,206208,206209,206210,206211,206212,207001,207002,207003,207004,207005,207006,207007,207008,207009,207010,207011,207012,207013,207014,207015,207016,208001};
    int [] idUest={300001,300002,300003,300004,300005,300006,300007,310001,310002,310003,310004,320001,320002,320003,320004,320005,320006,320007,360001};
    int [] idApp={330001,330002,330003,330004,330005,330006,330007,330008,330009,330010,330011,330012,330013,340001,340002,340003,340004,340005,340006,340007,340008,340009,350001,350002,350003,350004};

    /*int [] idArray = {100001,100002,100003,100011,100012,100013,100014,100101,100102,100103,100104,100111,100112,100113,100114,100115,100116,100117,100118,100119,100121,
            100201,100202,100203,101001,101002,101003,101004,101005,101006,101007,101101,110001,110002,110003,110004,110005,110006,110007,110008,110009,110010,
            110011,110012,110013,110014,110021,110022,110023,110024,110025,110026,110027,200001,201001,201002,201003,201004,201005,202001,202002,202003,202004,
            202005,203001,203002,203003,203004,203005,203010,203011,203020,203021,203022,203023,204001,204002,204003,204010,204011,204012,204013,204014,204015,
            204016,204017,205001,206001,206002,206003,206004,206005,206101,206102,206103,206104,206105,206106,206201,206202,206203,206204,206205,206206,206207,
            206208,206209,206210,206211,206212,207001,207002,207003,207004,207005,207006,207007,207008,207009,207010,207011,207012,207013,207014,207015,207016,
            208001,300001,300002,300003,300004,300005,300006,300007,310001,310002,310003,310004,320001,320002,320003,320004,320005,320006,320007,330001,330002,
            330003,330004,330005,330006,330007,330008,330009,330010,330011,330012,330013,340001,340002,340003,340004,340005,340006,340007,340008,340009,350001,
            350002,350003,350004,360001};*/

    Acero mAcero;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random_steel);

        final boolean[] steelGenerated = {false};

        chkBruto=(CheckBox)findViewById(R.id.chkBruto);
            chkBruto.setChecked(true);
            chkBruto.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) chkSelectAll.setChecked(false);
                }
            });
        chkTT=(CheckBox)findViewById(R.id.chkTT);
            chkTT.setChecked(true);
            chkTT.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) chkSelectAll.setChecked(false);
                }
            });
        chkFrio=(CheckBox)findViewById(R.id.chkFrio);
            chkFrio.setChecked(true);
            chkFrio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) chkSelectAll.setChecked(false);
                }
            });
        chkCaliente=(CheckBox)findViewById(R.id.chkCaliente);
            chkCaliente.setChecked(true);
            chkCaliente.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) chkSelectAll.setChecked(false);
                }
            });
        chkUest=(CheckBox)findViewById(R.id.chkUest);
            chkUest.setChecked(true);
            chkUest.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) chkSelectAll.setChecked(false);
                }
            });
        chkApp=(CheckBox)findViewById(R.id.chkApp);
            chkApp.setChecked(true);
            chkApp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) chkSelectAll.setChecked(false);
                }
            });
        chkSelectAll=(CheckBox)findViewById(R.id.chkSelectAll);
            chkSelectAll.setChecked(true);
            chkSelectAll.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkBruto.setChecked(true);
                        chkTT.setChecked(true);
                        chkFrio.setChecked(true);
                        chkCaliente.setChecked(true);
                        chkUest.setChecked(true);
                        chkApp.setChecked(true);
                    }
                }
            });

        txtClasificación=(TextView)findViewById(R.id.txtClasificacion);
        txtComposición=(TextView)findViewById(R.id.txtComposicion);
        txtComposición.setText("Genera un nuevo acero");
        txtUest=(TextView)findViewById(R.id.txtMicroestructura);
        txtCaracteristicasPpales=(TextView)findViewById(R.id.txtCaracteristicasPpales);
        txtCaracteristicasPpales.setVisibility(View.INVISIBLE);
        txtOtrasCaracteristicas=(TextView)findViewById(R.id.txtOtrasCaracteristicas);
        txtOtrasCaracteristicas.setVisibility(View.INVISIBLE);

        btnGenerateSteel=(Button)findViewById(R.id.btnGenerateSteel);
        btnGenerateSteel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                steelGenerated[0] =true;
                generarAcero();
                btnClasificacion.setVisibility(View.VISIBLE);
                btnUest.setVisibility(View.VISIBLE);
                btnApp.setVisibility(View.VISIBLE);
                btnTT.setVisibility(View.VISIBLE);
                txtCaracteristicasPpales.setVisibility(View.VISIBLE);
                txtOtrasCaracteristicas.setVisibility(View.VISIBLE);
                txtComposición.setText(mAcero.composicion);
                txtClasificación.setText("Pulsa para ver la clasificación");
                txtUest.setText("Pulsa para ver la microestructura");
            }
        });

        btnClasificacion=(Button)findViewById(R.id.btnClasificacion);
        btnClasificacion.setVisibility(View.INVISIBLE);
        btnClasificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (steelGenerated[0]) {
                    txtClasificación.setText(mAcero.clasificacion);
                }
            }
        });

        btnUest=(Button)findViewById(R.id.btnMicroestructura);
        btnUest.setVisibility(View.INVISIBLE);
        btnUest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (steelGenerated[0]) {
                    txtUest.setText(mAcero.uest);
                }
            }
        });

        btnApp=(Button)findViewById(R.id.btnAplicaciones);
        btnApp.setVisibility(View.INVISIBLE);
        btnApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(steelGenerated[0]){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(RandomSteel.this);
                    builder.setTitle("Aplicaciones");
                    builder.setMessage("poner aplicaiones del acero");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            if (id == Dialog.BUTTON_NEGATIVE)
                                dialog.dismiss();
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            }
        });

        btnTT=(Button)findViewById(R.id.btnTT);
        btnTT.setVisibility(View.INVISIBLE);
        btnTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(steelGenerated[0]){
                    final AlertDialog.Builder builder = new AlertDialog.Builder(RandomSteel.this);
                    builder.setTitle("Tratamientos térmicos");
                    builder.setMessage("poner tratamiento termico del acero");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            if (id == Dialog.BUTTON_POSITIVE)
                                dialog.dismiss();
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            }
        });
    }

    private void generarAcero() {
        int [] idArray = {};
        if (chkBruto.isChecked()) idArray = ArrayUtils.addAll(idArray,idBruto);
        if (chkTT.isChecked()) idArray = ArrayUtils.addAll(idArray,idTT);
        if (chkFrio.isChecked()) idArray = ArrayUtils.addAll(idArray,idFrio);
        if (chkCaliente.isChecked()) idArray = ArrayUtils.addAll(idArray,idCaliente);
        if (chkUest.isChecked()) idArray = ArrayUtils.addAll(idArray,idUest);
        if (chkApp.isChecked()) idArray = ArrayUtils.addAll(idArray,idApp);
        Random rand = new Random();
        int randomNum = rand.nextInt(((idArray.length-1) - 0) + 1) + 0;
        mAcero = new Acero(idArray[randomNum],getBaseContext());;
    }
}
