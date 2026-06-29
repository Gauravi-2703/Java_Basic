import java.util.Scanner;

class ReverseDigit
{
    public static void ReverseDigit(int no)
    {
        int digit=0;
        System.out.println("Reverse number is: ");
        while(no!=0)
        {
            digit=no%10;
            System.out.print(digit);
            no=no/10;
        }
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int value=obj.nextInt();
        ReverseDigit(value);

    }
}