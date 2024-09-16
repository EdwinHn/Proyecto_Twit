package com.mycompany.twit;

import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.Set;

class UsuarioInfo {

    private String usuario;
    private String nombre;
    private String edad;
    private String fecha;
    private String contraseña;
    private String genero;
    private boolean cuenta_activada;
    private int seguidores = 0;
    private static final int MAX_HASHTAGS = 100;
    private Twit[] hashtags = new Twit[MAX_HASHTAGS];
    private int contadorHashtags = 0;

    private Twit[] twits = new Twit[100];
    private int contadorTwits = 0;
    private Twit[] menciones = new Twit[100];
    private int contadorMenciones = 0;

    private static UsuarioInfo[] cuentas = new UsuarioInfo[100];
    private static int contador = 0;

    private seguidores seguidos;

    public UsuarioInfo(String usuario, String nombre, String edad, String fecha, String contraseña, String genero) {
        this.usuario = usuario;
        this.edad = edad;
        this.contraseña = contraseña;
        this.genero = genero;
        this.nombre = nombre;
        this.seguidos = new seguidores();
        this.cuenta_activada = true;
        this.fecha = fecha;
        this.twits = new Twit[100];
    }
    
    public void desactivarCuenta() {
        cuenta_activada = false;
    }

    public void activarCuenta() {
        cuenta_activada = true;
    }

    
    public boolean isCuentaActiva() {
        return cuenta_activada;
    }

    
    public String getusuario() {
        return usuario;
    }

    public String getedad() {
        return edad;
    }

    public String getcontraseña() {
        return contraseña;
    }

    public String getnombre() {
        return nombre;
    }

    public String getgenero() {
        return genero;
    }

    public String getfecha() {
        return fecha;
    }

