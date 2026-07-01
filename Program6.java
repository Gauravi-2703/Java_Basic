// Write a Java program to keep accepting numbers from the user until the user enters 0.

import java.util.Scanner;

class Program6
{
    public static void main(String[] args)
    {
       Scanner obj =new Scanner(System.in);
       System.out.println("Enter the value: ");
       int num=1;
       while(num!=0)
    {
        num=obj.nextInt();
    }
    }
}