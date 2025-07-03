package Ventas;

import Opciones.opciones;

import javax.swing.*;

public class ventas extends JFrame{
    private JPanel ven;
    private JTextField txtcod;
    private JTextField txtcant;
    private JButton calcularButton;
    private JButton REGRESARALMENUButton;
    private JLabel prod;
    private JLabel prec;
    private JLabel sub;
    private JLabel iva;
    private JLabel total;

    public ventas(){
        setTitle("Ventas");
        setContentPane(ven);
        setSize(300,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        String cod=txtcod.getText();
        String cant=txtcant.getText();

        calcularButton.addActionListener(e ->  {



        });

        REGRESARALMENUButton.addActionListener(e ->  {
            setVisible(false);
            new opciones().setVisible(true);
            dispose();
        });
    }

}
