/*Write a Java program to print natural numbers but stop when the sum exceeds 100.
[ Meaning:
•	You start printing natural numbers:
1, 2, 3, 4, 5, …
•	At the same time, you keep adding them to a running sum.
•	The moment the sum becomes greater than 100, you stop printing further numbers.
]*/

import java.util.Scanner;

class Program7
{
    public static void sum()
    {
        int i=1;
        int sum =0;

        System.out.println("Numbers are : ");
        while(sum<=100)
        {
            i++;
            sum=sum+i;
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        sum();

    }
}