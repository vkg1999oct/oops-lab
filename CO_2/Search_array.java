import java.util.Scanner;
public class Search_array
{
    public static void main(String[] args) 
    {
        int n, e, flag = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of elements in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements :");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element to search:");
        e = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == e)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at :"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}