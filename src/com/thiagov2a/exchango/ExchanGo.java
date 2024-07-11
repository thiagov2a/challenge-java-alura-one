package com.thiagov2a.exchango;

import com.thiagov2a.exchango.modelo.Moneda;
import com.thiagov2a.exchango.modelo.MonedaAPI;
import com.thiagov2a.exchango.servicio.ConsultaMoneda;
import com.thiagov2a.exchango.util.ConversionMonedas;

import java.util.Scanner;

public class ExchanGo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        ConversionMonedas conversionMonedas = new ConversionMonedas();
        boolean continuar = true;

        while (continuar) {
            System.out.println("====================================");
            System.out.println("            ExchanGo");
            System.out.println("====================================");
            System.out.println("Seleccione la moneda de origen:");
            System.out.println("1. ARS - Peso argentino");
            System.out.println("2. BOB - Boliviano boliviano");
            System.out.println("3. BRL - Real brasileño");
            System.out.println("4. CLP - Peso chileno");
            System.out.println("5. COP - Peso colombiano");
            System.out.println("6. USD - Dólar estadounidense");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            int opcionOrigen = input.nextInt();
            input.nextLine();  // Consumir la nueva línea

            if (opcionOrigen == 7) {
                continuar = false;
                System.out.println("Saliendo...");
                break;
            }

            String monedaOrigenString = "";

            switch (opcionOrigen) {
                case 1:
                    monedaOrigenString = "ARS";
                    break;
                case 2:
                    monedaOrigenString = "BOB";
                    break;
                case 3:
                    monedaOrigenString = "BRL";
                    break;
                case 4:
                    monedaOrigenString = "CLP";
                    break;
                case 5:
                    monedaOrigenString = "COP";
                    break;
                case 6:
                    monedaOrigenString = "USD";
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    continue;
            }

            System.out.println("====================================");
            System.out.println("Seleccione la moneda de destino:");
            System.out.println("1. ARS - Peso argentino");
            System.out.println("2. BOB - Boliviano boliviano");
            System.out.println("3. BRL - Real brasileño");
            System.out.println("4. CLP - Peso chileno");
            System.out.println("5. COP - Peso colombiano");
            System.out.println("6. USD - Dólar estadounidense");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            int opcionDestino = input.nextInt();
            input.nextLine();  // Consumir la nueva línea

            if (opcionDestino == 7) {
                continuar = false;
                System.out.println("Saliendo...");
                break;
            }

            String monedaDestinoString = "";

            switch (opcionDestino) {
                case 1:
                    monedaDestinoString = "ARS";
                    break;
                case 2:
                    monedaDestinoString = "BOB";
                    break;
                case 3:
                    monedaDestinoString = "BRL";
                    break;
                case 4:
                    monedaDestinoString = "CLP";
                    break;
                case 5:
                    monedaDestinoString = "COP";
                    break;
                case 6:
                    monedaDestinoString = "USD";
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    continue;
            }

            MonedaAPI monedaOrigenAPI = consultaMoneda.obtenerMoneda(monedaOrigenString);
            Moneda monedaOrigen = new Moneda(monedaOrigenAPI);

            MonedaAPI monedaDestinoAPI = consultaMoneda.obtenerMoneda(monedaDestinoString);
            Moneda monedaDestino = new Moneda(monedaDestinoAPI);

            System.out.println("====================================");
            System.out.print("Ingrese la cantidad que quiere convertir de " + monedaOrigen.getDivisa() + " a " + monedaDestino.getDivisa() + ": ");
            double cantidad = input.nextDouble();
            double tasaConversion = monedaOrigen.obtenerConversion(monedaDestino.getDivisa());
            double cantidadConvertida = conversionMonedas.convertir(cantidad, tasaConversion);

            System.out.println("====================================");
            System.out.println(cantidad + " " + monedaOrigen.getDivisa() + " equivalen a " + cantidadConvertida + " " + monedaDestino.getDivisa());
            System.out.println("====================================");
        }

        input.close();
    }
}
