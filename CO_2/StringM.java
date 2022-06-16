import java.util.*;
class StringM
{
	public static void main(String args[])
	{
        String m1,m2;
        m1="Hello";
        m2="world";
        System.out.println("String 1  :"+m1);
        System.out.println("String 2  :"+m2);
        if(m1.equals(m2))
            {
                System.out.println("String 1 and String 2 are equal ");

            }
        else{
            System.out.println("String 1 and String 2 are not equal ");

            }
            System.out.println("Concatinated String  :"+m1.concat(m2));
            System.out.println("Length of String  :"+m1.length());
            System.out.println("CharAt(1) of string 1 :"+m1.charAt(1));
            System.out.println("Replacing l of hello with t :"+m1.replace('l','t'));
            //System.out.println("SubString of hello  :"+m1.subString(2,1));
            System.out.println("String 1 to lower case  :"+m1.toLowerCase());
            System.out.println("String 1 to Upper case  :"+m1.toUpperCase());
        }
    }