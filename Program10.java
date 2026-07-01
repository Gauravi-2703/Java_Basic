//Write a Java program to print numbers from 1 to 20, but skip all even numbers.

class Program10
{
    public static void main(String[] args) {
       /*  for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println(i);
        }*/

        int i=1;
        while(i<20)
        {
            i++;
            if(i%2==0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}