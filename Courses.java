/*
 * Michael Karimizadeh
 * 22/12/16
 * Courses class
 * Allows user to retrieve information about courses
 */
public class Courses{
  private String code;//Creates code holder
  private String name;//Creats name holder
  private String level;//Creates level holder
  public Courses(String codee, String namee, String lvl){
    //Constructs course from name, code, and level
    code=codee;
    name=namee;
    level=lvl;
  }
  public String getCode(){
    //Returns course code
    return code;
  }
  public String getName(){
    //Returns course name
    return name;
  }
  public String getLevel(){
    //Returns course level
    return level;
  }
  public String toString(){
    //Returns attributes
    return getCode()+" "+getName()+" "+getLevel();
  }
}