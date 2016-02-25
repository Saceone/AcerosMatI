package com.ramon11025.android.acerosmati;

import android.app.Activity;
import android.content.Context;
/**
 * Created by ASUS on 21/02/2016.
 */
public class Acero extends Activity {

    public String composicion;
    public String clasificacion;
    public String uest;
    public String tt;
    public String app;

    private Context context;

    MyDB aceroDB;

    public Acero (int id, Context context){
        this.context = context;
        aceroDB = new MyDB(context);
        this.composicion = aceroDB.getComposicion(id);
        if(id==360001){
            this.composicion=this.composicion.substring(2,this.composicion.length());
        }
        this.clasificacion = aceroDB.getClasificacion(id);
        this.uest=getUest(id);
       // this.tt=getTT(id);
        //this.app=getApp(id);
    }

    private String getUest(int id) {
        String uest;
        switch (id){
            case 100001:
                uest = "Perlita dispersa en una matriz de ferrita";
                break;
            case 100002:
                uest = "Perlita dispersa en una matriz de ferrita";
                break;
            case 100003:
                uest = "Perlita dispersa en una matriz de ferrita";
                break;
            case 100011:
                uest = "Perlita dispersa en una matriz de ferrita con inclusiones no metálicas de sulfuro de manganeso";
                break;
            case 100012:
                uest = "Perlita dispersa en una matriz de ferrita con inclusiones no metálicas de sulfuro de manganeso y plomo";
                break;
            case 100013:
                uest = "Perlita dispersa en una matriz de ferrita con inclusiones no metálicas de sulfuro de manganeso";
                break;
            case 100014:
                uest = "Perlita dispersa en una matriz de ferrita con inclusiones no metálicas de sulfuro de manganeso y plomo";
                break;
            case 100101:
                uest = "Estructura ferrítico perlítica";
                break;
            case 100102:
                uest = "Estructura ferrítico perlítica";
                break;
            case 100103:
                uest = "Estructura ferrítico perlítica";
                break;
            case 100104:
                uest = "Estructura ferrítico perlítica";
                break;
            case 100111:
                uest = "Estructura ferrítico perlítica";
                break;
            case 100112:
                uest = "Estructura ferrítico perlítica";
                break;
            case 100113:
                uest = "Estructura ferrítico perlítica";
                break;
            case 100114:
                uest = "Estructura ferrítico perlítica";
                break;
            case 100115:
                uest = "Estructura ferrítico perlítica";
                break;
            case 100116:
                uest = "Estructura ferrítico perlítica";
                break;
            case 100117:
                uest = "Estructura ferrítico perlítica";
                break;
            case 100118:
                uest = "Estructura ferrítico perlítica";
                break;
            case 100119:
                uest = "Estructura ferrítico perlítica";
                break;
            case 100121:
                uest = "Ferrita poligonal";
                break;
            case 100201:
                uest = "Perlita dispersa en una matriz ferrítica con inclusiones de cobre";
                break;
            case 100202:
                uest = "Perlita dispersa en una matriz ferrítica con inclusiones de cobre";
                break;
            case 100203:
                uest = "Perlita dispersa en una matriz ferrítica con inclusiones de cobre";
                break;
            case 101001:
                uest = "Exclusivamente perlita para los de mayor dureza, o perlita y ferrita reticular para los grados más blandos";
                break;
            case 101002:
                uest = "Exclusivamente perlita para los de mayor dureza, o perlita y ferrita reticular para los grados más blandos";
                break;
            case 101003:
                uest = "Exclusivamente perlita para los de mayor dureza, o perlita y ferrita reticular para los grados más blandos";
                break;
            case 101004:
                uest = "Exclusivamente perlita para los de mayor dureza, o perlita y ferrita reticular para los grados más blandos";
                break;
            case 101005:
                uest = "Exclusivamente perlita para los de mayor dureza, o perlita y ferrita reticular para los grados más blandos";
                break;
            case 101006:
                uest = "Exclusivamente perlita para los de mayor dureza, o perlita y ferrita reticular para los grados más blandos";
                break;
            case 101007:
                uest = "Exclusivamente perlita para los de mayor dureza, o perlita y ferrita reticular para los grados más blandos";
                break;
            case 101101:
                uest = "Puesto que se endurecen por deformación, no se emplean elementos de aleación, sino que su estructura está formada" +
                        " por el microconstituyente tipo Ar' de mayor alargamiento: la sorbita";
                break;
            case 110001:
                uest = "Martensita revenida, y algo de perlita si la templabilidad no es suficientemente alta";
                break;
            case 110002:
                uest = "Martensita revenida, y algo de perlita si la templabilidad no es suficientemente alta";
                break;
            case 110003:
                uest = "Martensita revenida, y algo de perlita si la templabilidad no es suficientemente alta";
                break;
            case 110004:
                uest = "Martensita revenida, y algo de perlita si la templabilidad no es suficientemente alta";
                break;
            case 110005:
                uest = "Martensita revenida, y algo de perlita si la templabilidad no es suficientemente alta";
                break;
            case 110006:
                uest = "Martensita revenida, y algo de perlita si la templabilidad no es suficientemente alta";
                break;
            case 110007:
                uest = "Martensita revenida, y algo de perlita si la templabilidad no es suficientemente alta";
                break;
            case 110008:
                uest = "Martensita revenida, y algo de perlita si la templabilidad no es suficientemente alta";
                break;
            case 110009:
                uest = "Martensita revenida, y algo de perlita si la templabilidad no es suficientemente alta";
                break;
            case 110010:
                uest = "Martensita revenida, y algo de perlita si la templabilidad no es suficientemente alta";
                break;
            case 110011:
                uest = "Martensita revenida, y algo de perlita si la templabilidad no es suficientemente alta";
                break;
            case 110012:
                uest = "Martensita revenida, y algo de perlita si la templabilidad no es suficientemente alta";
                break;
            case 110013:
                uest = "Martensita revenida, y algo de perlita si la templabilidad no es suficientemente alta";
                break;
            case 110014:
                uest = "Martensita revenida, y algo de perlita si la templabilidad no es suficientemente alta";
                break;
            case 110021:
                uest = "Martensita revenida, más o menos fina dependiendo de la temperatura del revenido";
                break;
            case 110022:
                uest = "Martensita revenida, más o menos fina dependiendo de la temperatura del revenido";
                break;
            case 110023:
                uest = "Martensita revenida, más o menos fina dependiendo de la temperatura del revenido";
                break;
            case 110024:
                uest = "Martensita revenida, más o menos fina dependiendo de la temperatura del revenido";
                break;
            case 110025:
                uest = "Martensita revenida, más o menos fina dependiendo de la temperatura del revenido";
                break;
            case 110026:
                uest = "Martensita revenida, más o menos fina dependiendo de la temperatura del revenido";
                break;
            case 110027:
                uest = "Martensita revenida, más o menos fina dependiendo de la temperatura del revenido";
                break;
            default:
                uest="Microestructura no disponible";
                break;
        }
        return uest;
    }
}
