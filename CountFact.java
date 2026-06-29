import java.util.Scanner;

class CountFact
{

    public static int countFact(int no)
    {
        int count=0;
        for(int i=1;i<no;i++)
        {
            if(no%i==0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int value=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number: ");
        value=obj.nextInt();
        int result=countFact(value);
        System.out.println("factors count of  "+value+" is: "+result);

    }
}