package veterinaria;
public class Mascota {
    protected String nombre;
    protected double peso;
    protected int    edad;
    protected String documentoPropietario;

    Mascota (String nombre, double peso, int edad, String docProp){
        this.nombre = nombre;
        this.peso   = peso;
        this.edad   = edad;
        documentoPropietario = docProp;
    } 
    @Override
    public String toString(){
        String out = "";
        out += "Nombre: " + nombre + "\n";
        out += "\tPeso: " + peso + " kg" + "\n";
        out += "\tedad: " + edad + " meses" + "\n";
        out += "\tdocumento: " + documentoPropietario + "\n";
        return out;
    };


}
