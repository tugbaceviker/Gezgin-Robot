package prolab4;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import prolab2.oyun;



public class oyunarayuz1 extends JFrame{
	

	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					oyunarayuz1 frame = new oyunarayuz1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public oyunarayuz1() {
		setType(Type.UTILITY);
		setResizable(false);
		setTitle("GEZGİN ROBOT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1404, 851);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton url1 = new JButton("URL 1");
		url1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calistir1();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				oyunarayuz1.super.setVisible(false);
				
				
	
			
			}
		});
		url1.setFont(new Font("Tahoma", Font.PLAIN, 52));
		url1.setBounds(42, 330, 618, 283);
		contentPane.add(url1);
		
		JLabel lblNewLabel = new JLabel("LÜTFEN OLUŞTURACAĞINIZ LABİRENTİN URL ADRESİNİ SEÇİNİZ");
		lblNewLabel.setBounds(454, 10, 572, 82);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		JButton url2 = new JButton("URL 2");
		url2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calistir2();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				oyunarayuz1.super.setVisible(false);
			
				
			}
		});
		url2.setFont(new Font("Tahoma", Font.PLAIN, 52));
		url2.setBounds(728, 330, 618, 283);
		contentPane.add(url2);
	}

	public static void calistir1() throws IOException
	{
		uygulama.okuma1();
		
	}
	public static void calistir2() throws IOException
	{
		uygulama.okuma2();
		
	}
}
