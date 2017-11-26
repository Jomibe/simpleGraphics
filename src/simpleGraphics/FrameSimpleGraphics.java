package simpleGraphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class FrameSimpleGraphics extends JFrame {

	// Attribute
	private static final long serialVersionUID = 1L;

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

	public FrameSimpleGraphics() { // Konstruktor
		// Frame-Initialisierung
		super(); // Obsolet, ruft den Konstruktor der Superklasse auf
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		int frameWidth = 1000;
		int frameHeight = 700;
		this.setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("DEBUG: Screen Size is: " + d.width + " x " + d.height);
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		this.setLocation(x, y);
		this.setTitle("simpleGraphics");
		this.setResizable(false);
		Container cp = getContentPane();
		cp.setLayout(null);
		// Anfang Komponenten

		System.out.println("DEBUG: speed is set to " + speed);

		buttonUp.setBounds(80, 25, 75, 75);
		buttonUp.setText("up");
		buttonUp.setMnemonic(KeyEvent.VK_UP);
		buttonUp.setMargin(new Insets(2, 2, 2, 2));
		buttonUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonUp_ActionPerformed(evt);
			}
		});
		cp.add(buttonUp);
		buttonLeft.setBounds(40, 105, 75, 75);
		buttonLeft.setText("left");
		buttonLeft.setMnemonic(KeyEvent.VK_LEFT);
		buttonLeft.setMargin(new Insets(2, 2, 2, 2));
		buttonLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonLeft_ActionPerformed(evt);
			}
		});
		cp.add(buttonLeft);
		buttonRight.setBounds(120, 105, 75, 75);
		buttonRight.setText("right");
		buttonRight.setMnemonic(KeyEvent.VK_RIGHT);
		buttonRight.setMargin(new Insets(2, 2, 2, 2));
		buttonRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonRight_ActionPerformed(evt);
			}
		});
		cp.add(buttonRight);
		buttonDown.setBounds(80, 184, 75, 75);
		buttonDown.setText("down");
		buttonDown.setMnemonic(KeyEvent.VK_DOWN);
		buttonDown.setMargin(new Insets(2, 2, 2, 2));
		buttonDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonDown_ActionPerformed(evt);
			}
		});
		cp.add(buttonDown);
		buttonSizeUp.setBounds(40, 280, 75, 75);
		buttonSizeUp.setText("size +");
		buttonSizeUp.setMnemonic(KeyEvent.VK_X);
		buttonSizeUp.setMargin(new Insets(2, 2, 2, 2));
		buttonSizeUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonSizeUp_ActionPerformed(evt);
			}
		});
		cp.add(buttonSizeUp);
		buttonSizeDown.setBounds(120, 280, 75, 75);
		buttonSizeDown.setText("size -");
		buttonUp.setMnemonic(KeyEvent.VK_Y);
		buttonSizeDown.setMargin(new Insets(2, 2, 2, 2));
		buttonSizeDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonSizeDown_ActionPerformed(evt);
			}
		});
		cp.add(buttonSizeDown);
		buttonBackgroundColor.setBounds(25, 375, 175, 75);
		buttonBackgroundColor.setText("background color");
		buttonUp.setMnemonic(KeyEvent.VK_B);
		buttonBackgroundColor.setMargin(new Insets(2, 2, 2, 2));
		buttonBackgroundColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonBackgroundColor_ActionPerformed(evt);
			}
		});
		cp.add(buttonBackgroundColor);
		buttonRectangleColor.setBounds(25, 475, 175, 75);
		buttonRectangleColor.setText("rectangle color");
		buttonUp.setMnemonic(KeyEvent.VK_R);
		buttonRectangleColor.setMargin(new Insets(2, 2, 2, 2));
		buttonRectangleColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonRectangleColor_ActionPerformed(evt);
			}
		});
		cp.add(buttonRectangleColor);
		buttonFrameColor.setBounds(25, 575, 175, 75);
		buttonFrameColor.setText("frame color");
		buttonUp.setMnemonic(KeyEvent.VK_F);
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
		System.out.println("DEBUG: The size of jPanel is: " + jPanel1.getSize().width + " x " + jPanel1.getSize().height);
		cp.add(jPanel1);

		setVisible(true);
	}

	// Methoden
	public void renew() {
		this.repaint();
	}

	public static void main(String[] args) {
		new FrameSimpleGraphics();
	}

	public void buttonUp_ActionPerformed(ActionEvent evt) {
		((JPanel1) jPanel1).setPosY(((JPanel1) jPanel1).getPosY() - speed);
		this.renew();
	}

	public void buttonLeft_ActionPerformed(ActionEvent evt) {
		((JPanel1) jPanel1).setPosX(((JPanel1) jPanel1).getPosX() - speed);
		this.renew();
	}

	public void buttonRight_ActionPerformed(ActionEvent evt) {
		((JPanel1) jPanel1).setPosX(((JPanel1) jPanel1).getPosX() + speed);
		this.renew();
	}

	public void buttonDown_ActionPerformed(ActionEvent evt) {
		((JPanel1) jPanel1).setPosY(((JPanel1) jPanel1).getPosY() + speed);
		this.renew();
	}

	public void buttonSizeUp_ActionPerformed(ActionEvent evt) {
		JPanel1.setSizeAndSpeed(JPanel1.getSizeAndSpeed() + 1);
		this.repaint();
	}

	public void buttonSizeDown_ActionPerformed(ActionEvent evt) {
		JPanel1.setSizeAndSpeed(JPanel1.getSizeAndSpeed() - 1);
		this.repaint();
	}

	public void buttonBackgroundColor_ActionPerformed(ActionEvent evt) {
		Color colorBackground = JColorChooser.showDialog(null, "Farbauswahl Background", null);
		jPanel1.setBackground(colorBackground);
		String hexR = Integer.toHexString(colorBackground.getRed());
		String hexG = Integer.toHexString(colorBackground.getGreen());
		String hexB = Integer.toHexString(colorBackground.getBlue());
		System.out.println("DEBUG: The background color is set to " + hexR.toUpperCase() + ";" + hexG.toUpperCase() + ";" + hexB.toUpperCase());
	}

	public void buttonRectangleColor_ActionPerformed(ActionEvent evt) {
		Color colorRectangle = JColorChooser.showDialog(null, "Farbauswahl Rectangle", null);
		((JPanel1) jPanel1).setRectangleColor(colorRectangle);
		String hexR = Integer.toHexString(colorRectangle.getRed());
		String hexG = Integer.toHexString(colorRectangle.getGreen());
		String hexB = Integer.toHexString(colorRectangle.getBlue());
		System.out.println("DEBUG: The rectangle color is set to " + hexR.toUpperCase() + ";" + hexG.toUpperCase() + ";" + hexB.toUpperCase());
		this.repaint();
	}

	public void buttonFrameColor_ActionPerformed(ActionEvent evt) {
		Color colorFrameBackground = JColorChooser.showDialog(null, "Farbauswahl FrameBackground", null);
		getContentPane().setBackground(colorFrameBackground);
		String hexR = Integer.toHexString(colorFrameBackground.getRed());
		String hexG = Integer.toHexString(colorFrameBackground.getGreen());
		String hexB = Integer.toHexString(colorFrameBackground.getBlue());
		System.out.println("DEBUG: The Frame color is set to " + hexR.toUpperCase() + ";" + hexG.toUpperCase() + ";" + hexB.toUpperCase());
	}
}

class JPanel1 extends JPanel {

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
		JPanel1.size = _size;
		System.out.println("SizeAndSpeed is set to " + size);
	}

	public static int getSizeAndSpeed() {
		return JPanel1.size;
	}

	public void setRectangleColor(Color _color) {
		this.color = _color;
		String hexR = Integer.toHexString(color.getRed());
		String hexG = Integer.toHexString(color.getGreen());
		String hexB = Integer.toHexString(color.getBlue());
		System.out.println("DEBUG: The rectangle color is set to " + hexR.toUpperCase() + ";" + hexG.toUpperCase() + ";" + hexB.toUpperCase());
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
