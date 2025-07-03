package Opciones;

import Registro.registro;
import Ventas.ventas;
import Ver.ver;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opciones extends JFrame{
    private JPanel opc;
    private JButton registroButton;
    private JButton ventasButton;
    private JButton verProductosButton;

    public opciones(){
        setTitle("Opciones");
        setContentPane(opc);
        setSize(250,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        registroButton.addActionListener(e -> {
            setVisible(false);
            new registro().setVisible(true);

        });

        ventasButton.addActionListener(e ->  {
            setVisible(false);
            new ventas().setVisible(true);
        });

        verProductosButton.addActionListener(e ->  {
            setVisible(false);
            new ver().setVisible(true);
        });
    }

}
