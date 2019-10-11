/*
 * Michael Karimizadeh
 * 22/12/16
 * Main class
 * Allows user to create and manipulate teachers, students, courses, and schools
 */
public class Main{
  public static void main(String[] args){
    School sch1= new School("NHSS", "North York", 1000);//Creates school
    School sch2= new School ("Thornlea","Thornhill", 500);//Creates school
    Courses cor1= new Courses("SPH4U1", "Physics", "Grade 12");//Creates Course
    Courses cor2= new Courses("SCH4U1", "Chemistry", "Grade 12");//Creates Course
    Courses cor3= new Courses("SBI4U1", "Biology", "Grade 12");//Creates Course
    Courses cor4= new Courses("ICS4U1", "Computer Science", "Grade 12");//Creates Course
    Courses cor5= new Courses("MVF4U1", "Advanced Functions", "Grade 12");//Creates Course
    Courses cor6= new Courses("MCA4U1", "Calculus", "Grade 12");//Creates Course
    Courses cor7= new Courses("AVI4U1", "Art", "Grade 12");//Creates Course
    Courses cor8= new Courses("ENG4U1", "English", "Grade 12");//Creates Course
    Student stu1= new Student("Michael", "Karimizadeh");//Creates student
    Student stu2= new Student("Paul", "Lim");//Creates student
    Student stu3= new Student("Oliver", "Mo");//Creates student
    stu1.addCourse(cor6);//Adds course to student 1
    stu1.addCourse(cor3);//Adds course to student 1
    stu1.setSchool(sch1);//Sets school for student 1
    stu2.addCourse(cor2);//Adds course to student 2
    stu2.addCourse(cor8);//Adds course to student 2
    stu2.setSchool(sch1);//Sets school for student 2
    stu3.addCourse(cor1);//Adds course to student 3
    stu3.addCourse(cor5);//Adds course to student 3
    stu3.setSchool(sch2);//Sets school for student 3
    System.out.println(stu1.toString());//Prints student info
    System.out.println(stu2.toString());//Prints student info
    System.out.println(stu3.toString());//Prints student info
    Teacher te1= new Teacher("Ms. Navabi");//Creates teacher
    Teacher te2= new Teacher("Ms. Evans");//Creates teacher
    te1.setSchool(sch1);//Sets school for teacher 1
    te1.addCourse(cor2);//Adds course to teacher 1
    te1.addCourse(cor4);//Adds course to teacher 1
    te2.setSchool(sch2);//Sets school for teacher 2
    te2.addCourse(cor3);//Adds course to teacher 2
    te2.addCourse(cor1);//Adds course to teacher 2
    System.out.println(te1.toString());//Prints teacher info
    System.out.println(te2.toString());//Prints teacher info
  }
}
