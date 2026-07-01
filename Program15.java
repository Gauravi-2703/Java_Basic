//Write a Java program to print only odd numbers from a user-given range using continue.

import java.util.Scanner;

class Program15
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the limit: ");
        int limit=obj.nextInt();
        
        for(int i=0;i<=limit;i++)
        {
            if(i%2==0)
            {
               continue;
            }
            System.out.println(i);
        }
    }
}