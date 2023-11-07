package prolab4;

import java.awt.Color;
import java.util.List;

import javax.sound.midi.Soundbank;
import javax.swing.JPanel;

public class robot {

	 public static boolean searchPath1(int [][]maze ,int x,int y,List<Integer> path)
	 
	 {
		
		 if(maze[y][x]==9)
		 {
			 path.add(x);
			 path.add(y);
			 return true;
		 }
		 if(maze[y][x]==0)
		 {
			 maze[y][x]=2;
			 int dx=1;
			 int dy=0;
			 if(searchPath1(maze, x+dx, y+dy, path))
			 {
				 
				 
				 path.add(x);
				 path.add(y);
				 
				 return true;
			 }
			 dx=0;
			 dy=1;
			 if(searchPath1(maze, x+dx, y+dy, path))
			 {
				
				 path.add(x);
				 path.add(y);
				 return true;
			 }
			  dx=-1;
			  dy=0;
			 if(searchPath1(maze, x+dx, y+dy, path))
			 {
				 
				 path.add(x);
				 path.add(y);
				 return true;
			 }
			  dx=0;
			  dy=-1;
			 if(searchPath1(maze, x+dx, y+dy, path))
			 {
				
				 path.add(x);
				 path.add(y);
				 return true;
			 }
		 }
		 return false;
	 }
public static boolean searchPath2(int [][]maze ,int x,int y,List<Integer> path)
	 
	 {
		
		 if(maze[y][x]==9)
		 {
			 path.add(x);
			 path.add(y);
			 return true;
		 }
		 if(maze[y][x]==0)
		 {
			 maze[y][x]=2;
			 int dx=-1;
			 int dy=0;
			 if(searchPath2(maze, x+dx, y+dy, path))
			 {
				 
				 
				 path.add(x);
				 path.add(y);
				 
				 return true;
			 }
			 dx=0;
			 dy=1;
			 if(searchPath2(maze, x+dx, y+dy, path))
			 {
				
				 path.add(x);
				 path.add(y);
				 return true;
			 }
			  dx=1;
			  dy=0;
			 if(searchPath2(maze, x+dx, y+dy, path))
			 {
				 
				 path.add(x);
				 path.add(y);
				 return true;
			 }
			  dx=0;
			  dy=-1;
			 if(searchPath2(maze, x+dx, y+dy, path))
			 {
				
				 path.add(x);
				 path.add(y);
				 return true;
			 }
		 }
		 return false;
	 }
}
