/*
 * Humberto Alexander de la Cruz Chanchavac
 * Del 11/08/2023 al 13/08/2023
 * Descricpción: Este es un programa que lleva el control para adquirir boletos de un concierto De Taylor Swift
 */

import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Compra compra = new Compra();
        
        boolean bandera = true;
        while (bandera){
            System.out.println("----MENÚ CONCIERTO TAYLER SWIFT----");
            System.out.println("1. Adquirir boletos");
            System.out.println("2. Disponibilidad de todas las localidades");
            System.out.println("3. Disponibilidad de una localidad");
            System.out.println("4. Reporte de ventas");
            System.out.println("5. Salir del programa");
            System.out.println("Selecciona la opción: " );
            Scanner sc = new Scanner(System.in);
            String opcion = sc.nextLine();

            if(opcion.equals("1")){      
                compra.logicaCompra();
            }
            else if(opcion.equals("2")){
                compra.disponibilidadLocalidades();
            }
            else if(opcion.equals("3")){
                compra.disponibilidadLocalidad();
            }
            
            else if(opcion.equals("4")){
                compra.reporteCaja();
            }
            else if(opcion.equals("5")){
                bandera = false;
            }
            else System.out.println("Debe seleccionar una opción válida");

        }
    }
}