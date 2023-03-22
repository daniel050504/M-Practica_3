package com.mycompany.practica_31;

import java.util.Calendar;

public class MyUtils {
    
        public static String inverteix(String cadena) {
        
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
        
        return cadenaInvertida;
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        int resultat = 0;
        
       Calendar dataActual = Calendar.getInstance();
       
       int diaActual = dataActual.get(Calendar.DAY_OF_MONTH);
       int mesActual = dataActual.get(Calendar.MONTH);
       int anyActual = dataActual.get(Calendar.YEAR);
       
       int anysInicials = anyActual - year;
       resultat = anysInicials;
       
        if (mesActual > month) {
            resultat ++;
        } else if(mesActual == month){
            if (diaActual >= day) {
                resultat++;
            }
        }else{
        resultat--;
        }
       
        if (resultat <= 150 && resultat >= 0) {
            return resultat;
        } else if (resultat > 150){
            return -1;
        }else{
        return -2;
        }        
        
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static int factorial(int numero) {

        if (numero == 0) {
            return 1;
        } else {
            int resultat = numero * factorial(numero - 1);
            return resultat;
        }

    }
    
}
