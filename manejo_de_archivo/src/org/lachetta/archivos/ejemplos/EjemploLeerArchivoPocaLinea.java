package org.lachetta.archivos.ejemplos;

import org.lachetta.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivoPocaLinea {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\DevospGit\\ProgramacionII\\java.txt";
        ArchivoServicio servicio = new ArchivoServicio();

        servicio.LeerArchivoPocasLineas(nombreArchivo);
    }
}
