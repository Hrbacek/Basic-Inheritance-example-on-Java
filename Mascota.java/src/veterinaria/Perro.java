package veterinaria;
public class Perro extends Mascota {
    protected String marcaHueso ;
    Perro(String nombre, double peso, int edad, String docProp, String marcaH){
        super(nombre, peso, edad, docProp);
        marcaHueso = marcaH;
    }
    @Override
    public String toString(){   
        String out    = super.toString();
        out          += "\tMarca hueso: " + marcaHueso;
        return out;
    }   
}