    public seguidores getSeguidos() {
        return seguidos;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void incrementarSeguidores() {
        seguidores++;
    }

    public void decrementarSeguidores() {
        if (seguidores > 0) {
            seguidores--;
        }
    }

    public void seguirUsuario(UsuarioInfo usuarioASeguir) {
        if (!this.equals(usuarioASeguir) && !seguidos.loSigo(usuarioASeguir)) {
            seguidos.agregar(usuarioASeguir);
            usuarioASeguir.incrementarSeguidores();
        }


    }

    public void dejarDeSeguir(UsuarioInfo usuarioADejarDeSeguir) {
        if (seguidos.loSigo(usuarioADejarDeSeguir)) {
            seguidos.eliminar(usuarioADejarDeSeguir);
            usuarioADejarDeSeguir.decrementarSeguidores();
        }
        

    }

    
    public static UsuarioInfo obtenerUsuarioPerfil(String nombreUsuario) {
        for (int i = 0; i < contador; i++) {
            UsuarioInfo usuario = cuentas[i];
            if (usuario.getusuario().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
        
    }

    public static UsuarioInfo getCuenta(int index) {
        if (index >= 0 && index < contador) {
            return cuentas[index];
        } else {
            return null; 
        }
    }

    public static int getContador() {
        return contador;
    }

    public static void agregarCuenta(UsuarioInfo cuenta) {
        if (contador < cuentas.length) {
            cuentas[contador] = cuenta;
            contador++;
        }
    }

    public static boolean verificar_cuenta(String user) {
        for (int i = 0; i < contador; i++) {
            if (cuentas[i].getusuario().equals(user)) {
                return true;
            }
        }
        return false;
    }

    public static void buscarUsuarios(String texto) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            UsuarioInfo usuario = cuentas[i];
            if (usuario.getusuario().contains(texto) && usuario.isCuentaActiva()) {
                System.out.println(usuario.getusuario());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron usuarios activos.");
        }
    }

    public static String[] buscarUsuariosConSeguimiento(String texto, UsuarioInfo usuarioActual) {
        int contadorResultados = 0;

        String[] resultadosTemp = new String[getContador()];

        for (int i = 0; i < getContador(); i++) {
            UsuarioInfo cuenta = getCuenta(i);

            if (cuenta.getusuario().contains(texto) && cuenta.isCuentaActiva()) {
                String estado = usuarioActual.getSeguidos().loSigo(cuenta) ? "Sigues" : "No sigues";

                resultadosTemp[contadorResultados] = cuenta.getusuario() + " - " + estado;
                contadorResultados++;
            }
        }

        String[] resultados = new String[contadorResultados];
        System.arraycopy(resultadosTemp, 0, resultados, 0, contadorResultados);

        return resultados;
    }

    public void mandarTweet(String contenido) {
        if (contenido.length() > 140) {
            System.out.println("El tweet no puede exceder los 140 caracteres.");
            return;
        }

        if (contadorTwits < twits.length) {
            Twit nuevoTwit = new Twit(this.usuario, contenido);
            twits[contadorTwits] = nuevoTwit;
            contadorTwits++;

            procesarMencionYHashtags(nuevoTwit);

            notificarSeguidores(nuevoTwit);

            System.out.println("Tweet enviado exitosamente.");
        } else {
            System.out.println("Límite de tweets alcanzado.");
        }
    }

    private void notificarSeguidores(Twit twit) {
        UsuarioInfo[] seguidoresArray = seguidos.obtenerSeguidos();
        for (int i = 0; i < seguidoresArray.length; i++) {
            if (seguidoresArray[i] != null) {
                seguidoresArray[i].agregarTwit(twit);
            }
        }
    }

    public void agregarTwit(Twit twit) {
        if (contadorTwits < twits.length) {
            twits[contadorTwits] = twit;
            contadorTwits++;
        }
    }

    public Twit[] obtenerTwits() {
        Twit[] twitsActivos = new Twit[contadorTwits];
        System.arraycopy(twits, 0, twitsActivos, 0, contadorTwits);
        return twitsActivos;
    }

    public int getContadorTwits() {
        return contadorTwits;
    }

    public String[] obtenerTimeline() {
        Set<Twit> todosTwitsSet = new LinkedHashSet<>();
        todosTwitsSet.addAll(Arrays.asList(obtenerTwits())); 

        UsuarioInfo[] seguidoresArray = seguidos.obtenerSeguidos();
        for (int i = 0; i < seguidoresArray.length; i++) {
            if (seguidoresArray[i] != null && !seguidoresArray[i].getusuario().equals(this.getusuario())) {
                todosTwitsSet.addAll(Arrays.asList(seguidoresArray[i].obtenerTwits()));
            }
        }

        Twit[] todosTwits = todosTwitsSet.toArray(new Twit[0]);
        Arrays.sort(todosTwits, (t1, t2) -> t2.getFecha().compareTo(t1.getFecha()));

        String[] timeline = new String[todosTwits.length];
        for (int i = 0; i < todosTwits.length; i++) {
            timeline[i] = todosTwits[i].toString();
        }

        return timeline;
    }

    public String[] obtenerInteracciones() {
        int totalTwits = UsuarioInfo.getContador() * 100;

        Twit[] interacciones = new Twit[totalTwits];
        int index = 0;

        for (int i = 0; i < UsuarioInfo.getContador(); i++) {
            UsuarioInfo usuario = UsuarioInfo.getCuenta(i);
            Twit[] twitsUsuario = usuario.obtenerTwits();
            for (Twit twit : twitsUsuario) {
                if (twit.getContenido().contains("@" + this.usuario)) {
                    interacciones[index++] = twit;
                }
            }
        }


        for (int i = 0; i < index - 1; i++) {
            for (int j = i + 1; j < index; j++) {
                if (interacciones[i].getFecha().compareTo(interacciones[j].getFecha()) < 0) {
                    Twit temp = interacciones[i];
                    interacciones[i] = interacciones[j];
                    interacciones[j] = temp;
                }
            }
        }

        String[] interaccionesStr = new String[index];
        for (int i = 0; i < index; i++) {
            interaccionesStr[i] = interacciones[i].toString();
        }

        return interaccionesStr;
    }

    public void agregarMencion(Twit twit) {
        if (contadorMenciones < menciones.length) {
            menciones[contadorMenciones] = twit;
            contadorMenciones++;
        }
    }

    // Método para obtener las menciones
    public Twit[] obtenerMenciones() {
        Twit[] mencionesActivas = new Twit[contadorMenciones];
        System.arraycopy(menciones, 0, mencionesActivas, 0, contadorMenciones);
        return mencionesActivas;
    }

    private void procesarMencionYHashtags(Twit twit) {
    String contenido = twit.getContenido();
    
    // Procesar menciones
    if (contenido.contains("@")) {
        String[] palabras = contenido.split(" ");
        for (String palabra : palabras) {
            if (palabra.startsWith("@")) {
                String mencionado = palabra.substring(1); // Quitar el "@"
                UsuarioInfo mencionadoUsuario = Gestion_Cuenta.obtenerInformacion(mencionado);
                if (mencionadoUsuario != null) {
                    mencionadoUsuario.agregarMencion(twit);
                    System.out.println("El usuario @" + mencionado + " ha sido mencionado.");
                }
            }
        }
    }

    // Procesar hashtags
    if (contenido.contains("#")) {
        String[] palabras = contenido.split(" ");
        for (String palabra : palabras) {
            if (palabra.startsWith("#")) {
                if (contadorHashtags < hashtags.length) {
                    hashtags[contadorHashtags] = twit;
                    contadorHashtags++;
                    System.out.println("El tweet contiene el hashtag " + palabra);
                }
            }
        }
    }
}
    public Twit[] obtenerTweetsPorHashtag(String hashtag) {
    Twit[] resultados = new Twit[MAX_HASHTAGS];
    int contadorResultados = 0;

    for (int i = 0; i < contadorHashtags; i++) {
        if (hashtags[i].getContenido().contains(hashtag)) {
            resultados[contadorResultados] = hashtags[i];
            contadorResultados++;
        }
    }

    // Convertir a un arreglo de tamaño exacto
    Twit[] tweetsFiltrados = new Twit[contadorResultados];
    System.arraycopy(resultados, 0, tweetsFiltrados, 0, contadorResultados);

    return tweetsFiltrados;
}
}
