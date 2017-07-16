package ScoreManagement;

import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class feedNames extends JFrame {

	/**
	 * 
	 */
	JFrame thisframe=this;
	private static final long serialVersionUID = 1L;
	JLabel[] namelbl=new JLabel[16];
	JTextField nameTxt[]=new JTextField[16];
	JButton submit=new JButton("SUBMIT");



	public feedNames() throws HeadlessException {
		this.setBounds(0,0,(int)getToolkit().getScreenSize().getWidth(),(int)getToolkit().getScreenSize().getHeight());
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(16, 2, 0, 0));
		int i;
		for( i=0;i<15;i++)
		{
			namelbl[i]=new JLabel("Name"+(i+1));
			nameTxt[i]=new JTextField((i+1)+"");
			panel_1.add(namelbl[i]);
			panel_1.add(nameTxt[i]);
		}
		namelbl[i]=new JLabel("SUBMIT ->");
		namelbl[i].setBackground(Color.green);
		namelbl[i].setHorizontalAlignment(JLabel.TRAILING);
		namelbl[i].setOpaque(true);
		panel_1.add(namelbl[i]);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScoreMAinScreen sMS=new ScoreMAinScreen();
				for(int i=0;i<15;i++)
				{
					sMS.ETPanel[i].teamNameLabel.setText(nameTxt[i].getText());
				}
				thisframe.dispose();
				sMS.setVisible(true);
				
			}
		});
		submit.setBackground(new Color(240, 230, 140));
		panel_1.add(submit);
		i++;
		
		// TODO Auto-generated constructor stub
	}




	public static void main(String[] args) {
		new feedNames().setVisible(true);
		
		// TODO Auto-generated method stub

	}

}
