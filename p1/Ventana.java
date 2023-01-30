import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(){
        initValues();
    }//end Ventana
    private void initValues(){

        Font font1 = new Font("Arial", 1, 24);
        //Hacer un botón que cambie este texto1 utilizando un Thread para que cambié el número del 1 al 10
        JLabel texto1 = new JLabel("0");
        texto1.setFont(font1);
        texto1.setBounds(10,10,50,25);

        add(texto1);
        setTitle("Mi ventana");
        setSize(300,300);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }//end initValues
}