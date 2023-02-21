import javax.swing.*;
import java.awt.event.*;

public class Imagen2 extends JLabel implements Runnable, KeyListener {

	private String url1, url2;
	private ImageIcon icon;
	private int posX = 10, posY = 90;
	private boolean runStatus = false, right = false, shift = false, up = false;

	public Imagen2(String url1, String url2) {
		this.url1 = url1;
		this.url2 = url2;
		icon = new ImageIcon(this.getClass().getResource(url1));
		setIcon(icon);
	}

	@Override
	public void run() {
		runStatus = true;

		while(true) {
			System.out.println("while");

			if(up) {
				posY = 75;
				
			} else {
				posY = 90;
			}
			if(right && shift) {
				posX+=11;
				
				if((posX % 2) != 0) {
					icon = new ImageIcon(this.getClass().getResource(url2));
				} else {
					icon = new ImageIcon(this.getClass().getResource(url1));
				} //end if-else

				setIcon(icon);
				
				try { Thread.sleep(100); } catch(Exception e) {}
				
			} else if(right) {
				posX+=1;
				//setBounds(posX, 90, 42, 42);
				if((posX % 2) != 0) {
					icon = new ImageIcon(this.getClass().getResource(url2));
				} else {
					icon = new ImageIcon(this.getClass().getResource(url1));
				} //end if-else

				setIcon(icon);

				try { Thread.sleep(100); } catch(Exception e) {}
			} //end if 1

			setBounds(posX, posY, 42, 42);			

		} //end while
	} //end run

	@Override
	public void keyTyped(KeyEvent ke) {}

	@Override
	public void keyPressed(KeyEvent ke) {
		if(runStatus) {

			if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
				right = true;
			}
			if (ke.getKeyCode() == KeyEvent.VK_SHIFT) {
				shift = true;
			}
			if (ke.getKeyCode() == KeyEvent.VK_UP) {
				up = true;
			}

			/*if (ke.getKeyCode() == KeyEvent.VK_RIGHT && (ke.getModifiersEx() & KeyEvent.CTRL_DOWN_MASK) != 0) {
				posX += 11;
				if((posX % 2) != 0) {
					icon = new ImageIcon(this.getClass().getResource(url2));
				} else {
					icon = new ImageIcon(this.getClass().getResource(url1));
				}

				setBounds(posX, 90, 42, 42);
				setIcon(icon);
			} else if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
				posX++;
		
				if((posX % 2) != 0) {
					icon = new ImageIcon(this.getClass().getResource(url2));
				} else {
					icon = new ImageIcon(this.getClass().getResource(url1));
				}

				setBounds(posX, 90, 42, 42);
				setIcon(icon);
			}*/
		}
	} //end keyPressed

	@Override
	public void keyReleased(KeyEvent ke) {
		if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
			right = false;
		}
		if (ke.getKeyCode() == KeyEvent.VK_SHIFT) {
			shift = false;
		}
		if (ke.getKeyCode() == KeyEvent.VK_UP) {
			up = false;
		}
	}

}