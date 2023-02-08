import javax.swing.*;
import java.awt.event.*;

public class LabelKey extends JLabel implements Runnable{

        int posX = 11;
    
        public LabelKey(String texto){
            setText(texto);
        }
        
        public void run(){
                this.addKeyListener(new KeyListener(){
                    public void keyTyped(KeyEvent ke){    
                    }
                    public void keyPressed(KeyEvent ke){
                        if(ke.getKeyCode() == ke.VK_RIGHT && posX < 270){
                            setBounds(posX,40,50,25);
                            posX+=3;
                        }
                         if(ke.getKeyCode() == ke.VK_LEFT && posX > 10){
                            setBounds(posX,40,50,25);
                            posX-=3;
                        }
                    }//end KeyPressed
                    public void keyReleased(KeyEvent ke){}
                });
        }//end run
}