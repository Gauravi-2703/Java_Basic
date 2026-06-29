import java.util.Scanner;

public class OddEven
{
    public static  boolean chkOddEven(int no)
    {
        if(no%2==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        int value=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        value =obj.nextInt();
        boolean result=chkOddEven(value);
        if(result==true)
        {
            System.out.println(value+ " is the Even number.");
        }
        else
        {
            System.out.println(value+ " is the Odd number.");
        }

    }

}