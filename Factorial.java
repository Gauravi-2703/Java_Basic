import java.util.Scanner;

class Factorial
{
    public static int Factorial(int no)
    {
        int fact=1;
        for(int i=1;i<=no;i++)
        {
             fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        int value=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Nummber: ");
        value=obj.nextInt();
        int result=Factorial(value);
        System.out.println("Factorial of "+value+" is: "+result);
    }
}