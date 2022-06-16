import java.util.*;
class ComplexNo
{
    int img,real;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Real part: ");
        real=sc.nextInt();
        System.out.println("Enter Imaginary part: ");
        img=sc.nextInt();
    }
}

public class Complex
{
    public static void main(String args[])
	{
        int img1,real1;
        ComplexNo obj1 = new ComplexNo();
        ComplexNo obj2 = new ComplexNo();
        System.out.println("Enter the first complex number ");
        obj1.read();
        System.out.println("Enter the second complex number ");
        obj2.read();
        img1=obj1.img+obj2.img;
        real1=obj1.real+obj2.real;
        System.out.println("complex number 1 : "+ obj1.real + " + " +  obj1.img + "i");
        System.out.println("complex number 2 : "+ obj2.real + " + " +  obj2.img + "i");
        System.out.println("Sum of complex number is "+ real1 + " + " +  img1 + "i");
    }
}
