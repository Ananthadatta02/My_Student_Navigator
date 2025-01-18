package project.student_management_system;

import java.util.Scanner;

class Student
{
	private int id;
	private String name;
	private String mobileNumber;
	private int age;
	private String degree;
	private String stream;
	
	//Constructor
	public Student(int id, String name, String mobileNumber, int age, String degree, String stream)
	{
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.degree = degree;
		this.stream = stream;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getMobileNumber()
	{
		return mobileNumber;
	}
	
	public void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String toString()
	{
		return "[" + id +", " + name + ", " + mobileNumber + ", " + age + ", " + degree + ", " + stream +"]";
	}
}
public class StudentMainClass 
{
	private static Student[] studentArray = new Student[100]; // Fixed array size
    private static int count = 0; // Tracks the number of students
    private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.println("\nPress 1 to Enroll a Student..");
			System.out.println("Press 2 to Remove a Student..");
			System.out.println("Press 3 to Update Student Mobile Number..");
			System.out.println("Press 4 to Display all the Students..");
			System.out.println("Press 5 to Exit...");
			int choice = s.nextInt();
			switch(choice)
			{
			case 1 : System.out.println("Enter Student ID");
					 int id = s.nextInt();
					 s.nextLine();
					 System.out.println("Enter Student Name");
					 String name = s.nextLine();
					 System.out.println("Enter Mobile Number");
					 String mobileNumber = s.nextLine();
					 System.out.println("Enter Student Age");
					 int age = s.nextInt();
					 s.nextLine();
					 System.out.println("Enter Degree");
					 String degree = s.nextLine();
					 System.out.println("Enter Stream");
					 String stream = s.nextLine();
	                 studentArray[count++] = new Student(id, name, mobileNumber, age, degree, stream);
					 System.out.println("Student Enrolled Successfully...");
			break;
			case 2 : System.out.println("Enter Student name to Remove the Student");
					 String stuName = s.nextLine();
					 boolean removed  = removeStudent(stuName);
					 if(removed)
					 {
						 System.out.println("Student removed Successfully..");
					 }
					 else
					 {
						 System.out.println("Details are not Present..");
					 }
			break;
			case 3 : System.out.println("Enter the Student Id..");
					 int stuId = s.nextInt();
					 System.out.println("Enter Student Mobile Number to Update");
					 String newMobileNumber = s.nextLine();
					 boolean updated = updateMobileNumber(stuId, newMobileNumber);
					 if(updated)
					 {
						 System.out.println("Mobile Number Updated Successfully..");
					 }
					 else
					 {
						 System.out.println("Details are not present");
					 }
			break;
			case 4 : System.out.println("Student Records..");
					 displayStudents();
			break;
			case 5 : System.out.println("Run Again to Start..");
			break;
			default : System.err.println("Invalid Choice..");
					  System.out.println("Enter Valid Number..");
			}
			if(choice==5)
			{
				break;
			}
		}
	}
	private static void grow()
	{
		int newSize = studentArray.length + 50;
		Student[] newArray = new Student[newSize];
		for(int i=0;i<=studentArray.length-1;i++)
		{
			newArray[i] = studentArray[i];
		}
		studentArray = newArray;
	}
	
	private static boolean removeStudent(String input) {
	    for (int i = 0; i < count; i++) 
	    {
	        if (studentArray[i].getName().equalsIgnoreCase(input))
	        {
	            for (int j = i; j < count - 1; j++) 
	            {
	                studentArray[j] = studentArray[j + 1];
	            }
	            studentArray[--count] = null; // Nullify the last element and decrease count
	            return true;
	        }
	    }
	    return false;
	}
	
	private static boolean updateMobileNumber(int stuId, String newMobileNumber)
	{
		for (int i = 0; i <= count-1; i++) 
		{
			if(studentArray[i].getId() == stuId)
			{
				studentArray[i].setMobileNumber(newMobileNumber);
				return true;
			}
		}
		return false;
	}
	
	private static void displayStudents()
	{
		if(count == 0)
		{
			System.out.println("No records Found..");
		}
		else
		{
			for(int i=0; i<=count-1; i++)
			{
				System.out.println(studentArray[i]);
			}
		}
	}
}

