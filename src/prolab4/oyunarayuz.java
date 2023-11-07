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



public class oyunarayuz extends JFrame{
	
	
	
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					oyunarayuz frame = new oyunarayuz();
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
	
	public oyunarayuz() {
		setType(Type.UTILITY);
		setResizable(false);
		setTitle("GEZGİN ROBOT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1404, 851);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton problem1 = new JButton("Problem 1");
		problem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oyunarayuz1 oyunarayuz1=new oyunarayuz1();
				oyunarayuz1.setVisible(true);
				oyunarayuz.super.setVisible(false);
				
				
	
			
			}
		});
		problem1.setFont(new Font("Tahoma", Font.PLAIN, 52));
		problem1.setBounds(42, 330, 618, 283);
		contentPane.add(problem1);
		
		JLabel lblNewLabel = new JLabel("GEZGİN ROBOT");
		lblNewLabel.setBounds(454, 10, 572, 82);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 68));
		contentPane.add(lblNewLabel);
		
		JButton problem2 = new JButton("Problem 2");
		problem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calistir();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				oyunarayuz.super.setVisible(false);
			
				
			}
		});
		problem2.setFont(new Font("Tahoma", Font.PLAIN, 52));
		problem2.setBounds(728, 330, 618, 283);
		contentPane.add(problem2);
	}

 public static void calistir() throws IOException {
	 uygulama.okuma3();
 }
}
