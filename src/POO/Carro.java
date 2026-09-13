package POO;

public class Carro {

    public String marca;
    public String modelo;
    public int year;
    public String color;
    public String placa;
    public double precio;
    public String tipoCarroceria;
    public String tipoDeCombustible;
    public int cantidadPasajeros;
    public String tipoTransmision;
    public double peso;
    public int cantidadPuertas;
    public int Kilometraje;
    public double CaballosDeFuerza;
    public double Torque;
    public String paisDeFabricacion;

    public Carro(String marca, String modelo, int year, String color, String placa, double precio, String tipoCarroceria, String tipoDeCombustible, int cantidadPasajeros, String tipoTransmision, double peso, int cantidadPuertas, int kilometraje, double caballosDeFuerza, double torque, String paisDeFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.placa = placa;
        this.precio = precio;
        this.tipoCarroceria = tipoCarroceria;
        this.tipoDeCombustible = tipoDeCombustible;
        this.cantidadPasajeros = cantidadPasajeros;
        this.tipoTransmision = tipoTransmision;
        this.peso = peso;
        this.cantidadPuertas = cantidadPuertas;
        Kilometraje = kilometraje;
        CaballosDeFuerza = caballosDeFuerza;
        Torque = torque;
        this.paisDeFabricacion = paisDeFabricacion;
    }
}
