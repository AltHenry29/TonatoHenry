package Registro;

import Opciones.opciones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registro extends JFrame{
    private JPanel reg;
    private JTextField txtcod;
    private JTextField txtnom;
    private JTextField txtdet;
    private JTextField txtval;
    private JTextField txtstk;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JButton REGRESARALMENUButton;

    public registro(){
        setTitle("Registro");
        setContentPane(reg);
        setSize(300,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        String nom= txtnom.getText();
        String det= txtdet.getText();
        String val= txtval.getText();
        String stock= txtstk.getText();

        guardarButton.addActionListener(e ->  {

        });

        limpiarButton.addActionListener(e ->  {
            txtcod.setText(" ");
            txtdet.setText(" ");
            txtnom.setText(" ");
            txtstk.setText(" ");
            txtval.setText(" ");

        });
        REGRESARALMENUButton.addActionListener(e ->  {
            setVisible(false);
            new opciones().setVisible(true);
            dispose();
        });
    }
}
