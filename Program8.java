// Write a Java program that prints numbers from 1 to 20, but stops when a number divisible by 4 and 6 is found.

class Program8
{
    public static void main(String[] args)
    {
        for(int i=1;i<=20;i++)
        {
            System.out.println(i);
            if((i%4==0)&&(i%6==0))
            {
                break;
            }
        }
    }
}