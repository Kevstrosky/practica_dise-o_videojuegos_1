import javax.swing.*;
import java.awt.event.*;

public class Imagen3 extends JLabel implements Runnable, KeyListener {

	private String url1, url2;
	private ImageIcon icon;
	private boolean changeImg = false, runStatus = false, right = false, shift = false;
	private int posX = 10, posXBack = 0;
	JLabel background;

	public Imagen3(String url1, String url2) {
		this.url1 = url1;
		this.url2 = url2;
		icon = new ImageIcon(this.getClass().getResource(url1));
		setIcon(icon);
	}

	public void run() {
		runStatus = true;
		
		while(true) {
			System.out.println("while");
			
			if(right && shift) { moveImage(10, 40); }
			if(right) { moveImage(1, 100); }
		} //end while
	} //end run
	
	private void moveImage(int power, int time) {
		if(changeImg) {
			icon = new ImageIcon(this.getClass().getResource(url1));
			changeImg = false;
		} else {
			icon = new ImageIcon(this.getClass().getResource(url2));
			changeImg = true;
		}
		
		if(posX >= 120 && posXBack > -220) {
			posXBack-=power;
			background.setBounds(posXBack, 0, 510, 72);
			setBounds(120,11,42,42);
		} else if(posX <= 250) {
			posX += power;
			setBounds(posX,11,42,42);
		}	
		
		setIcon(icon);
		try { Thread.sleep(time); } catch(Exception e) {}
	} //end moveImage
	
	public void keyTyped(KeyEvent ke) {}
	
	public void keyPressed(KeyEvent ke) {
		if(runStatus) {
			if(ke.getKeyCode() == KeyEvent.VK_RIGHT) { right = true; }
			if(ke.getKeyCode() == KeyEvent.VK_SHIFT) { shift = true; }
		}
	} //end keyPressed
	
	public void keyReleased(KeyEvent ke) {
		if(runStatus) {
			if(ke.getKeyCode() == KeyEvent.VK_RIGHT) { right = false; }
			if(ke.getKeyCode() == KeyEvent.VK_SHIFT) { shift = false; }
		}
	}

}