package prolab4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.security.KeyStore.PrivateKeyEntry;

public class oyunarayuz2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue eventQueue = new EventQueue();
		eventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					oyunarayuz2 frame = new oyunarayuz2(float time, int kare);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param kare2 
	 * @param time2 
	 */
	public oyunarayuz2(Float time2, int kare2) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 870);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LABİRENT SONU");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Impact", Font.ITALIC, 60));
		lblNewLabel.setBounds(70, 32, 453, 74);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TOPLAM SÜRE");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Ink Free", Font.BOLD, 40));
		lblNewLabel_1.setBounds(113, 453, 562, 153);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("GEÇİLEN KARE SAYISI");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Ink Free", Font.BOLD, 40));
		lblNewLabel_1_1.setBounds(55, 132, 562, 165);
		contentPane.add(lblNewLabel_1_1);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBounds(149, 296, 256, 90);
		contentPane.add(panel);
		panel.setLayout(null);
		String kareString=Integer.toString(kare2);
		JLabel lblNewLabel_2 = new JLabel(kareString);
		lblNewLabel_2.setBounds(80, 0, 194, 97);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Impact", Font.BOLD, 50));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(55, 616, 439, 90);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setToolTipText("");
		String timeString=Float.toString(time2);
		JLabel lblNewLabel_2_1 = new JLabel(timeString);
		lblNewLabel_2_1.setBounds(10, 0, 194, 97);
		panel_1.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Impact", Font.BOLD, 50));
		
		JLabel lblNewLabel_3 = new JLabel("sn");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 80));
		lblNewLabel_3.setBounds(338, -9, 91, 90);
		panel_1.add(lblNewLabel_3);
	}

	
}
