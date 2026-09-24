package POO.ModificadorAcceso;

public class MyDate2 {

    private int day;
    private int month;
    private int year;
    private boolean esValida;

    public MyDate2(int day, int month, int year) {
        this.year = year;

        // Se valida y se guarda solo si es correcto
        boolean diaCorrecto = validarDia(day);
        boolean mesCorrecto = validarMes(month);

        if (diaCorrecto && mesCorrecto) {
            this.day = day;
            this.month = month;
            this.esValida = true;
        } else  {
            this.esValida = false;
        }
    }

    public String rellenarCeros(int number) {
        if  (number < 10) {
            return "0" + number;
        }
        return String.valueOf(number);
    }

    public boolean validarDia(int number) {
        if   (number < 1 || number > 31) {
            System.out.println("Error: El dia debe ser entre 1 y 31");
            return false;
        }
        return true;
    }

    public boolean validarMes(int number) {
        if   (number < 1 || number > 12) {
            System.out.println("Error: El mes debe ser entre 1 y 12");
            return false;
        }
        return true;
    }

    public String imprimirFecha() {
        if  (!esValida) {
            return "No se puede imprimir la fecha porque hay errores.";
        }

        String day = rellenarCeros(this.day);
        String month = rellenarCeros(this.month);
        return day + "/" + month + "/" + this.year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
