package edu.enriqueana.notas.ui;
import edu.enriqueana.notas.modulos.ModuloNotas;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class ProyectoNotas {
    public static void main(String[] args) {
        System.out.println("Introduce la nota del 1º trimestre");
        int nota1 = new Scanner(System.in).nextInt();
        System.out.println("Introduce la nota del 2º trimestre");
        int nota2 = new Scanner(System.in).nextInt();
        System.out.println("Introduce la nota del 3º trimestre");
        int nota3 = new Scanner(System.in).nextInt();
        double nota = ModuloNotas.calcularMedia(nota1,nota2,nota3);
        System.out.println("¿Dónde deseas ver el resultado? [1]Pantalla [2]Archivo");
        int eleccionUsuario = new Scanner(System.in).nextInt();
        if(eleccionUsuario==1){
            System.out.println("La nota media es: "+nota);
        }

    }
}
