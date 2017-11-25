package pe.edu.upc.tareamapa;


import android.graphics.drawable.shapes.RectShape;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by RENSO on 25/11/2017.
 */

public class Prueba1 extends RectShape {

    public String saludos(Date nombre) {
        return "Hola " + nombre;
    }

    //Este es un cambio
    //Mi tercer cambio
    //Mi CUarto cambio
    //RENSO VALENCIA VENTURA
    //Este es un comentario
    //hola soy ivonne
//CONSTRUCTORS
//Este es un comentario
    public Prueba1() {
    }

    private List<String> mStrings = new ArrayList<>();

    public Prueba1(List<String> strings) {
        mStrings = strings;
        System.out.println("Prueba1.Prueba1");
    }

    public List<String> getStrings() {
        return mStrings;
    }

    public void setStrings(List<String> strings) {
        mStrings = strings;
    }

    @Override
    public boolean hasAlpha() {
        return true;
    }

    @Override
    public String toString() {
        return "Prueba1{" +
                "mStrings=" + mStrings +
                '}';
    }

    //<editor-fold desc="Description">
    public boolean add(String s) {
        return mStrings.add(s);
    }
    //</editor-fold>
}
