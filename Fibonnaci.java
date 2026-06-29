import java.util.Scanner;

class Fibonnaci
{
    public static void Fibonnaci(int no)
    {
        int no1=0;
        int no2=1;
        int no3=0;
        for(int i=0;i<no;i++)
        {
            System.out.println(no1+ " ");
            no3=no1+no2;
            no1=no2;
            no2=no3;
        }
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int value=obj.nextInt();
        Fibonnaci(value);


    }
}