import java.util.Scanner;
class employee
{
	int id,salary;
	String name,address;
	employee()
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("\nEnter the employee no:");
      id=sc.nextInt();
      System.out.println("Enter the employee name:");
      name=sc.next();
      System.out.println("Enter the address:");
      address=sc.next();
      System.out.println("Enter the salary:");
      salary=sc.nextInt();
	}
}
class teacher extends employee
{
	String subject,department;
	teacher()
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("\nEnter the subject");
      subject=sc.next();
      System.out.println("Enter the department");
      department=sc.next();
    } 
    void disp()
    {
        System.out.println("\nEmployee id : "+id);
        System.out.println("\nName : "+name);
        System.out.println("\nAddress  : "+address);
        System.out.println("\nSalary :"+salary);
        System.out.println("\nSubject Taught:"+subject);
        System.out.println("\nDepartment :"+department);
    }
}

class inherit
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n;
	 System.out.println("\nEnter the no.of teacher:");
	 n=sc.nextInt();
	 teacher t[]=new teacher[n];
	 for(int i=0;i<n;i++)
	 {
       t[i]=new teacher();
     }
      System.out.println("\nDETAILS OF TEACHERS");
      for(int i=0;i<n;i++)
      {
      	t[i].disp();
      }
  }
}