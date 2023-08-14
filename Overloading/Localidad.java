import java.util.Random;

public class Localidad {
    //Atributos
    String tipo = "";
    double pecio =0;
    int boletosDisponibles =20;
    int boletosVendidos =0;


    public int localidadAleatorio(){
        Random random = new Random();
        int numero_random = random.nextInt(3)+1;
        return (numero_random);
    }

    //GET AND SET
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPecio() {
        return this.pecio;
    }

    public void setPecio(double pecio) {
        this.pecio = pecio;
    }

    public int getBoletosDisponibles() {
        return this.boletosDisponibles;
    }

    public void setBoletosDisponibles(int boletosDisponibles) {
        this.boletosDisponibles = boletosDisponibles;
    }

    public int getBoletosVendidos() {
        return this.boletosVendidos;
    }

    public void setBoletosVendidos(int boletosVendidos) {
        this.boletosVendidos = boletosVendidos;
    }


    @Override
    public String toString() {
        return "{" +
            " tipo='" + getTipo() + "'" +
            ", pecio='" + getPecio() + "'" +
            ", boletosDisponibles='" + getBoletosDisponibles() + "'" +
            ", boletosVendidos='" + getBoletosVendidos() + "'" +
            "}";
    }
    



}
