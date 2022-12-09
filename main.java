//Noah Molla
//Mr. Kahn Period 4
//Ready, Set... Code! S2E4 (Simple OOP Database) - [Due: Sun 11/15 @ 11:59PM]
//November 30th, 2020
//Sources: https://www.youtube.com/watch?v=0KdG9DZgi6I 
//https://www.youtube.com/watch?v=CWYv7xlKydw&ab_channel=AlexLee
//Collaborated with Aidan Villegas

import javax.swing.JFrame;
class main{
	public static void main(String[] args)
  {
    StudentGUI app = new StudentGUI();
    app.setVisible (true);
    app.setSize (1000,1000);
    app.setLocation (200,100);
    app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
  }
}