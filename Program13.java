//Write a Java program to print all numbers from 1 to 50, but skip multiples of 10.

class Program13
{
    public static void main(String[] args) {
        for(int i=1;i<=50;i++)
        {
            if(i%10==0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}