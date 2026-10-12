package edu.enriqueana.notas.modulos;
public class ModuloNotas {
    public static double calcularMedia(int n1,int n2,int n3){
        return (n1+n2+n3)/3.0;
    }
    public static String obtenerCalificacion(double nota){
        return  nota < 5 ? "suspenso" :
                nota < 6 ? "suficiente" :
                nota < 8 ? "bien" :
                nota < 9 ? "notable" :
                nota <= 10 ? "sobresaliente" : "nota incorrecta";
    }
}
