/*
 * Michael Karimizadeh
 * 22/12/16
 * School class
 * Allows user to retrieve information about School
 */
public class School{
  private String name;//Creates name holder
  private String address;//Creates address holder
  private int capacity;//Creates capacity holder
  public School(String nam, String add, int cap){
    //Constructs School from name, address, and capacity
    name=nam;
    address=add;
    capacity=cap;
  }
  public String getName(){
    //Returns name
    return name;
  }
  public String getAddress(){
    //Returns address
    return address;
  }
  public String toString(){
    //Returns attributes
    return name+", "+address;
  }
}