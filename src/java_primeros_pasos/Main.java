package java_primeros_pasos;



public class Main {

    public static void numeroMasFrecuente(int[] numeros) {
        int numeroFrecuente = numeros[0];
        int repeticiones = 0;
        for (int i = 1; i < numeros.length; i++) {
            int contador = 0;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == numeros[i]) {
                    contador++;
                }
            }
            if (contador > repeticiones) {
                repeticiones = contador;
                numeroFrecuente = numeros[i];
            }

        }
        System.out.println("El numero que mas se repite es : " + numeroFrecuente);
        System.out.println("Y se repite " + repeticiones + " veces");
    }

    public static void main (String[]args){

            int[] listanumeros = {1, 5, 3, 5, 4, 16, 5, 8, 4};
            numeroMasFrecuente(listanumeros);

        /*System.out.println(sumar(1,5));
        System.out.println(restar(5,3));
        System.out.println(multiplicar(2,5));
        System.out.println(dividir(10,0));
         */
    }

}
