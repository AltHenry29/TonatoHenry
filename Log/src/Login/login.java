package Login;

import Opciones.opciones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JPanel log;
    private JTextField textField1;
    private JButton accesoButton;
    private JButton limpiarButton;
    private JPasswordField passwordField1;

    public login(){
        setTitle("Login");
        setContentPane(log);
        setSize(250,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        accesoButton.addActionListener(e ->  {
            String user = textField1.getText();
            String pass = new String(passwordField1.getPassword());
            if (user.isEmpty() || pass.isEmpty()){
                JOptionPane.showMessageDialog(null,"Usuario o Password incompletos");
            } else if (user.equals("admin123") && pass.equals("admin123")) {
                new opciones().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this,"Credenciales Invalidas");
            }

        });

        limpiarButton.addActionListener(e ->  {
            textField1.setText(" ");
            passwordField1.setText(" ");
        });
    }

}
