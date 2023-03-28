package org.lachetta.archivos.ejemplos;

import org.lachetta.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivoPocaLinea {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\DevospGit\\ProgramacionII\\java.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivoPocasLineas(nombreArchivo);
    }
}

    

