// Write a Java program to print numbers from 1 to N, but stop if a number divisible by 7 is encountered.

import java.util.Scanner;

class Program5
{
    public static void main(String[] args) 
    {   Scanner obj=new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit=obj.nextInt();
        for(int i=0;i<=limit;i++)
        {
            if(i%7==0)
            {
                continue;
            }
            System.out.println(7+"*"+i+"="+(7*i));
        }
    }
}