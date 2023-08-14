import java.util.Random;

public class Ticket {
    int numTicket = 0;
    int verificadorA = 0;
    int verificadorB = 0;

    public int generarNumAleatorio(){
        Random random = new Random();
        int numero_random = random.nextInt(15000)+1;
        return (numero_random);
    }

    //Válida el número del ticket
    public boolean validarTicket(){
        numTicket = generarNumAleatorio();
        verificadorA = generarNumAleatorio();
        verificadorB = generarNumAleatorio();

        int rango = Math.abs(verificadorA - verificadorB);
        System.out.println("\n No. Ticket: " + numTicket+ " / Verificador A: "+ verificadorA + " / Verificador B:" + verificadorB);

        if( numTicket <= rango){
            System.out.println("\n FELICIDADES, PUEDES ADQUIRIR BOLETOS \n");
            return true; //El número del ticket SI está dentro del rango de los verficadores
        } else{
            System.out.println("\n LO SIENTO, NO PUEDES ADQUIRIR BOLETOS \n");
            return false; //El número del ticket NO está dentro del rango de los verficadores
        } 
    }

    //Get and Set
    public int getNumTicket() {
        return this.numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }



}
