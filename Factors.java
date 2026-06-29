import java.util.Scanner;

class Factors
{
    public static int  sumFactors(int no)
    {
        int sum=0;
        for(int i=1;i<no/2;i++)
        {
            if(no%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) 
    {
       int value=0;
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the number: ");
       value=obj.nextInt();
       int result=sumFactors(value);
       System.out.println("sum of the factors of "+value+" is: "+result);


    }
}