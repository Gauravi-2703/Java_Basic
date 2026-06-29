import java.util.Scanner;

class Digit
{
    public static void digit(int no)
    {
        int digit=0;
        while(no!=0)
        {
            digit=no%10;
            System.out.println(digit);
            no=no/10;
        }

    }
    public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);

       System.out.println("Enter the number: ");
       int value=obj.nextInt();
       digit(value);

    }
}