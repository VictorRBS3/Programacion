import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int dni;
        char[] LETRAS = {'T' , 'R' , 'W' , 'A' , 'G' , 'M', 'Y' , 'F' , 'P' , 'D' , 'X' , 'B' , 'N' , 'J' , 'Z' , 'S', 'Q' , 'V' , 'H' , 'L' , 'C' , 'K' , 'E'};

        System.out.println("Introduce tu DNI:");
dni = input.nextInt();
System.out.println(LETRAS[dni % 23]);
    }
}
