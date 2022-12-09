\

public class Student
{
  private String id;;
  private String firstName;
  private String middleInitial;
  private String lastName;
  private String grade;
//constructor
  public Student()
    {
      id="";
      firstName="";
      middleInitial="";
      lastName="";
      grade="";
    }
  	
    public Student(String id,String firstName,String middleInitial,String lastName,String grade)
    {
      this.id=id;
      this.firstName=firstName;
      this.middleInitial=middleInitial;
      this.lastName=lastName;
      this.grade=grade;
    }
//Accessors
    public String getID()
    {
      return id;
    }
    public String getFirstName()
    {
      return firstName;
    }
    public String getMiddleInitial()
    {
      return middleInitial;
    }
    public String getLastName()
    {
      return lastName;
    }
    public String getGrade()
    {
      return grade;
    }
//Modifiers
    public void setID(String id)
    {
      this.id = id;
    }
    public void setfirstName(String firstName)
    {
      this.firstName = firstName;
    }
    public void setmiddleInitial(String middleInitial)
    {
      this.middleInitial = middleInitial;
    }
    public void setlastName(String lastName)
    {
      this.lastName = lastName;
    }
    public void setgrade(String grade)
    {
      this.grade = grade;
    }
    //Helps prevent errors
    @Override
    public String toString()
    {
    	return id + "\t" + firstName + "\t" + middleInitial + "\t" + lastName + "\t" + grade;
    }

    
}
