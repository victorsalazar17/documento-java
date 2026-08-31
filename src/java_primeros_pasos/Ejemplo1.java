package java_primeros_pasos;

public class Ejemplo1 {

    public static int numMayor(int[] numeros) {
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }

    public static void main(String[] args) {

        int[] numeros = {1, 89, 25, 45, 9, 32, 7};

        System.out.println(numMayor(numeros));
    }
}