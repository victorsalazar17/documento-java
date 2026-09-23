package POO.ModificadorAcceso;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String rellenarCeros(int numero){
        if (numero < 10){
            return "0" + numero;
        }
        return String.valueOf(numero);
    }

    public String imprimirFecha(){
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

