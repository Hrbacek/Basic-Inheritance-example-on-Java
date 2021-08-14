package veterinaria;
import java.util.ArrayList;
import java.util.Scanner;

public class MisClientes{

    ArrayList<Mascota> mascotas ;
    private Scanner entrada;

    public MisClientes(){
        mascotas = new ArrayList<>();
        entrada = new Scanner(System.in);
    }
    public void agregarMascota(Mascota nuevaMascota){
        mascotas.add(nuevaMascota);
    }
    public void removerMascota(String nombre, String docProp){
        for(Mascota mascota: mascotas){ 
            boolean fc = mascota.nombre.equals(nombre);
            boolean sc = (mascota.documentoPropietario.equals(docProp)); 
            System.out.println(fc);
            System.out.println(sc);
            boolean aval = (fc && sc );
            if (aval){
                mascotas.remove(mascota);
            }
        }

    }
    public void listarMascotas(){
        System.out.println("***Clientes***");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }

    }
    public static void mensajeInstrucciones(){
        System.out.println("Ingrese un cliente al sistema con la opcion 1 y el formato indicado, muestre los clientes en pantalla con la opcion 2,\no salga definitivamente con la opcion 3: ");
    }
    public void procesarComandos() {        
        String[] comando = null;
        mensajeInstrucciones();
        do {
            System.out.print("Ingrese un comando: ");
            comando = entrada.nextLine().split("&");
            switch (comando[0]) {
                case "1":
                    Mascota mascota = null;
                    double peso = Double.parseDouble(comando[3]);
                    int    edad = Integer.parseInt(comando[4]);
                    if (comando[1].equals("Perro")) {
                        mascota = new Perro(comando[2], peso, edad, comando[5], comando[6]);
                    } else if (comando[1].equals("Gato")) {
                        mascota = new Gato(comando[2], peso, edad, comando[5], comando[6]);
                    }
                    agregarMascota(mascota);
                    break;
                case "2":
                    listarMascotas();
                    break;
                case "3":
                    break;
                case "4":
                    removerMascota(comando[1],comando[2]);
            }
        } while (!comando[0].equals("3"));
        entrada.close();
    }
    public static void main(String[] args) {
        MisClientes nuevaLista = new MisClientes();
        nuevaLista.procesarComandos();
    }
}