package edu.enriqueana.notas.modulos;
public class ModuloNotas {
    public static double calcularMedia(int n1,int n2,int n3){
        return (n1+n2+n3)/3.0;
    }
    public static String obtenerCalificacion(double nota){
        String calificacion="";
        if(nota<5){
            calificacion="suspenso";
        }else if(nota<6){
            calificacion="suficiente";
        }else if(nota<7){
            calificacion="bien";
        }else if(nota<9){
            calificacion="notable";
        }else if(nota<=10){
            calificacion="sobresaliente";
        }else{
            calificacion="nota incorrecta";
        }
        return calificacion;
    }
}
