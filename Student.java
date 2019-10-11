/*
 * Michael Karimizadeh
 * 22/12/16
 * Student class
 * Allows user to retrieve information about the Student, add courses, and set school
 */
public class Student{
  private String fname;//Creates first name holder
  private String lname;//Creates last name holder
  private Courses[] cour= new Courses[4];//Creates course array
  private School school;//Creates school holder
  public Student(String first, String last){
    //Constructs student from first and last name
    fname=first;
    lname=last;
  }
  public boolean addCourse(Courses course){
    //Adds course to student
    int x=0;
    if(cour[x]!=null){//Runs if there is no course
      x++;
    }
    cour[x]= course;//Sets course
    return true;//Returns true if successful
  }
  public boolean setSchool(School s){
    //Sets school
    school=s;
    return true;//Returns true if successful
  }
  public String getName(){
    //Returns name
    return fname+" "+lname;
  }
  public School getSchool(){
    //Returns school
    return school;
  }
  public Courses[] getCourses(){
    //Returns courses
    return cour;
  }
  public String toString(){
    //Returns attributes
    String a;
    if(cour[0]==null){//Runs if no course
      a="";
    }
    else{
      a=cour[0].getCode();//Gets course code
    }
    String b;
    if(cour[1]==null){//Runs if no course
      b="";
    }
    else{
      b=", "+cour[1].getCode();//Gets course code
    }
    String c;
    if(cour[2]==null){//Runs if no course
      c="";
    }
    else{
      c=", "+cour[2].getCode();//Gets course code
    }
    String d;
    if(cour[3]==null){//Runs if no course
      d="";
    }
    else{
      d=", "+cour[3].getCode();//Gets course code
    }
    //Returns all attributes
    return getName()+", School: "+getSchool().getName()+", has course(s): "+a+b+c+d;
  }
}