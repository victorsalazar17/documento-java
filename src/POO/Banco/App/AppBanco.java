package POO.Banco.App;

import POO.Banco.Dominio.Banco;
import POO.Banco.Dominio.CuentaBancaria;
import POO.Banco.Dominio.Persona;

public class AppBanco {
     public static void main(String[] args) {

         Banco Bancolombia = new Banco("Juan Carlos Mora Uribe", "Bancolombia");
         Banco Bogota = new Banco("César Prado Villegas", "Banco de Bogota");
         Banco Davivienda =  new Banco("Javier Suárez Esparo", "Davivienda");
         Banco Cotrafa = new Banco("Luis Fernando Gómez Giraldo", "Cotrafa");
         Banco NuBank = new Banco("Marcela Torres", "NuBank");

         Persona victorSalazar = new Persona("Victor Daniel Salazar", "1044531343", "vicsala1017@gmail.com", 19);
         Persona camilaMorales = new Persona("Camila Andrea Morales Rios", "1017582943", "camila.morales@email.com", 24);
         Persona mateoGomez = new Persona("Mateo Alejandro Gómez Patiño", "1036941205", "mateo.gomez88@email.com", 28);
         Persona luciaTorres = new Persona("Lucía Fernanda Torres Valencia", "43829104", "lucia.torres.v@email.com", 35);
         Persona santiagoRestrepo = new Persona("Santiago José Restrepo Henao", "1152409831", "santiago.restrepo@email.com", 22);
         Persona valeriaMendoza = new Persona("Valeria Isabel Mendoza Castro", "1020734512", "valeria.mendoza@email.com", 31);
         Persona carlosVargas = new Persona("Carlos Eduardo Vargas Silva", "71934820", "carlos.vargas.s@email.com", 42);
         Persona marianaJaramillo = new Persona("Mariana Sofia Jaramillo Londoño", "1037618490", "mariana.jaramillo@email.com", 19);
         Persona diegoRamirez = new Persona("Diego Fernando Ramírez Osorio", "98653210", "diego.ramirez.o@email.com", 48);
         Persona danielaBenitez = new Persona("Daniela Alejandra Benítez Prada", "1098421753", "daniela.benitez@email.com", 27);


         CuentaBancaria c1 = new CuentaBancaria("1002345678", 1500000, "1234", "Ahorros", victorSalazar, Bancolombia);
         CuentaBancaria c2 = new CuentaBancaria("2003456789", 2000000, "4567", "Corriente", camilaMorales, NuBank);
         CuentaBancaria c3 = new CuentaBancaria("3004567890", 500000, "7890", "Ahorros", mateoGomez, Cotrafa);
         CuentaBancaria c4 = new CuentaBancaria("4005678901", 3200000, "3214", "Ahorros", luciaTorres, Davivienda);
         CuentaBancaria c5 = new CuentaBancaria("5006789012", 800000, "6541", "Corriente", santiagoRestrepo, Bogota);
         CuentaBancaria c6 = new CuentaBancaria("6007890123", 1200000, "9872", "Ahorros", valeriaMendoza, Bancolombia);
         CuentaBancaria c7 = new CuentaBancaria("7008901234", 4500000, "1473", "Corriente", carlosVargas, NuBank);
         CuentaBancaria c8 = new CuentaBancaria("8009012345", 300000, "2584", "Ahorros", marianaJaramillo, Cotrafa);
         CuentaBancaria c9 = new CuentaBancaria("9000123456", 2500000, "3695", "Ahorros", diegoRamirez, Davivienda);
         CuentaBancaria c10 = new CuentaBancaria("1011234567", 1800000, "1596", "Corriente", danielaBenitez, Bogota);

         // Transacción 1: Depósito a la cuenta de Victor
         System.out.println("1. Depósito:");
         c1.depositar(200000);
         System.out.println("Nuevo saldo de Victor: $" + c1.saldo);

         // Transacción 2: Retiro en la cuenta de Camila
         System.out.println("2. Retiro:");
         c2.retirar(500000);
         System.out.println("Nuevo saldo de Camila: $" + c2.saldo);
         System.out.println("Nuevo saldo de Camila: $" + c2.saldo);

         // Transacción 3: Transferencia de Victor a Camila
         System.out.println("3. Transferencia:");
         c1.transferir(300000, c2);

         // Transacción 4: Depósito en la cuenta de Mateo
         System.out.println("4. Depósito:");
         c3.depositar(150000);
         System.out.println("Nuevo saldo de Mateo: $" + c3.saldo);

         // Transacción 5: Transferencia de Lucía a Mariana
         System.out.println("5. Transferencia:");
         c4.transferir(1000000, c8);

         // Transacción 6: Retiro en la cuenta de Carlos
         System.out.println("6. Retiro:");
         c7.retirar(2000000);
         System.out.println("Nuevo saldo de Carlos: $" + c7.saldo);

         // Transacción 7: Transferencia de Diego a Daniela
         System.out.println("7. Transferencia:");
         c9.transferir(500000, c10);

         // Transacción 8: Depósito en la cuenta de Valeria
         System.out.println("8. Depósito:");
         c6.depositar(400000);
         System.out.println("Nuevo saldo de Valeria: $" + c6.saldo);

         // Transacción 9: Retiro excesivo (prueba de validación)
         System.out.println("9. Retiro (Intento con saldo insuficiente):");
         c5.retirar(5000000);

         // Transacción 10: Transferencia de Santiago a Victor
         System.out.println("10. Transferencia:");
         c5.transferir(200000, c1);


         // 5. MOSTRAR INFORMACIÓN FINAL

         System.out.println(" ESTADO FINAL DE UNA CUENTA DE EJEMPLO ");
         c1.mostrarInformacion();

     }

}
