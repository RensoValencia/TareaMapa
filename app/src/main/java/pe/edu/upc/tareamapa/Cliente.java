package pe.edu.upc.tareamapa;

import java.nio.DoubleBuffer;

/**
 * Created by RENSO on 10/11/2017.
 */

public class Cliente {

    private String nombre;
    private String posicion;
    private String juega;
    private String biografia;
    private int pictureId;
    private String latitude;
    private String longitude;

    public Cliente(String nombre, String posicion, String juega, String biografia, int pictureId, String latitude, String longitude) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.juega = juega;
        this.biografia = biografia;
        this.pictureId = pictureId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getJuega() {
        return juega;
    }
//RENSO
    public void setJuega(String juega) {
        this.juega = juega;
    }

    public String getBiografia() {
        return biografia;
    }
//MARIA
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public int getPictureId() {
        return pictureId;
    }
//JOSE
    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    //Hola MUNDO
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
