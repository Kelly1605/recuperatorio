import Ventana.Ventana;
import Ventana.Post;

public class Main {
    public static void main(String[] args) {

        Ventana ventana = new Ventana();

        ventana.agregarPost(new Post("hola", "Kelly", 3));
        ventana.agregarPost(new Post("hoy es viernes", "Evelyn", 10));

        ventana.publicar2("kelly", "hola");

        ventana.buscarContenido("hola");
        ventana.buscarUsuario("kelly");





    }
}

