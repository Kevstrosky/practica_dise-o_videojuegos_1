import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    public Ventana(){
        initValues();
    }//end Ventana
    private void initValues(){

        Font font1 = new Font("Arial", 1, 24);
        Font font2 = new Font("Arial", 1, 12);
        JLabel texto1 = new JLabel("0");
        JButton boton1 = new JButton("Iniciar contador");
        ActionListener actionListener = new ActionListener() {
        public void actionPerformed(ActionEvent event) {
        new Thread(() -> {
         for (int i = 1; i <= 10; i++) {
            try {
               Thread.sleep(1000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            texto1.setText(String.valueOf(i));
         }
      }).start();
        }
        };
         boton1.addActionListener(actionListener);
        texto1.setFont(font1);
        boton1.setFont(font2);
        texto1.setBounds(10,10,50,25);
        boton1.setBounds(10,50,150,35);

        add(texto1);
        add(boton1);
        setTitle("Mi ventana");
        setSize(300,300);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }//end initValues
}