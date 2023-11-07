package prolab4;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyStore.PrivateKeyEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.print.event.PrintJobAttributeEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.BorderUIResource.MatteBorderUIResource;


public class izgara extends JFrame {
	static Random random = new Random();
	private int c;
	private int startx;
	private int starty;
	private int finishx;
	private int finishy;
	
	public int getStartx() {
		return startx;
	}


	public void setStartx(int startx) {
		this.startx = startx;
	}


	public int getStarty() {
		return starty;
	}


	public void setStarty(int starty) {
		this.starty = starty;
	}


	public int getFinishx() {
		return finishx;
	}


	public void setFinishx(int finishx) {
		this.finishx = finishx;
	}


	public int getFinishy() {
		return finishy;
	}


	public void setFinishy(int finishy) {
		this.finishy = finishy;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}


	private JPanel [][] matris= new JPanel[c][c]; 
	 
	
	
	public izgara(int [][]matris,int c,boolean sonuc,int text)
	{
	JFrame frame = new JFrame("GMAZE");
	frame.setSize(1000, 1000);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	GridLayout izgara = new GridLayout(c, c);

	
	JPanel mainPanel = new JPanel(new BorderLayout());

	JPanel gridPanel = new JPanel(izgara);

	JPanel[][] maze = new JPanel[c][c];

	for (int i = 0; i < c; i++) {
	    for (int j = 0; j < c; j++) {
	        JPanel panel = new JPanel();
	        if (matris[i][j] == 1) {
	            panel.setBackground(Color.GRAY);
	            maze[i][j] = panel;
	            gridPanel.add(panel);
	        } else if (matris[i][j] == 2 || matris[i][j] == 3) {
	            int a = random.nextInt(2);
	            if (a == 1) {
	                panel.setBackground(Color.GRAY);
	                maze[i][j] = panel;
	                gridPanel.add(panel);
	                matris[i][j] = 1;
	            } else {
	                panel.setBackground(Color.BLUE);
	                maze[i][j] = panel;
	                gridPanel.add(panel);
	                matris[i][j] = 0;
	            }
	        } else if (matris[i][j] == 0) {
	            panel.setBackground(Color.BLUE);
	            maze[i][j] = panel;
	            gridPanel.add(panel);
	        } else if (matris[i][j] == 4) {
	            panel.setBackground(Color.RED);
	            this.startx=i;
	            this.starty=j;
	            maze[i][j] = panel;
	            gridPanel.add(panel);
	        } else if (matris[i][j] == 9) {
	            panel.setBackground(Color.PINK);
	            this.finishx=i;
	            this.finishy=j;
	            maze[i][j] = panel;
	            gridPanel.add(panel);
	        }
	    }
	}
	matris[startx][starty]=0;
	robot robot=new robot();
	this.matris = maze;
	frame.setVisible(true);
	if(startx==1 && starty==1)
	{
		robot.searchPath1(matris, starty, startx,path);	
	}
	if(starty==(c-2) && startx==1)
	{
		robot.searchPath2(matris, starty, startx,path);	
	}
	

	// Add the gridPanel to the mainPanel
	mainPanel.add(gridPanel, BorderLayout.CENTER);

	// Create a new JButton
	JButton button1 = new JButton("Çalıştır");
	JButton button2 = new JButton("Sonuç Göster");
	JButton button3 = new JButton("Labirent Değiş");


	// Add the button to a new JPanel
	JPanel buttonPanel = new JPanel();
	buttonPanel.add(button1);
	button1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			for(int i=0;i<c;i++)
			{
				for(int j=0;j<c;j++)
				{
					maze[i][j].setBackground(Color.white);
				}
			}
			Thread t1 = new Thread(new Runnable() {
				
				
			    @Override
			    public void run() {
			    	for(int i=(path.size()-1);i>0;i-=2)
					 {
						
						maze[path.get(i)][path.get(i-1)].setBackground(Color.ORANGE);
						if(matris[path.get(i)+1][path.get(i-1)]==1)
						{
							maze[path.get(i)+1][path.get(i-1)].setBackground(Color.GRAY);
						}
						if(matris[path.get(i)+1][path.get(i-1)]==0)
						{
							maze[path.get(i)+1][path.get(i-1)].setBackground(Color.BLUE);
						}
						if(matris[path.get(i)-1][path.get(i-1)]==1)
						{
							maze[path.get(i)-1][path.get(i-1)].setBackground(Color.GRAY);
						}
						if(matris[path.get(i)-1][path.get(i-1)]==0)
						{
							maze[path.get(i)-1][path.get(i-1)].setBackground(Color.BLUE);
						}
						if(matris[path.get(i)][path.get(i-1)-1]==1)
						{
							maze[path.get(i)][path.get(i-1)-1].setBackground(Color.GRAY);
						}
						if(matris[path.get(i)][path.get(i-1)-1]==0)
						{
							maze[path.get(i)][path.get(i-1)-1].setBackground(Color.BLUE);
						}
						if(matris[path.get(i)][path.get(i-1)+1]==1)
						{
							maze[path.get(i)][path.get(i-1)+1].setBackground(Color.GRAY);
						}
						if(matris[path.get(i)][path.get(i-1)+1]==0)
						{
							maze[path.get(i)][path.get(i-1)+1].setBackground(Color.BLUE);
						}
						
						try {
						    Thread.sleep(100);
						} catch (Exception e) {
						    e.printStackTrace();
						}
						 
						 
					 }
			    }
			});  
			t1.start();
			
			
			
			
			

		
		}
	});
	button2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			for(int i=0;i<c;i++)
			{
				for(int j=0;j<c;j++)
				{
					if (matris[i][j] == 0)
					{
						maze[i][j].setBackground(Color.BLUE);
					}
					if (matris[i][j] == 2)
					{
						maze[i][j].setBackground(Color.ORANGE);
					}
					if (matris[i][j] == 1)
					{
						maze[i][j].setBackground(Color.GRAY);
					}
				}
			}
			Float time=(float) (((path.size())/2)*100/1000);
			Float time1=(time/9);
			time=time+time1;
			int kare=path.size()/2;
			String text="Geçilen Kare Sayısı :";
			text=text+"\n";
			text=text+kare;
			text=text+"\n";
			text=text+"Geçen Süre :";
			text=text+"\n";
			text=text+time;
			oyunarayuz2 arayuz=new oyunarayuz2(time,kare);
			arayuz.setVisible(true);
			
			
	        File file = new File("sonuc.txt");
	        if (!file.exists())
	            try {
	                file.createNewFile();
	            } catch (Exception a) {
	                a.printStackTrace();
	            }

	        try {
	            FileWriter fw = new FileWriter(file.getAbsoluteFile());
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.write(text);
	            bw.write("\n");
	            
	            bw.close();
	        } catch (Exception a) {
	            a.printStackTrace();
	        }
			
			
			
			

		
		}
	});
	buttonPanel.add(button2);
	button3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(sonuc==true)
			{
				try {
				uygulama.okuma3();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			frame.setVisible(false);
			}
			else {
				if(text==1)
				{
					try {
						uygulama.okuma2();
						frame.setVisible(false);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(text==2)
				{
					try {
						uygulama.okuma1();
						frame.setVisible(false);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			
		}
	});
	buttonPanel.add(button3);

	// Add the buttonPanel to the mainPanel
	mainPanel.add(buttonPanel, BorderLayout.SOUTH);

	// Set the mainPanel as the content pane of the JFrame
	frame.setContentPane(mainPanel);

	
	
}


	public JPanel [][] getMatris() {
		return matris;
	}


	public void setMatris(JPanel [][] matris) {
		this.matris = matris;
	}
	private  final List<Integer> path = new ArrayList <Integer>();
	private int [][] matris1= new int[c][c];
	public int[][] getMatris1() {
		return matris1;
	}


	public void setMatris1(int[][] matris1) {
		this.matris1 = matris1;
	} 
	

	
}