package java_primeros_pasos;

public class Ejercicios_Tarea {


    public static int contarPalabras(String texto){
        int contador = 1;
        for(int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) == ' '){
                contador++;
            }
        }
        return contador;
    }

    public static int contarLetras(String texto){
        int contador = 0;
        for(int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) != ' ') {
                contador++;
            }
        }
        return contador;
    }

    public static int numeroMenor(int[] numeros){
        int menor = numeros[0];
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        return menor;
    }

    public static String numeroMayoryMenor(int[] numeros){
        int mayor = numeros[0];
        int menor = numeros[0];
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            } else if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        return "Mayor: " + mayor + "  Menor: " + menor;
    }
    public static int segundoMayor(int[] numeros){

        int mayor = 0;
        int segundoMayor = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > mayor){
                segundoMayor = mayor;
                mayor = numeros[i];
            }else if(numeros[i] > segundoMayor){
                segundoMayor = numeros[i];
            }
        }
        return segundoMayor;


    }

    public static void main(String[] args) {
        String frase = "Pepito juega futbol";
        System.out.println(contarPalabras(frase));

        System.out.println(contarLetras(frase));

        int[] numeros = {1,89,25,12,45,8,9,1,2,3,5};
        System.out.println(numeroMenor(numeros));

        System.out.println(numeroMayoryMenor(numeros));

        System.out.println(segundoMayor(numeros));
    }
}
