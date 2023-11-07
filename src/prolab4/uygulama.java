package prolab4;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class uygulama {
	static oyunarayuz arayuz;
	static Random rand;

	public static void main(String[] args) throws IOException {
		
		arayuz=new oyunarayuz();
		
		arayuz.setVisible(true);
		  
		
		
	}
	
	public static void okuma1() throws IOException
	{

		URL url = new URL("http://bilgisayar.kocaeli.edu.tr/prolab2/url1.txt");
		Scanner s = new Scanner(url.openStream());
		String icerik ="";
		String line="";
		while (s.hasNextLine()) {
			line = s.nextLine();
			icerik=icerik+line;
		  
		 
		}
		s.close();
		int a=icerik.length();
		int b=(int) Math.sqrt(a);
		int[][] matris=new int[b+2][b+2];
		for(int i=0;i<b+2;i++)
		{
			for(int j=0;j<b+2;j++)
			{
				if(i==0 || i==b+1)
				{
					matris[i][j]=1;
				}
				if(j==0 || j==b+1)
				{
					matris[i][j]=1;
				}
			}
		}
		int[][] matris1=new int[b][b];
		char[] dizi=icerik.toCharArray();
		int [] dizi1=new int[a];
		for(int i=0;i<a;i++)
		{
			dizi1[i]=dizi[i]-'0';
		}
		int m=0;
		int i=0;
		int j=0;
		for(int k=0;k<a;k++)
		{
		matris1[i][j]=dizi1[k];
		j++;
		m++;
		if(m%b==0)
		{
			i++;
			j=0;
		}
			
		}
		for(int n=1;n<b+1;n++)
		{
			for(int v=1;v<b+1;v++)
			{
				matris[n][v]=matris1[n-1][v-1];
			}
		}
		int c=b+2;
		boolean sonuc=false;
	        
	        if(matris[1][1]==0 && matris[c-2][c-2]==0)
	        {
	        	
	        	matris[1][1]=4;
	        	matris[c-2][c-2]=9;
	        	
	        	
	        	sonuc=true;
	        }
	        if(matris[1][c-2]==0 && matris[c-2][1]==0 && sonuc==false )
	        {

	        	matris[1][c-2]=4;
	        	matris[c-2][1]=9;
	        	
	        }
		
		
		
		izgara izgara=new izgara(matris,c,false,1);	
		izgara.setMatris1(matris);
		izgara.setC(c);
		if(sonuc==true)
		{
			izgara.setStartx(1);
			izgara.setStarty(1);
			izgara.setFinishx(c-2);
			izgara.setFinishy(c-2);
		}
		if(sonuc==false)
		{
			izgara.setStartx(1);
			izgara.setStarty(c-2);
			izgara.setFinishx(c-2);
			izgara.setFinishy(1);
		}
		
		
		
	
	}
	public static void okuma2() throws IOException
	{


		URL url = new URL("http://bilgisayar.kocaeli.edu.tr/prolab2/url2.txt");
		Scanner s = new Scanner(url.openStream());
		String icerik ="";
		String line="";
		while (s.hasNextLine()) {
			line = s.nextLine();
			icerik=icerik+line;
		  
		 
		}
		s.close();
		int a=icerik.length();
		int b=(int) Math.sqrt(a);
		int[][] matris=new int[b+2][b+2];
		for(int i=0;i<b+2;i++)
		{
			for(int j=0;j<b+2;j++)
			{
				if(i==0 || i==b+1)
				{
					matris[i][j]=1;
				}
				if(j==0 || j==b+1)
				{
					matris[i][j]=1;
				}
			}
		}
		int[][] matris1=new int[b][b];
		char[] dizi=icerik.toCharArray();
		int [] dizi1=new int[a];
		for(int i=0;i<a;i++)
		{
			dizi1[i]=dizi[i]-'0';
		}
		int m=0;
		int i=0;
		int j=0;
		for(int k=0;k<a;k++)
		{
		matris1[i][j]=dizi1[k];
		j++;
		m++;
		if(m%b==0)
		{
			i++;
			j=0;
		}
			
		}
		for(int n=1;n<b+1;n++)
		{
			for(int v=1;v<b+1;v++)
			{
				matris[n][v]=matris1[n-1][v-1];
			}
		}
		int c=b+2;
		boolean sonuc=false;
        
        if(matris[1][1]==0 && matris[c-2][c-2]==0)
        {
        	
        	matris[1][1]=4;
        	matris[c-2][c-2]=9;
        	
        	
        	sonuc=true;
        }
        if(matris[1][c-2]==0 && matris[c-2][1]==0 && sonuc==false )
        {

        	matris[1][c-2]=4;
        	matris[c-2][1]=9;
        	
        }
		izgara izgara=new izgara(matris,c,false,2);	
		izgara.setMatris1(matris);
		izgara.setC(c);
	/*if(sonuc==true)
		{
			izgara.setStartx(1);
			izgara.setStarty(1);
			izgara.setFinishx(c-2);
			izgara.setFinishy(c-2);
		}
		if(sonuc==false)
		{
			izgara.setStartx(1);
			izgara.setStarty(c-2);
			izgara.setFinishx(c-2);
			izgara.setFinishy(1);
		}*/
		
		
	
	
	}
	public static void okuma3() throws IOException{
		
		String input=JOptionPane.showInputDialog("Labirent Boyutunu Giriniz :");
		int boyut=Integer.parseInt(input);
		int rows=boyut;
		int cols=boyut;
		int [][]maze=new int [rows][cols];
		rand=new Random();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				maze[i][j]=1;
			}
		}
		generateMaze(0, 0,maze,rows,cols);
		int [][] maze1=new int [boyut+2][boyut+2];
		for(int i=0;i<boyut+2;i++)
		{
			for(int j=0;j<boyut+2;j++)
			{
				if(i==0 || i==boyut+1)
				{
					maze1[i][j]=1;
				}
				if(j==0 || j==boyut+1)
				{
					maze1[i][j]=1;
				}
			}
		}
		for(int i=1;i<boyut;i++)
		{
			for(int j=1;j<boyut;j++)
			{
				maze1[i][j]=maze[i-1][j-1];
			}
		}
		
		maze1[boyut][boyut]=9;
		maze1[1][1]=4;
		izgara izgara=new izgara(maze1,boyut+2,true,3);	
		izgara.setMatris1(maze);
		izgara.setC(boyut);
		
			
        
        		
       
		
	}
	 private static void generateMaze(int row, int col,int [][]maze,int rows,int cols) {
	        maze[row][col] = 0;
	        
	        List<int[]> neighbors = new ArrayList<>();
	        if (row > 1 && maze[row-2][col] == 1) 
	        	neighbors.add(new int[] {row-2, col});
	        if (col > 1 && maze[row][col-2] == 1) 
	        	neighbors.add(new int[] {row, col-2});
	        if (row < rows-2 && maze[row+2][col] == 1) 
	        	neighbors.add(new int[] {row+2, col});
	        if (col < cols-2 && maze[row][col+2] == 1)
	        	neighbors.add(new int[] {row, col+2});
	        Collections.shuffle(neighbors, rand);

	        
	        for (int[] neighbor : neighbors) {
	            int r = neighbor[0];
	            int c = neighbor[1];
	            if (maze[r][c] == 1) {
	                maze[(row+r)/2][(col+c)/2] = 0;
	                generateMaze(r, c,maze,rows,cols);
	            }
	        }
	    }
}
