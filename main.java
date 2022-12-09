

//Simple OOP Database - [Due: Sun 11/15 @ 11:59PM]
//November 30th, 2020


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
