package ScoreManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ScoreMAinScreen extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame=this;
	EachTeamPanel ETPanel[]=new EachTeamPanel[15];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreMAinScreen window = new ScoreMAinScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScoreMAinScreen() {
		this.setUndecorated(true);
		this.setExtendedState(MAXIMIZED_BOTH);
		getContentPane().setBackground(Color.CYAN);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(5, 3, 1, 1));
		
		JLabel lblNewLabel = new JLabel("hide");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				hideScorePane();
			}
		});
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		for(int i=0;i<15;i++)
		{
			ETPanel[i]=new EachTeamPanel();

			frame.setAlwaysOnTop(true);
			panel.add(ETPanel[i]);
		}
		
	}
	void hideScorePane()
	{
		frame.setVisible(false);
		hideScorePaneFrame.setUndecorated(true);
		hideScorePaneFrame.setVisible(true);

		//hideScorePaneFrame.getRootPane().setWindowDecorationStyle(JRootPane.COLOR_CHOOSER_DIALOG);
		hideScorePaneFrame.getContentPane().setLayout(new BorderLayout());
		JButton btn=new JButton("show Score Board");
		hideScorePaneFrame.getContentPane().add(btn);
		hideScorePaneFrame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		hideScorePaneFrame.setBounds(new Rectangle((int) getToolkit().getScreenSize().getWidth(), 10));
		hideScorePaneFrame.setAlwaysOnTop(true);
		btn.setBorder(null);
		
		
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(true);
				hideScorePaneFrame.dispose();
				
				
			}
		});
		
	}

	JFrame hideScorePaneFrame=new JFrame();

}
