public class Ejercicio8 {
    public static void main(String[] args) {

        int[][] matriz = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = 1;
            }
        }

        matriz[0][4] = 8;
        matriz[2][6] = 8;
        matriz[3][1] = 8;
        matriz[8][6] = 8;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}