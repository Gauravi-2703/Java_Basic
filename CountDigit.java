import java.util.Scanner;

class CountDigit
{
    public static int countDigit(int no)
    {
        int digit=0;
        int count=0;
        while(no!=0)
        {
            for(int i=1;i<=no;i++)
            {
                digit=no%10;
                no=no/10;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int value=obj.nextInt();
    int result=countDigit(value);
    System.out.println("count of digits in "+value+" is: "+result);

    }
}