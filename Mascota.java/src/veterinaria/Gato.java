package veterinaria;
public class Gato extends Mascota {
    protected String marcaArena ;
    Gato(String nombre, double peso, int edad, String docProp, String marcaA){
        super(nombre, peso, edad, docProp);
        marcaArena = marcaA;
    }
    @Override
    public String toString(){
        String out    = super.toString();
        out          += "\tMarca arena: " + marcaArena;
        return out;
    }  
}
