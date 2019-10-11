/*
 * Michael Karimizadeh
 * 22/12/16
 * Teacher class
 * Allows user to retrieve information about the Teacher, add courses, and set school
 */
public class Teacher{
  private String lname;//Creates last name holder
  private Courses[] course= new Courses[3];//Creates course array
  private School school;//Creates school holder
  public Teacher(String last){
    //Constructs teacher from last name
    lname=last;
  }
  public boolean addCourse(Courses cour){
    //Adds course to teacher
    int x=0;
    if(course[x]!=null){//Runs if course doesn't exist
      x++;
    }
    course[x]= cour;//Adds course
    return true;//Returns true if successful
  }
  public boolean setSchool(School s){
    //Sets school for teacher
    school=s;
    return true;//Returns true if successful
  }
  public String getName(){
    //Returns name
    return lname;
  }
  public School getSchool(){
    //Returns school
    return school;
  }
  public Courses[] getCourses(){
    //Returns courses
    return course;
  }
  public String toString(){
    //Returns Attributes
    String a;
    if(course[0]==null){//Runs if course doesn't exist
      a="";
    }
    else{
      a=course[0].getCode();//Gets course code
    }
    String b;
    if(course[1]==null){//Runs if course doesn't exist
      b="";
    }
    else{
      b=", "+course[1].getCode();//Gets course code
    }
    String c;
    if(course[2]==null){//Runs if course doesn't exist
      c="";
    }
    else{
      c=", "+course[2].getCode();//Gets course code
    }
    //Returns all attributes
    return getName()+", School: "+getSchool().getName()+", has course(s): "+a+b+c;  
  }
}