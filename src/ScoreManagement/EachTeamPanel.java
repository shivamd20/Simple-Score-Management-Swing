package ScoreManagement;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EachTeamPanel extends JPanel{
	JPanel thisframe=this;
	void shyam()
	{
		JFrame frame=new JFrame("ramu");
		frame.setBounds(0,0,400,400);
		frame.getContentPane().setLayout(new GridLayout(5,2));
		frame.getContentPane().add(
		new EachTeamPanel());
		frame.getContentPane().add(
				new EachTeamPanel());
		frame.getContentPane().add(
				new EachTeamPanel());
		frame.getContentPane().add(
				new EachTeamPanel());
		frame.getContentPane().add(
				new EachTeamPanel());
		frame.getContentPane().add(
				new EachTeamPanel());

		frame.getContentPane().add(
				new EachTeamPanel());

		frame.getContentPane().add(
				new EachTeamPanel());

		frame.getContentPane().add(
				new EachTeamPanel());

		frame.getContentPane().add(
				new EachTeamPanel());
		frame.setVisible(true);
	}

	JPanel thisPanel=this;
	JLabel teamNameLabel = new JLabel("Team Name");
	JLabel teamPointLabel = new JLabel("000");
	JPanel panel = new JPanel();
	JButton p20btn = new JButton("+20");
	JButton changeBtn = new JButton("change");
	 JButton m10btn = new JButton("-10");
	 JButton p10btn = new JButton("+10");
	
	
	public EachTeamPanel() {
		setBackground(Color.BLACK);
		setLayout(new MigLayout("", "[34.00px:n][50px:15.00,grow][17.00px:n,grow,fill][73.00,grow]", "[grow]"));
		teamNameLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(p20btn.isEnabled())
				{
				//thisPanel.setEnabled(false);
				p20btn.setEnabled(false);
				p10btn.setEnabled(false);
				m10btn.setEnabled(false);
				changeBtn.setEnabled(false);
				teamNameLabel.setBackground(Color.black);

				teamPointLabel.setBackground(Color.magenta);
				}
				else
				{
					p20btn.setEnabled(true);
					p10btn.setEnabled(true);
					m10btn.setEnabled(true);
					changeBtn.setEnabled(true);
					teamNameLabel.setBackground(Color.blue);
					teamPointLabel.setBackground(Color.green);
				}
			}
		});
		
		teamNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		teamNameLabel.setBackground(Color.BLUE);
		teamNameLabel.setOpaque(true);
		teamNameLabel.setForeground(new Color(255, 255, 255));
		teamNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(teamNameLabel, "cell 0 0 2 1,grow");
		
		teamPointLabel.setFont(new Font("Stencil", Font.BOLD, 20));
		teamPointLabel.setBackground(Color.GREEN);
		teamPointLabel.setOpaque(true);
		teamPointLabel.setForeground(Color.RED);
		teamPointLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(teamPointLabel, "cell 2 0,alignx right,growy");
		
		add(panel, "cell 3 0,grow");
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		p20btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=Integer.parseInt(teamPointLabel.getText());
				teamPointLabel.setText(n+20+"");
				
				
			}
		});
		p20btn.setBackground(Color.ORANGE);
		p20btn.setBorder(null);
		
		panel.add(p20btn);
		p10btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=Integer.parseInt(teamPointLabel.getText());
				teamPointLabel.setText(n+10+"");
				
			}
		});
		p10btn.setBackground(new Color(255, 222, 173));
		p10btn.setBorder(null);
		
		panel.add(p10btn);
		
		m10btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=Integer.parseInt(teamPointLabel.getText());
				teamPointLabel.setText(n-10+"");
				
			}
		});
		m10btn.setBackground(new Color(210, 105, 30));
		m10btn.setBorder(null);
		
		panel.add(m10btn);
		changeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				int n=Integer.parseInt(JOptionPane.showInputDialog(thisPanel,"Enter Points for"+teamNameLabel.getText(),""));
				teamPointLabel.setText(n+"");
				}
				catch(NullPointerException e5)
				{
					
				}
				catch(NumberFormatException e7){
					
				}
			}
		});
		changeBtn.setBackground(new Color(220, 220, 220));
		changeBtn.setBorder(null);
		

		teamNameLabel.addMouseListener(MouseAda);
		teamPointLabel.addMouseListener(MouseAda);
		
		
		m10btn.addMouseListener(MouseAda);
		changeBtn.addMouseListener(MouseAda);
		p10btn.addMouseListener(MouseAda);
		p20btn.addMouseListener(MouseAda);
		panel.add(changeBtn);
		// TODO Auto-generated constructor stub
		//this.addMouseListener(mouseLis);
	}
	
	MouseAdapter MouseAda=new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e)
		{
			if(m10btn.isEnabled())
			teamNameLabel.setBackground(Color.red);
		}
		@Override
		public void mouseExited(MouseEvent e)
		{
			if(m10btn.isEnabled())

			teamNameLabel.setBackground(Color.blue);
		}
		@Override
		public void mousePressed(MouseEvent e)
		{
			
		}
		@Override
		public void mouseReleased(MouseEvent e)
		{
			
		}
	};
	
}
