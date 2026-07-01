// Write a Java program to print numbers from 1 to N, but skip numbers divisible by both 4 and 5.

import java.util.Scanner;

class Program12
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=obj.nextInt();

        for(int i=1;i<=num;i++)
        {
            if((i%4==0)&&(i%5==0))
            {
                continue;
            }
            System.out.println(i);
        }
    }
}