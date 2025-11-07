package Interface;

import Ventana.Post;
import Interface.PrimerPanel;
import Ventana.Ventana;

import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {



    public Interface() {


        setTitle("POST");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        PrimerPanel primerPanel = new PrimerPanel();

        add(primerPanel);
        setVisible(true);

    }

    public static void main(String[] args) {

        Ventana ventana = new Ventana();

        ventana.agregarPost(new Post("hola", "Kelly", 3));
        ventana.agregarPost(new Post("hoy es viernes", "Evelyn", 10));

        ventana.publicar2("kelly", "hola");

        ventana.buscarContenido("hola");
        ventana.buscarUsuario("kelly");



    }
}
