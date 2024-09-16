
package com.mycompany.twit;


import java.text.SimpleDateFormat;
import java.util.Date;
public class Twit {
    private String usuario; // Nombre del usuario que publicó el tweet
    private String contenido; // Contenido del tweet
    private String fecha; // Fecha en que se publicó

    public Twit(String usuario, String contenido) {
        this.usuario = usuario;
        this.contenido = contenido;
        this.fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContenido() {
        return contenido;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return usuario + " escribió: \"" + contenido + "\" el [" + fecha + "]";
    }
/*    private static String[] twits = new String[100];
    private static int contador1 = 0;
    private static int contadorTwits = 0;
    
    private String hashtag;
    private static Twit[] hashtags = new Twit[100];
    private static int contador2 = 0;
    private static int contadorHashtags = 0;

    public Twit (){
        
    } 
    
    public Twit (String hashtag){
        this.hashtag=hashtag;
    } 
    
    public static void agregarTwit(String twit) {
        if (contador1 < twits.length) {
            twits[contadorTwits] = twit;
            contadorTwits++;

        }
    }

    public String[] obtenerTwits() {
        return twits;
    }

    public int obtenerContadorTwits() {
        return contadorTwits;

    }
    
    public static void agregarHashtag(Twit hashtag) {
        if (contador2 < hashtags.length) {
            hashtags[contadorHashtags] = hashtag;
            contadorHashtags++;
        }
    }
    
    public String obtenerHashtag() {
        return hashtag;
    }

    public int obtenerContadorHashtag() {
        return contadorHashtags;

    }*/
}
