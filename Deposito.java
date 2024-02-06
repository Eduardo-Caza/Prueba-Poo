package prueba;

        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Deposito extends JFrame {
    private JTextField pantalla;
    private JButton uno;
    private JButton dos;
    private JButton tres;
    private JButton cuatro;
    private JButton cinco;
    private JButton seis;
    private JButton siete;
    private JButton ocho;
    private JButton nueve;
    private JButton cero;
    private JButton ENTERButton;
    private JButton MENUButton;
    public JPanel Deposito;
    private JLabel saldototal;

    private Saldo saldoForm;

    private double saldo = 0.0;

    public Deposito() {
        uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("1");
            }
        });

        dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("2");
            }
        });

        tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("3");
            }
        });
        cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("4");
            }
        });

        cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("5");
            }
        });

        seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("6");
            }
        });

        siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("7");
            }
        });

        ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("8");
            }
        });

        nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("9");
            }
        });

        cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("0");
            }
        });

        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Menu");
                frame.setContentPane(new Menu().Menu);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(500, 500);
                frame.setVisible(true);
                dispose(); // Cierra el formulario de Deposito
            }
        });

        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (saldoForm != null) {
                    double cantidad = Double.parseDouble(pantalla.getText());
                    saldoForm.actualizarSaldo(cantidad);
                }else{
                    eliminarNumero("");
                }
            }
        });
    }
    private void eliminarNumero(String numero) {
        pantalla.setText("");
    }

    private void agregarNumero(String numero) {
        pantalla.setText(pantalla.getText() + numero);
    }

    public void setSaldoForm(Saldo saldoForm) {
        this.saldoForm = saldoForm;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Deposito");
        frame.setContentPane(new Deposito().Deposito);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
