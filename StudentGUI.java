//Noah Molla
//Mr. Kahn Period 4
//Ready, Set... Code! S2E4 (Simple OOP Database) - [Due: Sun 11/15 @ 11:59PM]
//November 30th, 2020
//Sources: https://www.youtube.com/watch?v=0KdG9DZgi6I 
//https://www.youtube.com/watch?v=CWYv7xlKydw&ab_channel=AlexLee
//Collaborated with Aidan Villegas

import javax.swing.*;



import java.awt.*;
import java.util.LinkedList;

public class StudentGUI extends JFrame
	{
	  /**
		 * 
		 */
		private static final long serialVersionUID = 3264998872007300163L; //https://www.youtube.com/watch?v=0KdG9DZgi6I // Just to resolve error
		
		//GUI 
		JTextArea studentTextArea = new JTextArea ();
		
	JLabel  idLabel = new JLabel ("ID: ");
	  JTextField idTextField = new JTextField (10);
	
	  JLabel  firstNameLabel = new JLabel ("firstName: ");
	  JTextField firstNameTextField = new JTextField (10);
	
	  JLabel  middleInitialLabel = new JLabel ("middleInitial: ");
	  JTextField middleInitialTextField = new JTextField (10);
	
	  JLabel  lastNameLabel = new JLabel ("lastName: ");
	  JTextField lastNameTextField = new JTextField (10);
	
	  JLabel  gradeLabel = new JLabel ("grade: ");
	  JTextField gradeTextField = new JTextField (10);
	  
	  JButton addButton = new JButton ("Add");
	  JButton removeButton = new JButton ("Remove");
	  JButton printButton = new JButton ("Print");
	  JButton lookup = new JButton ("Lookup");
  

//Class
  
  private LinkedList<Student> studentLinkedList = new LinkedList<Student> (); //Linked list of students
  
  public StudentGUI()
  {
    JPanel flow1Panel = new JPanel (new FlowLayout (FlowLayout.CENTER));
    JPanel flow2Panel = new JPanel (new FlowLayout (FlowLayout.CENTER));
    
    
    studentTextArea.setEditable(false); //Makes the textbox uneditable
    
    JPanel gridPanel = new JPanel (new GridLayout (2,1));

    flow1Panel.add (idLabel);
    flow1Panel.add (idTextField);
    flow1Panel.add (firstNameLabel);
    flow1Panel.add (firstNameTextField);
    flow1Panel.add (middleInitialLabel);
    flow1Panel.add (middleInitialTextField);
    flow1Panel.add (lastNameLabel);
    flow1Panel.add (lastNameTextField);
    flow1Panel.add (gradeLabel);
    flow1Panel.add (gradeTextField);
    
    flow2Panel.add (addButton);
    flow2Panel.add (removeButton);
    flow2Panel.add (printButton);
    flow2Panel.add (lookup);
    
    
    gridPanel.add(flow1Panel);
    gridPanel.add(flow2Panel);
    add (studentTextArea, BorderLayout.CENTER); //sets to middle
    add(gridPanel, BorderLayout.SOUTH); //Sets to bottom
    
    addButton.addActionListener (event -> addStudent ());
    printButton.addActionListener (event -> printButton());		//refreshes the print, however this is called after every add/remove
    removeButton.addActionListener (event -> removeButton());
    lookup.addActionListener (event -> lookup());
  }

  
  private void removeButton() 
	{
	  /*
	  //System.out.println(idTextField.getText()+" here");
	  if(idTextField.getText()!="")
	  {
		  boolean unique1 = true;
		  for (Student stud : studentLinkedList)
		  {
			  if(stud.getID ().compareTo(idTextField.getText()) == 0)
			  {
				  unique1=false;
			  }
		  }
		  
		  if(unique1==true)
		  {
			  JOptionPane.showMessageDialog (null, "Error: Student ID doesn't exist");
		  }
		  else
		  {
			for (int s = 0; s<studentLinkedList.size();s++)
			{
				String idrn = studentLinkedList.get(s).getID();
				if(idrn.compareToIgnoreCase(idTextField.getText()) ==0)
				{
					studentLinkedList.remove(s);
				}
				printButton();			//constantly keeps it updated
			}
		  }
	  
	}*/
	  for (int s = 0; s<studentLinkedList.size();s++)
		{
			String idrn = studentLinkedList.get(s).getID();
			String idrn1 = studentLinkedList.get(s).getFirstName();
			String idrn2 = studentLinkedList.get(s).getMiddleInitial();
			String idrn3 = studentLinkedList.get(s).getLastName();
			String idrn4 = studentLinkedList.get(s).getGrade();
			if(idTextField.getText().compareToIgnoreCase("")==0)
			{
				idrn=idTextField.getText();
			}
			if(firstNameTextField.getText().compareToIgnoreCase("")==0)
			{
				idrn1=firstNameTextField.getText();
			}
			if(middleInitialTextField.getText().compareToIgnoreCase("")==0)
			{
				idrn2=middleInitialTextField.getText();
			}
			if(lastNameTextField.getText().compareToIgnoreCase("")==0)
			{
				idrn3=lastNameTextField.getText();
			}
			if(gradeTextField.getText().compareToIgnoreCase("")==0)
			{
				idrn4=gradeTextField.getText();
			}
			
			if((idrn.compareToIgnoreCase(idTextField.getText()) ==0)&&(idrn1.compareToIgnoreCase(firstNameTextField.getText()) ==0)
					&&(idrn2.compareToIgnoreCase(middleInitialTextField.getText()) ==0)&&(idrn3.compareToIgnoreCase(lastNameTextField.getText()) ==0)
					&&(idrn4.compareToIgnoreCase(gradeTextField.getText()) ==0))
			{
				studentLinkedList.remove(s);
				--s;
			}
			printButton();			//constantly keeps it updated
		}
	  
	}

	private void printButton() //refreshes constantly //LOOKUP FUNCTION BUILT IN
	  	{
		  studentTextArea.setText("");
		  for(Student stud1 : studentLinkedList)
		  {
			  studentTextArea.append (stud1 + "\n");
		  }
	  	}
	
	
	
	
	private void lookup()
	{
		studentTextArea.setText("");
		int s=0;
		boolean exist = false;
		for (Student stud1 : studentLinkedList)
		{
			
			
			String idrn = studentLinkedList.get(s).getID();
			String idrn1 = studentLinkedList.get(s).getFirstName();
			String idrn2 = studentLinkedList.get(s).getMiddleInitial();
			String idrn3 = studentLinkedList.get(s).getLastName();
			String idrn4 = studentLinkedList.get(s).getGrade();
			if(idTextField.getText().compareToIgnoreCase("")==0)
			{
				idrn=idTextField.getText();
			}
			if(firstNameTextField.getText().compareToIgnoreCase("")==0)
			{
				idrn1=firstNameTextField.getText();
			}
			if(middleInitialTextField.getText().compareToIgnoreCase("")==0)
			{
				idrn2=middleInitialTextField.getText();
			}
			if(lastNameTextField.getText().compareToIgnoreCase("")==0)
			{
				idrn3=lastNameTextField.getText();
			}
			if(gradeTextField.getText().compareToIgnoreCase("")==0)
			{
				idrn4=gradeTextField.getText();
			}
			
			if((idrn.compareToIgnoreCase(idTextField.getText()) ==0)&&(idrn1.compareToIgnoreCase(firstNameTextField.getText()) ==0)
					&&(idrn2.compareToIgnoreCase(middleInitialTextField.getText()) ==0)&&(idrn3.compareToIgnoreCase(lastNameTextField.getText()) ==0)
					&&(idrn4.compareToIgnoreCase(gradeTextField.getText()) ==0))
			{
				
				studentTextArea.append (stud1 + "\n");
				exist=true;
			}
			
			
			++s;		//constantly keeps it updated
		}
		
		if(exist==false)
		{
			studentTextArea.setText("No students exist with given parameters.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public int idS=-1;
	public String idSS="";
	private void addStudent()		
	  {
		/*
		  boolean unique = true;
		  for (Student stud : studentLinkedList)
		  {
			  if(stud.getID ().compareTo(idTextField.getText()) == 0)		//checks if ID already exists
			  {
				  unique=false;				
			  }
			  
		  }
		  
		  if (unique==false)
		  {
			  JOptionPane.showMessageDialog (null, "Error: Student ID already exists");
			  
		  }
		  else
		  {
			  studentLinkedList.add(new Student (idTextField.getText(), firstNameTextField.getText(), 
					  middleInitialTextField.getText(),lastNameTextField.getText(),
					  gradeTextField.getText() ));
			  printButton();																			//prints the new database after every add for ease of use
		  } 
		  */
		idS=idS+1; //AUTO SETS ID
		idSS=String.valueOf(idS);//CONVERTS INT TO STRING
		
		
		studentLinkedList.add(new Student (idSS, firstNameTextField.getText(), //auto adds ID starting at 0
				  middleInitialTextField.getText(),lastNameTextField.getText(),
				  gradeTextField.getText() ));
		  printButton();	
	  }
	/*
	//helper method for ID
	public int idS=0;
	public int idA()
	{
		idS=idS+1;
		
		return idS;
	}
	*/
	
}
