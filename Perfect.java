import java.util.Scanner;

class Perfect
{
    public static int perfect(int no)
    {
        int sum=0;

        for(int i=1;i<=no/2;i++)
        {
            if(no%i==0)
            {
                 sum=sum+i;
            }
           
        }
        return sum;
    }
    public static boolean chkPerfect(int no)
    {
        int sum=perfect(no);

        if(sum==no)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int value=sc.nextInt();

        boolean result=chkPerfect(value);
        if(result==true)
        {
            System.out.println("The "+value+" is the Perfect number.");
        }
        else
        {
            System.out.println("The "+value+" is not a Perfect number.");
        }
    }
}