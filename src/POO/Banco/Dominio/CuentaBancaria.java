package POO.Banco.Dominio;

public class CuentaBancaria {

    public String numeroCuenta;
    public double saldo;
    public String password;
    public String tipoCuenta;
    public Persona titular;
    public Banco banco;

    public CuentaBancaria(String numeroCuenta, double saldo, String password, String tipoCuenta, Persona titular, Banco banco) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.password = password;
        this.tipoCuenta = tipoCuenta;
        this.titular = titular;
        this.banco = banco;
    }
    // DEPOSITAR
    public void  depositar(double cantidad) {
        this.saldo += cantidad;
    }

    // RETIRAR
    public void retirar(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
        }  else {
            System.out.println("Saldo insuficiente");
        }
    }

    // TRANSFERIR A OTRA CUENTA

    public void transferir(double cantidad, CuentaBancaria cuentaDestino) {
        if (cantidad <= this.saldo) {
            retirar(cantidad);
            cuentaDestino.depositar(cantidad);
            System.out.println("Transferencia realizada con éxito.");
        } else {
            System.out.println("No se pudo realizar la transferencia: Saldo insuficiente.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Banco: " + this.banco.nombre);
        System.out.println("Numero Cuenta: " + this.numeroCuenta);
        System.out.println("Tipo de Cuenta: " + this.tipoCuenta);
        System.out.println("Titular de la Cuenta: " +  this.titular.nombre);
        System.out.println("Saldo: " + this.saldo);
    }


    // CREAR 5 BANCOS, 10 PERSONAS, MINIMO 10 TRANSACCIONES

}
