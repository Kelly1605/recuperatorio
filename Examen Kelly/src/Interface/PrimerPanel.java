package Interface;

import javax.swing.*;
import java.awt.*;

public class PrimerPanel extends JPanel {

    private JTextField usuarioTexto;
    private JTextField contenidoTexto;
    private JTextArea usuarioArea;
    private JTextArea textArea;
    private JButton publicarBoton;
    private JButton verBoton;

    public PrimerPanel () {




        setBackground(Color.CYAN);

        usuarioTexto.setBounds(5, 50, 10, 10);
        usuarioArea.setBounds(18, 50, 10, 10 );
        contenidoTexto.setBounds(5, 40, 10, 10);
        textArea.setBounds(18, 40, 10, 10);

        publicarBoton.setBounds(18, 30, 10, 10);
        verBoton.setBounds(18, 20, 10, 10);

        usuarioTexto = new JTextField("Usuario");
        usuarioArea = new JTextArea();

        contenidoTexto = new JTextField("Texto");
        textArea = new JTextArea();

        publicarBoton = new JButton("Publicar");
        verBoton = new JButton("Ver");






    }





}
