// Write a Java program to print numbers from 1 to 30, but skip numbers divisible by 3.

class Program11
{
    public static void main(String[] args) {
        for(int i=0;i<=30;i++)
        {
            if(i%3==0)
            {
                continue;
            }
            System.out.println(i);
        }

        int i=0;
        while(i<30)
        {
            i++;
             if(i%3==0)
            {
                continue;
            }
            System.out.println(i);

        }
    }
}