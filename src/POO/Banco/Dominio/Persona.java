package POO.Banco.Dominio;

public class Persona {

    public String nombre;
    public String identificacion;
    public String email;
    public int edad;

    public Persona(String nombre, String identificacion, String email, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.edad = edad;
    }
}
