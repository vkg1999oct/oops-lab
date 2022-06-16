import java.util.Scanner;
class Person
{
	int age;
	String name,address,gender;
	Person()
	{
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the Person name:");
      name=sc.next();
      System.out.println("\nEnter the Person age:");
      age=sc.nextInt();
      System.out.println("Enter the address:");
      address=sc.next();
      System.out.println("Enter Gender:");
      gender=sc.next();
	}
}
class Employee extends Person
{
	String cname,qual;
    int salary,empid;
	Employee()
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("\nEnter the employee id:");
      empid=sc.nextInt();
      System.out.println("\nEnter the Company name");
      cname=sc.next();
      System.out.println("Enter the Qualification");
      qual=sc.next();
      System.out.println("\nEnter the employee salary:");
      salary=sc.nextInt();
    } 
}

class Teacher extends Employee
{
	String subject,department;
    int tid;
	Teacher()
    {
    super();
     Scanner sc=new Scanner(System.in);
      System.out.println("\nEnter the Teacher id:");
      tid=sc.nextInt();
      System.out.println("\nEnter the subject");
      subject=sc.next();
      System.out.println("Enter the department");
      department=sc.next();
     
    } 

     void disp()
    {
        
        System.out.println("\nName : "+name);
        System.out.println("\nAddress  : "+address);
        System.out.println("\nAge : "+age);
        System.out.println("\nGender : "+gender);
         System.out.println("\n");
         System.out.println("\nEmployee id : "+empid);
          System.out.println("\nCompany Name : "+cname);
        System.out.println("\nSalary :"+salary);
         System.out.println("\nQualification : "+qual);
         System.out.println("\n");
          System.out.println("\nTeacher id : "+tid);
        System.out.println("\nSubject Taught:"+subject);
        System.out.println("\nDepartment :"+department);
    }
}
class person_inherit
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n;
	 System.out.println("\nEnter the no.of teacher:");
	 n=sc.nextInt();
	 Teacher t[]=new Teacher[n];
	 for(int i=0;i<n;i++)
	 {
       t[i]=new Teacher();
     }
      System.out.println("\nDETAILS of Person");
      for(int i=0;i<n;i++)
      {
      	t[i].disp();
      }
  }
}