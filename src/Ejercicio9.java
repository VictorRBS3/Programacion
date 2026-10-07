public class Ejercicio9 {
    public static void main(String[] args) {

        int array[][] = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 1;
            }
        }
        array[0][4] = 8;
        array[2][6] = 8;
        array[3][1] = 8;
        array[8][6] = 8;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int filas1 = 0;

        for (int i = 0; i < array.length; i++) {
            boolean todosUno = true;

            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 1) {
                    todosUno = false;
                }
            }

            if (todosUno) {
                filas1++;
            }
        }
        int columnas1 = 0;

        for (int j = 0; j < array.length; j++) {
            boolean todosUno = true;

            for (int i = 0; i < array.length; i++) {
                if (array[i][j] != 1) {
                    todosUno = false;
                }
            }

            if (todosUno) {
                columnas1++;
            }
        }

        System.out.println("Rows | = " + filas1 + " / Columns | = " + columnas1);
    }
}