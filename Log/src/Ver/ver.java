package Ver;

import Opciones.opciones;

import javax.swing.*;

public class ver extends JFrame{
    private JPanel ver;
    private JTextField txtcod;
    private JButton REGRESARALMENUButton;
    private JLabel name;
    private JLabel det;
    private JLabel actstk;

    public ver(){
        setTitle("Mostrar Productos");
        setContentPane(ver);
        setSize(300,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        String cod= txtcod.getText();

        REGRESARALMENUButton.addActionListener(e ->  {
            setVisible(false);
            new opciones().setVisible(true);
            dispose();
        });


    }

}
