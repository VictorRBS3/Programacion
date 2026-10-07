import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {

        final char[] LETRAS = {'V' , 'I' , 'C' , 'T' , 'O' , 'R', 'A' , 'M' , 'A' , 'A' , 'I' , 'R' , 'E' , 'N' , 'E' , 'P', 'E' , 'N' , 'E' , 'S'};

        char moda = LETRAS[0];
        int maxFrecuencia = 0;
        for (int i = 0; i < LETRAS.length; i++) {
            int frecuencia = 0;

            for (int j = 0; j < LETRAS.length; j++) {
                if (LETRAS[i] == LETRAS[j]) {
                    frecuencia++;
                }
            }

            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = LETRAS[i];
            }
        }

        System.out.println("La moda es: " + moda);
        System.out.println("Aparece " + maxFrecuencia + " veces.");
    }
}
