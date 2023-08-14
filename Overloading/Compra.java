import java.util.Scanner;

public class Compra {

    //Atributos
    Localidad localidad = new Localidad();
    Localidad localidad1 = new Localidad();
    Localidad localidad2 = new Localidad();
    Localidad localidad3 = new Localidad();

    Ticket ticket = new Ticket();
    
    Scanner sc = new Scanner(System.in);

    //Métodod que valida los datos del usuario, localidad, presupuesto, etc.
    public void logicaCompra(){
        if(ticket.validarTicket() == true){
            System.out.println("---Ingresar los datos siguientes---");
            System.out.println("Nombre:");
            String nombre = sc.nextLine();
            System.out.println("Email:");
            String email = sc.nextLine();
            System.out.println("Cantidad de boletos que desea comprar:");
            int cantBoletos = sc.nextInt();
            sc.nextLine();
            System.out.println("Presupuesto con el que cuenta:");
            double presupuestoMax = sc.nextDouble();
            sc.nextLine();
            Comprador datosComprador = new Comprador(nombre, email, cantBoletos, presupuestoMax);
            System.out.println(datosComprador.toString());

            if(localidad.localidadAleatorio() ==1){
                localidad1.setTipo("Localidad 1");
                localidad1.setPecio(100);
                System.out.println("\nLocalidad asignada: " + localidad1.getTipo() + " - Precio de cada Boleto: " + localidad1.getPecio() + "\n");
                disponibilidadBoletos(localidad1, cantBoletos, datosComprador);

                System.out.println(localidad1.toString());
            }
            else if(localidad.localidadAleatorio() == 2){
                localidad2.setTipo("Localidad 2");
                localidad2.setPecio(500);
                System.out.println("\nLocalidad asignada: " + localidad2.getTipo() + " - Precio de cada Boleto: " + localidad2.getPecio() + "\n");
                disponibilidadBoletos(localidad2, cantBoletos, datosComprador);

                System.out.println(localidad2.toString());
            }
            else{
                localidad3.setTipo("Localidad 3");
                localidad3.setPecio(1000);
                System.out.println("\nLocalidad asignada: " + localidad3.getTipo() + " - Precio de cada Boleto: " + localidad3.getPecio() + "\n");
                disponibilidadBoletos(localidad3, cantBoletos, datosComprador);

                System.out.println(localidad3.toString());
            }

        }
    }

    //Validar que la localidad tenga espacios
    public boolean espacioLocalidad(int boletosDisponibles){
        if(boletosDisponibles == 0){
            System.out.println("---Lo sentimos su localidad asignada, ya no cuenta con boletos---");
            return false;
        }else{

            return true;
        }
    }

    //Boletos deseados
    public void disponibilidadBoletos(Localidad localidadx, int cantBoletos, Comprador datosComprador){
        if(espacioLocalidad(localidadx.getBoletosDisponibles()) == true){
            if(localidadx.getBoletosDisponibles() <= cantBoletos){
                //Si le alcanza a comprar todos los boletos que queden en la localidad
                if(datosComprador.getPresupuestoMax() >= (localidadx.getBoletosDisponibles()*localidadx.getPecio())){
                    //Se le restan la cantidad que la localidad tenga
                    System.out.println("Boletos adquiridos: " + localidadx.getBoletosDisponibles());
                    System.out.println("Total a pagar: $" + (localidadx.getBoletosDisponibles()*localidadx.getPecio()));
                    localidadx.setBoletosDisponibles(0);
                    localidadx.setBoletosVendidos(20);
                }else{
                    System.out.println("---No puedes adquirir los boletos por falta de presupuesto---");
                }
                
            }else{
                //Si le alcanza a comprar todos los boletos que desea
                if(datosComprador.getPresupuestoMax() >= (cantBoletos*localidadx.getPecio())){
                    //Se le restan la cantidad de boletos que desea el comprador
                    System.out.println("Boletos adquiridos: " + cantBoletos);
                    System.out.println("Total a pagar: $" + (cantBoletos*localidadx.getPecio()));
                    localidadx.setBoletosDisponibles(localidadx.getBoletosDisponibles()- cantBoletos);
                    localidadx.setBoletosVendidos(localidadx.getBoletosVendidos() + cantBoletos);
                }else{
                    System.out.println("---No puedes adquirir los boletos por falta de presupuesto---");
                }
                    
            }
        }
    }

    //Disponibilidad de todas las localidad
    public void disponibilidadLocalidades(){
        System.out.println("\n ---LOCALIDAD 1--- \n Boletos Disponibles: " + localidad1.getBoletosDisponibles() + " / Boletos vendidos: " + localidad1.getBoletosVendidos() + "\n");
        System.out.println("\n ---LOCALIDAD 2--- \n Boletos Disponibles: " + localidad2.getBoletosDisponibles() + " / Boletos vendidos: " + localidad2.getBoletosVendidos() + "\n");
        System.out.println("\n ---LOCALIDAD 3--- \n Boletos Disponibles: " + localidad3.getBoletosDisponibles() + " / Boletos vendidos: " + localidad3.getBoletosVendidos() + "\n");
    }

    //Disponibilidad de "x" Localidad
    public void disponibilidadLocalidad(){
        System.out.println("\n ¿DE QUÉ LOCALIDAD DESEA VER LOS BOLETOS DISPONIBLES? \n 1. Localidad 1 \n 2. Localidad 2 \n 3. localidad 3");
        System.out.println("Ingrese el número de la localidad: ");
        String opcion = sc.nextLine();
        if(opcion.equals("1")){
            System.out.println("\n ---LOCALIDAD 1--- \n Boletos Disponibles: " + localidad1.getBoletosDisponibles() + "\n");
        }
        else if(opcion.equals("2")){
            System.out.println("\n ---LOCALIDAD 2--- \n Boletos Disponibles: " + localidad2.getBoletosDisponibles() + "\n");

        }
        else if(opcion.equals("3")){
            System.out.println("\n ---LOCALIDAD 3--- \n Boletos Disponibles: " + localidad3.getBoletosDisponibles() + "\n");        
        }
        else System.out.println("Opción no válida");
    }

    //Reporte de Caja
    public void reporteCaja(){
        double ventasTotales = ((localidad1.getBoletosVendidos()*localidad1.getPecio()) +
                                (localidad2.getBoletosVendidos()*localidad2.getPecio()) +
                                (localidad3.getBoletosVendidos()*localidad3.getPecio()));
        System.out.println("\n SE HA GENERADO $" + ventasTotales + " DE LAS VENTAS DE LAS 3 LOCALIDADES \n");
    }

}
