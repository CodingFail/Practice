package code;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TikalBoard extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private static JButton [] spots = new JButton[33];
	private static int width = 120, height = 50;
	private static int intx = 50, inty = 100;
	
	public static void main(String [] agrs){
		TikalBoard b = new TikalBoard();
		b.setVisible(true);
	}
	public TikalBoard(){
		//setLocationRelativeTo(null);
		setSize(900, 500);
		setResizable(false);
		setTitle("Tikal2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		int y = inty;
		int x = intx;
		for(int i = 0; i < 33; i++){
			spots[i] = new JButton(Integer.toString(i));
			spots[i].setBounds(x, y, width, height);
			add(spots[i]);
			spots[i].addActionListener(this);			
			if(i == 4 || i == 15 || i == 26){
				y = inty - height/2;
				x += width;
			}
			else if(i == 10 || i == 21){
				y = inty;
				x += width;
			}
			else{
				y += height;
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < 33; i++){
			if(e.getSource() == spots[i])
			{
				spots[i].setText("Spot Taken");
			}
		}
	}
}


