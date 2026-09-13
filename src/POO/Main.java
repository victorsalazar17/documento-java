package POO;

public class Main {


    public static void main(String[] args) {

        Persona victorSalazar = new Persona("Victor", "Salazar", 16, "1044531343");
        Persona juanGomez = new Persona("Juan", "Gomez", 19, "1044533689");
        Persona julianRave = new Persona("Julian", "Rave", 20, "1044533849");
        Persona julianVanegas = new Persona("Julian", "Vanegas", 32, "104421584");
        Persona cristianGonzalez = new Persona("Cristian", "Gonzales", 10, "10456687925");
        Persona samuelYepes = new Persona("Samuel", "Yepes", 22, "10453368792");
        Persona cesarEscobar = new Persona("Cesar", "Escobar", 40, "1044533459");
        Persona josueOrbegozo = new Persona("Josue", "Orbegozo", 35, "1034533549");
        Persona sebastianZuluaga = new Persona("Sebastian", "Zuluaga", 15, "70693065");
        Persona harbyGrajales = new Persona("Harby", "Grajales", 59, "667706498");

        System.out.println("Hola soy: " + victorSalazar.nombre + " " + victorSalazar.apellido + " y tengo " + victorSalazar.edad + " años de edad");

        Carro toyotaCorolla = new Carro("Toyota", "Corolla", 2022, "Blanco", "ABC123", 78000000, "Sedan", "Gasolina", 5, "Automatica", 1310, 4, 32500, 169, 200, "Japon");
        Carro chevroletOnix = new Carro("Chevrolet", "Onix", 2021, "Gris", "DEF456", 52000000, "Sedan", "Gasolina", 5, "Manual", 1050, 4, 48200, 115, 160, "Brasil");
        Carro mazdaCX5 = new Carro("Mazda", "CX-5", 2023, "Rojo", "GHI789", 125000000, "SUV", "Gasolina", 5, "Automatica", 1620, 5, 18700, 187, 252, "Japon");
        Carro renaultDuster = new Carro("Renault", "Duster", 2020, "Negro", "JKL234", 67000000, "SUV", "Gasolina", 5, "Manual", 1280, 5, 61400, 115, 156, "Colombia");
        Carro kiaSportage = new Carro("Kia", "Sportage", 2022, "Azul", "MNO567", 108000000, "SUV", "Gasolina", 5, "Automatica", 1580, 5, 29800, 181, 237, "Corea del Sur");
        Carro volkswagenJetta = new Carro("Volkswagen", "Jetta", 2021, "Plata", "PQR890", 82000000, "Sedan", "Gasolina", 5, "Automatica", 1420, 4, 44600, 150, 250, "Mexico");
        Carro fordRanger = new Carro("Ford", "Ranger", 2023, "Blanco", "STU345", 145000000, "Pick-up", "Diesel", 5, "Automatica", 2150, 4, 21300, 210, 500, "Tailandia");
        Carro hyundaiTucson = new Carro("Hyundai", "Tucson", 2022, "Gris oscuro", "VWX678", 112000000, "SUV", "Gasolina", 5, "Automatica", 1560, 5, 35900, 187, 241, "Corea del Sur");
        Carro nissanVersa = new Carro("Nissan", "Versa", 2020, "Azul oscuro", "YZA901", 55000000, "Sedan", "Gasolina", 5, "Manual", 1100, 4, 70200, 118, 149, "Mexico");
        Carro hondaCivic = new Carro("Honda", "Civic", 2023, "Negro", "BCD234", 118000000, "Sedan", "Gasolina", 5, "Automatica", 1350, 4, 16400, 158, 187, "Japon");
        Carro bmw320i = new Carro("BMW", "320i", 2021, "Blanco", "EFG567", 165000000, "Sedan", "Gasolina", 5, "Automatica", 1530, 4, 39700, 184, 300, "Alemania");
        Carro mercedesClaseC = new Carro("Mercedes-Benz", "Clase C", 2022, "Plata", "HIJ890", 195000000, "Sedan", "Gasolina", 5, "Automatica", 1610, 4, 27600, 204, 300, "Alemania");
        Carro audiQ3 = new Carro("Audi", "Q3", 2023, "Gris", "KLM345", 178000000, "SUV", "Gasolina", 5, "Automatica", 1645, 5, 19800, 180, 320, "Alemania");
        Carro jeepCompass = new Carro("Jeep", "Compass", 2020, "Verde", "NOP678", 95000000, "SUV", "Gasolina", 5, "Automatica", 1540, 5, 58900, 173, 237, "Brasil");
        Carro suzukiSwift = new Carro("Suzuki", "Swift", 2021, "Rojo", "QRS901", 59000000, "Hatchback", "Gasolina", 5, "Manual", 970, 5, 41500, 82, 113, "India");
        Carro fiatArgo = new Carro("Fiat", "Argo", 2022, "Amarillo", "TUV234", 57000000, "Hatchback", "Gasolina", 5, "Manual", 1000, 5, 33800, 99, 127, "Brasil");
        Carro teslaModel3 = new Carro("Tesla", "Model 3", 2023, "Blanco", "WXY567", 185000000, "Sedan", "Electrico", 5, "Automatica", 1765, 4, 15200, 283, 450, "Estados Unidos");
        Carro toyotaHilux = new Carro("Toyota", "Hilux", 2021, "Gris", "ZAB890", 138000000, "Pick-up", "Diesel", 5, "Automatica", 2050, 4, 52700, 201, 500, "Tailandia");
        Carro chevroletTracker = new Carro("Chevrolet", "Tracker", 2022, "Naranja", "CDE345", 86000000, "SUV", "Gasolina", 5, "Automatica", 1250, 5, 30100, 130, 190, "Brasil");
        Carro peugeot208 = new Carro("Peugeot", "208", 2023, "Azul", "FGH678", 72000000, "Hatchback", "Gasolina", 5, "Automatica", 1090, 5, 12600, 130, 230, "Argentina");
        Carro fordMustang = new Carro("Ford", "Mustang", 2022, "Rojo", "HIJ123", 210000000, "Coupe", "Gasolina", 4, "Automatica", 1715, 2, 22100, 450, 529, "Estados Unidos");
        Carro toyotaRav4 = new Carro("Toyota", "RAV4", 2021, "Verde", "KLM456", 105000000, "SUV", "Hibrido", 5, "Automatica", 1660, 5, 39700, 219, 221, "Japon");
        Carro kiaPicanto = new Carro("Kia", "Picanto", 2020, "Blanco", "NOP901", 48000000, "Hatchback", "Gasolina", 5, "Manual", 935, 5, 65400, 66, 95, "Corea del Sur");
        Carro mercedesGLC300 = new Carro("Mercedes-Benz", "GLC 300", 2023, "Negro", "QRS234", 235000000, "SUV", "Gasolina", 5, "Automatica", 1880, 5, 14200, 255, 400, "Alemania");
        Carro renaultSandero = new Carro("Renault", "Sandero", 2021, "Gris", "TUV567", 54000000, "Hatchback", "Gasolina", 5, "Manual", 1090, 5, 51200, 111, 151, "Colombia");
        Carro hyundaiElantra = new Carro("Hyundai", "Elantra", 2022, "Azul", "WXY890", 76000000, "Sedan", "Gasolina", 5, "Automatica", 1330, 4, 28400, 147, 179, "Corea del Sur");
        Carro nissanFrontier = new Carro("Nissan", "Frontier", 2023, "Blanco", "ZAB345", 142000000, "Pick-up", "Diesel", 5, "Automatica", 2080, 4, 18500, 188, 450, "Mexico");
        Carro mazda3 = new Carro("Mazda", "3", 2020, "Rojo oscuro", "CDE678", 69000000, "Sedan", "Gasolina", 5, "Automatica", 1390, 4, 58300, 153, 200, "Mexico");
        Carro volkswagenTCross = new Carro("Volkswagen", "T-Cross", 2022, "Naranja", "FGH901", 91000000, "SUV", "Gasolina", 5, "Automatica", 1260, 5, 31700, 128, 200, "Brasil");
        Carro hondaHRV = new Carro("Honda", "HR-V", 2023, "Gris", "IJK234", 116000000, "SUV", "Gasolina", 5, "Automatica", 1420, 5, 17300, 158, 187, "Japon");


        Estrella estrellaRoja1 = new Estrella("Rojo", 12.5, 15.0, 6.25, 5, "Gigante roja", true, "Norte", "Hidrogeno", 1.8, "Betelgeuse");
        Estrella estrellaRoja2 = new Estrella("Rojo", 10.0, 13.5, 5.0, 5, "Supergigante roja", true, "Sur", "Hidrogeno", 2.1, "Antares");
        Estrella estrellaRoja3 = new Estrella("Rojo", 8.5, 10.0, 4.25, 5, "Enana roja", true, "Este", "Hidrogeno", 0.4, "Proxima");
        Estrella estrellaRoja4 = new Estrella("Rojo", 14.0, 16.5, 7.0, 5, "Gigante roja", true, "Oeste", "Hidrogeno", 1.6, "Aldebaran");
        Estrella estrellaRoja5 = new Estrella("Rojo", 11.5, 14.0, 5.75, 5, "Gigante roja", true, "Noreste", "Hidrogeno", 1.9, "Arcturus");

        Estrella estrellaAzul1 = new Estrella("Azul", 16.0, 19.0, 8.0, 5, "Supergigante azul", true, "Norte", "Hidrogeno", 15.0, "Rigel");
        Estrella estrellaAzul2 = new Estrella("Azul", 14.5, 17.0, 7.25, 5, "Gigante azul", true, "Sur", "Hidrogeno", 12.5, "Spica");
        Estrella estrellaAzul3 = new Estrella("Azul", 18.0, 21.0, 9.0, 5, "Supergigante azul", true, "Este", "Hidrogeno", 18.0, "Bellatrix");
        Estrella estrellaAzul4 = new Estrella("Azul", 15.0, 18.5, 7.5, 5, "Gigante azul", true, "Oeste", "Hidrogeno", 10.8, "Alnitak");
        Estrella estrellaAzul5 = new Estrella("Azul", 17.0, 20.0, 8.5, 5, "Supergigante azul", true, "Noroeste", "Hidrogeno", 16.3, "Mintaka");

        Estrella estrellaAmarilla1 = new Estrella("Amarillo", 10.0, 12.0, 5.0, 5, "Enana amarilla", true, "Norte", "Hidrogeno", 1.0, "Sol");
        Estrella estrellaAmarilla2 = new Estrella("Amarillo", 10.5, 12.5, 5.25, 5, "Enana amarilla", true, "Sur", "Hidrogeno", 1.1, "Tau Ceti");
        Estrella estrellaAmarilla3 = new Estrella("Amarillo", 9.5, 11.5, 4.75, 5, "Enana amarilla", true, "Este", "Hidrogeno", 0.95, "Alpha Centauri A");
        Estrella estrellaAmarilla4 = new Estrella("Amarillo", 11.5, 13.5, 5.75, 5, "Gigante amarilla", true, "Oeste", "Hidrogeno", 1.3, "Capella");
        Estrella estrellaAmarilla5 = new Estrella("Amarillo", 10.0, 12.0, 5.0, 5, "Enana amarilla", true, "Noreste", "Hidrogeno", 1.05, "51 Pegasi");

        Estrella estrellaBlanca1 = new Estrella("Blanco", 13.0, 15.5, 6.5, 5, "Estrella blanca", true, "Norte", "Hidrogeno", 2.0, "Sirius");
        Estrella estrellaBlanca2 = new Estrella("Blanco", 12.0, 14.0, 6.0, 5, "Estrella blanca", true, "Sur", "Hidrogeno", 1.7, "Vega");
        Estrella estrellaBlanca3 = new Estrella("Blanco", 13.5, 16.0, 6.75, 5, "Estrella blanca", true, "Este", "Hidrogeno", 2.2, "Altair");
        Estrella estrellaBlanca4 = new Estrella("Blanco", 14.0, 17.0, 7.0, 5, "Estrella blanca", true, "Oeste", "Hidrogeno", 2.4, "Procyon");
        Estrella estrellaBlanca5 = new Estrella("Blanco", 12.5, 15.0, 6.25, 5, "Estrella blanca", true, "Noroeste", "Hidrogeno", 2.1, "Deneb");






    }
}
