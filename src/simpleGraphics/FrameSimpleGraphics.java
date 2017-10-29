package simpleGraphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;

public class FrameSimpleGraphics extends JFrame {

	private static final long serialVersionUID = 1L;
	// Anfang Attribute
	private JButton buttonUp = new JButton();
	private JButton buttonLeft = new JButton();
	private JButton buttonRight = new JButton();
	private JButton buttonDown = new JButton();
	private JButton buttonSizeUp = new JButton();
	private JButton buttonSizeDown = new JButton();
	private JButton buttonBackgroundColor = new JButton();
	private JButton buttonRectangleColor = new JButton();
	private JButton buttonFrameColor = new JButton();
	private JPanel jPanel1 = new JPanel1();
	private Random rand = new Random();
	private int speed = rand.nextInt(10) + 1;
	// Ende Attribute

	public FrameSimpleGraphics() { // Konstruktor
		// Frame-Initialisierung
		super(); // Obsolet, ruft den Konstruktor der Superklasse auf
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		int frameWidth = 1000;
		int frameHeight = 700;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("DEBUG: Screen Size is: " + d.width + " x " + d.height);
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		setTitle("simpleGraphics");
		setResizable(false);
		Container cp = getContentPane();
		cp.setLayout(null);
		// Anfang Komponenten

		buttonUp.setBounds(80, 25, 75, 75);
		buttonUp.setText("up");
		buttonUp.setMargin(new Insets(2, 2, 2, 2));
		buttonUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonUp_ActionPerformed(evt);
			}
		});
		cp.add(buttonUp);
		buttonLeft.setBounds(40, 105, 75, 75);
		buttonLeft.setText("left");
		buttonLeft.setMargin(new Insets(2, 2, 2, 2));
		buttonLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonLeft_ActionPerformed(evt);
			}
		});
		cp.add(buttonLeft);
		buttonRight.setBounds(120, 105, 75, 75);
		buttonRight.setText("right");
		buttonRight.setMargin(new Insets(2, 2, 2, 2));
		buttonRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonRight_ActionPerformed(evt);
			}
		});
		cp.add(buttonRight);
		buttonDown.setBounds(80, 184, 75, 75);
		buttonDown.setText("down");
		buttonDown.setMargin(new Insets(2, 2, 2, 2));
		buttonDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonDown_ActionPerformed(evt);
			}
		});
		cp.add(buttonDown);
		buttonSizeUp.setBounds(40, 280, 75, 75);
		buttonSizeUp.setText("size +");
		buttonSizeUp.setMargin(new Insets(2, 2, 2, 2));
		buttonSizeUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonSizeUp_ActionPerformed(evt);
			}
		});
		cp.add(buttonSizeUp);
		buttonSizeDown.setBounds(120, 280, 75, 75);
		buttonSizeDown.setText("size -");
		buttonSizeDown.setMargin(new Insets(2, 2, 2, 2));
		buttonSizeDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonSizeDown_ActionPerformed(evt);
			}
		});
		cp.add(buttonSizeDown);
		buttonBackgroundColor.setBounds(25, 375, 175, 75);
		buttonBackgroundColor.setText("background color");
		buttonBackgroundColor.setMargin(new Insets(2, 2, 2, 2));
		buttonBackgroundColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonBackgroundColor_ActionPerformed(evt);
			}
		});
		cp.add(buttonBackgroundColor);
		buttonRectangleColor.setBounds(25, 475, 175, 75);
		buttonRectangleColor.setText("rectangle color");
		buttonRectangleColor.setMargin(new Insets(2, 2, 2, 2));
		buttonRectangleColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonRectangleColor_ActionPerformed(evt);
			}
		});
		cp.add(buttonRectangleColor);
		buttonFrameColor.setBounds(25, 575, 175, 75);
		buttonFrameColor.setText("frame color");
		buttonFrameColor.setMargin(new Insets(2, 2, 2, 2));
		buttonFrameColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonFrameColor_ActionPerformed(evt);
			}
		});
		cp.add(buttonFrameColor);
		jPanel1.setBounds(300, 25, 675, 625);
		jPanel1.setOpaque(true);
		jPanel1.setBackground(Color.black);
		System.out
				.println("DEBUG: The size of jPanel is: " + jPanel1.getSize().width + " x " + jPanel1.getSize().height);
		cp.add(jPanel1);
		// Ende Komponenten

		setVisible(true);
	} // end of public simpleGraphics

	public void renew() {
		this.repaint();
	}

	// Anfang Methoden
	public static void main(String[] args) {
		new FrameSimpleGraphics();
	} // end of main

	public void buttonUp_ActionPerformed(ActionEvent evt) {
		((JPanel1) jPanel1).setPosY(((JPanel1) jPanel1).getPosY() - speed);
		this.renew();
	} // end of buttonUp_ActionPerformed

	public void buttonLeft_ActionPerformed(ActionEvent evt) {
		((JPanel1) jPanel1).setPosX(((JPanel1) jPanel1).getPosX() - speed);
		this.renew();
	} // end of buttonLeft_ActionPerformed

	public void buttonRight_ActionPerformed(ActionEvent evt) {
		((JPanel1) jPanel1).setPosX(((JPanel1) jPanel1).getPosX() + speed);
		this.renew();
	} // end of buttonRight_ActionPerformed

	public void buttonDown_ActionPerformed(ActionEvent evt) {
		((JPanel1) jPanel1).setPosY(((JPanel1) jPanel1).getPosY() + speed);
		this.renew();
	} // end of buttonDown_ActionPerformed

	public void buttonSizeUp_ActionPerformed(ActionEvent evt) {
		// TODO hier Quelltext einfügen

	} // end of buttonSizeUp_ActionPerformed

	public void buttonSizeDown_ActionPerformed(ActionEvent evt) {
		// TODO hier Quelltext einfügen

	} // end of buttonSizeDown_ActionPerformed

	public void buttonBackgroundColor_ActionPerformed(ActionEvent evt) {
		Color colorBackground = JColorChooser.showDialog(null, "Farbauswahl Background", null);
		jPanel1.setBackground(colorBackground);
	} // end of buttonBackgroundColor_ActionPerformed

	public void buttonRectangleColor_ActionPerformed(ActionEvent evt) {
		// TODO hier Quelltext einfügen

	} // end of buttonRectangleColor_ActionPerformed

	public void buttonFrameColor_ActionPerformed(ActionEvent evt) {
		Color colorFrameBackground = JColorChooser.showDialog(null, "Farbauswahl FrameBackground", null);
		getContentPane().setBackground(colorFrameBackground);
	} // end of buttonFrameColor_ActionPerformed

	// Ende Methoden
} // end of class FrameSimpleGraphics

class JPanel1 extends JPanel {

	private static final long serialVersionUID = 1L;
	private Random rand = new Random();
	int posX = rand.nextInt(50) + 1;
	int posY = rand.nextInt(50) + 1;
	int size = rand.nextInt(30) + 5;
	Color color = Color.green;

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
		this.posY = _posY;
	}

	public int getPosY() {
		return this.posY;
	}

	public void setSizeAndSpeed(int _size) {
		this.size = _size;
	}

	public int getSizeAndSpeed() {
		return this.size;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(posX, posY, size, size);
		g.setColor(color);
		g.fillRect(posX, posY, size, size);
	}
}
