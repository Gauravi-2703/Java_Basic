//Write a Java program to print numbers from 1 to 100, but stop printing when the number becomes 50.

class Program4
{
    public static void main(String[] args)
    {
        for(int i=1;i<=100;i++)
        {
            if(i==50)
            {
                break;
            }
            System.out.println(i);
        }
    }
}