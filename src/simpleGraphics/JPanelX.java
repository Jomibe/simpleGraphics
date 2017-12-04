/*package simpleGraphics;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class JPanelX extends JPanel {

	// Attribute
	private static final long serialVersionUID = 1L;
	private static Random rand = new Random();
	int posX = rand.nextInt(50) + 1;
	int posY = rand.nextInt(50) + 1;
	static int size = rand.nextInt(30) + 5;
	
	int posX2 = rand.nextInt(50) + 1;
	int posY2 = rand.nextInt(50) + 1;
	static int size2 = rand.nextInt(30) + 5;
	Color color = Color.green;

	// Methoden
	public void setPosX(int _posX) {
		if (_posX < 0) {
			System.out.println("ERROR: posX can't be negative!");
			return;
		}

		if (_posX > 675) {
			System.out.println("ERROR: posX can't be bigger than width of jPanel!");
			return;
		}

		this.posX = _posX;
	}

	public int getPosX() {
		return this.posX;
	}

	public void setPosY(int _posY) {
		if (_posY < 0) {
			System.out.println("ERROR: posY can't be negative!");
			return;
		}

		if (_posY > 625) {
			System.out.println("ERROR: posY can't be bigger than the height of jPanel!");
			return;
		}

		this.posY = _posY;
	}

	public int getPosY() {
		return this.posY;
	}

	public static void setSizeAndSpeed(int _size) {
		JPanelX.size = _size;
		System.out.println("SizeAndSpeed is set to " + size);
	}

	public static int getSizeAndSpeed() {
		return JPanelX.size;
	}

	public void setRectangleColor(Color _color) {
		this.color = _color;
		String hexR = Integer.toHexString(color.getRed());
		String hexG = Integer.toHexString(color.getGreen());
		String hexB = Integer.toHexString(color.getBlue());
		System.out.println("DEBUG: The rectangle color is set to " + hexR.toUpperCase() + ";" + hexG.toUpperCase() + ";" + hexB.toUpperCase());
	}
	
	public void setBackgroundColor(Color backgroundColor) {
		if(backgroundColor == null) {
			System.out.println("ERROR : backgroundColor can't be null!");
			backgroundColor = this.getBackground();
			System.out.println("DEBUG : Setting backgroundColor to previous value.");
			return;
		}
		
		this.setBackground(backgroundColor);
		
		String hexR = Integer.toHexString(backgroundColor.getRed());
		String hexG = Integer.toHexString(backgroundColor.getGreen());
		String hexB = Integer.toHexString(backgroundColor.getBlue());
		System.out.println("DEBUG: The background color is set to " + hexR.toUpperCase() + ";" + hexG.toUpperCase() + ";" + hexB.toUpperCase());
	}
	
	public void getNewBackgroundColor() {
		Color temp = this.getBackground();
		temp = JColorChooser.showDialog(null, "Farbauswahl Background", temp);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(posX, posY, size, size);
		g.setColor(color);
		g.fillRect(posX, posY, size, size);
		
		g.drawRect(posX2, posY2, size2, size2);
		g.setColor(Color.red);
		g.fillRect(posX2, posY2, size2, size2);
	}

}
*/