package java_primeros_pasos;



public class Main {

    public int numero1;
    public int numero2;

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }
    public static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }
    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }
    public static double dividir(double numero1, double numero2) {
        if  (numero1 == 0 || numero2 == 0) {
            return 0;
        }

        return numero1 / numero2;
    }
    public static void main(String[] args) {

        System.out.println(sumar(1,5));
        System.out.println(restar(5,3));
        System.out.println(multiplicar(2,5));
        System.out.println(dividir(10,0));


    }
}
