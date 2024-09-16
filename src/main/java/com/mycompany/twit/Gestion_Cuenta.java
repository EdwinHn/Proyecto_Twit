
package com.mycompany.twit;

public class Gestion_Cuenta {

    public boolean verificar(String user) {
        int contador = UsuarioInfo.getContador();
        for (int i = 0; i < contador; i++) {
            UsuarioInfo cuenta = UsuarioInfo.getCuenta(i);
            if (cuenta.getusuario().equals(user)) {
                return true;
            }
        }
        return false;
    }

    public static UsuarioInfo obtenerInformacion(String nombreUsuario) {
        int contador = UsuarioInfo.getContador();
        for (int i = 0; i < contador; i++) {
            UsuarioInfo usuario = UsuarioInfo.getCuenta(i);
            if (usuario.getusuario().equals(nombreUsuario) && usuario.isCuentaActiva()) {
                return usuario;
            }
        }
        return null;
    }
}
