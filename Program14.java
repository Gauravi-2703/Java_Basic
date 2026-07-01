//Write a Java program to accept 10 numbers from the user and skip negative numbers while printing.

import java.util.Scanner;

class Program14
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        

        for(int i=1;i<=10;i++)
        {
            int num=obj.nextInt();
            if(num<0)
            {
                break;
            }
           
        }
    }
}