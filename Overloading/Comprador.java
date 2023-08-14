public class Comprador {
    //Atributos
    String nombre = " ";
    String email = "";
    int cantBoletos = 0;
    double presupuestoMax = 0;
   
    //Constructor
    
    public Comprador(String nombre, String email, int cantBoletos, double presupuestoMax){
        this.nombre = nombre;
        this.email =email;
        this.cantBoletos = cantBoletos;
        this.presupuestoMax = presupuestoMax;
    }

    //GET AND SET
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCantBoletos() {
        return this.cantBoletos;
    }

    public void setCantBoletos(int cantBoletos) {
        this.cantBoletos = cantBoletos;
    }

    public double getPresupuestoMax() {
        return this.presupuestoMax;
    }

    public void setPresupuestoMax(double presupuestoMax) {
        this.presupuestoMax = presupuestoMax;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", email='" + getEmail() + "'" +
            ", cantBoletos='" + getCantBoletos() + "'" +
            ", presupuestoMax='" + getPresupuestoMax() + "'" +
            "}";
    }

    

}
