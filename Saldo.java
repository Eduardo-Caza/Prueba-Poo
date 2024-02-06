package prueba;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo extends JFrame {

    private JButton MENUButton;
    public JPanel Saldo;
    private JLabel saldototal;
    private double saldo = 0.0;

    public Saldo() {
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Menu");
                frame.setContentPane(new Menu().Menu);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(500, 500);
                frame.setVisible(true);
                dispose(); // Cierra el formulario de Saldo
            }
        });
    }

    public void actualizarSaldo(double cantidad) {
        saldo += cantidad;
        saldototal.setText("Saldo Total: $" + saldo);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Saldo");
        Saldo saldoForm = new Saldo();
        frame.setContentPane(saldoForm.Saldo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
