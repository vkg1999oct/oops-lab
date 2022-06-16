import java.util.*;
class Cpu{
    int price;
    void getCpu()
    {
    System.out.println("\nEnter the price of cpu:");
    Scanner sc=new Scanner(System.in);
    price=sc.nextInt();
    } 

    class Processor
    {
        int cores;
        String manufacture;

        void getProcessor()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter the no: of Cores of Processor  :");
            cores=sc.nextInt();
            System.out.println("\nEnter the Manufacturer of processor  :");
            manufacture=sc.next();
            
        }

        void displayProc()
        {
            System.out.println("\nNo: of Cores of Processor  :"+cores);
            System.out.println("\n Manufacturer of processor  :"+manufacture);
        }
        
    }

    static class Ram
    {
        int memory;
        String manufacture;
        Scanner sc=new Scanner(System.in);
        void getRam()
        {
        System.out.println("Enter the memory size(GB) of Ram:");
        memory=sc.nextInt();
        System.out.println("Enter the manufacturer of Ram :");
        manufacture=sc.next();
        }
        void displayRam()
        {
        System.out.println("Memory size of ram:"+memory+"GB");
        System.out.println("Manufacturer of ram:"+manufacture);
        }


    }
}
    
public class Cpu1 
{
    public static void main(String args[])
    {
    Cpu c=new Cpu();
    Cpu.Processor p=c.new Processor();
    Cpu.Ram r=new Cpu.Ram();
    
    c.getCpu();
    p.getProcessor();
    r.getRam();
    
    System.out.println("\nCPU DETAILS");
     p.displayProc();
     r.displayRam();
    }
    
}
